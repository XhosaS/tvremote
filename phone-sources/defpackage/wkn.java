package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wkn implements vug {
    UNSPECIFIED(0),
    UNCHECKED(1),
    INDETERMINATE(2),
    CHECKED(3),
    UNRECOGNIZED(-1);

    private final int g;

    wkn(int i) {
        this.g = i;
    }

    public static wkn b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return UNCHECKED;
        }
        if (i == 2) {
            return INDETERMINATE;
        }
        if (i != 3) {
            return null;
        }
        return CHECKED;
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
