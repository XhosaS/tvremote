package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kzb implements vug {
    TAG_UNSPECIFIED(0),
    DOWNLOADED(1),
    RENTED(2),
    FAMILY_LIBRARY_SHARING(3),
    NOT_FAMILY_LIBRARY_SHARING(4),
    QUALITY_SD(5),
    QUALITY_HD(6),
    QUALITY_UHD(7),
    UPGRADED_TO_4K(8),
    UNRECOGNIZED(-1);

    private final int l;

    kzb(int i) {
        this.l = i;
    }

    public static kzb b(int i) {
        switch (i) {
            case 0:
                return TAG_UNSPECIFIED;
            case 1:
                return DOWNLOADED;
            case 2:
                return RENTED;
            case 3:
                return FAMILY_LIBRARY_SHARING;
            case 4:
                return NOT_FAMILY_LIBRARY_SHARING;
            case 5:
                return QUALITY_SD;
            case 6:
                return QUALITY_HD;
            case 7:
                return QUALITY_UHD;
            case 8:
                return UPGRADED_TO_4K;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
