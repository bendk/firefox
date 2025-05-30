/* -*- Mode: C++; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* vim: set ts=2 et sw=2 tw=80: */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */

#ifndef mozilla_widget_WinMouseScrollHandler_h__
#define mozilla_widget_WinMouseScrollHandler_h__

#include "nscore.h"
#include "nsDebug.h"
#include "mozilla/Assertions.h"
#include "mozilla/EventForwards.h"
#include "mozilla/TimeStamp.h"
#include "Units.h"
#include <windows.h>
#include "nsPoint.h"

class nsWindow;

namespace mozilla {
namespace widget {

class ModifierKeyState;

struct MSGResult;

class MouseScrollHandler {
 public:
  static MouseScrollHandler* GetInstance();

  static void Initialize();
  static void Shutdown();

  static bool ProcessMessage(nsWindow* aWidget, UINT msg, WPARAM wParam,
                             LPARAM lParam, MSGResult& aResult);

  /**
   * See nsIWidget::SynthesizeNativeMouseScrollEvent() for the detail about
   * this method.
   */
  static nsresult SynthesizeNativeMouseScrollEvent(
      nsWindow* aWidget, const LayoutDeviceIntPoint& aPoint,
      uint32_t aNativeMessage, int32_t aDelta, uint32_t aModifierFlags,
      uint32_t aAdditionalFlags);

 private:
  MouseScrollHandler();
  ~MouseScrollHandler();

  static void MaybeLogKeyState();

  static MouseScrollHandler* sInstance;

  /**
   * InitEvent() initializes the aEvent.  If aPoint is null, the result of
   * GetCurrentMessagePos() will be used.
   */
  static void InitEvent(nsWindow* aWidget, WidgetGUIEvent& aEvent,
                        LPARAM* aPoint);

  /**
   * GetModifierKeyState() returns current modifier key state.
   * Note that some devices need some hack for the modifier key state.
   * This method does it automatically.
   *
   * @param aMessage    Message being handled.
   */
  static ModifierKeyState GetModifierKeyState(UINT aMessage);

  /**
   * MozGetMessagePos() returns the mouse cursor position when GetMessage()
   * was called last time.  However, if we're sending a native message,
   * this returns the specified cursor position by
   * SynthesizeNativeMouseScrollEvent().
   */
  static POINTS GetCurrentMessagePos();

  /**
   * ProcessMouseMessage() processes mousewheel and scroll messages, dispatching
   * to other handlers as needed while dealing with common tasks.
   *
   * @param aMessage    WM_MOUSEWHEEL, WM_MOUSEHWHEEL, WM_VSCROLL or WM_HSCROLL.
   * @param aWParam     The wParam value of the message.
   * @param aLParam     The lParam value of the message.
   */
  bool ProcessMouseMessage(UINT msg, WPARAM wParam, LPARAM lParam,
                           MSGResult& aResult);

  /**
   * HandleMouseWheelMessage() processes WM_MOUSEWHEEL or WM_MOUSEHWHEEL.
   *
   * @param aWidget     The window which should process the wheel message.
   * @param aMessage    WM_MOUSEWHEEL or WM_MOUSEHWHEEL.
   * @param aWParam     The wParam value of the message.
   * @param aLParam     The lParam value of the message.
   * @return            TRUE if the message is processed.  Otherwise, FALSE.
   */
  bool HandleMouseWheelMessage(nsWindow* aWidget, UINT aMessage, WPARAM aWParam,
                               LPARAM aLParam);

  /**
   * HandleScrollMessageAsMouseWheelMessage() processes WM_VSCROLL or WM_HSCROLL
   * when the user wants them to emulate a mouse-wheel message's behavior
   * (_i.e._, when `mousewheel.emulate_at_wm_scroll` is true).
   *
   * @param aWidget     The window which should process the scroll message.
   * @param aMessage    WM_VSCROLL or WM_HSCROLL.
   * @param aWParam     The wParam value of the message.
   * @param aLParam     The lParam value of the message.
   * @return            TRUE if the message is processed.  Otherwise, FALSE.
   */
  bool HandleScrollMessageAsMouseWheelMessage(nsWindow* aWidget, UINT aMessage,
                                              WPARAM aWParam, LPARAM aLParam);

  /**
   * HandleScrollMessageAsItself() processes the WM_VSCROLL and WM_HSCROLL when
   * the user does _not_ want them to emulate a mouse-wheel message's behavior
   * (_i.e._, when `mousewheel.emulate_at_wm_scroll` is false).
   *
   * @param aWidget     The window which should process the scroll message.
   * @param aMessage    WM_VSCROLL or WM_HSCROLL.
   * @param aWParam     The wParam value of the message.
   * @param aLParam     The lParam value of the message.
   * @return            TRUE if the message is processed.  Otherwise, FALSE.
   */
  bool HandleScrollMessageAsItself(nsWindow* aWidget, UINT aMessage,
                                   WPARAM aWParam, LPARAM aLParam);

  /**
   * ComputeMessagePos() abstracts over ::GetMessagePos(), which is known to
   * yield bad data under some mouse drivers (particularly Logitech's SetPoint).
   *
   * @param aMessage    Current message.
   * @param aWParam     Current message's wParam.
   * @param aLParam     Current message's lParam.
   * @return            Mouse cursor position.
   */
  POINT ComputeMessagePos(UINT aMessage, WPARAM aWParam, LPARAM aLParam);

  /**
   * FindTargetWindow() finds the nsWindow which needs to process the current
   * scroll event. (This is the window underneath the cursor -- which is not
   * necessarily the window whose event queue it came in on!)
   *
   * @param aMessage    Current message.
   * @param aWParam     Current message's wParam.
   * @param aLParam     Current message's lParam.
   * @return            The relevant nsWindow, or nullptr if no appropriate
   *                    window could be identified.
   */
  nsWindow* FindTargetWindow(UINT aMessage, WPARAM aWParam, LPARAM aLParam);

  class EventInfo {
   public:
    /**
     * @param aWidget   An nsWindow which is handling the event.
     * @param aMessage  Must be WM_MOUSEWHEEL or WM_MOUSEHWHEEL.
     */
    EventInfo(nsWindow* aWidget, UINT aMessage, WPARAM aWParam, LPARAM aLParam);

    bool CanDispatchWheelEvent() const;

    int32_t GetNativeDelta() const { return mDelta; }
    HWND GetWindowHandle() const { return mWnd; }
    const TimeStamp& GetTimeStamp() const { return mTimeStamp; }
    bool IsVertical() const { return mIsVertical; }
    bool IsPositive() const { return (mDelta > 0); }
    bool IsPage() const { return mIsPage; }

    /**
     * @return          Number of lines or pages scrolled per WHEEL_DELTA.
     */
    int32_t GetScrollAmount() const;

   protected:
    EventInfo()
        : mIsVertical(false), mIsPage(false), mDelta(0), mWnd(nullptr) {}

    // TRUE if event is for vertical scroll.  Otherwise, FALSE.
    bool mIsVertical;
    // TRUE if event scrolls per page, otherwise, FALSE.
    bool mIsPage;
    // The native delta value.
    int32_t mDelta;
    // The window handle which is handling the event.
    HWND mWnd;
    // Timestamp of the event.
    TimeStamp mTimeStamp;
  };

  class LastEventInfo : public EventInfo {
   public:
    LastEventInfo() : EventInfo(), mAccumulatedDelta(0) {}

    /**
     * CanContinueTransaction() checks whether the new event can continue the
     * last transaction or not.  Note that if there is no transaction, this
     * returns true.
     */
    bool CanContinueTransaction(const EventInfo& aNewEvent);

    /**
     * ResetTransaction() resets the transaction, i.e., the instance forgets
     * the last event information.
     */
    void ResetTransaction();

    /**
     * RecordEvent() saves the information of new event.
     */
    void RecordEvent(const EventInfo& aEvent);

    /**
     * InitWheelEvent() initializes NS_WHEEL_WHEEL event and
     * recomputes the remaning detla for the event.
     * This must be called only once during handling a message and after
     * RecordEvent() is called.
     *
     * @param aWidget           A window which will dispatch the event.
     * @param aWheelEvent       An NS_WHEEL_WHEEL event, this will be
     *                          initialized.
     * @param aModKeyState      Current modifier key state.
     * @return                  TRUE if the event is ready to dispatch.
     *                          Otherwise, FALSE.
     */
    bool InitWheelEvent(nsWindow* aWidget, WidgetWheelEvent& aWheelEvent,
                        const ModifierKeyState& aModKeyState, LPARAM aLParam);

   private:
    static int32_t RoundDelta(double aDelta);

    int32_t mAccumulatedDelta;
  };

  LastEventInfo mLastEventInfo;

  class SystemSettings {
   public:
    SystemSettings() : mInitialized(false) {}

    void Init();
    void MarkDirty();
    void NotifyUserPrefsMayOverrideSystemSettings();

    // On some environments, SystemParametersInfo() may be hooked by touchpad
    // utility or something.  In such case, when user changes active pointing
    // device to another one, the result of SystemParametersInfo() may be
    // changed without WM_SETTINGCHANGE message.  For avoiding this trouble,
    // we need to modify cache of system settings at every wheel message
    // handling if we meet known device whose utility may hook the API.
    void TrustedScrollSettingsDriver();

    int32_t GetScrollAmount(bool aForVertical) const {
      MOZ_ASSERT(mInitialized, "SystemSettings must be initialized");
      return aForVertical ? mScrollLines : mScrollChars;
    }

    bool IsPageScroll(bool aForVertical) const {
      MOZ_ASSERT(mInitialized, "SystemSettings must be initialized");
      return aForVertical ? (uint32_t(mScrollLines) == WHEEL_PAGESCROLL)
                          : (uint32_t(mScrollChars) == WHEEL_PAGESCROLL);
    }

    // The default vertical and horizontal scrolling speed is 3, this is defined
    // on the document of SystemParametersInfo in MSDN.
    static int32_t DefaultScrollLines() { return 3; }

   private:
    bool mInitialized;
    // The result of SystemParametersInfo() may not be reliable since it may
    // be hooked.  So, if the values are initialized with prefs, we can trust
    // the value.  Following mIsReliableScroll* are set true when mScroll* are
    // initialized with prefs.
    bool mIsReliableScrollLines;
    bool mIsReliableScrollChars;

    int32_t mScrollLines;
    int32_t mScrollChars;

    // Returns true if cached value is changed.
    bool InitScrollLines();
    bool InitScrollChars();

    void RefreshCache();
  };

  SystemSettings mSystemSettings;

  class UserPrefs {
   public:
    UserPrefs();
    ~UserPrefs();

    void MarkDirty();

    bool IsScrollMessageHandledAsWheelMessage() {
      Init();
      return mScrollMessageHandledAsWheelMessage;
    }

    bool IsSystemSettingCacheEnabled() {
      Init();
      return mEnableSystemSettingCache;
    }

    bool IsSystemSettingCacheForciblyEnabled() {
      Init();
      return mForceEnableSystemSettingCache;
    }

    bool ShouldEmulateToMakeWindowUnderCursorForeground() {
      Init();
      return mEmulateToMakeWindowUnderCursorForeground;
    }

    int32_t GetOverriddenVerticalScrollAmout() {
      Init();
      return mOverriddenVerticalScrollAmount;
    }

    int32_t GetOverriddenHorizontalScrollAmout() {
      Init();
      return mOverriddenHorizontalScrollAmount;
    }

    int32_t GetMouseScrollTransactionTimeout() {
      Init();
      return mMouseScrollTransactionTimeout;
    }

   private:
    void Init();

    static void OnChange(const char* aPrefName, void* aSelf) {
      static_cast<UserPrefs*>(aSelf)->MarkDirty();
    }

    bool mInitialized;
    bool mScrollMessageHandledAsWheelMessage;
    bool mEnableSystemSettingCache;
    bool mForceEnableSystemSettingCache;
    bool mEmulateToMakeWindowUnderCursorForeground;
    int32_t mOverriddenVerticalScrollAmount;
    int32_t mOverriddenHorizontalScrollAmount;
    int32_t mMouseScrollTransactionTimeout;
  };

  UserPrefs mUserPrefs;

  // only used in tests
  class SynthesizingEvent;
  UniquePtr<SynthesizingEvent> mSynthesizingEvent;
  static SynthesizingEvent* GetActiveSynthEvent();

 public:
  class Device {
   public:
    // SynTP is a touchpad driver of Synaptics.
    class SynTP {
     public:
      static bool IsDriverInstalled() { return sMajorVersion != 0; }
      /**
       * GetDriverMajorVersion() returns the installed driver's major version.
       * If SynTP driver isn't installed, this returns 0.
       */
      static int32_t GetDriverMajorVersion() { return sMajorVersion; }
      /**
       * GetDriverMinorVersion() returns the installed driver's minor version.
       * If SynTP driver isn't installed, this returns -1.
       */
      static int32_t GetDriverMinorVersion() { return sMinorVersion; }

      static void Init();

     private:
      static bool sInitialized;
      static int32_t sMajorVersion;
      static int32_t sMinorVersion;
    };

    class Elantech {
     public:
      /**
       * GetDriverMajorVersion() returns the installed driver's major version.
       * If Elantech's driver was installed, returns 0.
       */
      static int32_t GetDriverMajorVersion();

      /**
       * IsHelperWindow() checks whether aWnd is a helper window of Elantech's
       * touchpad.  Returns TRUE if so.  Otherwise, FALSE.
       */
      static bool IsHelperWindow(HWND aWnd);

      /**
       * Key message handler for Elantech's hack.  Returns TRUE if the message
       * is consumed by this handler.  Otherwise, FALSE.
       */
      static bool HandleKeyMessage(nsWindow* aWidget, UINT aMsg, WPARAM aWParam,
                                   LPARAM aLParam);

      static void UpdateZoomUntil();
      static bool IsZooming();

      static void Init();

      static bool IsPinchHackNeeded() { return sUsePinchHack; }

     private:
      // Whether to enable the Elantech swipe gesture hack.
      static bool sUseSwipeHack;
      // Whether to enable the Elantech pinch-to-zoom gesture hack.
      static bool sUsePinchHack;
      static DWORD sZoomUntil;
    };  // class Elantech

    // Apoint is a touchpad driver of Alps.
    class Apoint {
     public:
      static bool IsDriverInstalled() { return sMajorVersion != 0; }
      /**
       * GetDriverMajorVersion() returns the installed driver's major version.
       * If Apoint driver isn't installed, this returns 0.
       */
      static int32_t GetDriverMajorVersion() { return sMajorVersion; }
      /**
       * GetDriverMinorVersion() returns the installed driver's minor version.
       * If Apoint driver isn't installed, this returns -1.
       */
      static int32_t GetDriverMinorVersion() { return sMinorVersion; }

      static void Init();

     private:
      static bool sInitialized;
      static int32_t sMajorVersion;
      static int32_t sMinorVersion;
    };

    class TrackPoint {
     public:
      /**
       * IsDriverInstalled() returns TRUE if TrackPoint's driver is installed.
       * Otherwise, returns FALSE.
       */
      static bool IsDriverInstalled();
    };  // class TrackPoint

    class UltraNav {
     public:
      /**
       * IsObsoleteDriverInstalled() checks whether obsoleted UltraNav
       * is installed on the environment.
       * Returns TRUE if it was installed.  Otherwise, FALSE.
       */
      static bool IsObsoleteDriverInstalled();
    };  // class UltraNav

    class SetPoint {
     public:
      /**
       * SetPoint, Logitech's mouse driver, may report wrong cursor position
       * for WM_MOUSEHWHEEL message.  See comment in the implementation for
       * the detail.
       */
      static bool IsGetMessagePosResponseValid(UINT aMessage, WPARAM aWParam,
                                               LPARAM aLParam);

     private:
      static bool sMightBeUsing;
    };

    static void Init();

    static bool IsFakeScrollableWindowNeeded() {
      return sFakeScrollableWindowNeeded;
    }

   private:
    /**
     * Gets the bool value of aPrefName used to enable or disable an input
     * workaround (like the Trackpoint hack).  The pref can take values 0 (for
     * disabled), 1 (for enabled) or -1 (to automatically detect whether to
     * enable the workaround).
     *
     * @param aPrefName The name of the pref.
     * @param aValueIfAutomatic Whether the given input workaround should be
     *                          enabled by default.
     */
    static bool GetWorkaroundPref(const char* aPrefName,
                                  bool aValueIfAutomatic);

    static bool sFakeScrollableWindowNeeded;
  };  // class Device
};

}  // namespace widget
}  // namespace mozilla

#endif  // mozilla_widget_WinMouseScrollHandler_h__
