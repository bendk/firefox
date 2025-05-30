/* -*- indent-tabs-mode: nil; js-indent-level: 2 -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

var CustomTitlebar = {
  init() {
    this._readPref();
    Services.prefs.addObserver(this._prefName, this);

    this._initialized = true;
    this._update();
  },

  allowedBy(condition, allow) {
    if (allow) {
      if (condition in this._disallowed) {
        delete this._disallowed[condition];
        this._update();
      }
    } else if (!(condition in this._disallowed)) {
      this._disallowed[condition] = null;
      this._update();
    }
  },

  get systemSupported() {
    let isSupported = false;
    switch (AppConstants.MOZ_WIDGET_TOOLKIT) {
      case "windows":
      case "cocoa":
        isSupported = true;
        break;
      case "gtk":
        isSupported = window.matchMedia("(-moz-gtk-csd-available)").matches;
        break;
    }
    delete this.systemSupported;
    return (this.systemSupported = isSupported);
  },

  get enabled() {
    return document.documentElement.hasAttribute("customtitlebar");
  },

  observe(subject, topic) {
    if (topic == "nsPref:changed") {
      this._readPref();
    }
  },

  _initialized: false,
  _disallowed: {},
  _prefName: "browser.tabs.inTitlebar",

  _readPref() {
    let hiddenTitlebar = Services.appinfo.drawInTitlebar;
    this.allowedBy("pref", hiddenTitlebar);
  },

  _update() {
    if (!this._initialized) {
      return;
    }

    let allowed =
      this.systemSupported &&
      !window.fullScreen &&
      !Object.keys(this._disallowed).length;

    document.documentElement.toggleAttribute("customtitlebar", allowed);
    if (AppConstants.platform == "macosx") {
      document.documentElement.toggleAttribute("drawtitle", !allowed);
    }

    ToolbarIconColor.inferFromText("customtitlebar", allowed);
    TabBarVisibility.update(true);
  },

  uninit() {
    Services.prefs.removeObserver(this._prefName, this);
  },
};
