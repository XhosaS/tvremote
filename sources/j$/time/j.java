package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j[] h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = h;
            if (i >= jVarArr.length) {
                j jVar = jVarArr[0];
                g = jVar;
                j jVar2 = jVarArr[12];
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
            jVarArr[i] = new j(i, 0, 0, 0);
            i++;
        }
    }

    public j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static j E(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new j(i, i2, i3, i4);
    }

    public static j F(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        j jVar = (j) mVar.l(j$.time.temporal.q.g);
        if (jVar != null) {
            return jVar;
        }
        throw new C0003b("Unable to obtain LocalTime from TemporalAccessor: " + String.valueOf(mVar) + " of type " + mVar.getClass().getName());
    }

    public static j H(long j) {
        j$.time.temporal.a.NANO_OF_DAY.t(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return E(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static j N(ObjectInput objectInput) throws IOException {
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
            j$.time.temporal.a.HOUR_OF_DAY.t(i3);
            j$.time.temporal.a.MINUTE_OF_HOUR.t(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.t(i2);
            j$.time.temporal.a.NANO_OF_SECOND.t(i);
            return E(i3, b, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        j$.time.temporal.a.HOUR_OF_DAY.t(i3);
        j$.time.temporal.a.MINUTE_OF_HOUR.t(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.t(i2);
        j$.time.temporal.a.NANO_OF_SECOND.t(i);
        return E(i3, b, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int iCompare = Integer.compare(this.a, jVar.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, jVar.b)) == 0 && (iCompare = Integer.compare(this.c, jVar.c)) == 0) ? Integer.compare(this.d, jVar.d) : iCompare;
    }

    public final int G(j$.time.temporal.p pVar) {
        int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (O() / 1000000);
            case 7:
                return this.c;
            case 8:
                return P();
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
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (j) rVar.i(this, j);
        }
        switch (i.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return L(j);
            case 2:
                return L((j % 86400000000L) * 1000);
            case 3:
                return L((j % 86400000) * 1000000);
            case 4:
                return M(j);
            case 5:
                return K(j);
            case 6:
                return J(j);
            case 7:
                return J((j % 2) * 12);
            default:
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
    }

    public final j J(long j) {
        if (j == 0) {
            return this;
        }
        return E(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j K(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return E(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final j L(long j) {
        if (j != 0) {
            long jO = O();
            long j2 = (((j % 86400000000000L) + jO) + 86400000000000L) % 86400000000000L;
            if (jO != j2) {
                return E((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final j M(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return E(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long O() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int P() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final j c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (j) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.t(j);
        int i = i.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return R((int) j);
            case 2:
                return H(j);
            case 3:
                return R(((int) j) * 1000);
            case 4:
                return H(j * 1000);
            case 5:
                return R(((int) j) * 1000000);
            case 6:
                return H(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.t(i3);
                    return E(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return M(j - P());
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.t(i4);
                    return E(b3, i4, b, i2);
                }
                return this;
            case 10:
                return K(j - ((b3 * 60) + b2));
            case 11:
                return J(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return J(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.t(i5);
                    return E(i5, b2, b, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.t(i6);
                    return E(i6, b2, b, i2);
                }
                return this;
            case 15:
                return J((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
    }

    public final j R(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.t(i);
        return E(this.a, this.b, this.c, i);
    }

    public final void S(DataOutput dataOutput) {
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

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() : pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jO = O();
        return (int) (jO ^ (jO >>> 32));
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? G(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return (j) j$.nio.file.attribute.a.c(fVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.q.b || bVar == j$.time.temporal.q.a || bVar == j$.time.temporal.q.e || bVar == j$.time.temporal.q.d) {
            return null;
        }
        if (bVar == j$.time.temporal.q.g) {
            return this;
        }
        if (bVar == j$.time.temporal.q.f) {
            return null;
        }
        return bVar == j$.time.temporal.q.c ? j$.time.temporal.b.NANOS : bVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(O(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
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

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.NANO_OF_DAY ? O() : pVar == j$.time.temporal.a.MICRO_OF_DAY ? O() / 1000 : G(pVar) : pVar.l(this);
    }
}
