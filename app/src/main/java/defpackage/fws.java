package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fws implements abxf {
    NETWORK_STATE_UNSPECIFIED(0),
    NETWORK_STATE_TRUSTED(1),
    NETWORK_STATE_UNTRUSTED(2),
    UNRECOGNIZED(-1);

    private final int f;

    fws(int i) {
        this.f = i;
    }

    public static fws b(int i) {
        if (i == 0) {
            return NETWORK_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return NETWORK_STATE_TRUSTED;
        }
        if (i != 2) {
            return null;
        }
        return NETWORK_STATE_UNTRUSTED;
    }

    @Override // defpackage.abxf
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
