package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lby implements vug {
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

    lby(int i) {
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
