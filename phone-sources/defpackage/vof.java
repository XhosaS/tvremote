package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vof implements vug {
    ORIENTATION_UNKNOWN(0),
    ORIENTATION_PORTRAIT(1),
    ORIENTATION_LANDSCAPE(2);

    public final int d;

    vof(int i) {
        this.d = i;
    }

    public static vof b(int i) {
        if (i == 0) {
            return ORIENTATION_UNKNOWN;
        }
        if (i == 1) {
            return ORIENTATION_PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return ORIENTATION_LANDSCAPE;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
