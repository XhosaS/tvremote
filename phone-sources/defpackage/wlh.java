package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wlh implements vug {
    DOMAIN_UNSPECIFIED(0),
    WATCH_ACTION(1),
    RECOMMENDATION(2),
    TVM_ENTITY(3),
    WATCHLIST(4),
    CONTINUE_WATCHING(5),
    LIBRARY(6),
    UNRECOGNIZED(-1);

    private final int j;

    wlh(int i2) {
        this.j = i2;
    }

    public static wlh b(int i2) {
        switch (i2) {
            case 0:
                return DOMAIN_UNSPECIFIED;
            case 1:
                return WATCH_ACTION;
            case 2:
                return RECOMMENDATION;
            case 3:
                return TVM_ENTITY;
            case 4:
                return WATCHLIST;
            case 5:
                return CONTINUE_WATCHING;
            case 6:
                return LIBRARY;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
