package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ggg implements abxf {
    EVENT_TYPE_UNSPECIFIED(0),
    EVENT_TYPE_START(1),
    EVENT_TYPE_MILESTONE(2),
    EVENT_TYPE_END(3),
    UNRECOGNIZED(-1);

    private final int g;

    ggg(int i) {
        this.g = i;
    }

    public static ggg b(int i) {
        if (i == 0) {
            return EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return EVENT_TYPE_START;
        }
        if (i == 2) {
            return EVENT_TYPE_MILESTONE;
        }
        if (i != 3) {
            return null;
        }
        return EVENT_TYPE_END;
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
