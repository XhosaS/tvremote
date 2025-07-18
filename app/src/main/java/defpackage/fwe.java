package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fwe implements abxf {
    DSC_UNSPECIFIED(0),
    DSC_GRANTED(1),
    DSC_DENIED(2),
    DSC_DENIED_IN_OOBE(3),
    UNRECOGNIZED(-1);

    private final int g;

    fwe(int i) {
        this.g = i;
    }

    public static fwe b(int i) {
        if (i == 0) {
            return DSC_UNSPECIFIED;
        }
        if (i == 1) {
            return DSC_GRANTED;
        }
        if (i == 2) {
            return DSC_DENIED;
        }
        if (i != 3) {
            return null;
        }
        return DSC_DENIED_IN_OOBE;
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
