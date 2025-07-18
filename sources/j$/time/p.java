package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final j a;
    public final y b;

    static {
        j jVar = j.e;
        y yVar = y.g;
        jVar.getClass();
        new p(jVar, yVar);
        j jVar2 = j.f;
        y yVar2 = y.f;
        jVar2.getClass();
        new p(jVar2, yVar2);
    }

    public p(j jVar, y yVar) {
        Objects.a(jVar, "time");
        this.a = jVar;
        Objects.a(yVar, "offset");
        this.b = yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final p d(long j, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.b ? E(this.a.d(j, rVar), this.b) : (p) rVar.i(this, j);
    }

    public final p E(j jVar, y yVar) {
        return (this.a == jVar && this.b.equals(yVar)) ? this : new p(jVar, yVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (p) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        j jVar = this.a;
        if (pVar != aVar) {
            return E(jVar.c(j, pVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) pVar;
        return E(jVar, y.J(aVar2.b.a(j, aVar2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        y yVar = pVar.b;
        j jVar = pVar.a;
        boolean zEquals = this.b.equals(yVar);
        j jVar2 = this.a;
        if (zEquals) {
            return jVar2.compareTo(jVar);
        }
        int iCompare = Long.compare(jVar2.O() - (r2.a * 1000000000), jVar.O() - (pVar.b.a * 1000000000));
        return iCompare == 0 ? jVar2.compareTo(jVar) : iCompare;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
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
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return (p) j$.nio.file.attribute.a.c(fVar, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) pVar).b;
        }
        j jVar = this.a;
        jVar.getClass();
        return j$.time.temporal.q.d(jVar, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.q.d || bVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (((bVar == j$.time.temporal.q.a) || (bVar == j$.time.temporal.q.b)) || bVar == j$.time.temporal.q.f) {
            return null;
        }
        return bVar == j$.time.temporal.q.g ? this.a : bVar == j$.time.temporal.q.c ? j$.time.temporal.b.NANOS : bVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a.O(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
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
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.a : this.a.x(pVar) : pVar.l(this);
    }
}
