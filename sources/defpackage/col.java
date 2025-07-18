package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class col {
    static {
        clo cloVarO = clf.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        ((clf) cltVar).b = -315576000000L;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        ((clf) cloVarO.b).c = -999999999;
        clo cloVarO2 = clf.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar2 = cloVarO2.b;
        ((clf) cltVar2).b = 315576000000L;
        if (!cltVar2.A()) {
            cloVarO2.l();
        }
        ((clf) cloVarO2.b).c = 999999999;
        clo cloVarO3 = clf.a.o();
        if (!cloVarO3.b.A()) {
            cloVarO3.l();
        }
        clt cltVar3 = cloVarO3.b;
        ((clf) cltVar3).b = 0L;
        if (!cltVar3.A()) {
            cloVarO3.l();
        }
        ((clf) cloVarO3.b).c = 0;
    }

    public static clf a(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = qm.V(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        clo cloVarO = clf.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        ((clf) cltVar).b = j;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        ((clf) cloVarO.b).c = i;
        clf clfVar = (clf) cloVarO.i();
        long j2 = clfVar.b;
        int i2 = clfVar.c;
        if (j2 < -315576000000L || j2 > 315576000000L || i2 < -999999999 || i2 >= 1000000000 || ((j2 < 0 || i2 < 0) && (j2 > 0 || i2 > 0))) {
            throw new IllegalArgumentException(bit.l("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j2), Integer.valueOf(i2)));
        }
        return clfVar;
    }
}
