package j$.time;

import j$.time.chrono.InterfaceC0005b;
import j$.time.chrono.InterfaceC0008e;
import j$.time.chrono.InterfaceC0013j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class B implements j$.time.temporal.l, InterfaceC0013j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final h a;
    public final y b;
    public final w c;

    public B(h hVar, w wVar, y yVar) {
        this.a = hVar;
        this.b = yVar;
        this.c = wVar;
    }

    public static B D(h hVar, w wVar, y yVar) {
        Objects.a(hVar, "localDateTime");
        Objects.a(wVar, "zone");
        if (wVar instanceof y) {
            return new B(hVar, wVar, (y) wVar);
        }
        j$.time.zone.e eVarD = wVar.D();
        List listF = eVarD.f(hVar);
        if (listF.size() == 1) {
            yVar = (y) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarD.e(hVar);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            hVar = hVar.J(Duration.j(bVar.d.a - bVar.c.a, 0).a);
            yVar = bVar.d;
        } else if (yVar == null || !listF.contains(yVar)) {
            yVar = (y) listF.get(0);
            Objects.a(yVar, "offset");
        }
        return new B(hVar, wVar, yVar);
    }

    public static B o(long j, int i, w wVar) {
        y yVarD = wVar.D().d(Instant.ofEpochSecond(j, i));
        return new B(h.H(j, i, yVarD), wVar, yVarD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final /* synthetic */ long C() {
        return j$.nio.file.attribute.a.v(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: E */
    public final B d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (B) rVar.i(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) rVar;
        int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        y yVar = this.b;
        w wVar = this.c;
        h hVar = this.a;
        if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return D(hVar.d(j, rVar), wVar, yVar);
        }
        h hVarD = hVar.d(j, rVar);
        Objects.a(hVarD, "localDateTime");
        Objects.a(yVar, "offset");
        Objects.a(wVar, "zone");
        return wVar.D().f(hVarD).contains(yVar) ? new B(hVarD, wVar, yVar) : o(j$.nio.file.attribute.a.u(hVarD, yVar), hVarD.b.d, wVar);
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final j$.time.chrono.m a() {
        return ((f) f()).a();
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final j b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (B) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = A.a[aVar.ordinal()];
        w wVar = this.c;
        h hVar = this.a;
        if (i == 1) {
            return o(j, hVar.b.d, wVar);
        }
        y yVar = this.b;
        if (i != 2) {
            return D(hVar.c(j, pVar), wVar, yVar);
        }
        y yVarJ = y.J(aVar.b.a(j, aVar));
        return (yVarJ.equals(yVar) || !wVar.D().f(hVar).contains(yVarJ)) ? this : new B(hVar, wVar, yVarJ);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.nio.file.attribute.a.h(this, (InterfaceC0013j) obj);
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
        if (obj instanceof B) {
            B b = (B) obj;
            if (this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0005b f() {
        return this.a.a;
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final y g() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.nio.file.attribute.a.j(this, pVar);
        }
        int i = A.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(pVar) : this.b.a;
        }
        throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(f fVar) {
        return D(h.G(fVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : this.a.k(pVar) : pVar.j(this);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.q.f ? this.a.a : j$.nio.file.attribute.a.s(this, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0008e p() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0013j s(w wVar) {
        Objects.a(wVar, "zone");
        return this.c.equals(wVar) ? this : D(this.a, wVar, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final String toString() {
        String string = this.a.toString();
        y yVar = this.b;
        String str = string + yVar.b;
        w wVar = this.c;
        if (yVar == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final w w() {
        return this.c;
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = A.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.x(pVar) : this.b.a : j$.nio.file.attribute.a.v(this);
    }
}
