package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uza implements vug {
    UNKNOWN(0),
    ABOVE(1),
    BELOW(2);

    public final int d;

    uza(int i) {
        this.d = i;
    }

    public static uza b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
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
