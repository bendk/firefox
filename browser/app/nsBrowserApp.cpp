/* -*- Mode: C++; tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include "nsXULAppAPI.h"
#include "mozilla/XREAppData.h"
#include "XREChildData.h"
#include "XREShellData.h"
#include "application.ini.h"
#include "mozilla/Bootstrap.h"
#include "mozilla/ProcessType.h"
#include "mozilla/RuntimeExceptionModule.h"
#include "mozilla/ScopeExit.h"
#include "BrowserDefines.h"
#if defined(XP_WIN)
#  include <windows.h>
#  include <stdlib.h>
#elif defined(XP_UNIX)
#  include <sys/resource.h>
#  include <unistd.h>
#  include <fcntl.h>
#endif

#include <stdio.h>
#include <stdarg.h>
#include <time.h>

#include "nsCOMPtr.h"

#ifdef XP_WIN
#  include "mozilla/PreXULSkeletonUI.h"
#  include "freestanding/SharedSection.h"
#  include "LauncherProcessWin.h"
#  include "mozilla/GeckoArgs.h"
#  include "mozilla/mscom/ProcessRuntime.h"
#  include "mozilla/WindowsDllBlocklist.h"
#  include "mozilla/WindowsDpiInitialization.h"
#  include "mozilla/WindowsProcessMitigations.h"

#  define XRE_WANT_ENVIRON
#  include "nsWindowsWMain.cpp"

#  define strcasecmp _stricmp
#  ifdef MOZ_SANDBOX
#    include "mozilla/sandboxing/SandboxInitialization.h"
#    include "mozilla/sandboxing/sandboxLogging.h"
#  endif
#endif
#include "BinaryPath.h"

#include "nsXPCOMPrivate.h"  // for MAXPATHLEN and XPCOM_DLL

#include "mozilla/Sprintf.h"
#include "mozilla/StartupTimeline.h"
#include "BaseProfiler.h"

#ifdef LIBFUZZER
#  include "FuzzerDefs.h"
#endif

#ifdef MOZ_LINUX_32_SSE2_STARTUP_ERROR
#  include <cpuid.h>
#  include "mozilla/Unused.h"

static bool IsSSE2Available() {
  // The rest of the app has been compiled to assume that SSE2 is present
  // unconditionally, so we can't use the normal copy of SSE.cpp here.
  // Since SSE.cpp caches the results and we need them only transiently,
  // instead of #including SSE.cpp here, let's just inline the specific check
  // that's needed.
  unsigned int level = 1u;
  unsigned int eax, ebx, ecx, edx;
  unsigned int bits = (1u << 26);
  unsigned int max = __get_cpuid_max(0, nullptr);
  if (level > max) {
    return false;
  }
  __cpuid_count(level, 0, eax, ebx, ecx, edx);
  return (edx & bits) == bits;
}

static const char sSSE2Message[] =
    "This browser version requires a processor with the SSE2 instruction "
    "set extension.\nYou may be able to obtain a version that does not "
    "require SSE2 from your Linux distribution.\n";

__attribute__((constructor)) static void SSE2Check() {
  if (IsSSE2Available()) {
    return;
  }
  // Using write() in order to avoid jemalloc-based buffering. Ignoring return
  // values, since there isn't much we could do on failure and there is no
  // point in trying to recover from errors.
  MOZ_UNUSED(write(STDERR_FILENO, sSSE2Message, std::size(sSSE2Message) - 1));
  // _exit() instead of exit() to avoid running the usual "at exit" code.
  _exit(255);
}
#endif

#if !defined(MOZ_WIDGET_COCOA) && !defined(MOZ_WIDGET_ANDROID)
#  define MOZ_BROWSER_CAN_BE_CONTENTPROC
#endif

using namespace mozilla;

#ifdef XP_MACOSX
#  define kOSXResourcesFolder "Resources"
#endif
#define kDesktopFolder "browser"

static MOZ_FORMAT_PRINTF(1, 2) void Output(const char* fmt, ...) {
  va_list ap;
  va_start(ap, fmt);

#ifndef XP_WIN
  vfprintf(stderr, fmt, ap);
#else
  char msg[2048];
  vsnprintf_s(msg, _countof(msg), _TRUNCATE, fmt, ap);

  wchar_t wide_msg[2048];
  MultiByteToWideChar(CP_UTF8, 0, msg, -1, wide_msg, _countof(wide_msg));
#  if MOZ_WINCONSOLE
  fwprintf_s(stderr, wide_msg);
#  else
  // Linking user32 at load-time interferes with the DLL blocklist (bug 932100).
  // This is a rare codepath, so we can load user32 at run-time instead.
  HMODULE user32 = LoadLibraryW(L"user32.dll");
  if (user32) {
    decltype(MessageBoxW)* messageBoxW =
        (decltype(MessageBoxW)*)GetProcAddress(user32, "MessageBoxW");
    if (messageBoxW) {
      messageBoxW(nullptr, wide_msg, L"Firefox",
                  MB_OK | MB_ICONERROR | MB_SETFOREGROUND);
    }
    FreeLibrary(user32);
  }
#  endif
#endif

  va_end(ap);
}

/**
 * Return true if |arg| matches the given argument name.
 */
static bool IsArg(const char* arg, const char* s) {
  if (*arg == '-') {
    if (*++arg == '-') ++arg;
    return !strcasecmp(arg, s);
  }

#if defined(XP_WIN)
  if (*arg == '/') return !strcasecmp(++arg, s);
#endif

  return false;
}

MOZ_RUNINIT Bootstrap::UniquePtr gBootstrap;

static int do_main(int argc, char* argv[], char* envp[]) {
  // Allow firefox.exe to launch XULRunner apps via -app <application.ini>
  // Note that -app must be the *first* argument.
  const char* appDataFile = getenv("XUL_APP_FILE");
  if ((!appDataFile || !*appDataFile) && (argc > 1 && IsArg(argv[1], "app"))) {
    if (argc == 2) {
      Output("Incorrect number of arguments passed to -app");
      return 255;
    }
    appDataFile = argv[2];

    char appEnv[MAXPATHLEN];
    SprintfLiteral(appEnv, "XUL_APP_FILE=%s", argv[2]);
    if (putenv(strdup(appEnv))) {
      Output("Couldn't set %s.\n", appEnv);
      return 255;
    }
    argv[2] = argv[0];
    argv += 2;
    argc -= 2;
  } else if (argc > 1 && IsArg(argv[1], "xpcshell")) {
    for (int i = 1; i < argc; i++) {
      argv[i] = argv[i + 1];
    }

    XREShellData shellData;
#if defined(XP_WIN) && defined(MOZ_SANDBOX)
    shellData.sandboxBrokerServices =
        sandboxing::GetInitializedBrokerServices();
#endif

#ifdef LIBFUZZER
    shellData.fuzzerDriver = fuzzer::FuzzerDriver;
#endif
#ifdef AFLFUZZ
    shellData.fuzzerDriver = afl_interface_raw;
#endif

    return gBootstrap->XRE_XPCShellMain(--argc, argv, envp, &shellData);
  }

  BootstrapConfig config;

  if (appDataFile && *appDataFile) {
    config.appData = nullptr;
    config.appDataPath = appDataFile;
  } else {
    // no -app flag so we use the compiled-in app data
    config.appData = &sAppData;
    config.appDataPath = kDesktopFolder;
  }

#if defined(XP_WIN) && defined(MOZ_SANDBOX)
  sandbox::BrokerServices* brokerServices =
      sandboxing::GetInitializedBrokerServices();
  if (!brokerServices) {
    Output("Couldn't initialize the broker services.\n");
    return 255;
  }
  config.sandboxBrokerServices = brokerServices;
#endif

#ifdef LIBFUZZER
  if (getenv("FUZZER"))
    gBootstrap->XRE_LibFuzzerSetDriver(fuzzer::FuzzerDriver);
#endif

  EnsureBrowserCommandlineSafe(argc, argv);

  return gBootstrap->XRE_main(argc, argv, config);
}

static nsresult InitXPCOMGlue(LibLoadingStrategy aLibLoadingStrategy) {
  if (gBootstrap) {
    return NS_OK;
  }

  UniqueFreePtr<char> exePath = BinaryPath::Get();
  if (!exePath) {
    Output("Couldn't find the application directory.\n");
    return NS_ERROR_FAILURE;
  }

  auto bootstrapResult =
      mozilla::GetBootstrap(exePath.get(), aLibLoadingStrategy);
  if (bootstrapResult.isErr()) {
    Output("Couldn't load XPCOM.\n");
    return NS_ERROR_FAILURE;
  }

  gBootstrap = bootstrapResult.unwrap();

  // This will set this thread as the main thread.
  gBootstrap->NS_LogInit();

  return NS_OK;
}

#ifdef HAS_DLL_BLOCKLIST
// NB: This must be extern, as this value is checked elsewhere
uint32_t gBlocklistInitFlags = eDllBlocklistInitFlagDefault;
#endif

#if defined(XP_UNIX)
static void ReserveDefaultFileDescriptors() {
  // Reserve the lower positions of the file descriptors to make sure
  // we don't reuse stdin/stdout/stderr in case they were closed
  // before launch.
  // Otherwise code explicitly writing to fd 1 or 2 might accidentally
  // write to something else, like in bug 1820896 where FD 1 is
  // reused for the X server display connection.
  int fd = open("/dev/null", O_RDONLY);
  for (int i = 0; i < 2; i++) {
    mozilla::Unused << dup(fd);
  }
}
#endif

int main(int argc, char* argv[], char* envp[]) {
#if defined(XP_UNIX)
  ReserveDefaultFileDescriptors();
#endif

#ifdef MOZ_BROWSER_CAN_BE_CONTENTPROC
  if (argc > 1 && IsArg(argv[1], "contentproc")) {
    // Set the process type and gecko child id.
    SetGeckoProcessType(argv[--argc]);
    SetGeckoChildID(argv[--argc]);

#  if defined(MOZ_ENABLE_FORKSERVER)
    if (GetGeckoProcessType() == GeckoProcessType_ForkServer) {
      nsresult rv = InitXPCOMGlue(LibLoadingStrategy::NoReadAhead);
      if (NS_FAILED(rv)) {
        return 255;
      }

      // Run a fork server in this process, single thread. When it returns, it
      // means the fork server have been stopped or a new child process is
      // created.
      //
      // For the latter case, XRE_ForkServer() will return false, running in a
      // child process just forked from the fork server process. argc & argv
      // will be updated with the values passing from the chrome process, as
      // will GeckoProcessType and GeckoChildID. With the new values, this
      // function continues the reset of the code acting as a child process.
      if (gBootstrap->XRE_ForkServer(&argc, &argv)) {
        // Return from the fork server in the fork server process.
        // Stop the fork server.
        // InitXPCOMGlue calls NS_LogInit, so we need to balance it here.
        gBootstrap->NS_LogTerm();
        return 0;
      }
    }
#  endif
  }
#endif

  mozilla::TimeStamp start = mozilla::TimeStamp::Now();

  AUTO_BASE_PROFILER_INIT;
  AUTO_BASE_PROFILER_LABEL("nsBrowserApp main", OTHER);

  // Register an external module to report on otherwise uncatchable exceptions.
  // Note that in child processes this must be called after Gecko process type
  // has been set.
  CrashReporter::RegisterRuntimeExceptionModule();

  // Make sure we unregister the runtime exception module before returning.
  auto unregisterRuntimeExceptionModule =
      MakeScopeExit([] { CrashReporter::UnregisterRuntimeExceptionModule(); });

#ifdef MOZ_BROWSER_CAN_BE_CONTENTPROC
  // We are launching as a content process, delegate to the appropriate
  // main
  if (GetGeckoProcessType() != GeckoProcessType_Default) {
#  if defined(XP_WIN) && defined(MOZ_SANDBOX)
    // We need to set whether our process is supposed to have win32k locked down
    // from the command line setting before DllBlocklist_Initialize,
    // GetInitializedTargetServices and WindowsDpiInitialization.
    Maybe<bool> win32kLockedDown =
        mozilla::geckoargs::sWin32kLockedDown.Get(argc, argv);
    if (win32kLockedDown.isSome() && *win32kLockedDown) {
      mozilla::SetWin32kLockedDownInPolicy();
    }
#  endif

#  ifdef HAS_DLL_BLOCKLIST
    uint32_t initFlags =
        gBlocklistInitFlags | eDllBlocklistInitFlagIsChildProcess;
    SetDllBlocklistProcessTypeFlags(initFlags, GetGeckoProcessType());
    DllBlocklist_Initialize(initFlags);
#  endif  // HAS_DLL_BLOCKLIST

#  if defined(XP_WIN) && defined(MOZ_SANDBOX)
    // We need to initialize the sandbox TargetServices before InitXPCOMGlue
    // because we might need the sandbox broker to give access to some files.
    if (IsSandboxedProcess() && !sandboxing::GetInitializedTargetServices()) {
      Output("Failed to initialize the sandbox target services.");
      return 255;
    }
#  endif
#  if defined(XP_WIN)
    // Ideally, we would be able to set our DPI awareness in
    // firefox.exe.manifest Unfortunately, that would cause Win32k calls when
    // user32.dll gets loaded, which would be incompatible with Win32k Lockdown
    //
    // MSDN says that it's allowed-but-not-recommended to initialize DPI
    // programatically, as long as it's done before any HWNDs are created.
    // Thus, we do it almost as soon as we possibly can
    {
      auto result = mozilla::WindowsDpiInitialization();
      (void)result;  // Ignore errors since some tools block DPI calls
    }
#  endif

    nsresult rv = InitXPCOMGlue(LibLoadingStrategy::NoReadAhead);
    if (NS_FAILED(rv)) {
      return 255;
    }

    XREChildData childData;

#  if defined(XP_WIN) && defined(MOZ_SANDBOX)
    if (IsSandboxedProcess()) {
      childData.sandboxTargetServices =
          mozilla::sandboxing::GetInitializedTargetServices();
      if (!childData.sandboxTargetServices) {
        return 1;
      }

      childData.ProvideLogFunction = mozilla::sandboxing::ProvideLogFunction;
    }
#  endif

    rv = gBootstrap->XRE_InitChildProcess(argc, argv, &childData);

#  if defined(DEBUG) && defined(HAS_DLL_BLOCKLIST)
    DllBlocklist_Shutdown();
#  endif

    // InitXPCOMGlue calls NS_LogInit, so we need to balance it here.
    gBootstrap->NS_LogTerm();

    return NS_FAILED(rv) ? 1 : 0;
  }
#endif

#ifdef HAS_DLL_BLOCKLIST
  DllBlocklist_Initialize(gBlocklistInitFlags);
#endif

// We will likely only ever support this as a command line argument on Windows
// and OSX, so we're ifdefing here just to not create any expectations.
#if defined(XP_WIN) || defined(XP_MACOSX)
  if (argc > 1 && IsArg(argv[1], "silentmode")) {
    ::putenv(const_cast<char*>("MOZ_APP_SILENT_START=1"));
#  if defined(XP_WIN)
    // On windows We also want to set a separate variable, which we want to
    // persist across restarts, which will let us keep the process alive
    // even if the last window is closed.
    ::putenv(const_cast<char*>("MOZ_APP_ALLOW_WINDOWLESS=1"));
#  endif
#  if defined(XP_MACOSX)
    ::putenv(const_cast<char*>("MOZ_APP_NO_DOCK=1"));
#  endif
  }
#endif

#if defined(XP_WIN)

  // Ideally, we would be able to set our DPI awareness in firefox.exe.manifest
  // Unfortunately, that would cause Win32k calls when user32.dll gets loaded,
  // which would be incompatible with Win32k Lockdown
  //
  // MSDN says that it's allowed-but-not-recommended to initialize DPI
  // programatically, as long as it's done before any HWNDs are created.
  // Thus, we do it almost as soon as we possibly can
  {
    auto result = mozilla::WindowsDpiInitialization();
    (void)result;  // Ignore errors since some tools block DPI calls
  }

  // Once the browser process hits the main function, we no longer need
  // a writable section handle because all dependent modules have been
  // loaded.
  mozilla::freestanding::gSharedSection.ConvertToReadOnly();

  mozilla::CreateAndStorePreXULSkeletonUI(GetModuleHandle(nullptr), argc, argv);
#endif

  nsresult rv = InitXPCOMGlue(LibLoadingStrategy::ReadAhead);
  if (NS_FAILED(rv)) {
    return 255;
  }

  gBootstrap->XRE_StartupTimelineRecord(mozilla::StartupTimeline::START, start);

#ifdef MOZ_BROWSER_CAN_BE_CONTENTPROC
  gBootstrap->XRE_EnableSameExecutableForContentProc();
#endif

  int result = do_main(argc, argv, envp);

#if defined(XP_WIN)
  CleanupProcessRuntime();
#endif

  gBootstrap->NS_LogTerm();

#if defined(DEBUG) && defined(HAS_DLL_BLOCKLIST)
  DllBlocklist_Shutdown();
#endif

#ifdef XP_MACOSX
  // Allow writes again. While we would like to catch writes from static
  // destructors to allow early exits to use _exit, we know that there is
  // at least one such write that we don't control (see bug 826029). For
  // now we enable writes again and early exits will have to use exit instead
  // of _exit.
  gBootstrap->XRE_StopLateWriteChecks();
#endif

  gBootstrap.reset();

  return result;
}
