package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wpk implements vug {
    QUALITY_UNSPECIFIED(0),
    SD(1),
    HD(2),
    UHD(3),
    UNRECOGNIZED(-1);

    private final int g;

    wpk(int i) {
        this.g = i;
    }

    public static wpk b(int i) {
        if (i == 0) {
            return QUALITY_UNSPECIFIED;
        }
        if (i == 1) {
            return SD;
        }
        if (i == 2) {
            return HD;
        }
        if (i != 3) {
            return null;
        }
        return UHD;
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
