package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vcx implements vug {
    GRADIENT_UNSPECIFIED(0),
    GRADIENT_BL_TR(1),
    GRADIENT_BOTTOM_TOP(2),
    GRADIENT_BR_TL(3),
    GRADIENT_LEFT_RIGHT(4),
    GRADIENT_RIGHT_LEFT(5),
    GRADIENT_TL_BR(6),
    GRADIENT_TOP_BOTTOM(7),
    GRADIENT_TR_BL(8),
    UNRECOGNIZED(-1);

    private final int l;

    vcx(int i) {
        this.l = i;
    }

    public static vcx b(int i) {
        switch (i) {
            case 0:
                return GRADIENT_UNSPECIFIED;
            case 1:
                return GRADIENT_BL_TR;
            case 2:
                return GRADIENT_BOTTOM_TOP;
            case 3:
                return GRADIENT_BR_TL;
            case 4:
                return GRADIENT_LEFT_RIGHT;
            case 5:
                return GRADIENT_RIGHT_LEFT;
            case 6:
                return GRADIENT_TL_BR;
            case 7:
                return GRADIENT_TOP_BOTTOM;
            case 8:
                return GRADIENT_TR_BL;
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
