package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcx extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uyx uyxVar = (uyx) obj;
        int iOrdinal = uyxVar.ordinal();
        if (iOrdinal == 0) {
            return vnp.PULSE_WITH_INNER_CIRCLE;
        }
        if (iOrdinal == 1) {
            return vnp.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uyxVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vnp vnpVar = (vnp) obj;
        int iOrdinal = vnpVar.ordinal();
        if (iOrdinal == 1) {
            return uyx.PULSE_WITH_INNER_CIRCLE;
        }
        if (iOrdinal == 2) {
            return uyx.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vnpVar))));
    }
}
