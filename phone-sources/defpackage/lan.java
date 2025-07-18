package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lan implements vug {
    SEASON_SELECTION_LOCATION_UNKNOWN(0),
    EARLIEST(1),
    LATEST(2),
    UNRECOGNIZED(-1);

    private final int f;

    lan(int i) {
        this.f = i;
    }

    public static lan b(int i) {
        if (i == 0) {
            return SEASON_SELECTION_LOCATION_UNKNOWN;
        }
        if (i == 1) {
            return EARLIEST;
        }
        if (i != 2) {
            return null;
        }
        return LATEST;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
