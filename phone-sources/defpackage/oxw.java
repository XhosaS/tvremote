package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxw extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxa uxaVar = (uxa) obj;
        int iOrdinal = uxaVar.ordinal();
        if (iOrdinal == 0) {
            return voo.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return voo.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return voo.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return voo.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return voo.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uxaVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        voo vooVar = (voo) obj;
        int iOrdinal = vooVar.ordinal();
        if (iOrdinal == 0) {
            return uxa.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uxa.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return uxa.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return uxa.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return uxa.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vooVar))));
    }
}
