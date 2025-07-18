package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acqc implements abxf {
    REQUIRES_UNSPECIFIED(0),
    REQUIRES_ACTIVATION_ID(1),
    REQUIRES_ORIGIN_PRODUCT_ID(2);

    public static final abxg d = new abxg() { // from class: acqb
    };
    private final int f;

    acqc(int i) {
        this.f = i;
    }

    public static acqc b(int i) {
        if (i == 0) {
            return REQUIRES_UNSPECIFIED;
        }
        if (i == 1) {
            return REQUIRES_ACTIVATION_ID;
        }
        if (i != 2) {
            return null;
        }
        return REQUIRES_ORIGIN_PRODUCT_ID;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
