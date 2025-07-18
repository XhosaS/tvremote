package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pts extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        qrt qrtVar = (qrt) obj;
        int iOrdinal = qrtVar.ordinal();
        if (iOrdinal == 0) {
            return qfz.a;
        }
        if (iOrdinal == 1) {
            return qfz.b;
        }
        if (iOrdinal == 2) {
            return qfz.c;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qrtVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        qfz qfzVar = (qfz) obj;
        int iOrdinal = qfzVar.ordinal();
        if (iOrdinal == 0) {
            return qrt.a;
        }
        if (iOrdinal == 1) {
            return qrt.b;
        }
        if (iOrdinal == 2) {
            return qrt.c;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qfzVar))));
    }
}
