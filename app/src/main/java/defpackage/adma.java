package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adma implements abxf {
    UNKNOWN_HOST_APP_ID(0),
    NGA(1),
    AGSA_HOTWORD(2),
    ANDROID_RECOGNITION_SERVICE(3),
    ANDROID_INTENT_API(12),
    ANDROID_VOICE_IME(13),
    MARBLE(4),
    LIBASSISTANT(5),
    GBOARD(6),
    EMBEDDED_AUTO(7),
    WEAR_OS(8),
    HUB_MODE(9),
    MORRIS(10),
    VS(11),
    ROTI(14),
    TEST_OR_DEMO(15),
    QUICK_PHRASES_ANDROID(16),
    NOTIFICATION(17),
    CHROME_LIVE_CAPTION(18),
    AUTO_PROJECTED(19),
    RECOGNITION_SERVICE_PUBLIC_API(20),
    AUTO_EMBEDDED(21),
    SAXOPHONE(22),
    GENERIC_ASR_APA(23),
    VOICE_MATCH_ENROLLMENT(24),
    ANDROID_WEAR(25),
    ROBIN(26),
    DIALER(27),
    GBOARD_SMART_DICTATION(28),
    FITBIT(29),
    VOICE_MODE(30),
    CHROME_LIVE(31),
    RECORDER(32),
    LENS_LIVE(33),
    DC_SERVICE(34),
    YOUTUBE(35);

    public final int K;

    adma(int i) {
        this.K = i;
    }

    public static adma b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HOST_APP_ID;
            case 1:
                return NGA;
            case 2:
                return AGSA_HOTWORD;
            case 3:
                return ANDROID_RECOGNITION_SERVICE;
            case 4:
                return MARBLE;
            case 5:
                return LIBASSISTANT;
            case 6:
                return GBOARD;
            case 7:
                return EMBEDDED_AUTO;
            case 8:
                return WEAR_OS;
            case 9:
                return HUB_MODE;
            case 10:
                return MORRIS;
            case 11:
                return VS;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ANDROID_INTENT_API;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ANDROID_VOICE_IME;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ROTI;
            case 15:
                return TEST_OR_DEMO;
            case 16:
                return QUICK_PHRASES_ANDROID;
            case 17:
                return NOTIFICATION;
            case 18:
                return CHROME_LIVE_CAPTION;
            case 19:
                return AUTO_PROJECTED;
            case 20:
                return RECOGNITION_SERVICE_PUBLIC_API;
            case 21:
                return AUTO_EMBEDDED;
            case 22:
                return SAXOPHONE;
            case 23:
                return GENERIC_ASR_APA;
            case 24:
                return VOICE_MATCH_ENROLLMENT;
            case 25:
                return ANDROID_WEAR;
            case 26:
                return ROBIN;
            case 27:
                return DIALER;
            case 28:
                return GBOARD_SMART_DICTATION;
            case 29:
                return FITBIT;
            case 30:
                return VOICE_MODE;
            case 31:
                return CHROME_LIVE;
            case 32:
                return RECORDER;
            case 33:
                return LENS_LIVE;
            case 34:
                return DC_SERVICE;
            case 35:
                return YOUTUBE;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}
