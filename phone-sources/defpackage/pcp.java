package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcp extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxv uxvVar = (uxv) obj;
        int iOrdinal = uxvVar.ordinal();
        if (iOrdinal == 0) {
            return vna.USER_ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return vna.USER_ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return vna.USER_ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return vna.USER_ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return vna.USER_ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uxvVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vna vnaVar = (vna) obj;
        int iOrdinal = vnaVar.ordinal();
        if (iOrdinal == 0) {
            return uxv.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uxv.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return uxv.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return uxv.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return uxv.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vnaVar))));
    }
}
