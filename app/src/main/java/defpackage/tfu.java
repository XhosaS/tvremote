package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tfu implements abxf {
    UNKNOWN(0),
    GOOGLE_APP(6),
    TRANSCRIPTION(1673),
    NIU(1771),
    ASSISTANT(7),
    LENS_NBU(1626),
    LENS(1739),
    SOUND_SEARCH(1770),
    ASSISTANT_AUTO_EMBEDDED(1856),
    PRONUNCIATION_LEARNING(1870),
    WEATHER(1891),
    FACEVIEWER(1900),
    SCENEVIEWER(2507),
    ASSISTANT_AUTO_PROJECTED(1909),
    MORRIS(2611),
    LINGO_CAMERA(1963),
    HOTWORD_LIBRARY_ANDROID(1869),
    HSI(2000),
    PODCASTS(1628),
    CREATOR_STUDIO(2076),
    ASSISTANT_AUTO_TNG(1855),
    GELLER_AGSA(1808),
    LOCATION_AGSA(2306),
    WEBGLIDE(2316),
    FEDORA(2458),
    KAHANI(2462),
    APA(2463),
    ASSISTANT_TITAN_TNG(2512),
    SODA_ANDROID(2369),
    WEB_X(2578),
    WORKMANAGER_MONITORING(2572),
    PROACTIVE_ASSISTANT(1947),
    READALOUD(2478),
    READ(2710),
    QUICK_PHRASES(2711),
    BISTO(2734),
    AUDIO_LIBRARY_ANDROID(2759),
    INTERPRETER_MODE(2792),
    INFRASTRUCTURE(2880),
    IN_APP_UPDATE_ANDROID(3161),
    STOCKS_WIDGET(2907),
    OMNI(2895),
    ROBIN_ANDROID(2974),
    SEARCH_VIDEO_ANDROID(2947),
    XBLEND_ANDROID(2897),
    SPORTS_WIDGET(3072),
    MDD_ANDROID(3132),
    SEARCH_XR(3047),
    OMNI_XR(3244),
    SEAPORT_ANDROID(3279),
    NETWORK_MONITORING_LIBRARY_SEARCH_ANDROID(3282),
    AGSA_AIM_LIBRARY_ANDROID(3409),
    UNRECOGNIZED(-1);

    private final int ac;

    tfu(int i) {
        this.ac = i;
    }

    public static tfu b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 6:
                return GOOGLE_APP;
            case 7:
                return ASSISTANT;
            case 1626:
                return LENS_NBU;
            case 1628:
                return PODCASTS;
            case 1673:
                return TRANSCRIPTION;
            case 1739:
                return LENS;
            case 1770:
                return SOUND_SEARCH;
            case 1771:
                return NIU;
            case 1808:
                return GELLER_AGSA;
            case 1855:
                return ASSISTANT_AUTO_TNG;
            case 1856:
                return ASSISTANT_AUTO_EMBEDDED;
            case 1869:
                return HOTWORD_LIBRARY_ANDROID;
            case 1870:
                return PRONUNCIATION_LEARNING;
            case 1891:
                return WEATHER;
            case 1900:
                return FACEVIEWER;
            case 1909:
                return ASSISTANT_AUTO_PROJECTED;
            case 1947:
                return PROACTIVE_ASSISTANT;
            case 1963:
                return LINGO_CAMERA;
            case 2000:
                return HSI;
            case 2076:
                return CREATOR_STUDIO;
            case 2306:
                return LOCATION_AGSA;
            case 2316:
                return WEBGLIDE;
            case 2369:
                return SODA_ANDROID;
            case 2458:
                return FEDORA;
            case 2462:
                return KAHANI;
            case 2463:
                return APA;
            case 2478:
                return READALOUD;
            case 2507:
                return SCENEVIEWER;
            case 2512:
                return ASSISTANT_TITAN_TNG;
            case 2572:
                return WORKMANAGER_MONITORING;
            case 2578:
                return WEB_X;
            case 2611:
                return MORRIS;
            case 2710:
                return READ;
            case 2711:
                return QUICK_PHRASES;
            case 2734:
                return BISTO;
            case 2759:
                return AUDIO_LIBRARY_ANDROID;
            case 2792:
                return INTERPRETER_MODE;
            case 2880:
                return INFRASTRUCTURE;
            case 2895:
                return OMNI;
            case 2897:
                return XBLEND_ANDROID;
            case 2907:
                return STOCKS_WIDGET;
            case 2947:
                return SEARCH_VIDEO_ANDROID;
            case 2974:
                return ROBIN_ANDROID;
            case 3047:
                return SEARCH_XR;
            case 3072:
                return SPORTS_WIDGET;
            case 3132:
                return MDD_ANDROID;
            case 3161:
                return IN_APP_UPDATE_ANDROID;
            case 3244:
                return OMNI_XR;
            case 3279:
                return SEAPORT_ANDROID;
            case 3282:
                return NETWORK_MONITORING_LIBRARY_SEARCH_ANDROID;
            case 3409:
                return AGSA_AIM_LIBRARY_ANDROID;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.ac;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ac);
    }
}
