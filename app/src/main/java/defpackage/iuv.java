package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum iuv {
    FOREGROUND_APP_EVENT,
    INSTALLED_APP_EVENT,
    MEDIA_SESSION_EVENT,
    SCREEN_EVENT,
    NETFLIX_DET_TOKEN_EVENT,
    DEVICE_EVENT,
    TV_OPERATOR_EVENT,
    LAUNCHERX_KIDS_MODE_EVENT,
    VOLUME_EVENT,
    LAUNCHER_LIVE_TV_CHANNELS_EVENT,
    EVENTTYPES_NOT_SET;

    public static iuv a(int i) {
        switch (i) {
            case 0:
                return EVENTTYPES_NOT_SET;
            case 1:
                return FOREGROUND_APP_EVENT;
            case 2:
                return INSTALLED_APP_EVENT;
            case 3:
                return MEDIA_SESSION_EVENT;
            case 4:
                return SCREEN_EVENT;
            case 5:
                return NETFLIX_DET_TOKEN_EVENT;
            case 6:
                return DEVICE_EVENT;
            case 7:
                return TV_OPERATOR_EVENT;
            case 8:
                return LAUNCHERX_KIDS_MODE_EVENT;
            case 9:
                return VOLUME_EVENT;
            case 10:
                return LAUNCHER_LIVE_TV_CHANNELS_EVENT;
            default:
                return null;
        }
    }
}
