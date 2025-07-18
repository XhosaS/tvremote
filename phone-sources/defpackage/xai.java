package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xai implements vug {
    FORMAT_UNKNOWN(0),
    FORMAT_SD(1),
    FORMAT_HD(2),
    FORMAT_UHD1(3),
    FORMAT_3D(4);

    public final int f;

    xai(int i) {
        this.f = i;
    }

    public static xai b(int i) {
        if (i == 0) {
            return FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return FORMAT_SD;
        }
        if (i == 2) {
            return FORMAT_HD;
        }
        if (i == 3) {
            return FORMAT_UHD1;
        }
        if (i != 4) {
            return null;
        }
        return FORMAT_3D;
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
