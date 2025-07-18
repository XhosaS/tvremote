package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xbm implements vug {
    DETAILS_PAGE_DISTRIBUTOR_SELECTION_TYPE_UNKNOWN(0),
    GOOGLE_PLAY(1),
    SPECIFIC_DISTRIBUTOR(2),
    ENTITLED_DISTRIBUTOR(3),
    BEST_AVAILABLE(4);

    public final int f;

    xbm(int i) {
        this.f = i;
    }

    public static xbm b(int i) {
        if (i == 0) {
            return DETAILS_PAGE_DISTRIBUTOR_SELECTION_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return GOOGLE_PLAY;
        }
        if (i == 2) {
            return SPECIFIC_DISTRIBUTOR;
        }
        if (i == 3) {
            return ENTITLED_DISTRIBUTOR;
        }
        if (i != 4) {
            return null;
        }
        return BEST_AVAILABLE;
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
