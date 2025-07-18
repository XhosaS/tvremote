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

/* loaded from: classes3.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant V(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant W(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        Objects.a(kVar, "temporal");
        try {
            return ofEpochSecond(kVar.H(j$.time.temporal.a.INSTANT_SECONDS), kVar.i(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            throw new b(e.a("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return V(j$.desugar.sun.nio.fs.g.A(j, j2), ((int) j$.desugar.sun.nio.fs.g.I(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return V(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        String string;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f;
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(1);
        dateTimeFormatter.getClass();
        Objects.a(charSequence, "text");
        try {
            return (Instant) dateTimeFormatter.b(charSequence).U(nVar);
        } catch (j$.time.format.w e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            j$.time.format.w wVar = new j$.time.format.w(e.a("Text '", string, "' could not be parsed: ", e2.getMessage()), e2);
            charSequence.toString();
            throw wVar;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.t(this);
        }
        int i2 = f.a[((j$.time.temporal.a) nVar).ordinal()];
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
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.f || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar.c(this);
    }

    public final Instant X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.J(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.l(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(0L, j);
            case 2:
                return X(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return X(j / 1000, (j % 1000) * 1000000);
            case 4:
                return X(j, 0L);
            case 5:
                return X(j$.desugar.sun.nio.fs.g.K(j, 60), 0L);
            case 6:
                return X(j$.desugar.sun.nio.fs.g.K(j, 3600), 0L);
            case 7:
                return X(j$.desugar.sun.nio.fs.g.K(j, 43200), 0L);
            case 8:
                return X(j$.desugar.sun.nio.fs.g.K(j, 86400), 0L);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final long Z(Instant instant) {
        long jL = j$.desugar.sun.nio.fs.g.L(instant.a, this.a);
        long j = instant.b - this.b;
        return (jL <= 0 || j >= 0) ? (jL >= 0 || j <= 0) ? jL : jL + 1 : jL - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.E(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.H(j);
        int i = f.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return V(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return V(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
                }
                if (j != j2) {
                    return V(j, i2);
                }
            }
        } else if (j != i2) {
            return V(j2, (int) j);
        }
        return this;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.V(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return ZonedDateTime.t(getEpochSecond(), getNano(), zoneId);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantW = W(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, instantW);
        }
        int i = f.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(instantW.a, j), 1000000000L), instantW.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(instantW.a, j), 1000000000L), instantW.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.L(instantW.toEpochMilli(), toEpochMilli());
            case 4:
                return Z(instantW);
            case 5:
                return Z(instantW) / 60;
            case 6:
                return Z(instantW) / 3600;
            case 7:
                return Z(instantW) / 43200;
            case 8:
                return Z(instantW) / 86400;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
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
            return j$.time.temporal.o.d(this, nVar).a(nVar.t(this), nVar);
        }
        int i = f.a[((j$.time.temporal.a) nVar).ordinal()];
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
    public final Temporal l(h hVar) {
        return (Instant) hVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.l(this);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? X(Long.MAX_VALUE, 0L).X(1L, 0L) : X(-j, 0L);
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
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j, 1000), i / 1000000) : j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j + 1, 1000), (i / 1000000) - 1000);
    }

    public String toString() {
        return DateTimeFormatter.f.a(this);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return V(j$.desugar.sun.nio.fs.g.J(j, j$.desugar.sun.nio.fs.g.A(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.I(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }
}
