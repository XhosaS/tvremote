package j$.time;

import j$.time.chrono.InterfaceC0005b;
import j$.time.chrono.InterfaceC0008e;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements j$.time.temporal.l, j$.time.temporal.n, InterfaceC0005b, Serializable {
    public static final f d = L(-999999999, 1, 1);
    public static final f e = L(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        L(1970, 1, 1);
    }

    public f(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static f E(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.c.getClass();
                if (j$.time.chrono.t.j(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C0003b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C0003b("Invalid date '" + k.G(i2).name() + " " + i3 + "'");
            }
        }
        return new f(i, i2, i3);
    }

    public static f F(j$.time.temporal.m mVar) {
        Objects.a(mVar, "temporal");
        f fVar = (f) mVar.l(j$.time.temporal.q.f);
        if (fVar != null) {
            return fVar;
        }
        throw new C0003b("Unable to obtain LocalDate from TemporalAccessor: " + String.valueOf(mVar) + " of type " + mVar.getClass().getName());
    }

    public static f L(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.t(i);
        j$.time.temporal.a.MONTH_OF_YEAR.t(i2);
        j$.time.temporal.a.DAY_OF_MONTH.t(i3);
        return E(i, i2, i3);
    }

    public static f M(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.t(j);
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
        return new f(aVar.b.a(j7, aVar), i3, i4);
    }

    public static f R(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.t.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.t.j((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new f(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0005b interfaceC0005b) {
        return interfaceC0005b instanceof f ? D((f) interfaceC0005b) : j$.nio.file.attribute.a.e(this, interfaceC0005b);
    }

    public final int D(f fVar) {
        int i = this.a - fVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - fVar.b;
        return i2 == 0 ? this.c - fVar.c : i2;
    }

    public final int G(j$.time.temporal.p pVar) {
        int i;
        int i2 = e.a[((j$.time.temporal.a) pVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return I();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return H().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((I() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((I() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return i + 1;
    }

    public final c H() {
        return c.D(((int) j$.nio.file.attribute.a.E(y() + 3, 7)) + 1);
    }

    public final int I() {
        return (k.G(this.b).D(J()) + this.c) - 1;
    }

    public final boolean J() {
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        long j = this.a;
        tVar.getClass();
        return j$.time.chrono.t.j(j);
    }

    public final int K() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : J() ? 29 : 28;
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (f) rVar.i(this, j);
        }
        switch (e.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return O(j$.nio.file.attribute.a.C(j, 7));
            case 3:
                return P(j);
            case 4:
                return Q(j);
            case 5:
                return Q(j$.nio.file.attribute.a.C(j, 10));
            case 6:
                return Q(j$.nio.file.attribute.a.C(j, 100));
            case 7:
                return Q(j$.nio.file.attribute.a.C(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.nio.file.attribute.a.F(x(aVar), j), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
    }

    public final f O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new f(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jK = K();
                if (j2 <= jK) {
                    return new f(i, s, (int) j2);
                }
                if (s < 12) {
                    return new f(i, s + 1, (int) (j2 - jK));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.t(i2);
                return new f(i2, 1, (int) (j2 - jK));
            }
        }
        return M(j$.nio.file.attribute.a.F(y(), j));
    }

    public final f P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return R(aVar.b.a(j$.nio.file.attribute.a.D(j2, j3), aVar), ((int) j$.nio.file.attribute.a.E(j2, j3)) + 1, this.c);
    }

    public final f Q(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return R(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final f c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (f) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.t(j);
        int i = e.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return L(i2, s2, i3);
                }
                return this;
            case 2:
                return U((int) j);
            case 3:
                return O(j$.nio.file.attribute.a.C(j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return V((int) j);
            case 5:
                return O(j - H().getValue());
            case 6:
                return O(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return O(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return M(j);
            case 9:
                return O(j$.nio.file.attribute.a.C(j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.t(i4);
                    return R(i2, i4, s);
                }
                return this;
            case 11:
                return P(j - (((i2 * 12) + s2) - 1));
            case 12:
                return V((int) j);
            case 13:
                if (x(j$.time.temporal.a.ERA) != j) {
                    return V(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final f j(j$.time.temporal.n nVar) {
        return nVar instanceof f ? (f) nVar : (f) nVar.o(this);
    }

    public final f U(int i) {
        if (I() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.t(j);
        j$.time.temporal.a.DAY_OF_YEAR.t(i);
        j$.time.chrono.t.c.getClass();
        boolean zJ = j$.time.chrono.t.j(j);
        if (i == 366 && !zJ) {
            throw new C0003b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k kVarG = k.G(((i - 1) / 31) + 1);
        if (i > (kVarG.E(zJ) + kVarG.D(zJ)) - 1) {
            kVarG = k.a[((((int) 1) + 12) + kVarG.ordinal()) % 12];
        }
        return new f(i2, kVarG.getValue(), (i - kVarG.D(zJ)) + 1);
    }

    public final f V(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.t(i);
        return R(i, this.b, this.c);
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.o(this, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && D((f) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? G(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.f(1L, K());
        }
        if (i == 2) {
            return j$.time.temporal.t.f(1L, J() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) pVar).b : this.a <= 0 ? j$.time.temporal.t.f(1L, 1000000000L) : j$.time.temporal.t.f(1L, 999999999L);
        }
        return j$.time.temporal.t.f(1L, (k.G(this.b) != k.FEBRUARY || J()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.q.f ? this : j$.nio.file.attribute.a.q(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return j$.nio.file.attribute.a.c(this, lVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0005b
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

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.EPOCH_DAY ? y() : pVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.a * 12) + this.b) - 1 : G(pVar) : pVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final long y() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !J() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final InterfaceC0008e z(j jVar) {
        return h.G(this, jVar);
    }
}
