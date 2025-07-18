package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rva implements abxf {
    DEFAULT(0),
    AMBIENT(1),
    CONVERSATIONAL(2),
    CONVERSATIONAL_TURN_BY_TURN(4),
    CAPTURE_OUTPUT(3);

    public final int f;

    rva(int i) {
        this.f = i;
    }

    public static rva b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return AMBIENT;
        }
        if (i == 2) {
            return CONVERSATIONAL;
        }
        if (i == 3) {
            return CAPTURE_OUTPUT;
        }
        if (i != 4) {
            return null;
        }
        return CONVERSATIONAL_TURN_BY_TURN;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
