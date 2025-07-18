package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes4.dex */
public abstract class o {
    public static final j$.desugar.sun.nio.fs.n a = new j$.desugar.sun.nio.fs.n(2);
    public static final j$.desugar.sun.nio.fs.n b = new j$.desugar.sun.nio.fs.n(3);
    public static final j$.desugar.sun.nio.fs.n c = new j$.desugar.sun.nio.fs.n(4);
    public static final j$.desugar.sun.nio.fs.n d = new j$.desugar.sun.nio.fs.n(5);
    public static final j$.desugar.sun.nio.fs.n e = new j$.desugar.sun.nio.fs.n(6);
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(7);
    public static final j$.desugar.sun.nio.fs.n g = new j$.desugar.sun.nio.fs.n(8);

    public static int a(k kVar, n nVar) {
        q qVarM = kVar.m(nVar);
        if (!qVarM.d()) {
            throw new p("Invalid field " + String.valueOf(nVar) + " for get() method, use getLong() instead");
        }
        long jC = kVar.C(nVar);
        if (qVarM.e(jC)) {
            return (int) jC;
        }
        throw new j$.time.b("Invalid value for " + String.valueOf(nVar) + " (valid values " + String.valueOf(qVarM) + "): " + jC);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(k kVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == a || nVar == b || nVar == c) {
            return null;
        }
        return nVar.a(kVar);
    }

    public static q d(k kVar, n nVar) {
        if (!(nVar instanceof a)) {
            Objects.a(nVar, "field");
            return nVar.l(kVar);
        }
        if (kVar.d(nVar)) {
            return ((a) nVar).d;
        }
        throw new p("Unsupported field: ".concat(String.valueOf(nVar)));
    }
}
