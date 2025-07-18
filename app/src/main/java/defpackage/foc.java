package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum foc implements abxf {
    TOGGLE_UNSPECIFIED(0),
    TOGGLE_OFF(1),
    TOGGLE_ON(2),
    UNRECOGNIZED(-1);

    private final int f;

    foc(int i) {
        this.f = i;
    }

    public static foc b(int i) {
        if (i == 0) {
            return TOGGLE_UNSPECIFIED;
        }
        if (i == 1) {
            return TOGGLE_OFF;
        }
        if (i != 2) {
            return null;
        }
        return TOGGLE_ON;
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
