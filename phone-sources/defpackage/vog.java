package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vog implements vug {
    THEME_UNKNOWN(0),
    THEME_LIGHT(1),
    THEME_DARK(2);

    public final int d;

    vog(int i) {
        this.d = i;
    }

    public static vog b(int i) {
        if (i == 0) {
            return THEME_UNKNOWN;
        }
        if (i == 1) {
            return THEME_LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return THEME_DARK;
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
