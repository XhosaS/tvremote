package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uxr {
    REQUEST_PERMISSIONS,
    APP_SETTINGS_REDIRECT,
    IN_APP_BROWSER_REDIRECT,
    ACTIONDATA_NOT_SET;

    public static uxr a(int i) {
        if (i == 0) {
            return ACTIONDATA_NOT_SET;
        }
        if (i == 1) {
            return REQUEST_PERMISSIONS;
        }
        if (i == 2) {
            return APP_SETTINGS_REDIRECT;
        }
        if (i != 3) {
            return null;
        }
        return IN_APP_BROWSER_REDIRECT;
    }
}
