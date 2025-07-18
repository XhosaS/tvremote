package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fnj implements abxf {
    UNSPECIFIED(0),
    SOFTWARE(1),
    IR(2),
    CEC(3),
    UNRECOGNIZED(-1);

    private final int g;

    fnj(int i) {
        this.g = i;
    }

    public static fnj b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return SOFTWARE;
        }
        if (i == 2) {
            return IR;
        }
        if (i != 3) {
            return null;
        }
        return CEC;
    }

    @Override // defpackage.abxf
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
