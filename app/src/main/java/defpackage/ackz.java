package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ackz implements abxf {
    UNSPECIFIED(0),
    ABOUT_ME(107),
    ACCESSIBILITY(29),
    ACTIVE_EDGE(24),
    ACTIVE_EDGE_SENSITIVITY(37),
    ADAPTIVE_BATTERY(150),
    ADAPTIVE_BRIGHTNESS(7),
    ADAPTIVE_CHARGING(156),
    ADAPTIVE_CONNECTIVITY(157),
    ADAPTIVE_SOUND(251),
    ADD_ACCOUNT(250),
    ADD_BLUETOOTH_DEVICE(153),
    ADD_DEVICE(108),
    ADD_FINGERPRINT(39),
    ADS_TRACKING(241),
    AIRPLANE_MODE(3),
    ALARM_VOLUME(53),
    ALARM_SOUND(211),
    ALLOW_MULTIPLE_USERS(247),
    AMBIENT_DISPLAY_ALWAYS_ON(22),
    AMBIENT_DISPLAY_NEW_NOTIFICATION(23),
    ANDROID_AUTO(186),
    ANDROID_VERSION(130),
    APP_BATTERY_USAGE(13),
    APP_DATA_USAGE(20),
    APP_DETAILS(50),
    APP_SHORTCUT(104),
    APPS_NOTIFICATIONS(226),
    APPS_STORAGE(120),
    ASSISTANT_ACCOUNT(109),
    ASSISTANT_FACE_MATCH(115),
    ASSISTANT_LANGUAGE(111),
    ASSISTANT_VOICE_MATCH(110),
    AUTO_ROTATE(15),
    AUTO_ROTATE_FACE_DETECTION(158),
    BACKUP(197),
    BATTERY_HEALTH(322),
    BATTERY_LEVEL(6),
    BATTERY_LOW(152),
    BATTERY_PERCENTAGE(131),
    BATTERY_PRESENT(147),
    BATTERY_SAVER(14),
    BATTERY_SAVER_SCHEDULE(229),
    BATTERY_SHARE(188),
    BATTERY_USAGE(142),
    BIOMETRIC(121),
    BLUETOOTH(2),
    BLUETOOTH_NAME(189),
    BLUETOOTH_ADDRESS(199),
    BLUETOOTH_SETTINGS(190),
    BRIGHTNESS_LEVEL(4),
    BUBBLES(159),
    CALL_VOLUME(56),
    CAMERA_DOUBLE_TWIST(31),
    CAST(143),
    CAR_CRASH_DETECTION(243),
    COLOR_INVERSION(27),
    COLOR_CORRECTION(221),
    CONVERSATIONS(228),
    CHARGING_SOUNDS_AND_VIBRATION(160),
    CHARGING_STATE(161),
    CONNECTED_DEVICES(216),
    CONTACTLESS_PAYMENTS(132),
    DATA_ROAMING(21),
    DATA_SAVER(18),
    DATA_USAGE(43),
    DATA_LIMIT(206),
    DATA_LIMIT_LEVEL(207),
    DATA_WARNING(208),
    DATA_WARNING_LEVEL(209),
    DEFAULT_ALARM_SOUND(236),
    DEFAULT_NOTIFICATION_SOUND(237),
    DEFAULT_APPS(133),
    DEVELOPER_OPTIONS(144),
    DEVICE_ASSISTANT_APP(245),
    DEVICE_NAME(201),
    DISPLAY_OVER_OTHER_APPS(134),
    DISPLAY_SIZE(40),
    DO_NOT_DISTURB(8),
    DO_NOT_DISTURB_MESSAGES(194),
    DO_NOT_DISTURB_CALLS(195),
    DO_NOT_DISTURB_ALARMS(196),
    DO_NOT_DISTURB_SCHEDULES(184),
    DOUBLE_TAP_CHECK_PHONE(46),
    DRIVING_MODE(212),
    EARTHQUAKE_ALERTS(244),
    EMERGENCY(217),
    EMERGENCY_ALERTS(162),
    EMERGENCY_CONTACTS(242),
    EMERGENCY_INFORMATION(36),
    ETHERNET_TETHERING(135),
    EXTRA_DIM(223),
    EXTREME_BATTERY_SAVER(218),
    FACTORY_RESET(136),
    FIND_MY_DEVICE(231),
    FLASHLIGHT(51),
    FOCUS_MODE(141),
    FONT_SIZE(41),
    FREE_UP_SPACE(34),
    FINGERPRINT_MANAGER(246),
    GESTURES(122),
    HAPTIC_FEEDBACK_VIBRATION(163),
    HARD_KEYBOARD(233),
    HEADS_UP(164),
    HIGH_REFRESH_RATE(215),
    HOT_SPOT(19),
    HOTSPOT_TETHERING(123),
    HOT_WORD(117),
    HUB_MODE(313),
    IP_ADDRESS(204),
    IMPROVE_LOCATION_ACCURACY(165),
    JUMP_TO_CAMERA(45),
    KEYBOARD_SHORTCUTS(137),
    LIFT_CHECK_PHONE(47),
    LIVE_TRANSLATE(240),
    LOCATION(17),
    LOCATION_HISTORY(232),
    LOCATION_BLUETOOTH_SCANNING(166),
    LOCATION_WIFI_SCANNING(167),
    LOCK_SCREEN(124),
    LOCK_SCREEN_DEVICE_CONTROLS(168),
    LOCK_SCREEN_WALLET(169),
    MAC_ADDRESS(205),
    MAGNIFICATION(170),
    MAGNIFY_BUTTON(55),
    MAGNIFY_TRIPLE_TAP(54),
    MANIFY_BUTTON(26),
    MANIFY_TRIPLE_TAP(25),
    MEDIA(125),
    MEDIA_VOLUME(57),
    MICROPHONE_ACCESS(234),
    MOBILE(146),
    MOBILE_DATA(16),
    MUSIC(114),
    MUTE_MODE(155),
    NETWORK(145),
    NETWORK_RESET(214),
    NFC(28),
    NIGHT_LIGHT_INTENSITY(10),
    NIGHT_LIGHT_SWITCH(9),
    NIGHT_MODE(52),
    NOTIFICATION_BADGE(30),
    NOTIFICATION_SOUND(210),
    NOTIFICATION_ON_SCREEN(171),
    NOTIFICATION_HISTORY(227),
    NOTIFY_FOR_PUBLIC_NETWORKS(172),
    ONEHANDED_MODE(173),
    OS_VERSION(238),
    PASSWORD(105),
    PERMISSION_MANAGER(200),
    PERMISSION_USAGE(222),
    PERSONALIZATION(112),
    PRINTING(225),
    PHONE_NUMBER(203),
    PICTURE_IN_PICTURE(126),
    POINTER_SPEED(174),
    POWER_MENU(127),
    REMINDERS(113),
    REQUIRE_DEVICE_UNLOCK_FOR_NFC(149),
    RINGTONE(11),
    RING_VOLUME(12),
    NEARBY_DEVICES_SCANNING(191),
    NEARBY_SHARE(213),
    SCREEN_LOCKING_SOUND(175),
    SCREEN_MAGNIFICATION(176),
    SCREEN_TIMEOUT(148),
    SCREEN_LOCK(219),
    SCREEN_SAVER(230),
    SELECT_TO_SPEAK(85),
    SET_TIME_AUTOMATICALLY(177),
    SET_TIME_ZONE_AUTOMATICALLY(178),
    SETTINGS(119),
    SIM(128),
    SIM_MANAGER(224),
    SPEECH_RATE(138),
    STORAGE_USAGE(35),
    SWIPE_FOR_NOTIFICATION(48),
    SWITCH_ACCESS(42),
    SYSTEM_UPDATE(32),
    SYSTEM_UPDATES(239),
    SYSTEM_NAVIGATION(220),
    SYSTEM_NAVIGATION_GESTURES(249),
    SYSTEM_NAVIGATION_BUTTONS(248),
    TALKBACK_PASSWORDS(179),
    TEXT_TO_SPEECH(118),
    TIME_ZONE(202),
    UNUSED_APPS(185),
    USB(187),
    USB_TETHERING(139),
    VERBOSE_TTS(49),
    VIBRATE(180),
    VIBRATION(235),
    VIBRATION_MODE(154),
    VOICE(44),
    VOLUME_LEVEL(5),
    WAKE_SCREEN_FOR_NOTIFICATIONS(ModuleDescriptor.MODULE_VERSION),
    WALLPAPERS(38),
    WEBVIEW(140),
    WIFI(1),
    WIFI_ADD_NETWORK(192),
    WIFI_ADD_NETWORK_QR_CODE(193),
    WIFI_CALLING(129),
    WIFI_HOTSPOT(100),
    ACCESSIBILITY_SELECT_TO_SPEAK(252),
    CRISIS_ALERTS(253),
    REGULATORY_LABELS(254),
    SEND_FEEDBACK(255),
    OS_BUILD_NUMBER(256),
    ACCESSIBILITY_SHORTCUTS(257),
    ACCESSIBILITY_MENU(258),
    ACCESSIBILITY_SOUND_AMPLIFIER(259),
    ACCESSIBILITY_LIVE_TRANSCRIBE(260),
    ACCESSIBILITY_SOUND_NOTIFICATIONS(261),
    ACCESSIBILITY_TALKBACK(262),
    ACCESSIBILITY_TIMEOUT(263),
    CAMERA_SETTINGS(264),
    BATTERY_SAVER_TOGGLE(265),
    COVID_NOTIFICATIONS(266),
    APP_LOCATION(267),
    LOCATION_SERVICES(268),
    PRIVATE_DNS(269),
    UNRESTRICTED_DATA(270),
    PREFERRED_NETWORK(271),
    NETWORK_PREFERENCES(272),
    PASSWORDS_AND_ACCOUNTS(273),
    PRIVACY_DASHBOARD(274),
    MORE_SECURITY(275),
    APP_PINNING(276),
    CONFIRM_SIM_DELETION(277),
    ENCRYPT_PHONE(278),
    FACE_UNLOCK(279),
    INSTALL_UNKNOWN_APPS(280),
    NOW_PLAYING(281),
    STAY_AWAKE(282),
    ASSISTANT_VOICE(283),
    RESET_BLUETOOTH_WIFI(284),
    DEFAULT_PHONE_APP(285),
    GOOGLE_ACCOUNT(286),
    ACCESSIBILITY_CAPTION_SIZE_AND_STYLE(287),
    ACCESSIBILITY_CAPTION_STYLE(288),
    ACCESSIBILITY_CAPTION_TEXT(289),
    ACCESSIBILITY_CAPTION_PREFERENCES(290),
    ACCESSIBILITY_COLOR_AND_MOTION(291),
    ACCESSIBILITY_BOLD_TEXT(292),
    LIVE_CAPTION(293),
    POWER_BUTTON_ENDS_CALL(294),
    TOUCH_AND_HOLD_DELAY(295),
    ACCESSIBILITY_VOICE_ACCESS(296),
    SMS_PERMISSIONS(297),
    SPECIAL_APP_ACCESS(298),
    DARK_THEME_SCHEDULE(299),
    LOCK_SCREEN_TEXT(300),
    NIGHT_LIGHT_SCHEDULE(301),
    AUTOFILL(302),
    USAGE_AND_DIAGNOSTICS(303),
    SENSITIVE_NOTIFICATIONS(304),
    ENCRYPTION_AND_CREDENTIALS(305),
    SPACIAL_AUDIO(306),
    RESET_OPTIONS(307),
    QUICK_TAP(308),
    TIPS_AND_SUPPORT(309),
    SCREEN_ATTENTION(311),
    BLUETOOTH_TETHERING(312),
    ALL_APPS(314),
    EXTEND_UNLOCK(315),
    CLEAR_CALLING(316),
    GOOGLE_SETTINGS(317),
    APP_LANGUAGES(318),
    SIM_STATUS(319),
    MICROPHONE_PERMISSIONS(320),
    GOOGLE_PLAY_UPDATE(321),
    ADD_GOOGLE_ACCOUNT(323),
    ASSISTANT_SPOKEN_NOTIFICATIONS(324),
    ABOUT_PHONE(106),
    ACCOUNTS(58),
    APPLICATION(59),
    ASSISTANT(77),
    AUDIO(73),
    BATTERY(60),
    BELL_SCHEDULE(99),
    CONTINUED_CONVERSATION(78),
    DATE_TIME(61),
    DARK_THEME(82),
    DEVICE_INFO(62),
    DICTIONARY(63),
    DIGITAL_WELLBEING(72),
    DISPLAY(64),
    LANGUAGE(74),
    NIGHT_LIGHT(75),
    NOTIFICATION(65),
    NOTIFICATION_VOLUME(66),
    PHONE_RINGTONE(81),
    PRIVACY(67),
    ROAMING(76),
    ROUTINES(79),
    SEARCH(84),
    SECURITY(68),
    SOUND(69),
    SPELL_CHECKER(80),
    SYSTEM(83),
    STORAGE(70),
    VPN(71),
    AUTOCLICK(86),
    CARET_HIGHLIGHT(87),
    CHROMEVOX(88),
    CURSOR_HIGHLIGHT(89),
    DOCKED_MAGNIFIER(90),
    FOCUS_HIGHLIGHT(91),
    FULLSCREEN_MAGNIFIER(92),
    HIGH_CONTRAST_MODE(93),
    LARGE_CURSOR(94),
    MONO_AUDIO(95),
    STICKY_KEYS(96),
    TAP_DRAGGING(97),
    VIRTUAL_KEYBOARD(98),
    WEARABLE_AMBIENT(101),
    WEARABLE_NOISE_CANCELLATION(102),
    WEARABLE_TOUCH_CONTROLS(103),
    RAISE_TO_TALK(116),
    BEDTIME_MODE(181),
    THEATER_MODE(182),
    TOUCH_LOCK(183),
    PRESS_AND_HOLD(310),
    WATCH_FACE(326),
    NOTIFICATION_ANNOUNCEMENT(325),
    UNRECOGNIZED(-1);

    private final int fp;

    ackz(int i) {
        this.fp = i;
    }

    public static ackz b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return WIFI;
            case 2:
                return BLUETOOTH;
            case 3:
                return AIRPLANE_MODE;
            case 4:
                return BRIGHTNESS_LEVEL;
            case 5:
                return VOLUME_LEVEL;
            case 6:
                return BATTERY_LEVEL;
            case 7:
                return ADAPTIVE_BRIGHTNESS;
            case 8:
                return DO_NOT_DISTURB;
            case 9:
                return NIGHT_LIGHT_SWITCH;
            case 10:
                return NIGHT_LIGHT_INTENSITY;
            case 11:
                return RINGTONE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return RING_VOLUME;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return APP_BATTERY_USAGE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return BATTERY_SAVER;
            case 15:
                return AUTO_ROTATE;
            case 16:
                return MOBILE_DATA;
            case 17:
                return LOCATION;
            case 18:
                return DATA_SAVER;
            case 19:
                return HOT_SPOT;
            case 20:
                return APP_DATA_USAGE;
            case 21:
                return DATA_ROAMING;
            case 22:
                return AMBIENT_DISPLAY_ALWAYS_ON;
            case 23:
                return AMBIENT_DISPLAY_NEW_NOTIFICATION;
            case 24:
                return ACTIVE_EDGE;
            case 25:
                return MANIFY_TRIPLE_TAP;
            case 26:
                return MANIFY_BUTTON;
            case 27:
                return COLOR_INVERSION;
            case 28:
                return NFC;
            case 29:
                return ACCESSIBILITY;
            case 30:
                return NOTIFICATION_BADGE;
            case 31:
                return CAMERA_DOUBLE_TWIST;
            case 32:
                return SYSTEM_UPDATE;
            case 33:
            case 198:
            default:
                return null;
            case 34:
                return FREE_UP_SPACE;
            case 35:
                return STORAGE_USAGE;
            case 36:
                return EMERGENCY_INFORMATION;
            case 37:
                return ACTIVE_EDGE_SENSITIVITY;
            case 38:
                return WALLPAPERS;
            case 39:
                return ADD_FINGERPRINT;
            case 40:
                return DISPLAY_SIZE;
            case 41:
                return FONT_SIZE;
            case 42:
                return SWITCH_ACCESS;
            case 43:
                return DATA_USAGE;
            case 44:
                return VOICE;
            case 45:
                return JUMP_TO_CAMERA;
            case 46:
                return DOUBLE_TAP_CHECK_PHONE;
            case 47:
                return LIFT_CHECK_PHONE;
            case 48:
                return SWIPE_FOR_NOTIFICATION;
            case 49:
                return VERBOSE_TTS;
            case 50:
                return APP_DETAILS;
            case 51:
                return FLASHLIGHT;
            case 52:
                return NIGHT_MODE;
            case 53:
                return ALARM_VOLUME;
            case 54:
                return MAGNIFY_TRIPLE_TAP;
            case 55:
                return MAGNIFY_BUTTON;
            case 56:
                return CALL_VOLUME;
            case 57:
                return MEDIA_VOLUME;
            case 58:
                return ACCOUNTS;
            case 59:
                return APPLICATION;
            case 60:
                return BATTERY;
            case 61:
                return DATE_TIME;
            case 62:
                return DEVICE_INFO;
            case 63:
                return DICTIONARY;
            case 64:
                return DISPLAY;
            case 65:
                return NOTIFICATION;
            case 66:
                return NOTIFICATION_VOLUME;
            case 67:
                return PRIVACY;
            case 68:
                return SECURITY;
            case 69:
                return SOUND;
            case 70:
                return STORAGE;
            case 71:
                return VPN;
            case 72:
                return DIGITAL_WELLBEING;
            case 73:
                return AUDIO;
            case 74:
                return LANGUAGE;
            case 75:
                return NIGHT_LIGHT;
            case 76:
                return ROAMING;
            case 77:
                return ASSISTANT;
            case 78:
                return CONTINUED_CONVERSATION;
            case 79:
                return ROUTINES;
            case 80:
                return SPELL_CHECKER;
            case 81:
                return PHONE_RINGTONE;
            case 82:
                return DARK_THEME;
            case 83:
                return SYSTEM;
            case 84:
                return SEARCH;
            case 85:
                return SELECT_TO_SPEAK;
            case 86:
                return AUTOCLICK;
            case 87:
                return CARET_HIGHLIGHT;
            case 88:
                return CHROMEVOX;
            case 89:
                return CURSOR_HIGHLIGHT;
            case 90:
                return DOCKED_MAGNIFIER;
            case 91:
                return FOCUS_HIGHLIGHT;
            case 92:
                return FULLSCREEN_MAGNIFIER;
            case 93:
                return HIGH_CONTRAST_MODE;
            case 94:
                return LARGE_CURSOR;
            case 95:
                return MONO_AUDIO;
            case 96:
                return STICKY_KEYS;
            case 97:
                return TAP_DRAGGING;
            case 98:
                return VIRTUAL_KEYBOARD;
            case 99:
                return BELL_SCHEDULE;
            case 100:
                return WIFI_HOTSPOT;
            case 101:
                return WEARABLE_AMBIENT;
            case 102:
                return WEARABLE_NOISE_CANCELLATION;
            case 103:
                return WEARABLE_TOUCH_CONTROLS;
            case 104:
                return APP_SHORTCUT;
            case 105:
                return PASSWORD;
            case 106:
                return ABOUT_PHONE;
            case 107:
                return ABOUT_ME;
            case 108:
                return ADD_DEVICE;
            case 109:
                return ASSISTANT_ACCOUNT;
            case 110:
                return ASSISTANT_VOICE_MATCH;
            case 111:
                return ASSISTANT_LANGUAGE;
            case 112:
                return PERSONALIZATION;
            case 113:
                return REMINDERS;
            case 114:
                return MUSIC;
            case 115:
                return ASSISTANT_FACE_MATCH;
            case 116:
                return RAISE_TO_TALK;
            case 117:
                return HOT_WORD;
            case 118:
                return TEXT_TO_SPEECH;
            case 119:
                return SETTINGS;
            case 120:
                return APPS_STORAGE;
            case 121:
                return BIOMETRIC;
            case 122:
                return GESTURES;
            case 123:
                return HOTSPOT_TETHERING;
            case 124:
                return LOCK_SCREEN;
            case 125:
                return MEDIA;
            case 126:
                return PICTURE_IN_PICTURE;
            case 127:
                return POWER_MENU;
            case 128:
                return SIM;
            case 129:
                return WIFI_CALLING;
            case 130:
                return ANDROID_VERSION;
            case 131:
                return BATTERY_PERCENTAGE;
            case 132:
                return CONTACTLESS_PAYMENTS;
            case 133:
                return DEFAULT_APPS;
            case 134:
                return DISPLAY_OVER_OTHER_APPS;
            case 135:
                return ETHERNET_TETHERING;
            case 136:
                return FACTORY_RESET;
            case 137:
                return KEYBOARD_SHORTCUTS;
            case 138:
                return SPEECH_RATE;
            case 139:
                return USB_TETHERING;
            case 140:
                return WEBVIEW;
            case 141:
                return FOCUS_MODE;
            case 142:
                return BATTERY_USAGE;
            case 143:
                return CAST;
            case 144:
                return DEVELOPER_OPTIONS;
            case 145:
                return NETWORK;
            case 146:
                return MOBILE;
            case 147:
                return BATTERY_PRESENT;
            case 148:
                return SCREEN_TIMEOUT;
            case 149:
                return REQUIRE_DEVICE_UNLOCK_FOR_NFC;
            case 150:
                return ADAPTIVE_BATTERY;
            case ModuleDescriptor.MODULE_VERSION /* 151 */:
                return WAKE_SCREEN_FOR_NOTIFICATIONS;
            case 152:
                return BATTERY_LOW;
            case 153:
                return ADD_BLUETOOTH_DEVICE;
            case 154:
                return VIBRATION_MODE;
            case 155:
                return MUTE_MODE;
            case 156:
                return ADAPTIVE_CHARGING;
            case 157:
                return ADAPTIVE_CONNECTIVITY;
            case 158:
                return AUTO_ROTATE_FACE_DETECTION;
            case 159:
                return BUBBLES;
            case 160:
                return CHARGING_SOUNDS_AND_VIBRATION;
            case 161:
                return CHARGING_STATE;
            case 162:
                return EMERGENCY_ALERTS;
            case 163:
                return HAPTIC_FEEDBACK_VIBRATION;
            case 164:
                return HEADS_UP;
            case 165:
                return IMPROVE_LOCATION_ACCURACY;
            case 166:
                return LOCATION_BLUETOOTH_SCANNING;
            case 167:
                return LOCATION_WIFI_SCANNING;
            case 168:
                return LOCK_SCREEN_DEVICE_CONTROLS;
            case 169:
                return LOCK_SCREEN_WALLET;
            case 170:
                return MAGNIFICATION;
            case 171:
                return NOTIFICATION_ON_SCREEN;
            case 172:
                return NOTIFY_FOR_PUBLIC_NETWORKS;
            case 173:
                return ONEHANDED_MODE;
            case 174:
                return POINTER_SPEED;
            case 175:
                return SCREEN_LOCKING_SOUND;
            case 176:
                return SCREEN_MAGNIFICATION;
            case 177:
                return SET_TIME_AUTOMATICALLY;
            case 178:
                return SET_TIME_ZONE_AUTOMATICALLY;
            case 179:
                return TALKBACK_PASSWORDS;
            case 180:
                return VIBRATE;
            case 181:
                return BEDTIME_MODE;
            case 182:
                return THEATER_MODE;
            case 183:
                return TOUCH_LOCK;
            case 184:
                return DO_NOT_DISTURB_SCHEDULES;
            case 185:
                return UNUSED_APPS;
            case 186:
                return ANDROID_AUTO;
            case 187:
                return USB;
            case 188:
                return BATTERY_SHARE;
            case 189:
                return BLUETOOTH_NAME;
            case 190:
                return BLUETOOTH_SETTINGS;
            case 191:
                return NEARBY_DEVICES_SCANNING;
            case 192:
                return WIFI_ADD_NETWORK;
            case 193:
                return WIFI_ADD_NETWORK_QR_CODE;
            case 194:
                return DO_NOT_DISTURB_MESSAGES;
            case 195:
                return DO_NOT_DISTURB_CALLS;
            case 196:
                return DO_NOT_DISTURB_ALARMS;
            case 197:
                return BACKUP;
            case 199:
                return BLUETOOTH_ADDRESS;
            case 200:
                return PERMISSION_MANAGER;
            case 201:
                return DEVICE_NAME;
            case 202:
                return TIME_ZONE;
            case 203:
                return PHONE_NUMBER;
            case 204:
                return IP_ADDRESS;
            case 205:
                return MAC_ADDRESS;
            case 206:
                return DATA_LIMIT;
            case 207:
                return DATA_LIMIT_LEVEL;
            case 208:
                return DATA_WARNING;
            case 209:
                return DATA_WARNING_LEVEL;
            case 210:
                return NOTIFICATION_SOUND;
            case 211:
                return ALARM_SOUND;
            case 212:
                return DRIVING_MODE;
            case 213:
                return NEARBY_SHARE;
            case 214:
                return NETWORK_RESET;
            case 215:
                return HIGH_REFRESH_RATE;
            case 216:
                return CONNECTED_DEVICES;
            case 217:
                return EMERGENCY;
            case 218:
                return EXTREME_BATTERY_SAVER;
            case 219:
                return SCREEN_LOCK;
            case 220:
                return SYSTEM_NAVIGATION;
            case 221:
                return COLOR_CORRECTION;
            case 222:
                return PERMISSION_USAGE;
            case 223:
                return EXTRA_DIM;
            case 224:
                return SIM_MANAGER;
            case 225:
                return PRINTING;
            case 226:
                return APPS_NOTIFICATIONS;
            case 227:
                return NOTIFICATION_HISTORY;
            case 228:
                return CONVERSATIONS;
            case 229:
                return BATTERY_SAVER_SCHEDULE;
            case 230:
                return SCREEN_SAVER;
            case 231:
                return FIND_MY_DEVICE;
            case 232:
                return LOCATION_HISTORY;
            case 233:
                return HARD_KEYBOARD;
            case 234:
                return MICROPHONE_ACCESS;
            case 235:
                return VIBRATION;
            case 236:
                return DEFAULT_ALARM_SOUND;
            case 237:
                return DEFAULT_NOTIFICATION_SOUND;
            case 238:
                return OS_VERSION;
            case 239:
                return SYSTEM_UPDATES;
            case 240:
                return LIVE_TRANSLATE;
            case 241:
                return ADS_TRACKING;
            case 242:
                return EMERGENCY_CONTACTS;
            case 243:
                return CAR_CRASH_DETECTION;
            case 244:
                return EARTHQUAKE_ALERTS;
            case 245:
                return DEVICE_ASSISTANT_APP;
            case 246:
                return FINGERPRINT_MANAGER;
            case 247:
                return ALLOW_MULTIPLE_USERS;
            case 248:
                return SYSTEM_NAVIGATION_BUTTONS;
            case 249:
                return SYSTEM_NAVIGATION_GESTURES;
            case 250:
                return ADD_ACCOUNT;
            case 251:
                return ADAPTIVE_SOUND;
            case 252:
                return ACCESSIBILITY_SELECT_TO_SPEAK;
            case 253:
                return CRISIS_ALERTS;
            case 254:
                return REGULATORY_LABELS;
            case 255:
                return SEND_FEEDBACK;
            case 256:
                return OS_BUILD_NUMBER;
            case 257:
                return ACCESSIBILITY_SHORTCUTS;
            case 258:
                return ACCESSIBILITY_MENU;
            case 259:
                return ACCESSIBILITY_SOUND_AMPLIFIER;
            case 260:
                return ACCESSIBILITY_LIVE_TRANSCRIBE;
            case 261:
                return ACCESSIBILITY_SOUND_NOTIFICATIONS;
            case 262:
                return ACCESSIBILITY_TALKBACK;
            case 263:
                return ACCESSIBILITY_TIMEOUT;
            case 264:
                return CAMERA_SETTINGS;
            case 265:
                return BATTERY_SAVER_TOGGLE;
            case 266:
                return COVID_NOTIFICATIONS;
            case 267:
                return APP_LOCATION;
            case 268:
                return LOCATION_SERVICES;
            case 269:
                return PRIVATE_DNS;
            case 270:
                return UNRESTRICTED_DATA;
            case 271:
                return PREFERRED_NETWORK;
            case 272:
                return NETWORK_PREFERENCES;
            case 273:
                return PASSWORDS_AND_ACCOUNTS;
            case 274:
                return PRIVACY_DASHBOARD;
            case 275:
                return MORE_SECURITY;
            case 276:
                return APP_PINNING;
            case 277:
                return CONFIRM_SIM_DELETION;
            case 278:
                return ENCRYPT_PHONE;
            case 279:
                return FACE_UNLOCK;
            case 280:
                return INSTALL_UNKNOWN_APPS;
            case 281:
                return NOW_PLAYING;
            case 282:
                return STAY_AWAKE;
            case 283:
                return ASSISTANT_VOICE;
            case 284:
                return RESET_BLUETOOTH_WIFI;
            case 285:
                return DEFAULT_PHONE_APP;
            case 286:
                return GOOGLE_ACCOUNT;
            case 287:
                return ACCESSIBILITY_CAPTION_SIZE_AND_STYLE;
            case 288:
                return ACCESSIBILITY_CAPTION_STYLE;
            case 289:
                return ACCESSIBILITY_CAPTION_TEXT;
            case 290:
                return ACCESSIBILITY_CAPTION_PREFERENCES;
            case 291:
                return ACCESSIBILITY_COLOR_AND_MOTION;
            case 292:
                return ACCESSIBILITY_BOLD_TEXT;
            case 293:
                return LIVE_CAPTION;
            case 294:
                return POWER_BUTTON_ENDS_CALL;
            case 295:
                return TOUCH_AND_HOLD_DELAY;
            case 296:
                return ACCESSIBILITY_VOICE_ACCESS;
            case 297:
                return SMS_PERMISSIONS;
            case 298:
                return SPECIAL_APP_ACCESS;
            case 299:
                return DARK_THEME_SCHEDULE;
            case 300:
                return LOCK_SCREEN_TEXT;
            case 301:
                return NIGHT_LIGHT_SCHEDULE;
            case 302:
                return AUTOFILL;
            case 303:
                return USAGE_AND_DIAGNOSTICS;
            case 304:
                return SENSITIVE_NOTIFICATIONS;
            case 305:
                return ENCRYPTION_AND_CREDENTIALS;
            case 306:
                return SPACIAL_AUDIO;
            case 307:
                return RESET_OPTIONS;
            case 308:
                return QUICK_TAP;
            case 309:
                return TIPS_AND_SUPPORT;
            case 310:
                return PRESS_AND_HOLD;
            case 311:
                return SCREEN_ATTENTION;
            case 312:
                return BLUETOOTH_TETHERING;
            case 313:
                return HUB_MODE;
            case 314:
                return ALL_APPS;
            case 315:
                return EXTEND_UNLOCK;
            case 316:
                return CLEAR_CALLING;
            case 317:
                return GOOGLE_SETTINGS;
            case 318:
                return APP_LANGUAGES;
            case 319:
                return SIM_STATUS;
            case 320:
                return MICROPHONE_PERMISSIONS;
            case 321:
                return GOOGLE_PLAY_UPDATE;
            case 322:
                return BATTERY_HEALTH;
            case 323:
                return ADD_GOOGLE_ACCOUNT;
            case 324:
                return ASSISTANT_SPOKEN_NOTIFICATIONS;
            case 325:
                return NOTIFICATION_ANNOUNCEMENT;
            case 326:
                return WATCH_FACE;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.fp;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.fp);
    }
}
