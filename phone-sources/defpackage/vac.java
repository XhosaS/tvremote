package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vac implements vug {
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

    vac(int i) {
        this.l = i;
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
