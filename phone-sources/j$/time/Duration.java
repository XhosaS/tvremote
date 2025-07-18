package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.e(temporal2, ChronoUnit.NANOS));
        } catch (b | ArithmeticException unused) {
            long jE = temporal.e(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jC = temporal2.C(aVar) - temporal.C(aVar);
                if (jE > 0 && jC < 0) {
                    jE++;
                } else if (jE < 0 && jC > 0) {
                    jE--;
                }
                j = jC;
            } catch (b unused2) {
            }
            return ofSeconds(jE, j);
        }
    }

    public static Duration m(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.t(j$.desugar.sun.nio.fs.g.I(j, 86400), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new j$.time.temporal.p("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = d.a[((ChronoUnit) temporalUnit).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? duration.t(j$.desugar.sun.nio.fs.g.I(temporalUnit.getDuration().a, j), 0L) : duration.t(j, 0L) : duration.t(j / 1000, (j % 1000) * 1000000) : duration.t((j / 1000000000) * 1000, 0L).t(0L, (j % 1000000000) * 1000) : duration.t(0L, j);
        }
        Duration duration2 = temporalUnit.getDuration();
        duration2.getClass();
        if (j == 0) {
            duration2 = duration;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration2.a).add(BigDecimal.valueOf(duration2.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
            }
            duration2 = ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return duration.t(duration2.getSeconds(), 0L).t(0L, duration2.getNano());
    }

    public static Duration ofHours(long j) {
        return m(j$.desugar.sun.nio.fs.g.I(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return m(j$.desugar.sun.nio.fs.g.I(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return m(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return m(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal i(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? instant.b(i, ChronoUnit.NANOS) : instant;
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal l(Instant instant) {
        long j = this.a;
        Temporal temporalA = instant;
        if (j != 0) {
            temporalA = instant.A(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return temporalA;
        }
        return ((Instant) temporalA).A(i, ChronoUnit.NANOS);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? t(Long.MAX_VALUE, -nano).t(1L, 0L) : t(-seconds, -nano);
    }

    public final Duration t(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.H(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j2, 1000), j / 1000000);
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j, long j2) {
        return m(j$.desugar.sun.nio.fs.g.H(j, j$.desugar.sun.nio.fs.g.z(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.G(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }
}
