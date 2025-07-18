package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uvz implements vug {
    CONNECTIVITY_UNKNOWN(0),
    OFFLINE(1),
    ONLINE(2),
    UNRECOGNIZED(-1);

    private final int f;

    uvz(int i) {
        this.f = i;
    }

    public static uvz b(int i) {
        if (i == 0) {
            return CONNECTIVITY_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i != 2) {
            return null;
        }
        return ONLINE;
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
