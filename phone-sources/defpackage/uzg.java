package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uzg implements vug {
    UNKNOWN(0),
    DISPLAYED(1),
    TAPPED(2),
    AUTOMATED(3);

    public final int e;

    uzg(int i) {
        this.e = i;
    }

    public static uzg b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISPLAYED;
        }
        if (i == 2) {
            return TAPPED;
        }
        if (i != 3) {
            return null;
        }
        return AUTOMATED;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
