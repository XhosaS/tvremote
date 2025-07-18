package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ptt extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        qri qriVar = (qri) obj;
        int iOrdinal = qriVar.ordinal();
        if (iOrdinal == 0) {
            return qfh.PRIORITY_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return qfh.PRIORITY_NORMAL;
        }
        if (iOrdinal == 2) {
            return qfh.PRIORITY_HIGH;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qriVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        qfh qfhVar = (qfh) obj;
        int iOrdinal = qfhVar.ordinal();
        if (iOrdinal == 0) {
            return qri.a;
        }
        if (iOrdinal == 1) {
            return qri.b;
        }
        if (iOrdinal == 2) {
            return qri.c;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qfhVar))));
    }
}
