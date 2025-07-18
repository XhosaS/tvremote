package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pcs extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uyk uykVar = (uyk) obj;
        int iOrdinal = uykVar.ordinal();
        if (iOrdinal == 0) {
            return voj.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return voj.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(uykVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        voj vojVar = (voj) obj;
        int iOrdinal = vojVar.ordinal();
        if (iOrdinal == 0) {
            return uyk.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return uyk.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vojVar))));
    }
}
