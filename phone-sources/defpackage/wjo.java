package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wjo implements vug {
    ANDROID_SURFACE_UNSPECIFIED(0),
    MOBILE(1),
    ATV(2),
    GTV(3),
    XR(4),
    DESKTOP(5),
    CAR(6);

    public final int h;

    wjo(int i2) {
        this.h = i2;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
