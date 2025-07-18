package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class t implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public t(int i) {
        this.a = i;
    }

    public static t D(int i) {
        j$.time.temporal.a.YEAR.t(i);
        return new t(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: E */
    public final t d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (t) rVar.i(this, j);
        }
        int i = s.b[((j$.time.temporal.b) rVar).ordinal()];
        if (i == 1) {
            return F(j);
        }
        if (i == 2) {
            return F(j$.nio.file.attribute.a.C(j, 10));
        }
        if (i == 3) {
            return F(j$.nio.file.attribute.a.C(j, 100));
        }
        if (i == 4) {
            return F(j$.nio.file.attribute.a.C(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return c(j$.nio.file.attribute.a.F(x(aVar), j), aVar);
    }

    public final t F(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return D(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: G */
    public final t c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (t) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.t(j);
        int i = s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return D((int) j);
        }
        if (i == 2) {
            return D((int) j);
        }
        if (i == 3) {
            return x(j$.time.temporal.a.ERA) == j ? this : D(1 - i2);
        }
        throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((t) obj).a;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (this.a == ((t) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return (t) j$.nio.file.attribute.a.c(fVar, this);
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
        return bVar == j$.time.temporal.q.b ? j$.time.chrono.t.c : bVar == j$.time.temporal.q.c ? j$.time.temporal.b.YEARS : j$.time.temporal.q.c(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        if (!j$.nio.file.attribute.a.A(lVar).equals(j$.time.chrono.t.c)) {
            throw new C0003b("Adjustment only supported on ISO date-time");
        }
        return lVar.c(this.a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = s.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
    }
}
