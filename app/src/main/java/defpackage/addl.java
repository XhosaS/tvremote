package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum addl implements abxf {
    CLIENT_ID_UNSPECIFIED(0),
    DISCOVER_ANDROID(1),
    DISCOVER_IOS(2),
    GOOGLE_ON_CONTENT_AGSA_CLASSIC_ANDROID(3),
    GOOGLE_ON_CONTENT_IOS(4),
    ASSISTANT_ANDROID(5),
    ASSISTANT_IOS(6),
    GOOGLE_GO_ANDROID(7),
    DISCOVER_CHROME_ANDROID(8),
    ASSISTANT_ANDROID_TV(9),
    DISCOVER_NIU_ANDROID(10),
    ASSISTANT_SYMBIOTE_ANDROID(11),
    GOOGLE_ON_CONTENT_AGSA_TNG_ANDROID(12),
    MESSAGES_ANDROID(13),
    LENS_ANDROID(14),
    PLAYGROUND_ANDROID(15),
    WEATHER_ANDROID(16),
    ASSISTANT_SNAPSHOT_ANDROID(17),
    CARD_VIEWER(18),
    ASSISTANT_KIT_SNAPSHOT_IOS(19),
    ASSISTANT_KIT_OPA_IOS(20),
    ASSISTANT_KIT_PLATE_IOS(21),
    LENS_IOS(22),
    PLAYGROUND_IOS(23),
    XBLEND_IOS(24),
    XBLEND_ANDROID(25),
    AMBIENT_ANDROID_TV(26),
    DYNAMIC_HOME_IOS(27),
    SEARCH_XRAY_IOS(28),
    ASSISTANT_LEARNING_CENTER_ANDROID(29),
    JUMP_BACK_IN_IOS(30),
    TITAN_HUBUI_ANDROID(31),
    MAIN_ASSISTANT_TNG_ANDROID(32),
    SEARCH_NOTIFICATIONS_IOS(33),
    LAUNCHERX_ANDROID_TV(34),
    FEATURE_INTEGRATION_POINT_IGA_TASK_RESUMPTION_IOS(35),
    SUGGEST_ANDROID(36),
    XBLEND_BUBBLES_ANDROID(37),
    SUGGEST_IOS(38),
    ZERO_SERVER(39),
    GMM_ANDROID(40),
    GMM_IOS(41),
    PAGE_INSIGHTS_CHROME_ANDROID(42),
    ASSISTANT_WEAR_OS_WATCH(43),
    VOS(44),
    ASSISTANT_KIT_ROBIN_IOS(45),
    GOOGLE_ONE_ANDROID(46),
    PIXEL_SUBZERO_ANDROID(47),
    PIXEL_RETAIL_DEMO_ANDROID(48);

    public final int X;

    addl(int i) {
        this.X = i;
    }

    public static addl b(int i) {
        switch (i) {
            case 0:
                return CLIENT_ID_UNSPECIFIED;
            case 1:
                return DISCOVER_ANDROID;
            case 2:
                return DISCOVER_IOS;
            case 3:
                return GOOGLE_ON_CONTENT_AGSA_CLASSIC_ANDROID;
            case 4:
                return GOOGLE_ON_CONTENT_IOS;
            case 5:
                return ASSISTANT_ANDROID;
            case 6:
                return ASSISTANT_IOS;
            case 7:
                return GOOGLE_GO_ANDROID;
            case 8:
                return DISCOVER_CHROME_ANDROID;
            case 9:
                return ASSISTANT_ANDROID_TV;
            case 10:
                return DISCOVER_NIU_ANDROID;
            case 11:
                return ASSISTANT_SYMBIOTE_ANDROID;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return GOOGLE_ON_CONTENT_AGSA_TNG_ANDROID;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return MESSAGES_ANDROID;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return LENS_ANDROID;
            case 15:
                return PLAYGROUND_ANDROID;
            case 16:
                return WEATHER_ANDROID;
            case 17:
                return ASSISTANT_SNAPSHOT_ANDROID;
            case 18:
                return CARD_VIEWER;
            case 19:
                return ASSISTANT_KIT_SNAPSHOT_IOS;
            case 20:
                return ASSISTANT_KIT_OPA_IOS;
            case 21:
                return ASSISTANT_KIT_PLATE_IOS;
            case 22:
                return LENS_IOS;
            case 23:
                return PLAYGROUND_IOS;
            case 24:
                return XBLEND_IOS;
            case 25:
                return XBLEND_ANDROID;
            case 26:
                return AMBIENT_ANDROID_TV;
            case 27:
                return DYNAMIC_HOME_IOS;
            case 28:
                return SEARCH_XRAY_IOS;
            case 29:
                return ASSISTANT_LEARNING_CENTER_ANDROID;
            case 30:
                return JUMP_BACK_IN_IOS;
            case 31:
                return TITAN_HUBUI_ANDROID;
            case 32:
                return MAIN_ASSISTANT_TNG_ANDROID;
            case 33:
                return SEARCH_NOTIFICATIONS_IOS;
            case 34:
                return LAUNCHERX_ANDROID_TV;
            case 35:
                return FEATURE_INTEGRATION_POINT_IGA_TASK_RESUMPTION_IOS;
            case 36:
                return SUGGEST_ANDROID;
            case 37:
                return XBLEND_BUBBLES_ANDROID;
            case 38:
                return SUGGEST_IOS;
            case 39:
                return ZERO_SERVER;
            case 40:
                return GMM_ANDROID;
            case 41:
                return GMM_IOS;
            case 42:
                return PAGE_INSIGHTS_CHROME_ANDROID;
            case 43:
                return ASSISTANT_WEAR_OS_WATCH;
            case 44:
                return VOS;
            case 45:
                return ASSISTANT_KIT_ROBIN_IOS;
            case 46:
                return GOOGLE_ONE_ANDROID;
            case 47:
                return PIXEL_SUBZERO_ANDROID;
            case 48:
                return PIXEL_RETAIL_DEMO_ANDROID;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.X;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.X);
    }
}
