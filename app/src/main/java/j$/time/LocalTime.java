package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class LocalTime implements Temporal, j$.time.temporal.l, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    public static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime W(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime X(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalTime localTime = (LocalTime) kVar.U(j$.time.temporal.o.g);
        if (localTime != null) {
            return localTime;
        }
        throw new b(e.a("Unable to obtain LocalTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
    }

    public static LocalTime Z(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.H(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.H(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.H(i3);
        j$.time.temporal.a.NANO_OF_SECOND.H(i4);
        return W(i, i2, i3, i4);
    }

    public static LocalTime a0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.H(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return W(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    public static LocalTime g0(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 >= 0) {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r4 = ~b2;
                i = 0;
                b = r4;
                i2 = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    b = b2;
                } else {
                    i = objectInput.readInt();
                    b = b2;
                    i2 = b3;
                }
            }
            return Z(i3, b, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        return Z(i3, b, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? toNanoOfDay() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? toNanoOfDay() / 1000 : Y(nVar) : nVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        if (nVar == j$.time.temporal.o.g) {
            return this;
        }
        if (nVar == j$.time.temporal.o.f) {
            return null;
        }
        return nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public final int Y(j$.time.temporal.n nVar) {
        int i = j.a[((j$.time.temporal.a) nVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.c;
            case 8:
                return h0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (b2 == 0) {
                    return 24;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.l(this, j);
        }
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return e0(j);
            case 2:
                return e0((j % 86400000000L) * 1000);
            case 3:
                return e0((j % 86400000) * 1000000);
            case 4:
                return f0(j);
            case 5:
                return d0(j);
            case 6:
                return c0(j);
            case 7:
                return c0((j % 2) * 12);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalTime c0(long j) {
        if (j == 0) {
            return this;
        }
        return W(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() : nVar != null && nVar.i(this);
    }

    public final LocalTime d0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return W(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeX = X(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, localTimeX);
        }
        long nanoOfDay = localTimeX.toNanoOfDay() - toNanoOfDay();
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                return nanoOfDay / 1000;
            case 3:
                return nanoOfDay / 1000000;
            case 4:
                return nanoOfDay / 1000000000;
            case 5:
                return nanoOfDay / 60000000000L;
            case 6:
                return nanoOfDay / 3600000000000L;
            case 7:
                return nanoOfDay / 43200000000000L;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final LocalTime e0(long j) {
        if (j != 0) {
            long nanoOfDay = toNanoOfDay();
            long j2 = (((j % 86400000000000L) + nanoOfDay) + 86400000000000L) % 86400000000000L;
            if (nanoOfDay != j2) {
                return W((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    public final LocalTime f0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return W(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final int h0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? Y(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalTime) nVar.E(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.H(j);
        int i = j.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return j0((int) j);
            case 2:
                return a0(j);
            case 3:
                return j0(((int) j) * 1000);
            case 4:
                return a0(j * 1000);
            case 5:
                return j0(((int) j) * 1000000);
            case 6:
                return a0(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.H(i3);
                    return W(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return f0(j - h0());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.H(i4);
                    return W(b3, i4, b, i2);
                }
                return this;
            case 10:
                return d0(j - ((b3 * 60) + b2));
            case 11:
                return c0(j - (b3 % 12));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (j == 12) {
                    j = 0;
                }
                return c0(j - (b3 % 12));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.H(i5);
                    return W(i5, b2, b, i2);
                }
                return this;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.H(i6);
                    return W(i6, b2, b, i2);
                }
                return this;
            case 15:
                return c0((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    public final LocalTime j0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.H(i);
        return W(this.a, this.b, this.c, i);
    }

    public final void k0(DataOutput dataOutput) throws IOException {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(h hVar) {
        return (LocalTime) hVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(toNanoOfDay(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public long toNanoOfDay() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }
}
