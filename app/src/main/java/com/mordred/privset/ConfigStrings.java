package com.mordred.privset;

/**
 * Created by mordred on 18.05.2017.
 */

public class ConfigStrings {
    public static final String[] boolConfigs = new String[]{
            "config_freeformWindowManagement",
            "config_supportsMultiWindow",
            "config_useRoundIcon",
            "config_supportSystemNavigationKeys",
            "config_sf_limitedAlpha",
            "config_sf_slowBlur",
            "config_useVolumeKeySounds",
            "config_ui_enableFadingMarquee",
            "config_closeDialogWhenTouchOutside",
            "config_avoidGfxAccel",
            "config_enableAutoPowerModes",
            "config_automatic_brightness_available",
            "config_unplugTurnsOnScreen",
            "config_useAttentionLight",
            "config_animateScreenLights",
            "config_enableScreenshotChord",
            "config_allowTheaterModeWakeFromUnplug",
            "config_allowTheaterModeWakeFromGesture",
            "config_allowTheaterModeWakeFromCameraLens",
            "config_allowTheaterModeWakeFromPowerKey",
            "config_allowTheaterModeWakeFromKey",
            "config_allowTheaterModeWakeFromMotion",
            "config_allowTheaterModeWakeFromMotionWhenNotDreaming",
            "config_allowTheaterModeWakeFromLidSwitch",
            "config_allowTheaterModeWakeFromDock",
            "config_allowTheaterModeWakeFromWindowLayout",
            "config_goToSleepOnButtonPressTheaterMode",
            "config_supportLongPressPowerWhenNonInteractive",
            "config_supportAutoRotation",
            "config_allowAllRotations",
            "config_reverseDefaultRotation",
            "config_lidControlsSleep",
            "config_deskDockEnablesAccelerometer",
            "config_carDockEnablesAccelerometer",
            "config_suspendWhenScreenOffDueToProximity",
            "config_batterySdCardAccessibility",
            "config_use_strict_phone_number_comparation",
            "config_intrusiveNotificationLed",
            "config_disableMenuKeyInLockScreen",
            "config_enableLockBeforeUnlockScreen",
            "config_enableLockScreenRotation",
            "config_enableLockScreenTranslucentDecor",
            "config_enableTranslucentDecor",
            "config_enable_emergency_call_while_sim_locked",
            "config_allowAutoBrightnessWhileDozing",
            "config_autoBrightnessResetAmbientLuxAfterWarmUp",
            "config_swipeDisambiguation",
            "config_enableWallpaperService",
            "config_bluetooth_sco_off_call",
            "config_bluetooth_wide_band_speech",
            "config_bluetooth_address_validation",
            "config_bluetooth_le_peripheral_mode_supported",
            "config_showMenuShortcutsWhenKeyboardPresent",
            "config_showNavigationBar",
            "config_actionMenuItemAllCaps",
            "config_allowActionMenuItemTextWithIcon",
            "config_dreamsSupported",
            "config_dreamsEnabledByDefault",
            "config_dreamsActivatedOnDockByDefault",
            "config_dreamsActivatedOnSleepByDefault",
            "config_dreamsEnabledOnBattery",
            "config_dozeAfterScreenOff",
            "config_powerDecoupleAutoSuspendModeFromDisplay",
            "config_powerDecoupleInteractiveModeFromDisplay",
            "config_syncstorageengine_masterSyncAutomatically",
            "config_enableMultiUserUI",
            "config_useDevInputEventForAudioJack",
            "config_safe_media_volume_enabled",
            "config_useFixedVolume",
            "config_forceDefaultOrientation",
            "config_hasPermanentDpad",
            "config_windowIsRound",
            "config_windowShowCircularMask",
            "config_windowEnableCircularEmulatorDisplayOverlay",
            "skipHoldBeforeMerge",
            "config_defaultWindowFeatureOptionsPanel",
            "config_defaultWindowFeatureContextMenu",
            "config_defaultInTouchMode",
            "config_enableBurnInProtection",
            "config_allowAnimationsInLowPowerMode",
            "config_supportDoubleTapWake",
            "config_mainBuiltInDisplayIsRound",
            "config_supportMicNearUltrasound",
            "config_supportSpeakerNearUltrasound",
            "config_cameraDoubleTapPowerGestureEnabled"
    };

    public static final String[] intConfigs = new String[]{
            "config_soundEffectVolumeDb",
            "config_lockSoundVolumeDb",
            "config_shortAnimTime",
            "config_mediumAnimTime",
            "config_longAnimTime",
            "config_activityShortDur",
            "config_activityDefaultDur",
            "config_lowMemoryKillerMinFreeKbytesAbsolute",
            "config_lowMemoryKillerMinFreeKbytesAdjust",
            "config_extraFreeKbytesAbsolute",
            "config_extraFreeKbytesAdjust",
            "config_lidOpenRotation",
            "config_backPanicBehavior",
            "config_lidKeyboardAccessibility",
            "config_lidNavigationAccessibility",
            "config_deskDockRotation",
            "config_deskDockKeepsScreenOn",
            "config_carDockRotation",
            "config_carDockKeepsScreenOn",
            "config_undockedHdmiRotation",
            "config_defaultUiModeType",
            "config_defaultNightMode",
            "config_longPressOnBackBehavior",
            "config_longPressOnPowerBehavior",
            "config_shortPressOnPowerBehavior",
            "config_doublePressOnPowerBehavior",
            "config_triplePressOnPowerBehavior",
            "config_shortPressOnSleepBehavior",
            "config_criticalBatteryWarningLevel",
            "config_shutdownBatteryTemperature",
            "config_lowBatteryWarningLevel",
            "config_lowBatteryCloseWarningBump",
            "config_defaultNotificationLedOn",
            "config_defaultNotificationLedOff",
            "config_notificationsBatteryLowARGB",
            "config_notificationsBatteryMediumARGB",
            "config_notificationsBatteryFullARGB",
            "config_notificationsBatteryLedOn",
            "config_notificationsBatteryLedOff",
            "config_notificationServiceArchiveSize",
            "config_longPressOnHomeBehavior",
            "config_doubleTapOnHomeBehavior",
            "config_screenBrightnessSettingMinimum",
            "config_screenBrightnessSettingMaximum",
            "config_screenBrightnessSettingDefault",
            "config_screenBrightnessDoze",
            "config_autoBrightnessBrighteningLightDebounce",
            "config_autoBrightnessDarkeningLightDebounce",
            "config_autoBrightnessLightSensorRate",
            "config_screenBrightnessDim",
            "config_screenBrightnessDark",
            "config_lightSensorWarmupTime",
            "config_virtualKeyQuietTimeMillis",
            "config_datause_polling_period_sec",
            "config_datause_threshold_bytes",
            "config_datause_throttle_kbitsps",
            "config_datause_notification_type",
            "config_downloadDataDirSize",
            "config_downloadDataDirLowSpaceThreshold",
            "config_cursorWindowSize",
            "status_bar_notification_info_maxnum",
            "config_dreamsBatteryLevelMinimumWhenPowered",
            "config_dreamsBatteryLevelMinimumWhenNotPowered",
            "config_dreamsBatteryLevelDrainCutoff",
            "config_minimumScreenOffTimeout",
            "config_maximumScreenDimDuration",
            "config_globalActionsKeyTimeout",
            "config_maxResolverActivityColumns",
            "config_multiuserMaximumUsers",
            "config_safe_media_volume_index",
            "config_immersive_mode_confirmation_panic",
            "config_overrideHasPermanentMenuKey",
            "config_windowOutsetBottom",
            "config_drawLockTimeoutMillis",
            "config_zen_repeat_callers_threshold",
            "config_screen_magnification_multi_tap_adjustment",
            "config_burnInProtectionMaxRadius",
            "config_burnInProtectionMinHorizontalOffset",
            "config_burnInProtectionMaxHorizontalOffset",
            "config_burnInProtectionMinVerticalOffset",
            "config_burnInProtectionMaxVerticalOffset",
            "config_fingerprintMaxTemplatesPerUser",
            "config_previousVibrationsDumpLimit",
            "config_cameraLaunchGestureSensorType"
    };

    public static final String[] stringConfigs = new String[]{
            "config_customAdbPublicKeyConfirmationComponent",
            "config_customVpnConfirmDialogComponent"
    };
}
