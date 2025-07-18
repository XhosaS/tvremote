package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final h a;
    public final y b;

    static {
        h hVar = h.c;
        y yVar = y.g;
        hVar.getClass();
        new o(hVar, yVar);
        h hVar2 = h.d;
        y yVar2 = y.f;
        hVar2.getClass();
        new o(hVar2, yVar2);
    }

    public o(h hVar, y yVar) {
        Objects.a(hVar, "dateTime");
        this.a = hVar;
        Objects.a(yVar, "offset");
        this.b = yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: D */
    public final o d(long j, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.b ? E(this.a.d(j, rVar), this.b) : (o) rVar.i(this, j);
    }

    public final o E(h hVar, y yVar) {
        return (this.a == hVar && this.b.equals(yVar)) ? this : new o(hVar, yVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (o) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = n.a[aVar.ordinal()];
        y yVar = this.b;
        h hVar = this.a;
        if (i != 1) {
            return i != 2 ? E(hVar.c(j, pVar), yVar) : E(hVar, y.J(aVar.b.a(j, aVar)));
        }
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j, hVar.b.d);
        Objects.a(instantOfEpochSecond, "instant");
        Objects.a(yVar, "zone");
        y yVarD = yVar.D().d(instantOfEpochSecond);
        return new o(h.H(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), yVarD), yVarD);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        o oVar = (o) obj;
        y yVar = oVar.b;
        h hVar = oVar.a;
        y yVar2 = this.b;
        boolean zEquals = yVar2.equals(yVar);
        h hVar2 = this.a;
        if (zEquals) {
            iCompare = hVar2.compareTo(hVar);
        } else {
            hVar2.getClass();
            long jU = j$.nio.file.attribute.a.u(hVar2, yVar2);
            y yVar3 = oVar.b;
            hVar.getClass();
            iCompare = Long.compare(jU, j$.nio.file.attribute.a.u(hVar, yVar3));
            if (iCompare == 0) {
                iCompare = hVar2.b.d - hVar.b.d;
            }
        }
        return iCompare == 0 ? hVar2.compareTo(hVar) : iCompare;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.a;
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.a(this, pVar);
        }
        int i = n.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(pVar) : this.b.a;
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        h hVar = this.a;
        return E(hVar.M(fVar, hVar.b), this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : this.a.k(pVar) : pVar.j(this);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.q.d || bVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (bVar == j$.time.temporal.q.a) {
            return null;
        }
        j$.time.format.b bVar2 = j$.time.temporal.q.f;
        h hVar = this.a;
        return bVar == bVar2 ? hVar.a : bVar == j$.time.temporal.q.g ? hVar.b : bVar == j$.time.temporal.q.b ? j$.time.chrono.t.c : bVar == j$.time.temporal.q.c ? j$.time.temporal.b.NANOS : bVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        h hVar = this.a;
        return lVar.c(hVar.a.y(), aVar).c(hVar.b.O(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = n.a[((j$.time.temporal.a) pVar).ordinal()];
        y yVar = this.b;
        h hVar = this.a;
        if (i != 1) {
            return i != 2 ? hVar.x(pVar) : yVar.a;
        }
        hVar.getClass();
        return j$.nio.file.attribute.a.u(hVar, yVar);
    }
}
