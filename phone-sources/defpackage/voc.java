package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum voc implements vug {
    ANDROID_PERMISSION_TYPE_UNSPECIFIED(0),
    ANDROID_POST_NOTIFICATIONS(1),
    ANDROID_CAMERA(2),
    ANDROID_ACCESS_FINE_LOCATION(3);

    private final int f;

    voc(int i) {
        this.f = i;
    }

    public static voc b(int i) {
        if (i == 0) {
            return ANDROID_PERMISSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ANDROID_POST_NOTIFICATIONS;
        }
        if (i == 2) {
            return ANDROID_CAMERA;
        }
        if (i != 3) {
            return null;
        }
        return ANDROID_ACCESS_FINE_LOCATION;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
