package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcw extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uza uzaVar = (uza) obj;
        int iOrdinal = uzaVar.ordinal();
        if (iOrdinal == 0) {
            return vnx.PLACEMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vnx.ABOVE;
        }
        if (iOrdinal == 2) {
            return vnx.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uzaVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vnx vnxVar = (vnx) obj;
        int iOrdinal = vnxVar.ordinal();
        if (iOrdinal == 0) {
            return uza.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uza.ABOVE;
        }
        if (iOrdinal == 2) {
            return uza.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vnxVar))));
    }
}
