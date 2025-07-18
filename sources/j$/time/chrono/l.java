package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class l implements InterfaceC0013j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C0010g a;
    public final transient j$.time.y b;
    public final transient j$.time.w c;

    public l(j$.time.w wVar, j$.time.y yVar, C0010g c0010g) {
        Objects.a(c0010g, "dateTime");
        this.a = c0010g;
        Objects.a(yVar, "offset");
        this.b = yVar;
        Objects.a(wVar, "zone");
        this.c = wVar;
    }

    public static l D(j$.time.w wVar, j$.time.y yVar, C0010g c0010g) {
        Objects.a(c0010g, "localDateTime");
        Objects.a(wVar, "zone");
        if (wVar instanceof j$.time.y) {
            return new l(wVar, (j$.time.y) wVar, c0010g);
        }
        j$.time.zone.e eVarD = wVar.D();
        j$.time.h hVarE = j$.time.h.E(c0010g);
        List listF = eVarD.f(hVarE);
        if (listF.size() == 1) {
            yVar = (j$.time.y) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarD.e(hVarE);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c0010g = c0010g.F(c0010g.a, 0L, 0L, Duration.j(bVar.d.a - bVar.c.a, 0).a, 0L);
            yVar = bVar.d;
        } else {
            if (yVar == null || !listF.contains(yVar)) {
                yVar = (j$.time.y) listF.get(0);
            }
            c0010g = c0010g;
        }
        Objects.a(yVar, "offset");
        return new l(wVar, yVar, c0010g);
    }

    public static l o(m mVar, j$.time.temporal.l lVar) {
        l lVar2 = (l) lVar;
        if (mVar.equals(lVar2.a())) {
            return lVar2;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + lVar2.a().h());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final /* synthetic */ long C() {
        return j$.nio.file.attribute.a.v(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: E */
    public final l d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return o(a(), rVar.i(this, j));
        }
        return o(a(), this.a.d(j, rVar).o(this));
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final m a() {
        return f().a();
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final j$.time.j b() {
        return ((C0010g) p()).b();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return o(a(), pVar.o(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = AbstractC0014k.a[aVar.ordinal()];
        if (i == 1) {
            return d(j - j$.nio.file.attribute.a.v(this), j$.time.temporal.b.SECONDS);
        }
        j$.time.w wVar = this.c;
        C0010g c0010g = this.a;
        if (i != 2) {
            return D(wVar, this.b, c0010g.c(j, pVar));
        }
        j$.time.y yVarJ = j$.time.y.J(aVar.b.a(j, aVar));
        c0010g.getClass();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j$.nio.file.attribute.a.u(c0010g, yVarJ), c0010g.b.d);
        m mVarA = a();
        j$.time.y yVarD = wVar.D().d(instantOfEpochSecond);
        Objects.a(yVarD, "offset");
        return new l(wVar, yVarD, (C0010g) mVarA.v(j$.time.h.H(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), yVarD)));
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
        return (obj instanceof InterfaceC0013j) && j$.nio.file.attribute.a.h(this, (InterfaceC0013j) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0005b f() {
        return ((C0010g) p()).f();
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final j$.time.y g() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.j(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(j$.time.f fVar) {
        return o(a(), fVar.o(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).b : ((C0010g) p()).k(pVar) : pVar.j(this);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.s(this, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0008e p() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final InterfaceC0013j s(j$.time.w wVar) {
        return D(wVar, this.b, this.a);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return o(a(), j$.time.temporal.q.b(this, j, bVar));
    }

    public final String toString() {
        String string = this.a.toString();
        j$.time.y yVar = this.b;
        String str = string + yVar.b;
        j$.time.w wVar = this.c;
        if (yVar == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    @Override // j$.time.chrono.InterfaceC0013j
    public final j$.time.w w() {
        return this.c;
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = AbstractC0012i.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? ((C0010g) p()).x(pVar) : g().a : C();
    }
}
