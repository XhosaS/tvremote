package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xbn implements vug {
    SEASON_SELECTION_LOCATION_UNKNOWN(0),
    EARLIEST(1),
    LATEST(2);

    public final int d;

    xbn(int i) {
        this.d = i;
    }

    public static xbn b(int i) {
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
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
