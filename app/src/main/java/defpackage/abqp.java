package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abqp implements abxf {
    CPS_UNSPECIFIED(0),
    CPS_OR_NONCPS_UNKNOWN(1),
    CPS_NONCPS_PRODUCT(2),
    CPS_SEARCH(3),
    CPS_YOUTUBE(4),
    CPS_CHROME(6),
    CPS_PLAYSTORE(7),
    CPS_SHOPPING(8),
    CPS_ADS(9),
    CPS_MAPS(10),
    CPS_ANDROID(5),
    CPS_ASSISTANT(11),
    CPS_CONTACTS(12),
    CPS_ACCOMMODATIONS(19),
    CPS_ANDROID_AUTO(20),
    CPS_ANDROID_TV(21),
    CPS_AUTHENTICATOR(22),
    CPS_CHROME_WEB_STORE(23),
    CPS_FILES_BY_GOOGLE(24),
    CPS_FLIGHTS(25),
    CPS_GALLERY_GO(26),
    CPS_GBOARD(27),
    CPS_GOOGLE_ONE(28),
    CPS_GOOGLE_PHOTOS(29),
    CPS_GOOGLE_SIGN_IN(30),
    CPS_GOOGLE_TV(31),
    CPS_NEWS(14),
    CPS_PAYMENTS_AND_WALLET(15),
    CPS_TRANSLATE(32),
    CPS_WEATHER_IMMERSIVE(33),
    CPS_WORKSPACE_COMMUNICATIONS(16),
    CPS_WORKSPACE_DOCUMENT_PROCESSING(17),
    CPS_WORKSPACE_EMAIL_AND_SCHEDULING(18),
    CPS_DIGITAL_WELLBEING(34),
    CPS_GEMINI_APPS(35),
    CPS_GOOGLE_EARTH(36),
    CPS_MESSAGES(37),
    CPS_WAZE(38),
    NOT_FOR_USE_WITH_EXHAUSTIVE_SWITCH_STATEMENTS(13),
    UNRECOGNIZED(-1);

    private final int P;

    abqp(int i) {
        this.P = i;
    }

    public static abqp b(int i) {
        switch (i) {
            case 0:
                return CPS_UNSPECIFIED;
            case 1:
                return CPS_OR_NONCPS_UNKNOWN;
            case 2:
                return CPS_NONCPS_PRODUCT;
            case 3:
                return CPS_SEARCH;
            case 4:
                return CPS_YOUTUBE;
            case 5:
                return CPS_ANDROID;
            case 6:
                return CPS_CHROME;
            case 7:
                return CPS_PLAYSTORE;
            case 8:
                return CPS_SHOPPING;
            case 9:
                return CPS_ADS;
            case 10:
                return CPS_MAPS;
            case 11:
                return CPS_ASSISTANT;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return CPS_CONTACTS;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return NOT_FOR_USE_WITH_EXHAUSTIVE_SWITCH_STATEMENTS;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return CPS_NEWS;
            case 15:
                return CPS_PAYMENTS_AND_WALLET;
            case 16:
                return CPS_WORKSPACE_COMMUNICATIONS;
            case 17:
                return CPS_WORKSPACE_DOCUMENT_PROCESSING;
            case 18:
                return CPS_WORKSPACE_EMAIL_AND_SCHEDULING;
            case 19:
                return CPS_ACCOMMODATIONS;
            case 20:
                return CPS_ANDROID_AUTO;
            case 21:
                return CPS_ANDROID_TV;
            case 22:
                return CPS_AUTHENTICATOR;
            case 23:
                return CPS_CHROME_WEB_STORE;
            case 24:
                return CPS_FILES_BY_GOOGLE;
            case 25:
                return CPS_FLIGHTS;
            case 26:
                return CPS_GALLERY_GO;
            case 27:
                return CPS_GBOARD;
            case 28:
                return CPS_GOOGLE_ONE;
            case 29:
                return CPS_GOOGLE_PHOTOS;
            case 30:
                return CPS_GOOGLE_SIGN_IN;
            case 31:
                return CPS_GOOGLE_TV;
            case 32:
                return CPS_TRANSLATE;
            case 33:
                return CPS_WEATHER_IMMERSIVE;
            case 34:
                return CPS_DIGITAL_WELLBEING;
            case 35:
                return CPS_GEMINI_APPS;
            case 36:
                return CPS_GOOGLE_EARTH;
            case 37:
                return CPS_MESSAGES;
            case 38:
                return CPS_WAZE;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.P;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.P);
    }
}
