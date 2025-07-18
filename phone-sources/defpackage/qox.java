package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qox extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vka vkaVar = (vka) obj;
        int iOrdinal = vkaVar.ordinal();
        if (iOrdinal == 0) {
            return qoq.a;
        }
        if (iOrdinal == 1) {
            return qoq.b;
        }
        if (iOrdinal == 2) {
            return qoq.c;
        }
        if (iOrdinal == 3) {
            return qoq.d;
        }
        if (iOrdinal == 4) {
            return qoq.e;
        }
        if (iOrdinal == 5) {
            return qoq.f;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vkaVar))));
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        qoq qoqVar = (qoq) obj;
        int iOrdinal = qoqVar.ordinal();
        if (iOrdinal == 0) {
            return vka.DEFAULT;
        }
        if (iOrdinal == 1) {
            return vka.TV;
        }
        if (iOrdinal == 2) {
            return vka.WEARABLE;
        }
        if (iOrdinal == 3) {
            return vka.AUTOMOTIVE;
        }
        if (iOrdinal == 4) {
            return vka.BATTLESTAR;
        }
        if (iOrdinal == 5) {
            return vka.CHROME_OS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qoqVar))));
    }
}
