package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class s implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.s.EXCEEDS_PAD);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public s(int i) {
        this.a = i;
    }

    public static s K(int i) {
        j$.time.temporal.a.YEAR.A(i);
        return new s(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = r.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? j$.time.chrono.t.c : nVar == j$.time.temporal.o.c ? ChronoUnit.YEARS : j$.time.temporal.o.c(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final s b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.l(this, j);
        }
        int i = r.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return M(j);
        }
        if (i == 2) {
            return M(j$.desugar.sun.nio.fs.g.I(j, 10));
        }
        if (i == 3) {
            return M(j$.desugar.sun.nio.fs.g.I(j, 100));
        }
        if (i == 4) {
            return M(j$.desugar.sun.nio.fs.g.I(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return a(j$.desugar.sun.nio.fs.g.H(C(aVar), j), aVar);
    }

    public final s M(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.d.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final s a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (s) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.A(j);
        int i = r.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return K((int) j);
        }
        if (i == 2) {
            return K((int) j);
        }
        if (i == 3) {
            return C(j$.time.temporal.a.ERA) == j ? this : K(1 - i2);
        }
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((s) obj).a;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        s sVarK;
        if (temporal instanceof s) {
            sVarK = (s) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.c.equals(j$.desugar.sun.nio.fs.g.w(temporal))) {
                    temporal = LocalDate.M(temporal);
                }
                sVarK = K(temporal.i(j$.time.temporal.a.YEAR));
            } catch (b e) {
                throw new b("Unable to obtain Year from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, sVarK);
        }
        long j = sVarK.a - this.a;
        int i = r.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i != 5) {
            throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return sVarK.C(aVar) - C(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            if (this.a == ((s) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return m(nVar).a(C(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (s) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.q.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.w(temporal).equals(j$.time.chrono.t.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.a(this.a, j$.time.temporal.a.YEAR);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
