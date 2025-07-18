package j$.time;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import j$.time.chrono.InterfaceC0083b;
import j$.time.chrono.InterfaceC0086e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class LocalDate implements Temporal, j$.time.temporal.l, InterfaceC0083b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate L(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.c.getClass();
                if (j$.time.chrono.t.l(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + j.N(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate M(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalDate localDate = (LocalDate) kVar.J(j$.time.temporal.o.f);
        if (localDate != null) {
            return localDate;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName());
    }

    public static LocalDate V(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.A(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.d.a(j7, aVar), i3, i4);
    }

    public static LocalDate a0(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.t.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.t.l((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.A(i);
        j$.time.temporal.a.MONTH_OF_YEAR.A(i2);
        j$.time.temporal.a.DAY_OF_MONTH.A(i3);
        return L(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.EPOCH_DAY ? D() : nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? Q() : N(nVar) : nVar.m(this);
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final long D() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !S() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final InterfaceC0086e E(i iVar) {
        return LocalDateTime.N(this, iVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0083b interfaceC0083b) {
        return interfaceC0083b instanceof LocalDate ? K((LocalDate) interfaceC0083b) : j$.desugar.sun.nio.fs.g.b(this, interfaceC0083b);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this : j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    public final int K(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final int N(j$.time.temporal.n nVar) {
        int i;
        int i2 = f.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return P();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return O().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((P() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((P() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return i + 1;
    }

    public final c O() {
        return c.K(((int) j$.desugar.sun.nio.fs.g.G(D() + 3, 7)) + 1);
    }

    public final int P() {
        return (j.N(this.b).K(S()) + this.c) - 1;
    }

    public final long Q() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean R(InterfaceC0083b interfaceC0083b) {
        return interfaceC0083b instanceof LocalDate ? K((LocalDate) interfaceC0083b) < 0 : D() < interfaceC0083b.D();
    }

    public final boolean S() {
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        long j = this.a;
        tVar.getClass();
        return j$.time.chrono.t.l(j);
    }

    public final int T() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : S() ? 29 : 28;
    }

    public final long U(LocalDate localDate) {
        return (((localDate.Q() * 32) + localDate.c) - ((Q() * 32) + this.c)) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.l(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return X(j$.desugar.sun.nio.fs.g.I(j, 7));
            case 3:
                return Y(j);
            case 4:
                return Z(j);
            case 5:
                return Z(j$.desugar.sun.nio.fs.g.I(j, 10));
            case 6:
                return Z(j$.desugar.sun.nio.fs.g.I(j, 100));
            case 7:
                return Z(j$.desugar.sun.nio.fs.g.I(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.H(C(aVar), j), aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalDate X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jT = T();
                if (j2 <= jT) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jT));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.A(i2);
                return new LocalDate(i2, 1, (int) (j2 - jT));
            }
        }
        return V(j$.desugar.sun.nio.fs.g.H(D(), j));
    }

    public final LocalDate Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return a0(aVar.d.a(j$.desugar.sun.nio.fs.g.z(j2, j3), aVar), ((int) j$.desugar.sun.nio.fs.g.G(j2, j3)) + 1, this.c);
    }

    public final LocalDate Z(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return a0(aVar.d.a(this.a + j, aVar), this.b, this.c);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        LocalDateTime localDateTimeN = LocalDateTime.N(this, i.g);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.L().e(localDateTimeN);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.i()) {
                localDateTimeN = bVar.b.Q(bVar.d.a - bVar.c.a);
            }
        }
        return ZonedDateTime.L(localDateTimeN, zoneId, null);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDate) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.A(j);
        int i = f.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return of(i2, s2, i3);
                }
                return this;
            case 2:
                return d0((int) j);
            case 3:
                return X(j$.desugar.sun.nio.fs.g.I(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return e0((int) j);
            case 5:
                return X(j - O().getValue());
            case 6:
                return X(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return X(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return V(j);
            case 9:
                return X(j$.desugar.sun.nio.fs.g.I(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.A(i4);
                    return a0(i2, i4, s);
                }
                return this;
            case 11:
                return Y(j - Q());
            case 12:
                return e0((int) j);
            case 13:
                if (C(j$.time.temporal.a.ERA) != j) {
                    return e0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDate l(j$.time.temporal.l lVar) {
        return lVar instanceof LocalDate ? (LocalDate) lVar : (LocalDate) lVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, nVar);
    }

    public final LocalDate d0(int i) {
        if (P() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.A(j);
        j$.time.temporal.a.DAY_OF_YEAR.A(i);
        j$.time.chrono.t.c.getClass();
        boolean zL = j$.time.chrono.t.l(j);
        if (i == 366 && !zL) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        j jVarN = j.N(((i - 1) / 31) + 1);
        if (i > (jVarN.L(zL) + jVarN.K(zL)) - 1) {
            jVarN = j.a[((((int) 1) + 12) + jVarN.ordinal()) % 12];
        }
        return new LocalDate(i2, jVarN.getValue(), (i - jVarN.K(zL)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateM = M(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, localDateM);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateM.D() - D();
            case 2:
                return (localDateM.D() - D()) / 7;
            case 3:
                return U(localDateM);
            case 4:
                return U(localDateM) / 12;
            case 5:
                return U(localDateM) / 120;
            case 6:
                return U(localDateM) / 1200;
            case 7:
                return U(localDateM) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateM.C(aVar) - C(aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalDate e0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.A(i);
        return a0(i, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && K((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final j$.time.chrono.m getChronology() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? N(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, T());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, S() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? aVar.d : this.a <= 0 ? j$.time.temporal.q.f(1L, 1000000000L) : j$.time.temporal.q.f(1L, 999999999L);
        }
        return j$.time.temporal.q.f(1L, (j.N(this.b) != j.FEBRUARY || S()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + WVMediaCrypto.TYPE);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0083b
    /* renamed from: w */
    public final InterfaceC0083b A(long j, TemporalUnit temporalUnit) {
        return b(-1L, temporalUnit);
    }
}
