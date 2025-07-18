package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xau implements vug {
    OFFER_UNKNOWN(0),
    RENTAL(1),
    EST(2),
    SUBSCRIPTION(3),
    OFFER_FREE_WITH_ADS(4);

    public final int f;

    xau(int i) {
        this.f = i;
    }

    public static xau b(int i) {
        if (i == 0) {
            return OFFER_UNKNOWN;
        }
        if (i == 1) {
            return RENTAL;
        }
        if (i == 2) {
            return EST;
        }
        if (i == 3) {
            return SUBSCRIPTION;
        }
        if (i != 4) {
            return null;
        }
        return OFFER_FREE_WITH_ADS;
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
