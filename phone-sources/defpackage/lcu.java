package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lcu implements vug {
    TOMATOMETER_RATING_UNKNOWN(0),
    TOMATOMETER_RATING_ROTTEN(1),
    TOMATOMETER_RATING_FRESH(2),
    TOMATOMETER_RATING_CERTIFIED_FRESH(3),
    UNRECOGNIZED(-1);

    private final int g;

    lcu(int i) {
        this.g = i;
    }

    public static lcu b(int i) {
        if (i == 0) {
            return TOMATOMETER_RATING_UNKNOWN;
        }
        if (i == 1) {
            return TOMATOMETER_RATING_ROTTEN;
        }
        if (i == 2) {
            return TOMATOMETER_RATING_FRESH;
        }
        if (i != 3) {
            return null;
        }
        return TOMATOMETER_RATING_CERTIFIED_FRESH;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
