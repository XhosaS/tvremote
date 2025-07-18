package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0085d implements InterfaceC0083b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static InterfaceC0083b K(m mVar, Temporal temporal) {
        InterfaceC0083b interfaceC0083b = (InterfaceC0083b) temporal;
        if (mVar.equals(interfaceC0083b.getChronology())) {
            return interfaceC0083b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.h() + ", actual: " + interfaceC0083b.getChronology().h());
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public long D() {
        return C(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public InterfaceC0086e E(j$.time.i iVar) {
        return new C0088g(this, iVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: I */
    public final /* synthetic */ int compareTo(InterfaceC0083b interfaceC0083b) {
        return j$.desugar.sun.nio.fs.g.b(this, interfaceC0083b);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    public n L() {
        return getChronology().x(j$.time.temporal.o.a(this, j$.time.temporal.a.ERA));
    }

    public final long M(InterfaceC0083b interfaceC0083b) {
        if (getChronology().v(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jC = C(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC0083b.C(aVar) * 32) + interfaceC0083b.i(aVar2)) - (jC + j$.time.temporal.o.a(this, aVar2))) / 32;
    }

    public abstract InterfaceC0083b N(long j);

    public abstract InterfaceC0083b O(long j);

    public abstract InterfaceC0083b P(long j);

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public InterfaceC0083b l(j$.time.temporal.l lVar) {
        return K(getChronology(), lVar.t(this));
    }

    @Override // j$.time.chrono.InterfaceC0083b, j$.time.temporal.k
    public /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0083b, j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0083b interfaceC0083bB = getChronology().B(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.i(this, interfaceC0083bB);
        }
        switch (AbstractC0084c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC0083bB.D() - D();
            case 2:
                return (interfaceC0083bB.D() - D()) / 7;
            case 3:
                return M(interfaceC0083bB);
            case 4:
                return M(interfaceC0083bB) / 12;
            case 5:
                return M(interfaceC0083bB) / 120;
            case 6:
                return M(interfaceC0083bB) / 1200;
            case 7:
                return M(interfaceC0083bB) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC0083bB.C(aVar) - C(aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0083b) && j$.desugar.sun.nio.fs.g.b(this, (InterfaceC0083b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public int hashCode() {
        long jD = D();
        return getChronology().hashCode() ^ ((int) (jD ^ (jD >>> 32)));
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Temporal t(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final String toString() {
        long jC = C(j$.time.temporal.a.YEAR_OF_ERA);
        long jC2 = C(j$.time.temporal.a.MONTH_OF_YEAR);
        long jC3 = C(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(L());
        sb.append(" ");
        sb.append(jC);
        sb.append(jC2 < 10 ? "-0" : "-");
        sb.append(jC2);
        sb.append(jC3 < 10 ? "-0" : "-");
        sb.append(jC3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceC0083b A(long j, TemporalUnit temporalUnit) {
        return K(getChronology(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0083b a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return K(getChronology(), nVar.t(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0083b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return K(getChronology(), temporalUnit.l(this, j));
        }
        switch (AbstractC0084c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return N(j);
            case 2:
                return N(j$.desugar.sun.nio.fs.g.I(j, 7));
            case 3:
                return O(j);
            case 4:
                return P(j);
            case 5:
                return P(j$.desugar.sun.nio.fs.g.I(j, 10));
            case 6:
                return P(j$.desugar.sun.nio.fs.g.I(j, 100));
            case 7:
                return P(j$.desugar.sun.nio.fs.g.I(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.H(C(aVar), j), (j$.time.temporal.n) aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
