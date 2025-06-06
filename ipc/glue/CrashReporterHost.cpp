/* -*- Mode: C++; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* vim: set ts=8 sts=2 et sw=2 tw=80: */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#include "CrashReporterHost.h"
#include "CrashReporter/CrashReporterInitArgs.h"
#include "mozilla/dom/Promise.h"
#include "mozilla/Sprintf.h"
#include "mozilla/SyncRunnable.h"
#include "mozilla/glean/IpcMetrics.h"
#include "nsServiceManagerUtils.h"
#include "nsICrashService.h"
#include "nsXULAppAPI.h"
#include "nsIFile.h"

#if defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) && \
    defined(MOZ_OXIDIZED_BREAKPAD)
#  include "mozilla/toolkit/crashreporter/rust_minidump_writer_linux_ffi_generated.h"
#endif  // defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) &&
        // defined(MOZ_OXIDIZED_BREAKPAD)

namespace mozilla::ipc {

CrashReporterHost::CrashReporterHost(
    GeckoProcessType aProcessType, base::ProcessId aPid,
    const CrashReporter::CrashReporterInitArgs& aInitArgs)
    : mProcessType(aProcessType),
      mPid(aPid),
      mThreadId(aInitArgs.threadId()),
      mStartTime(::time(nullptr)),
      mFinalized(false) {
#if defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) && \
    defined(MOZ_OXIDIZED_BREAKPAD)
  const CrashReporter::AuxvInfo& ipdlAuxvInfo = aInitArgs.auxvInfo();
  DirectAuxvDumpInfo auxvInfo = {};
  auxvInfo.program_header_count = ipdlAuxvInfo.programHeaderCount();
  auxvInfo.program_header_address = ipdlAuxvInfo.programHeaderAddress();
  auxvInfo.linux_gate_address = ipdlAuxvInfo.linuxGateAddress();
  auxvInfo.entry_address = ipdlAuxvInfo.entryAddress();
  CrashReporter::RegisterChildAuxvInfo(mPid, auxvInfo);
#endif  // defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) &&
        // defined(MOZ_OXIDIZED_BREAKPAD)
}

CrashReporterHost::~CrashReporterHost() {
#if defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) && \
    defined(MOZ_OXIDIZED_BREAKPAD)
  CrashReporter::UnregisterChildAuxvInfo(mPid);
#endif  // defined(XP_LINUX) && defined(MOZ_CRASHREPORTER) &&
        // defined(MOZ_OXIDIZED_BREAKPAD)
}

bool CrashReporterHost::GenerateCrashReport() {
  if (!TakeCrashedChildMinidump()) {
    return false;
  }

  FinalizeCrashReport();
  RecordCrash(mProcessType, nsICrashService::CRASH_TYPE_CRASH, mDumpID);
  return true;
}

RefPtr<nsIFile> CrashReporterHost::TakeCrashedChildMinidump() {
  CrashReporter::AnnotationTable annotations;
  MOZ_ASSERT(!HasMinidump());

  RefPtr<nsIFile> crashDump;
  if (!CrashReporter::TakeMinidumpForChild(mPid, getter_AddRefs(crashDump),
                                           annotations)) {
    return nullptr;
  }
  if (!AdoptMinidump(crashDump, annotations)) {
    return nullptr;
  }
  return crashDump;
}

bool CrashReporterHost::AdoptMinidump(nsIFile* aFile,
                                      const AnnotationTable& aAnnotations) {
  if (!CrashReporter::GetIDFromMinidump(aFile, mDumpID)) {
    return false;
  }

  MergeCrashAnnotations(mExtraAnnotations, aAnnotations);
  return true;
}

void CrashReporterHost::FinalizeCrashReport() {
  MOZ_ASSERT(!mFinalized);
  MOZ_ASSERT(HasMinidump());

  mExtraAnnotations[CrashReporter::Annotation::ProcessType] = ProcessType();

  char startTime[32];
  SprintfLiteral(startTime, "%lld", static_cast<long long>(mStartTime));
  mExtraAnnotations[CrashReporter::Annotation::StartupTime] =
      nsDependentCString(startTime);

  CrashReporter::WriteExtraFile(mDumpID, mExtraAnnotations);
  mFinalized = true;
}

void CrashReporterHost::DeleteCrashReport() {
  if (mFinalized && HasMinidump()) {
    CrashReporter::DeleteMinidumpFilesForID(mDumpID, Some(u"browser"_ns));
  }
}

const char* CrashReporterHost::ProcessType() const {
  return XRE_ChildProcessTypeToAnnotation(mProcessType);
}

/* static */
void CrashReporterHost::RecordCrash(GeckoProcessType aProcessType,
                                    int32_t aCrashType,
                                    const nsString& aChildDumpID) {
  if (!NS_IsMainThread()) {
    RefPtr<Runnable> runnable = NS_NewRunnableFunction(
        "ipc::CrashReporterHost::RecordCrash", [&]() -> void {
          CrashReporterHost::RecordCrash(aProcessType, aCrashType,
                                         aChildDumpID);
        });
    RefPtr<nsIThread> mainThread = do_GetMainThread();
    SyncRunnable::DispatchToThread(mainThread, runnable);
    return;
  }

  RecordCrashWithTelemetry(aProcessType, aCrashType);
  NotifyCrashService(aProcessType, aCrashType, aChildDumpID);
}

/* static */
void CrashReporterHost::RecordCrashWithTelemetry(GeckoProcessType aProcessType,
                                                 int32_t aCrashType) {
  nsCString key;

  switch (aProcessType) {
#define GECKO_PROCESS_TYPE(enum_value, enum_name, string_name, proc_typename, \
                           process_bin_type, procinfo_typename,               \
                           webidl_typename, allcaps_name)                     \
  case GeckoProcessType_##enum_name:                                          \
    key.AssignLiteral(string_name);                                           \
    break;
#include "mozilla/GeckoProcessTypes.h"
#undef GECKO_PROCESS_TYPE
    // We can't really hit this, thanks to the above switch, but having it
    // here will placate the compiler.
    default:
      MOZ_ASSERT_UNREACHABLE("unknown process type");
  }

  glean::subprocess::crashes_with_dump.Get(key).Add(1);
}

/* static */
void CrashReporterHost::NotifyCrashService(GeckoProcessType aProcessType,
                                           int32_t aCrashType,
                                           const nsString& aChildDumpID) {
  MOZ_ASSERT(!aChildDumpID.IsEmpty());

  nsCOMPtr<nsICrashService> crashService =
      do_GetService("@mozilla.org/crashservice;1");
  if (!crashService) {
    return;
  }

  int32_t processType;

  switch (aProcessType) {
    case GeckoProcessType_IPDLUnitTest:
    case GeckoProcessType_Default:
      NS_ERROR("unknown process type");
      return;
    default:
      processType = (int)aProcessType;
      break;
  }

  RefPtr<dom::Promise> promise;
  crashService->AddCrash(processType, aCrashType, aChildDumpID,
                         getter_AddRefs(promise));
}

void CrashReporterHost::AddAnnotationBool(CrashReporter::Annotation aKey,
                                          bool aValue) {
  MOZ_ASSERT(TypeOfAnnotation(aKey) == CrashReporter::AnnotationType::Boolean,
             "Wrong annotation type");
  mExtraAnnotations[aKey] = aValue ? "1"_ns : "0"_ns;
}

void CrashReporterHost::AddAnnotationU32(CrashReporter::Annotation aKey,
                                         uint32_t aValue) {
  MOZ_ASSERT(TypeOfAnnotation(aKey) == CrashReporter::AnnotationType::U32,
             "Wrong annotation type");
  nsAutoCString valueString;
  valueString.AppendInt(aValue);
  mExtraAnnotations[aKey] = valueString;
}

void CrashReporterHost::AddAnnotationNSCString(CrashReporter::Annotation aKey,
                                               const nsACString& aValue) {
  MOZ_ASSERT(TypeOfAnnotation(aKey) == CrashReporter::AnnotationType::String,
             "Wrong annotation type");
  mExtraAnnotations[aKey] = aValue;
}

}  // namespace mozilla::ipc
