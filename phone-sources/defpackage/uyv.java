package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uyv implements vug {
    UNSPECIFIED(0),
    LIGHT(1),
    DARK(2);

    public final int d;

    uyv(int i) {
        this.d = i;
    }

    public static uyv b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return DARK;
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
