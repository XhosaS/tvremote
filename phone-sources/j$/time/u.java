package j$.time;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class u implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.s.EXCEEDS_PAD);
        mVar.c('-');
        mVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
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
        int i = t.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return K();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? j$.time.chrono.t.c : nVar == j$.time.temporal.o.c ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, nVar);
    }

    public final long K() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final u b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.l(this, j);
        }
        switch (t.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j);
            case 2:
                return N(j);
            case 3:
                return N(j$.desugar.sun.nio.fs.g.I(j, 10));
            case 4:
                return N(j$.desugar.sun.nio.fs.g.I(j, 100));
            case 5:
                return N(j$.desugar.sun.nio.fs.g.I(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.H(C(aVar), j), aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final u M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return O(aVar.d.a(j$.desugar.sun.nio.fs.g.z(j2, j3), aVar), ((int) j$.desugar.sun.nio.fs.g.G(j2, j3)) + 1);
    }

    public final u N(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.d.a(this.a + j, aVar), this.b);
    }

    public final u O(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new u(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final u a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (u) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.A(j);
        int i = t.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.A(i3);
            return O(i2, i3);
        }
        if (i == 2) {
            return M(j - K());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.A(i5);
            return O(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.A(i6);
            return O(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        if (C(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.A(i7);
        return O(i7, i4);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i = this.a - uVar.a;
        return i == 0 ? this.b - uVar.b : i;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.PROLEPTIC_MONTH || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.c.equals(j$.desugar.sun.nio.fs.g.w(temporal))) {
                    temporal = LocalDate.M(temporal);
                }
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                int i = temporal.i(aVar);
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
                int i2 = temporal.i(aVar2);
                aVar.A(i);
                aVar2.A(i2);
                uVar = new u(i, i2);
            } catch (b e) {
                throw new b("Unable to obtain YearMonth from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, uVar);
        }
        long jK = uVar.K() - K();
        switch (t.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jK;
            case 2:
                return jK / 12;
            case 3:
                return jK / 120;
            case 4:
                return jK / 1200;
            case 5:
                return jK / 12000;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
                return uVar.C(aVar3) - C(aVar3);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return m(nVar).a(C(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (u) j$.desugar.sun.nio.fs.g.a(localDate, this);
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
        return temporal.a(K(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + WVMediaCrypto.TYPE);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
