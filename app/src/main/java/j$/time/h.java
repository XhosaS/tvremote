package j$.time;

import j$.time.chrono.InterfaceC0048b;
import j$.time.chrono.InterfaceC0051e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class h implements Temporal, j$.time.temporal.l, InterfaceC0048b, Serializable {
    public static final h d = h0(-999999999, 1, 1);
    public static final h e = h0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        h0(1970, 1, 1);
    }

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static h W(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.t.c.T(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + k.Y(i2).name() + " " + i3 + "'");
            }
        }
        return new h(i, i2, i3);
    }

    public static h X(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        h hVar = (h) kVar.U(j$.time.temporal.o.f);
        if (hVar != null) {
            return hVar;
        }
        throw new b(e.a("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
    }

    public static h g0(a aVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.a(instantOfEpochMilli, "instant");
        Objects.a(zoneId, "zone");
        return i0(j$.desugar.sun.nio.fs.g.A(instantOfEpochMilli.getEpochSecond() + zoneId.W().d(instantOfEpochMilli).b, 86400));
    }

    public static h h0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.H(i);
        j$.time.temporal.a.MONTH_OF_YEAR.H(i2);
        j$.time.temporal.a.DAY_OF_MONTH.H(i3);
        return W(i, i2, i3);
    }

    public static h i0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.H(j);
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
        return new h(aVar.d.a(j7, aVar), i3, i4);
    }

    public static h j0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.H(j);
        j$.time.temporal.a.DAY_OF_YEAR.H(i2);
        boolean zT = j$.time.chrono.t.c.T(j);
        if (i2 == 366 && !zT) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        k kVarY = k.Y(((i2 - 1) / 31) + 1);
        if (i2 > (kVarY.W(zT) + kVarY.V(zT)) - 1) {
            kVarY = k.a[((((int) 1) + 12) + kVarY.ordinal()) % 12];
        }
        return new h(i, kVarY.getValue(), (i2 - kVarY.V(zT)) + 1);
    }

    public static h p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.t.c.T((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new h(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.EPOCH_DAY ? I() : nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? b0() : Y(nVar) : nVar.t(this);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final long I() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !v() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final InterfaceC0051e J(LocalTime localTime) {
        return LocalDateTime.Y(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final j$.time.chrono.n L() {
        return this.a >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final InterfaceC0048b O(TemporalAmount temporalAmount) {
        if (temporalAmount != null) {
            q qVar = (q) temporalAmount;
            return m0((qVar.a * 12) + qVar.b).l0(qVar.c);
        }
        Objects.a(temporalAmount, "amountToAdd");
        return (h) ((q) temporalAmount).i(this);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final int R() {
        return v() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0048b interfaceC0048b) {
        return interfaceC0048b instanceof h ? V((h) interfaceC0048b) : j$.desugar.sun.nio.fs.g.b(this, interfaceC0048b);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this : j$.desugar.sun.nio.fs.g.m(this, nVar);
    }

    public final int V(h hVar) {
        int i = this.a - hVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - hVar.b;
        return i2 == 0 ? this.c - hVar.c : i2;
    }

    public final int Y(j$.time.temporal.n nVar) {
        int i;
        int i2 = g.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return a0();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return Z().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((a0() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((a0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return i + 1;
    }

    public final c Z() {
        return c.V(((int) j$.desugar.sun.nio.fs.g.I(I() + 3, 7)) + 1);
    }

    public final int a0() {
        return (k.Y(this.b).V(v()) + this.c) - 1;
    }

    public final long b0() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean c0(InterfaceC0048b interfaceC0048b) {
        return interfaceC0048b instanceof h ? V((h) interfaceC0048b) < 0 : I() < interfaceC0048b.I();
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.k(this, nVar);
    }

    public final int d0() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : v() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        h hVarX = X(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, hVarX);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return hVarX.I() - I();
            case 2:
                return (hVarX.I() - I()) / 7;
            case 3:
                return f0(hVarX);
            case 4:
                return f0(hVarX) / 12;
            case 5:
                return f0(hVarX) / 120;
            case 6:
                return f0(hVarX) / 1200;
            case 7:
                return f0(hVarX) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return hVarX.H(aVar) - H(aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.chrono.InterfaceC0048b
    /* renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h x(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && V((h) obj) == 0;
    }

    public final long f0(h hVar) {
        return (((hVar.b0() * 32) + hVar.c) - ((b0() * 32) + this.c)) / 32;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final j$.time.chrono.m getChronology() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? Y(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final h b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (h) temporalUnit.l(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return l0(j);
            case 2:
                return n0(j);
            case 3:
                return m0(j);
            case 4:
                return o0(j);
            case 5:
                return o0(j$.desugar.sun.nio.fs.g.K(j, 10));
            case 6:
                return o0(j$.desugar.sun.nio.fs.g.K(j, 100));
            case 7:
                return o0(j$.desugar.sun.nio.fs.g.K(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.J(H(aVar), j), aVar);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final h l0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new h(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jD0 = d0();
                if (j2 <= jD0) {
                    return new h(i, s, (int) j2);
                }
                if (s < 12) {
                    return new h(i, s + 1, (int) (j2 - jD0));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.H(i2);
                return new h(i2, 1, (int) (j2 - jD0));
            }
        }
        return i0(j$.desugar.sun.nio.fs.g.J(I(), j));
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
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, d0());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, R());
        }
        if (i != 3) {
            return i != 4 ? aVar.d : this.a <= 0 ? j$.time.temporal.q.f(1L, 1000000000L) : j$.time.temporal.q.f(1L, 999999999L);
        }
        return j$.time.temporal.q.f(1L, (k.Y(this.b) != k.FEBRUARY || v()) ? 5L : 4L);
    }

    public final h m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return p0(aVar.d.a(j$.desugar.sun.nio.fs.g.A(j2, j3), aVar), ((int) j$.desugar.sun.nio.fs.g.I(j2, j3)) + 1, this.c);
    }

    public final h n0(long j) {
        return l0(j$.desugar.sun.nio.fs.g.K(j, 7));
    }

    public final h o0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return p0(aVar.d.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final h a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (h) nVar.E(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.H(j);
        int i = g.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return h0(i2, s2, i3);
                }
                return this;
            case 2:
                int i4 = (int) j;
                if (a0() != i4) {
                    return j0(i2, i4);
                }
                return this;
            case 3:
                return n0(j - H(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return s0((int) j);
            case 5:
                return l0(j - Z().getValue());
            case 6:
                return l0(j - H(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return l0(j - H(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return i0(j);
            case 9:
                return n0(j - H(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 != i5) {
                    j$.time.temporal.a.MONTH_OF_YEAR.H(i5);
                    return p0(i2, i5, s);
                }
                return this;
            case 11:
                return m0(j - b0());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return s0((int) j);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (H(j$.time.temporal.a.ERA) != j) {
                    return s0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h l(j$.time.temporal.l lVar) {
        return lVar instanceof h ? (h) lVar : (h) lVar.t(this);
    }

    public final h s0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.H(i);
        return p0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(I(), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0048b
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
            sb.append(i + 10000);
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

    @Override // j$.time.chrono.InterfaceC0048b
    public final boolean v() {
        return j$.time.chrono.t.c.T(this.a);
    }
}
