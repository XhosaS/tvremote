package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xos implements abxf {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    CHROME_OS(3),
    NATIVE_CHROME_OS(4),
    KAIOS(5),
    ANDROID_TV(6);

    public final int h;

    xos(int i2) {
        this.h = i2;
    }

    public static xos b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return ANDROID;
            case 2:
                return IOS;
            case 3:
                return CHROME_OS;
            case 4:
                return NATIVE_CHROME_OS;
            case 5:
                return KAIOS;
            case 6:
                return ANDROID_TV;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
