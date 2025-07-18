package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acgd implements abxf {
    UNKNOWN(0),
    ACCOUNT_CAPABILITIES(108),
    ACCOUNT_LOCATIONS_HOME_ICONS(173),
    ACCOUNT_LOCATIONS_WORK_ICONS(174),
    ACP_CONTEXT(24),
    ACTION_HISTORY(14),
    ACTION_HISTORY_EPHEMERAL(44),
    AMBIENT_ASSISTANT_LOCATION_FEEDBACK(57),
    ANDROID_PROMOTIONAL_NOTIFICATIONS(119),
    ANSWERS(4),
    ANSWERS_EVAL(30),
    APP_ACTIONS(22),
    APP_SHORTCUTS(55),
    APP_VOICIFICATION(63),
    ASSISTANT_ACTION_INTERACTION_EVENT(31),
    ASSISTANT_ALARM(71),
    ASSISTANT_ARBITRATION_HOST_IP(89),
    ASSISTANT_ASPIRE_ACTIVITY(74),
    ASSISTANT_AUTO_EMBEDDED_PAIRED_CONTACTS(133),
    ASSISTANT_CONTACT_AFFINITY(35),
    ASSISTANT_DEVICE_YOUTUBE_SETTINGS(111),
    ASSISTANT_DISTILLED_ACTION_USER_MODEL(19),
    ASSISTANT_EPHEMERAL_AUDIO(91),
    ASSISTANT_GROWTH_PROFILE(34),
    ASSISTANT_HISTORY(39),
    ASSISTANT_HISTORY_ON_DEVICE_UNREDACTED(115),
    ASSISTANT_HISTORY_KIDS(124),
    ASSISTANT_NLU_SERVER_AUX(92),
    ASSISTANT_ON_DEVICE_ACTIVITY(93),
    ASSISTANT_ON_DEVICE_DISCOVERY(106),
    ASSISTANT_REMINDERS(56),
    ASSISTANT_REMINDER_USER_PROFILE(112),
    ASSISTANT_VOICE_SETTINGS(134),
    ASSISTANT_DRIVING_SETTINGS(135),
    ASSISTANT_HELP_IMPROVE_ASSISTANT_SETTINGS(136),
    ASSISTANT_DEVICE_SETTINGS(137),
    ASSISTANT_PRODUCTIVITY_SETTINGS(138),
    ASSISTANT_NOTES_AND_LISTS_SETTINGS(139),
    ASSISTANT_ACCESSIBILITY_SETTINGS(140),
    ASSISTANT_LANGUAGE_PARTNER_SETTINGS(141),
    ASSISTANT_CALENDAR_SETTINGS(142),
    ASSISTANT_SHELDON_EMAIL_STATUS_SETTINGS(143),
    ASSISTANT_LOCKSCREEN_SETTINGS(144),
    ASSISTANT_DEVICE_SETTINGS_MUTATIONS(145),
    ASSISTANT_DRIVING_SETTINGS_MUTATIONS(146),
    ASSISTANT_LOCKSCREEN_SETTINGS_MUTATIONS(147),
    ASSISTANT_SETTINGS_METADATA(ModuleDescriptor.MODULE_VERSION),
    ASSISTANT_SETTINGS(18),
    ASSISTANT_UPDATES_CENTER_POOL(49),
    ASSISTANT_USAGE_STATISTICS(61),
    ASSISTANT_USER_DISPLAY_NAME(88),
    ASSISTANT_USER_PROFILE(118),
    ASSISTANT_UUDP_PROFILE(113),
    ASSISTANT_WHOLE_HOME_STATE_UPLOAD(105),
    AUIS(99),
    CHALKBOARD(60),
    CONVERSATIONAL_ACTIONS(76),
    CONTRIBUTOR_STUDIO_XGA_ELIGIBILITY(86),
    CROSS_DEVICE_ALARM(109),
    CROSS_DEVICE_TIMER(96),
    DAND_USER_PROFILE(176),
    DC_NOTIFICATION_SYNC(159),
    DC_NOTIFICATION_SYNC_DEVICES(170),
    DEEPLINK(17),
    DEVICE_CAPABILITIES(59),
    DEVICE_INSTALLED_APPS(33),
    ENCRYPTED_ONDEVICE_LOCATION_HISTORY(79),
    ENCRYPTED_ONDEVICE_LOCATION_HISTORY_TRIAL(131),
    FAST_PAIR(58),
    FEDERATED_HOTWORD_SIGNALS(128),
    FOOTPRINTS_FALSE_ACCEPT(40),
    GELLER_CONFIG(36),
    HABITS_PROFILE(32),
    HABITS_AA_PROFILES(45),
    HERON(90),
    HANDBAG_PERSONALIZED_SLICE_INFO(25),
    HOME_AUTOMATION(15),
    HOME_AUTOMATION_AGENT_INFO(77),
    HOME_AUTOMATION_DISCOVERY(50),
    HOME_GRAPH(6),
    HULK_ONDEVICE_PERSONALIZATION(46),
    GDD_NEVER_USE_THIS_SEE_OMG_28475(1000),
    GDD_WEBREF(1001),
    GDD_WEBREF_NGA(1006),
    GDD_WEBREF_NGA_DEV(1007),
    GDD_NGA_GENIE_FM(1002),
    GDD_APA_GENIE_FM(1003),
    GDD_APA_BISTO(1004),
    GDD_APA_WARMACTIONS(1005),
    GDD_APA_LIGHTWEIGHT_TOKENS(1008),
    GDD_MDD_SAMPLE_APP_MULTI_VARIANTS(1009),
    GDD_APA_HOTWORD_MODEL(1010),
    GDD_APA_UCM_TFL(1011),
    GDD_APA_DICTATION_FORMATTING(1012),
    GDD_APA_CORRECTIONS(1013),
    GDD_APA_HEAD_SUGGEST(1014),
    GDD_APA_SMART_ACTION_MODELS(1015),
    GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO(1016),
    GDD_LENS_TEXT(1017),
    GDD_APA_ARC_POP_NLU_MODELS(1018),
    GDD_MOBSERVE_CODELAB(1019),
    GDD_APA_HOTMATCH(1020),
    GDD_AGSA_GROWTH_TRACKING(1021),
    GDD_APA_POP(1022),
    GDD_LENS_AVS(1023),
    GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT(1025),
    GDD_AAE_SMART_ACTION_MODELS(1026),
    GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS(1027),
    GDD_APA_RIOD(1028),
    GDD_LENS_OFFLINE_TEXT(1029),
    GDD_LENS_INPAINTING(1030),
    GDD_WELLBEING_INTELLIGENCE(1031),
    GDD_SCONE_UE_CAPA_DOWNLOADER(1032),
    GDD_ODLH_FA_REGIONS(1033),
    GDD_AIP_TOAST_QUALITY(1034),
    GDD_BUGLE_DATA_DOWNLOAD(1035),
    GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT(1036),
    GDD_BUGLE_EMOJIFY(1037),
    GDD_ASSISTANT_AUTO_EMBEDDED_POP(1039),
    GDD_AGSA_APA_TEST_GROUP(1040),
    GDD_BUGLE_SUMMARIZATION(1041),
    GDD_AGSA_APA_SUMMARIZE(1042),
    GDD_LENS_SCENE_X(1043),
    GDD_AGSA_APA_CONTACT(1044),
    GDD_FILES_OCR_ML_MODEL(1045),
    GDD_WALLET_ISSUER_LOCATION(1046),
    GDD_AGSA_APA_ROADWAY_RECAP_MODELS(1047),
    GPAC_INBOX(123),
    GPAC_INBOX_LOCAL(132),
    GPAC_CONTEXT(125),
    GPAC_HISTORY(129),
    ICING_CONFIG(164),
    IDENTITY_VAULT_DOCUMENT(82),
    IDENTITY_VAULT_EVENT(83),
    IDENTITY_VAULT_BLOB(84),
    IDENTITY_VAULT_DOCUMENT_LARGE_BLOB(87),
    INTERNAL_METRICS_CACHE_STATUS(37),
    INTERNAL_METRICS_CACHE_ACCESS(38),
    JINN_ALL_DJ(11),
    JINN_STARLIGHT(10),
    JINN_VOICE_PROFILE(5),
    LAUNCHER_DEEPLINKS(70),
    LENS_HISTORY_QUERY(148),
    LENS_HISTORY_IMAGE_METADATA(149),
    LENS_HISTORY_IMAGE_DATA_ORIGINAL(150),
    LENS_HISTORY_IMAGE_DATA_THUMBNAIL(155),
    LENS_HISTORY_IMAGE_DATA_SUGGEST_THUMBNAIL(161),
    LOCAL_LEAF_PAGE_VIEW(62),
    LOCAL_NETWORK_SYNC_METADATA(110),
    MAPS_SEARCH_CLICK(41),
    MAPS_SEARCH_DELETION(162),
    MAPS_SEARCH_QUERY(107),
    MAPS_SEARCH_QUERY_HISTORY(172),
    MAPS_SEARCH_RESULT(97),
    MAPS_VIEWPORT_UPDATE(54),
    MAPS_VEHICLE_ENERGY_MODEL(1048),
    GDD_BUGLE_SMARTS(1049),
    GDD_LENS_TEXT_CLASSIFIER(1050),
    GDD_APA_TELEPORT(1051),
    MAPS_LIVE_VEHICLE_INFO(1070),
    MAPS_VEHICLE_INFO(1024),
    MAPS_PLANNED_VEHICLE_TRIP(114),
    MAPS_TRIP_PLANNING_CONSENT(122),
    MAPS_USER_GENERATED_VEHICLE_PROFILE(154),
    MEDIA_USER_CONTEXT_INFO(80),
    NGA_STASH_CLOUD_ENTITY(28),
    NGA_STASH_CLOUD_RECORD(29),
    NGA_STASH_COLLECTION_MEMBERSHIP(75),
    NGA_STASH_DEVICE_ENTITY(26),
    NGA_STASH_DEVICE_RECORD(27),
    NGA_STASH_METADATA(68),
    NGA_STASH_TRIGGER_SPEC(42),
    OEM_ANSWERS_OPAQUE_TAGS(117),
    ONDEVICE_AD_EVENTS(69),
    PEOPLE_API(13),
    PIE_ASSISTANT_USAGE_STATS(43),
    GDD_AGSA_APA_TEXT_CLASSIFIER(1053),
    GDD_AGSA_APA_TCLIB_PERSON_NAME(1054),
    GDD_PIXELMERLIN_MODELS(1055),
    GDD_LENS_SEGMENTATION(1056),
    GDD_LENS_EDU(1057),
    GDD_LENS_RAID(1058),
    GDD_SPEECH_DSP_HOTWORD_MODEL(1059),
    GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD(1060),
    GDD_CUSTOMIZATIONBUNDLE_THEMEPACK(1061),
    GDD_TR_TRANSLITERATION(1062),
    GDD_TR_NMT(1063),
    GDD_TR_DICTIONARY(1064),
    GDD_CAST_DEVICECONFIGS(1065),
    GDD_PIXELCARE_AGENT_RESOURCES(1066),
    GDD_SBG_SPEECH_MODEL_DOWNLOAD(1067),
    GDD_AGSA_UNIFIED_MIC(1068),
    GDD_WALLET_OCR_IMAGE_PASSES(1069),
    PKG(1),
    PKG_AIAI(95),
    PKG_ENTITIES(8),
    PLAYBACK(12),
    PLAYGROUND(9),
    PLAYGROUND_FOOTPRINTS_BACKEND(160),
    PLAYGROUND_ICING(168),
    PORTABLE_PROVIDER(85),
    PORTABLE_PROVIDER_WEB_FULFILLMENT(116),
    PORTABLE_PROVIDER_NAME_ANNOTATION(120),
    PRIVACY_SETTINGS(21),
    ACTIVITY_CONTROLS_SETTINGS(152),
    SAVES_LISTS(101),
    SEARCH_CONSOLE_INSIGHTS(98),
    SMARTSPACE_HEADPHONE_APP_USAGE_MODEL(66),
    SMARTSPACE_HEADPHONE_LOGS(67),
    SMARTSPACE_CARD_UPDATE_RECORD(94),
    SOUND_SEARCH_VAA2_AUDIO_METADATA(165),
    SOUND_SEARCH_VAA2_AUDIO_WAA_METADATA(166),
    SONG_SEARCH_HISTORY(167),
    TAPAS_REFLECTION_MODELS(47),
    TAPAS_REFLECTION_TRAINING_BUFFERS(48),
    TELEPORT_APP_URL_ANNOTATOR(72),
    TRANSLATE_HISTORY_ENTRIES(73),
    TRUSTLET_PLACE(157),
    VAAV2_BLUE_BAR(51),
    TAPAS_USER_PROFILE(52),
    TAPAS_OFFLINE_RANKED(64),
    UGC_TASK_COMPLETIONS(153),
    YOUTUBE_SEARCH(130),
    YOUTUBE_VIDEO_AND_ACCOUNT_INFO(156),
    WEB_SEARCH(78),
    AOG_APP_USER_CONTEXT(81),
    TNG_ASSISTANT_TOP_CONTACTS(100),
    SEARCH_PERSONAL_INFO_REMOVAL_REQUEST(102),
    SEARCH_PERSONAL_INFO_REMOVAL_REQUEST_HISTORY(103),
    SEARCH_PERSONAL_INFO_REMOVAL_USER_SETTINGS(104),
    AIP_TOP_ENTITIES(121),
    ASSISTANT_ROUTINES(126),
    PAS_PDS_DEMO(127),
    ASSISTANT_ROBIN_SUGGESTIONS(158),
    VOGON_ON_DEVICE_NLU_CACHE(163),
    ANIMA_CONTENT_INTERESTS(169),
    SAVES(171),
    GMAIL_WONDER_OBJECTS(177);

    public final int dE;

    acgd(int i) {
        this.dE = i;
    }

    public static acgd b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PKG;
        }
        if (i == 4) {
            return ANSWERS;
        }
        if (i == 5) {
            return JINN_VOICE_PROFILE;
        }
        if (i == 6) {
            return HOME_GRAPH;
        }
        if (i == 21) {
            return PRIVACY_SETTINGS;
        }
        if (i == 22) {
            return APP_ACTIONS;
        }
        if (i == 176) {
            return DAND_USER_PROFILE;
        }
        if (i == 177) {
            return GMAIL_WONDER_OBJECTS;
        }
        switch (i) {
            case 8:
                return PKG_ENTITIES;
            case 9:
                return PLAYGROUND;
            case 10:
                return JINN_STARLIGHT;
            case 11:
                return JINN_ALL_DJ;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return PLAYBACK;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return PEOPLE_API;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ACTION_HISTORY;
            case 15:
                return HOME_AUTOMATION;
            default:
                switch (i) {
                    case 17:
                        return DEEPLINK;
                    case 18:
                        return ASSISTANT_SETTINGS;
                    case 19:
                        return ASSISTANT_DISTILLED_ACTION_USER_MODEL;
                    default:
                        switch (i) {
                            case 24:
                                return ACP_CONTEXT;
                            case 25:
                                return HANDBAG_PERSONALIZED_SLICE_INFO;
                            case 26:
                                return NGA_STASH_DEVICE_ENTITY;
                            case 27:
                                return NGA_STASH_DEVICE_RECORD;
                            case 28:
                                return NGA_STASH_CLOUD_ENTITY;
                            case 29:
                                return NGA_STASH_CLOUD_RECORD;
                            case 30:
                                return ANSWERS_EVAL;
                            case 31:
                                return ASSISTANT_ACTION_INTERACTION_EVENT;
                            case 32:
                                return HABITS_PROFILE;
                            case 33:
                                return DEVICE_INSTALLED_APPS;
                            case 34:
                                return ASSISTANT_GROWTH_PROFILE;
                            case 35:
                                return ASSISTANT_CONTACT_AFFINITY;
                            case 36:
                                return GELLER_CONFIG;
                            case 37:
                                return INTERNAL_METRICS_CACHE_STATUS;
                            case 38:
                                return INTERNAL_METRICS_CACHE_ACCESS;
                            case 39:
                                return ASSISTANT_HISTORY;
                            case 40:
                                return FOOTPRINTS_FALSE_ACCEPT;
                            case 41:
                                return MAPS_SEARCH_CLICK;
                            case 42:
                                return NGA_STASH_TRIGGER_SPEC;
                            case 43:
                                return PIE_ASSISTANT_USAGE_STATS;
                            case 44:
                                return ACTION_HISTORY_EPHEMERAL;
                            case 45:
                                return HABITS_AA_PROFILES;
                            case 46:
                                return HULK_ONDEVICE_PERSONALIZATION;
                            case 47:
                                return TAPAS_REFLECTION_MODELS;
                            case 48:
                                return TAPAS_REFLECTION_TRAINING_BUFFERS;
                            case 49:
                                return ASSISTANT_UPDATES_CENTER_POOL;
                            case 50:
                                return HOME_AUTOMATION_DISCOVERY;
                            case 51:
                                return VAAV2_BLUE_BAR;
                            case 52:
                                return TAPAS_USER_PROFILE;
                            default:
                                switch (i) {
                                    case 54:
                                        return MAPS_VIEWPORT_UPDATE;
                                    case 55:
                                        return APP_SHORTCUTS;
                                    case 56:
                                        return ASSISTANT_REMINDERS;
                                    case 57:
                                        return AMBIENT_ASSISTANT_LOCATION_FEEDBACK;
                                    case 58:
                                        return FAST_PAIR;
                                    case 59:
                                        return DEVICE_CAPABILITIES;
                                    case 60:
                                        return CHALKBOARD;
                                    case 61:
                                        return ASSISTANT_USAGE_STATISTICS;
                                    case 62:
                                        return LOCAL_LEAF_PAGE_VIEW;
                                    case 63:
                                        return APP_VOICIFICATION;
                                    case 64:
                                        return TAPAS_OFFLINE_RANKED;
                                    default:
                                        switch (i) {
                                            case 66:
                                                return SMARTSPACE_HEADPHONE_APP_USAGE_MODEL;
                                            case 67:
                                                return SMARTSPACE_HEADPHONE_LOGS;
                                            case 68:
                                                return NGA_STASH_METADATA;
                                            case 69:
                                                return ONDEVICE_AD_EVENTS;
                                            case 70:
                                                return LAUNCHER_DEEPLINKS;
                                            case 71:
                                                return ASSISTANT_ALARM;
                                            case 72:
                                                return TELEPORT_APP_URL_ANNOTATOR;
                                            case 73:
                                                return TRANSLATE_HISTORY_ENTRIES;
                                            case 74:
                                                return ASSISTANT_ASPIRE_ACTIVITY;
                                            case 75:
                                                return NGA_STASH_COLLECTION_MEMBERSHIP;
                                            case 76:
                                                return CONVERSATIONAL_ACTIONS;
                                            case 77:
                                                return HOME_AUTOMATION_AGENT_INFO;
                                            case 78:
                                                return WEB_SEARCH;
                                            case 79:
                                                return ENCRYPTED_ONDEVICE_LOCATION_HISTORY;
                                            case 80:
                                                return MEDIA_USER_CONTEXT_INFO;
                                            case 81:
                                                return AOG_APP_USER_CONTEXT;
                                            case 82:
                                                return IDENTITY_VAULT_DOCUMENT;
                                            case 83:
                                                return IDENTITY_VAULT_EVENT;
                                            case 84:
                                                return IDENTITY_VAULT_BLOB;
                                            case 85:
                                                return PORTABLE_PROVIDER;
                                            case 86:
                                                return CONTRIBUTOR_STUDIO_XGA_ELIGIBILITY;
                                            case 87:
                                                return IDENTITY_VAULT_DOCUMENT_LARGE_BLOB;
                                            case 88:
                                                return ASSISTANT_USER_DISPLAY_NAME;
                                            case 89:
                                                return ASSISTANT_ARBITRATION_HOST_IP;
                                            case 90:
                                                return HERON;
                                            case 91:
                                                return ASSISTANT_EPHEMERAL_AUDIO;
                                            case 92:
                                                return ASSISTANT_NLU_SERVER_AUX;
                                            case 93:
                                                return ASSISTANT_ON_DEVICE_ACTIVITY;
                                            case 94:
                                                return SMARTSPACE_CARD_UPDATE_RECORD;
                                            case 95:
                                                return PKG_AIAI;
                                            case 96:
                                                return CROSS_DEVICE_TIMER;
                                            case 97:
                                                return MAPS_SEARCH_RESULT;
                                            case 98:
                                                return SEARCH_CONSOLE_INSIGHTS;
                                            case 99:
                                                return AUIS;
                                            case 100:
                                                return TNG_ASSISTANT_TOP_CONTACTS;
                                            case 101:
                                                return SAVES_LISTS;
                                            case 102:
                                                return SEARCH_PERSONAL_INFO_REMOVAL_REQUEST;
                                            case 103:
                                                return SEARCH_PERSONAL_INFO_REMOVAL_REQUEST_HISTORY;
                                            case 104:
                                                return SEARCH_PERSONAL_INFO_REMOVAL_USER_SETTINGS;
                                            case 105:
                                                return ASSISTANT_WHOLE_HOME_STATE_UPLOAD;
                                            case 106:
                                                return ASSISTANT_ON_DEVICE_DISCOVERY;
                                            case 107:
                                                return MAPS_SEARCH_QUERY;
                                            case 108:
                                                return ACCOUNT_CAPABILITIES;
                                            case 109:
                                                return CROSS_DEVICE_ALARM;
                                            case 110:
                                                return LOCAL_NETWORK_SYNC_METADATA;
                                            case 111:
                                                return ASSISTANT_DEVICE_YOUTUBE_SETTINGS;
                                            case 112:
                                                return ASSISTANT_REMINDER_USER_PROFILE;
                                            case 113:
                                                return ASSISTANT_UUDP_PROFILE;
                                            case 114:
                                                return MAPS_PLANNED_VEHICLE_TRIP;
                                            case 115:
                                                return ASSISTANT_HISTORY_ON_DEVICE_UNREDACTED;
                                            case 116:
                                                return PORTABLE_PROVIDER_WEB_FULFILLMENT;
                                            case 117:
                                                return OEM_ANSWERS_OPAQUE_TAGS;
                                            case 118:
                                                return ASSISTANT_USER_PROFILE;
                                            case 119:
                                                return ANDROID_PROMOTIONAL_NOTIFICATIONS;
                                            case 120:
                                                return PORTABLE_PROVIDER_NAME_ANNOTATION;
                                            case 121:
                                                return AIP_TOP_ENTITIES;
                                            case 122:
                                                return MAPS_TRIP_PLANNING_CONSENT;
                                            case 123:
                                                return GPAC_INBOX;
                                            case 124:
                                                return ASSISTANT_HISTORY_KIDS;
                                            case 125:
                                                return GPAC_CONTEXT;
                                            case 126:
                                                return ASSISTANT_ROUTINES;
                                            case 127:
                                                return PAS_PDS_DEMO;
                                            case 128:
                                                return FEDERATED_HOTWORD_SIGNALS;
                                            case 129:
                                                return GPAC_HISTORY;
                                            case 130:
                                                return YOUTUBE_SEARCH;
                                            case 131:
                                                return ENCRYPTED_ONDEVICE_LOCATION_HISTORY_TRIAL;
                                            case 132:
                                                return GPAC_INBOX_LOCAL;
                                            case 133:
                                                return ASSISTANT_AUTO_EMBEDDED_PAIRED_CONTACTS;
                                            case 134:
                                                return ASSISTANT_VOICE_SETTINGS;
                                            case 135:
                                                return ASSISTANT_DRIVING_SETTINGS;
                                            case 136:
                                                return ASSISTANT_HELP_IMPROVE_ASSISTANT_SETTINGS;
                                            case 137:
                                                return ASSISTANT_DEVICE_SETTINGS;
                                            case 138:
                                                return ASSISTANT_PRODUCTIVITY_SETTINGS;
                                            case 139:
                                                return ASSISTANT_NOTES_AND_LISTS_SETTINGS;
                                            case 140:
                                                return ASSISTANT_ACCESSIBILITY_SETTINGS;
                                            case 141:
                                                return ASSISTANT_LANGUAGE_PARTNER_SETTINGS;
                                            case 142:
                                                return ASSISTANT_CALENDAR_SETTINGS;
                                            case 143:
                                                return ASSISTANT_SHELDON_EMAIL_STATUS_SETTINGS;
                                            case 144:
                                                return ASSISTANT_LOCKSCREEN_SETTINGS;
                                            case 145:
                                                return ASSISTANT_DEVICE_SETTINGS_MUTATIONS;
                                            case 146:
                                                return ASSISTANT_DRIVING_SETTINGS_MUTATIONS;
                                            case 147:
                                                return ASSISTANT_LOCKSCREEN_SETTINGS_MUTATIONS;
                                            case 148:
                                                return LENS_HISTORY_QUERY;
                                            case 149:
                                                return LENS_HISTORY_IMAGE_METADATA;
                                            case 150:
                                                return LENS_HISTORY_IMAGE_DATA_ORIGINAL;
                                            case ModuleDescriptor.MODULE_VERSION /* 151 */:
                                                return ASSISTANT_SETTINGS_METADATA;
                                            case 152:
                                                return ACTIVITY_CONTROLS_SETTINGS;
                                            case 153:
                                                return UGC_TASK_COMPLETIONS;
                                            case 154:
                                                return MAPS_USER_GENERATED_VEHICLE_PROFILE;
                                            case 155:
                                                return LENS_HISTORY_IMAGE_DATA_THUMBNAIL;
                                            case 156:
                                                return YOUTUBE_VIDEO_AND_ACCOUNT_INFO;
                                            case 157:
                                                return TRUSTLET_PLACE;
                                            case 158:
                                                return ASSISTANT_ROBIN_SUGGESTIONS;
                                            case 159:
                                                return DC_NOTIFICATION_SYNC;
                                            case 160:
                                                return PLAYGROUND_FOOTPRINTS_BACKEND;
                                            case 161:
                                                return LENS_HISTORY_IMAGE_DATA_SUGGEST_THUMBNAIL;
                                            case 162:
                                                return MAPS_SEARCH_DELETION;
                                            case 163:
                                                return VOGON_ON_DEVICE_NLU_CACHE;
                                            case 164:
                                                return ICING_CONFIG;
                                            case 165:
                                                return SOUND_SEARCH_VAA2_AUDIO_METADATA;
                                            case 166:
                                                return SOUND_SEARCH_VAA2_AUDIO_WAA_METADATA;
                                            case 167:
                                                return SONG_SEARCH_HISTORY;
                                            case 168:
                                                return PLAYGROUND_ICING;
                                            case 169:
                                                return ANIMA_CONTENT_INTERESTS;
                                            case 170:
                                                return DC_NOTIFICATION_SYNC_DEVICES;
                                            case 171:
                                                return SAVES;
                                            case 172:
                                                return MAPS_SEARCH_QUERY_HISTORY;
                                            case 173:
                                                return ACCOUNT_LOCATIONS_HOME_ICONS;
                                            case 174:
                                                return ACCOUNT_LOCATIONS_WORK_ICONS;
                                            case 1039:
                                                return GDD_ASSISTANT_AUTO_EMBEDDED_POP;
                                            case 1040:
                                                return GDD_AGSA_APA_TEST_GROUP;
                                            case 1041:
                                                return GDD_BUGLE_SUMMARIZATION;
                                            case 1042:
                                                return GDD_AGSA_APA_SUMMARIZE;
                                            case 1043:
                                                return GDD_LENS_SCENE_X;
                                            case 1044:
                                                return GDD_AGSA_APA_CONTACT;
                                            case 1045:
                                                return GDD_FILES_OCR_ML_MODEL;
                                            case 1046:
                                                return GDD_WALLET_ISSUER_LOCATION;
                                            case 1047:
                                                return GDD_AGSA_APA_ROADWAY_RECAP_MODELS;
                                            case 1048:
                                                return MAPS_VEHICLE_ENERGY_MODEL;
                                            case 1049:
                                                return GDD_BUGLE_SMARTS;
                                            case 1050:
                                                return GDD_LENS_TEXT_CLASSIFIER;
                                            case 1051:
                                                return GDD_APA_TELEPORT;
                                            case 1053:
                                                return GDD_AGSA_APA_TEXT_CLASSIFIER;
                                            case 1054:
                                                return GDD_AGSA_APA_TCLIB_PERSON_NAME;
                                            case 1055:
                                                return GDD_PIXELMERLIN_MODELS;
                                            case 1056:
                                                return GDD_LENS_SEGMENTATION;
                                            case 1057:
                                                return GDD_LENS_EDU;
                                            case 1058:
                                                return GDD_LENS_RAID;
                                            case 1059:
                                                return GDD_SPEECH_DSP_HOTWORD_MODEL;
                                            case 1060:
                                                return GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD;
                                            case 1061:
                                                return GDD_CUSTOMIZATIONBUNDLE_THEMEPACK;
                                            case 1062:
                                                return GDD_TR_TRANSLITERATION;
                                            case 1063:
                                                return GDD_TR_NMT;
                                            case 1064:
                                                return GDD_TR_DICTIONARY;
                                            case 1065:
                                                return GDD_CAST_DEVICECONFIGS;
                                            case 1066:
                                                return GDD_PIXELCARE_AGENT_RESOURCES;
                                            case 1067:
                                                return GDD_SBG_SPEECH_MODEL_DOWNLOAD;
                                            case 1068:
                                                return GDD_AGSA_UNIFIED_MIC;
                                            case 1069:
                                                return GDD_WALLET_OCR_IMAGE_PASSES;
                                            case 1070:
                                                return MAPS_LIVE_VEHICLE_INFO;
                                            default:
                                                switch (i) {
                                                    case 1000:
                                                        return GDD_NEVER_USE_THIS_SEE_OMG_28475;
                                                    case 1001:
                                                        return GDD_WEBREF;
                                                    case 1002:
                                                        return GDD_NGA_GENIE_FM;
                                                    case 1003:
                                                        return GDD_APA_GENIE_FM;
                                                    case 1004:
                                                        return GDD_APA_BISTO;
                                                    case 1005:
                                                        return GDD_APA_WARMACTIONS;
                                                    case 1006:
                                                        return GDD_WEBREF_NGA;
                                                    case 1007:
                                                        return GDD_WEBREF_NGA_DEV;
                                                    case 1008:
                                                        return GDD_APA_LIGHTWEIGHT_TOKENS;
                                                    case 1009:
                                                        return GDD_MDD_SAMPLE_APP_MULTI_VARIANTS;
                                                    case 1010:
                                                        return GDD_APA_HOTWORD_MODEL;
                                                    case 1011:
                                                        return GDD_APA_UCM_TFL;
                                                    case 1012:
                                                        return GDD_APA_DICTATION_FORMATTING;
                                                    case 1013:
                                                        return GDD_APA_CORRECTIONS;
                                                    case 1014:
                                                        return GDD_APA_HEAD_SUGGEST;
                                                    case 1015:
                                                        return GDD_APA_SMART_ACTION_MODELS;
                                                    case 1016:
                                                        return GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO;
                                                    case 1017:
                                                        return GDD_LENS_TEXT;
                                                    case 1018:
                                                        return GDD_APA_ARC_POP_NLU_MODELS;
                                                    case 1019:
                                                        return GDD_MOBSERVE_CODELAB;
                                                    case 1020:
                                                        return GDD_APA_HOTMATCH;
                                                    case 1021:
                                                        return GDD_AGSA_GROWTH_TRACKING;
                                                    case 1022:
                                                        return GDD_APA_POP;
                                                    case 1023:
                                                        return GDD_LENS_AVS;
                                                    case 1024:
                                                        return MAPS_VEHICLE_INFO;
                                                    case 1025:
                                                        return GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT;
                                                    case 1026:
                                                        return GDD_AAE_SMART_ACTION_MODELS;
                                                    case 1027:
                                                        return GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS;
                                                    case 1028:
                                                        return GDD_APA_RIOD;
                                                    case 1029:
                                                        return GDD_LENS_OFFLINE_TEXT;
                                                    case 1030:
                                                        return GDD_LENS_INPAINTING;
                                                    case 1031:
                                                        return GDD_WELLBEING_INTELLIGENCE;
                                                    case 1032:
                                                        return GDD_SCONE_UE_CAPA_DOWNLOADER;
                                                    case 1033:
                                                        return GDD_ODLH_FA_REGIONS;
                                                    case 1034:
                                                        return GDD_AIP_TOAST_QUALITY;
                                                    case 1035:
                                                        return GDD_BUGLE_DATA_DOWNLOAD;
                                                    case 1036:
                                                        return GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT;
                                                    case 1037:
                                                        return GDD_BUGLE_EMOJIFY;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.dE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.dE);
    }
}
