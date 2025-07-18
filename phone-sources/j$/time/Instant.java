package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant c = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant d = ofEpochSecond(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant K(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant L(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        Objects.a(kVar, "temporal");
        try {
            return ofEpochSecond(kVar.C(j$.time.temporal.a.INSTANT_SECONDS), kVar.i(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName(), e);
        }
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return K(j$.desugar.sun.nio.fs.g.z(j, j2), ((int) j$.desugar.sun.nio.fs.g.G(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return K(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i2 = e.a[((j$.time.temporal.a) nVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.f || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar.a(this);
    }

    public final Instant M(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.H(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.l(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(0L, j);
            case 2:
                return M(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return O(j);
            case 4:
                return M(j, 0L);
            case 5:
                return M(j$.desugar.sun.nio.fs.g.I(j, 60), 0L);
            case 6:
                return M(j$.desugar.sun.nio.fs.g.I(j, 3600), 0L);
            case 7:
                return M(j$.desugar.sun.nio.fs.g.I(j, 43200), 0L);
            case 8:
                return M(j$.desugar.sun.nio.fs.g.I(j, 86400), 0L);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final Instant O(long j) {
        return M(j / 1000, (j % 1000) * 1000000);
    }

    public final long P(Instant instant) {
        long J = j$.desugar.sun.nio.fs.g.J(instant.a, this.a);
        long j = instant.b - this.b;
        return (J <= 0 || j >= 0) ? (J >= 0 || j <= 0) ? J : J + 1 : J - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.A(j);
        int i = e.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return K(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return K(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
                }
                if (j != j2) {
                    return K(j, i2);
                }
            }
        } else if (j != i2) {
            return K(j2, (int) j);
        }
        return this;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.K(this, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantL = L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, instantL);
        }
        int i = e.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j$.desugar.sun.nio.fs.g.J(instantL.a, j), 1000000000L), instantL.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j$.desugar.sun.nio.fs.g.J(instantL.a, j), 1000000000L), instantL.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.J(instantL.toEpochMilli(), toEpochMilli());
            case 4:
                return P(instantL);
            case 5:
                return P(instantL) / 60;
            case 6:
                return P(instantL) / 3600;
            case 7:
                return P(instantL) / 43200;
            case 8:
                return P(instantL) / 86400;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.d(this, nVar).a(nVar.m(this), nVar);
        }
        int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.d.a(this.a, aVar);
        }
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (Instant) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.l(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? O(Long.MAX_VALUE).O(1L) : O(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? M(Long.MAX_VALUE, 0L).M(1L, 0L) : M(-j, 0L);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.i(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j, 1000), i / 1000000) : j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j + 1, 1000), (i / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return K(j$.desugar.sun.nio.fs.g.H(j, j$.desugar.sun.nio.fs.g.z(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.G(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }
}
