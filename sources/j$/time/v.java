package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class v implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    public final long D() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: E */
    public final v d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (v) rVar.i(this, j);
        }
        switch (u.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return F(j);
            case 2:
                return G(j);
            case 3:
                return G(j$.nio.file.attribute.a.C(j, 10));
            case 4:
                return G(j$.nio.file.attribute.a.C(j, 100));
            case 5:
                return G(j$.nio.file.attribute.a.C(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.nio.file.attribute.a.F(x(aVar), j), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
    }

    public final v F(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return H(aVar.b.a(j$.nio.file.attribute.a.D(j2, j3), aVar), ((int) j$.nio.file.attribute.a.E(j2, j3)) + 1);
    }

    public final v G(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return H(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final v H(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new v(i, i2);
    }

    @Override // j$.time.temporal.l
    /* renamed from: I */
    public final v c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (v) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.t(j);
        int i = u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.t(i3);
            return H(i2, i3);
        }
        if (i == 2) {
            return F(j - D());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.t(i5);
            return H(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.t(i6);
            return H(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        if (x(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.t(i7);
        return H(i7, i4);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.a - vVar.a;
        return i == 0 ? this.b - vVar.b : i;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.a == vVar.a && this.b == vVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return (v) j$.nio.file.attribute.a.c(fVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.q.b ? j$.time.chrono.t.c : bVar == j$.time.temporal.q.c ? j$.time.temporal.b.MONTHS : j$.time.temporal.q.c(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        if (!j$.nio.file.attribute.a.A(lVar).equals(j$.time.chrono.t.c)) {
            throw new C0003b("Adjustment only supported on ISO date-time");
        }
        return lVar.c(D(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
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
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = u.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return D();
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
        throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
    }
}
