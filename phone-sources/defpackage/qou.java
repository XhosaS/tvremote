package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qou extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vgt vgtVar = (vgt) obj;
        int iOrdinal = vgtVar.ordinal();
        if (iOrdinal == 0) {
            return vkc.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vkc.TRUE;
        }
        if (iOrdinal == 2) {
            return vkc.FALSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vgtVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vkc vkcVar = (vkc) obj;
        int iOrdinal = vkcVar.ordinal();
        if (iOrdinal == 0) {
            return vgt.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vgt.TRUE;
        }
        if (iOrdinal == 2) {
            return vgt.FALSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vkcVar))));
    }
}
