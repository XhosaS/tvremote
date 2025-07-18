package j$.time;

import j$.time.chrono.InterfaceC0005b;
import j$.time.chrono.InterfaceC0008e;
import j$.time.chrono.InterfaceC0013j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.l, j$.time.temporal.n, InterfaceC0008e, Serializable {
    public static final h c = G(f.d, j.e);
    public static final h d = G(f.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final f a;
    public final j b;

    public h(f fVar, j jVar) {
        this.a = fVar;
        this.b = jVar;
    }

    public static h E(j$.time.temporal.m mVar) {
        if (mVar instanceof h) {
            return (h) mVar;
        }
        if (mVar instanceof B) {
            return ((B) mVar).a;
        }
        if (mVar instanceof o) {
            return ((o) mVar).a;
        }
        try {
            return new h(f.F(mVar), j.F(mVar));
        } catch (C0003b e) {
            throw new C0003b("Unable to obtain LocalDateTime from TemporalAccessor: " + String.valueOf(mVar) + " of type " + mVar.getClass().getName(), e);
        }
    }

    public static h G(f fVar, j jVar) {
        Objects.a(fVar, "date");
        Objects.a(jVar, "time");
        return new h(fVar, jVar);
    }

    public static h H(long j, int i, y yVar) {
        Objects.a(yVar, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.t(j2);
        return new h(f.M(j$.nio.file.attribute.a.D(j + yVar.a, 86400)), j.H((((int) j$.nio.file.attribute.a.E(r5, r7)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0008e interfaceC0008e) {
        return interfaceC0008e instanceof h ? D((h) interfaceC0008e) : j$.nio.file.attribute.a.g(this, interfaceC0008e);
    }

    public final int D(h hVar) {
        int iD = this.a.D(hVar.a);
        return iD == 0 ? this.b.compareTo(hVar.b) : iD;
    }

    public final boolean F(InterfaceC0008e interfaceC0008e) {
        if (interfaceC0008e instanceof h) {
            return D((h) interfaceC0008e) < 0;
        }
        long jY = this.a.y();
        long jY2 = interfaceC0008e.f().y();
        if (jY >= jY2) {
            return jY == jY2 && this.b.O() < interfaceC0008e.b().O();
        }
        return true;
    }

    @Override // j$.time.temporal.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final h d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (h) rVar.i(this, j);
        }
        int i = g.a[((j$.time.temporal.b) rVar).ordinal()];
        j jVar = this.b;
        f fVar = this.a;
        switch (i) {
            case 1:
                return K(this.a, 0L, 0L, 0L, j);
            case 2:
                h hVarM = M(fVar.O(j / 86400000000L), jVar);
                return hVarM.K(hVarM.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                h hVarM2 = M(fVar.O(j / 86400000), jVar);
                return hVarM2.K(hVarM2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return J(j);
            case 5:
                return K(this.a, 0L, j, 0L, 0L);
            case 6:
                return K(this.a, j, 0L, 0L, 0L);
            case 7:
                h hVarM3 = M(fVar.O(j / 256), jVar);
                return hVarM3.K(hVarM3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return M(fVar.d(j, rVar), jVar);
        }
    }

    public final h J(long j) {
        return K(this.a, 0L, 0L, j, 0L);
    }

    public final h K(f fVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j jVarH = this.b;
        if (j5 == 0) {
            return M(fVar, jVarH);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jO = jVarH.O();
        long j10 = (j9 * j8) + jO;
        long jD = j$.nio.file.attribute.a.D(j10, 86400000000000L) + (j7 * j8);
        long jE = j$.nio.file.attribute.a.E(j10, 86400000000000L);
        if (jE != jO) {
            jVarH = j.H(jE);
        }
        return M(fVar.O(jD), jVarH);
    }

    @Override // j$.time.temporal.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final h c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (h) pVar.o(this, j);
        }
        boolean zX = ((j$.time.temporal.a) pVar).x();
        j jVar = this.b;
        f fVar = this.a;
        return zX ? M(fVar, jVar.c(j, pVar)) : M(fVar.c(j, pVar), jVar);
    }

    public final h M(f fVar, j jVar) {
        return (this.a == fVar && this.b == jVar) ? this : new h(fVar, jVar);
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final j$.time.chrono.m a() {
        return ((f) f()).a();
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final j b() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.x();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a.equals(hVar.a) && this.b.equals(hVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final InterfaceC0005b f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() ? this.b.i(pVar) : this.a.i(pVar) : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return M(fVar, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!((j$.time.temporal.a) pVar).x()) {
            return this.a.k(pVar);
        }
        j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.q.d(jVar, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.q.f ? this.a : j$.nio.file.attribute.a.r(this, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final InterfaceC0013j m(y yVar) {
        return B.D(this, yVar, null);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(((f) f()).y(), j$.time.temporal.a.EPOCH_DAY).c(b().O(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() ? this.b.x(pVar) : this.a.x(pVar) : pVar.l(this);
    }
}
