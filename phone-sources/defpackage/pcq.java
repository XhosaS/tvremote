package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcq extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxx uxxVar = (uxx) obj;
        int iOrdinal = uxxVar.ordinal();
        if (iOrdinal == 0) {
            return vng.ALIGNMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vng.TRAILING;
        }
        if (iOrdinal == 2) {
            return vng.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uxxVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vng vngVar = (vng) obj;
        int iOrdinal = vngVar.ordinal();
        if (iOrdinal == 0) {
            return uxx.UNKNOWN_ALIGNMENT;
        }
        if (iOrdinal == 1) {
            return uxx.RIGHT;
        }
        if (iOrdinal == 2) {
            return uxx.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vngVar))));
    }
}
