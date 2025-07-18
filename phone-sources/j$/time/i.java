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

/* loaded from: classes4.dex */
public final class i implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i[] h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            i[] iVarArr = h;
            if (i >= iVarArr.length) {
                i iVar = iVarArr[0];
                g = iVar;
                i iVar2 = iVarArr[12];
                e = iVar;
                f = new i(23, 59, 59, 999999999);
                return;
            }
            iVarArr[i] = new i(i, 0, 0, 0);
            i++;
        }
    }

    public i(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static i L(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new i(i, i2, i3, i4);
    }

    public static i M(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        i iVar = (i) kVar.J(j$.time.temporal.o.g);
        if (iVar != null) {
            return iVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName());
    }

    public static i O(long j) {
        j$.time.temporal.a.NANO_OF_DAY.A(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return L(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static i U(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        byte b = 0;
        if (i3 >= 0) {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                ?? r6 = ~b2;
                i = 0;
                b = r6;
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
            j$.time.temporal.a.HOUR_OF_DAY.A(i3);
            j$.time.temporal.a.MINUTE_OF_HOUR.A(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.A(i2);
            j$.time.temporal.a.NANO_OF_SECOND.A(i);
            return L(i3, b, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        j$.time.temporal.a.HOUR_OF_DAY.A(i3);
        j$.time.temporal.a.MINUTE_OF_HOUR.A(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.A(i2);
        j$.time.temporal.a.NANO_OF_SECOND.A(i);
        return L(i3, b, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.NANO_OF_DAY ? V() : nVar == j$.time.temporal.a.MICRO_OF_DAY ? V() / 1000 : N(nVar) : nVar.m(this);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        if (nVar == j$.time.temporal.o.g) {
            return this;
        }
        if (nVar == j$.time.temporal.o.f) {
            return null;
        }
        return nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        int iCompare = Integer.compare(this.a, iVar.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, iVar.b)) == 0 && (iCompare = Integer.compare(this.c, iVar.c)) == 0) ? Integer.compare(this.d, iVar.d) : iCompare;
    }

    public final int N(j$.time.temporal.n nVar) {
        int i = h.a[((j$.time.temporal.a) nVar).ordinal()];
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
                return (int) (V() / 1000000);
            case 7:
                return this.c;
            case 8:
                return W();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final i b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (i) temporalUnit.l(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(j);
            case 2:
                return S((j % 86400000000L) * 1000);
            case 3:
                return S((j % 86400000) * 1000000);
            case 4:
                return T(j);
            case 5:
                return R(j);
            case 6:
                return Q(j);
            case 7:
                return Q((j % 2) * 12);
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final i Q(long j) {
        if (j == 0) {
            return this;
        }
        return L(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final i R(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return L(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final i S(long j) {
        if (j != 0) {
            long jV = V();
            long j2 = (((j % 86400000000000L) + jV) + 86400000000000L) % 86400000000000L;
            if (jV != j2) {
                return L((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final i T(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return L(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long V() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int W() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final i a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (i) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.A(j);
        int i = h.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Y((int) j);
            case 2:
                return O(j);
            case 3:
                return Y(((int) j) * 1000);
            case 4:
                return O(j * 1000);
            case 5:
                return Y(((int) j) * 1000000);
            case 6:
                return O(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.A(i3);
                    return L(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return T(j - W());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.A(i4);
                    return L(b3, i4, b, i2);
                }
                return this;
            case 10:
                return R(j - ((b3 * 60) + b2));
            case 11:
                return Q(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return Q(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.A(i5);
                    return L(i5, b2, b, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.A(i6);
                    return L(i6, b2, b, i2);
                }
                return this;
            case 15:
                return Q((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    public final i Y(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.A(i);
        return L(this.a, this.b, this.c, i);
    }

    public final void Z(DataOutput dataOutput) throws IOException {
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

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        i iVarM = M(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, iVarM);
        }
        long jV = iVarM.V() - V();
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jV;
            case 2:
                return jV / 1000;
            case 3:
                return jV / 1000000;
            case 4:
                return jV / 1000000000;
            case 5:
                return jV / 60000000000L;
            case 6:
                return jV / 3600000000000L;
            case 7:
                return jV / 43200000000000L;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jV = V();
        return (int) (jV ^ (jV >>> 32));
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? N(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (i) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(V(), j$.time.temporal.a.NANO_OF_DAY);
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
