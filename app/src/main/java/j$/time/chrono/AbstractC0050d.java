package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0050d implements InterfaceC0048b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static InterfaceC0048b V(m mVar, Temporal temporal) {
        InterfaceC0048b interfaceC0048b = (InterfaceC0048b) temporal;
        if (mVar.equals(interfaceC0048b.getChronology())) {
            return interfaceC0048b;
        }
        throw new ClassCastException(j$.time.e.a("Chronology mismatch, expected: ", mVar.getId(), ", actual: ", interfaceC0048b.getChronology().getId()));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: D */
    public InterfaceC0048b l(j$.time.temporal.l lVar) {
        return V(getChronology(), lVar.t(this));
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public long I() {
        return H(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public InterfaceC0051e J(LocalTime localTime) {
        return new C0053g(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public n L() {
        return getChronology().z(j$.time.temporal.o.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public InterfaceC0048b O(TemporalAmount temporalAmount) {
        return V(getChronology(), temporalAmount.i(this));
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public int R() {
        return v() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: S */
    public final /* synthetic */ int compareTo(InterfaceC0048b interfaceC0048b) {
        return j$.desugar.sun.nio.fs.g.b(this, interfaceC0048b);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object U(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    public final long W(InterfaceC0048b interfaceC0048b) {
        if (getChronology().w(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jH = H(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC0048b.H(aVar) * 32) + interfaceC0048b.i(aVar2)) - (jH + j$.time.temporal.o.a(this, aVar2))) / 32;
    }

    public abstract InterfaceC0048b X(long j);

    public abstract InterfaceC0048b Y(long j);

    public abstract InterfaceC0048b Z(long j);

    @Override // j$.time.chrono.InterfaceC0048b, j$.time.temporal.k
    public /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0048b, j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0048b interfaceC0048bG = getChronology().G(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.i(this, interfaceC0048bG);
        }
        switch (AbstractC0049c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC0048bG.I() - I();
            case 2:
                return (interfaceC0048bG.I() - I()) / 7;
            case 3:
                return W(interfaceC0048bG);
            case 4:
                return W(interfaceC0048bG) / 12;
            case 5:
                return W(interfaceC0048bG) / 120;
            case 6:
                return W(interfaceC0048bG) / 1200;
            case 7:
                return W(interfaceC0048bG) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC0048bG.H(aVar) - H(aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0048b) && j$.desugar.sun.nio.fs.g.b(this, (InterfaceC0048b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public int hashCode() {
        long jI = I();
        return getChronology().hashCode() ^ ((int) (jI ^ (jI >>> 32)));
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
    public final Temporal t(Temporal temporal) {
        return temporal.a(I(), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final String toString() {
        long jH = H(j$.time.temporal.a.YEAR_OF_ERA);
        long jH2 = H(j$.time.temporal.a.MONTH_OF_YEAR);
        long jH3 = H(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(L());
        sb.append(" ");
        sb.append(jH);
        sb.append(jH2 < 10 ? "-0" : "-");
        sb.append(jH2);
        sb.append(jH3 < 10 ? "-0" : "-");
        sb.append(jH3);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public boolean v() {
        return getChronology().T(H(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0048b x(long j, TemporalUnit temporalUnit) {
        return V(getChronology(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0048b a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return V(getChronology(), nVar.E(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0048b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return V(getChronology(), temporalUnit.l(this, j));
        }
        switch (AbstractC0049c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return X(j$.desugar.sun.nio.fs.g.K(j, 7));
            case 3:
                return Y(j);
            case 4:
                return Z(j);
            case 5:
                return Z(j$.desugar.sun.nio.fs.g.K(j, 10));
            case 6:
                return Z(j$.desugar.sun.nio.fs.g.K(j, 100));
            case 7:
                return Z(j$.desugar.sun.nio.fs.g.K(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.J(H(aVar), j), (j$.time.temporal.n) aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
