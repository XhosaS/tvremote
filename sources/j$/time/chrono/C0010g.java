package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0010g implements InterfaceC0008e, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC0005b a;
    public final transient j$.time.j b;

    public C0010g(InterfaceC0005b interfaceC0005b, j$.time.j jVar) {
        Objects.a(jVar, "time");
        this.a = interfaceC0005b;
        this.b = jVar;
    }

    public static C0010g D(m mVar, j$.time.temporal.l lVar) {
        C0010g c0010g = (C0010g) lVar;
        if (mVar.equals(c0010g.a.a())) {
            return c0010g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + c0010g.a.a().h());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: A */
    public final /* synthetic */ int compareTo(InterfaceC0008e interfaceC0008e) {
        return j$.nio.file.attribute.a.g(this, interfaceC0008e);
    }

    @Override // j$.time.temporal.l
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C0010g d(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.b;
        InterfaceC0005b interfaceC0005b = this.a;
        if (!z) {
            return D(interfaceC0005b.a(), rVar.i(this, j));
        }
        int i = AbstractC0009f.a[((j$.time.temporal.b) rVar).ordinal()];
        j$.time.j jVar = this.b;
        switch (i) {
            case 1:
                return F(this.a, 0L, 0L, 0L, j);
            case 2:
                C0010g c0010gH = H(interfaceC0005b.d(j / 86400000000L, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jVar);
                return c0010gH.F(c0010gH.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0010g c0010gH2 = H(interfaceC0005b.d(j / 86400000, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jVar);
                return c0010gH2.F(c0010gH2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return F(this.a, 0L, 0L, j, 0L);
            case 5:
                return F(this.a, 0L, j, 0L, 0L);
            case 6:
                return F(this.a, j, 0L, 0L, 0L);
            case 7:
                C0010g c0010gH3 = H(interfaceC0005b.d(j / 256, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jVar);
                return c0010gH3.F(c0010gH3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return H(interfaceC0005b.d(j, rVar), jVar);
        }
    }

    public final C0010g F(InterfaceC0005b interfaceC0005b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVarH = this.b;
        if (j5 == 0) {
            return H(interfaceC0005b, jVarH);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jO = jVarH.O();
        long j10 = j9 + jO;
        long jD = j$.nio.file.attribute.a.D(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jE = j$.nio.file.attribute.a.E(j10, 86400000000000L);
        if (jE != jO) {
            jVarH = j$.time.j.H(jE);
        }
        return H(interfaceC0005b.d(jD, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jVarH);
    }

    @Override // j$.time.temporal.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final C0010g c(long j, j$.time.temporal.p pVar) {
        boolean z = pVar instanceof j$.time.temporal.a;
        InterfaceC0005b interfaceC0005b = this.a;
        if (!z) {
            return D(interfaceC0005b.a(), pVar.o(this, j));
        }
        boolean zX = ((j$.time.temporal.a) pVar).x();
        j$.time.j jVar = this.b;
        return zX ? H(interfaceC0005b, jVar.c(j, pVar)) : H(interfaceC0005b.c(j, pVar), jVar);
    }

    public final C0010g H(j$.time.temporal.l lVar, j$.time.j jVar) {
        InterfaceC0005b interfaceC0005b = this.a;
        return (interfaceC0005b == lVar && this.b == jVar) ? this : new C0010g(AbstractC0007d.D(interfaceC0005b.a(), lVar), jVar);
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final m a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final j$.time.j b() {
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
        return (obj instanceof InterfaceC0008e) && j$.nio.file.attribute.a.g(this, (InterfaceC0008e) obj) == 0;
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
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() ? this.b.i(pVar) : this.a.i(pVar) : k(pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l j(j$.time.f fVar) {
        return H(fVar, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!((j$.time.temporal.a) pVar).x()) {
            return this.a.k(pVar);
        }
        j$.time.j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.q.d(jVar, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.r(this, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0008e
    public final InterfaceC0013j m(j$.time.y yVar) {
        return l.D(yVar, null, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(f().y(), j$.time.temporal.a.EPOCH_DAY).c(b().O(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return D(this.a.a(), j$.time.temporal.q.b(this, j, bVar));
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).x() ? this.b.x(pVar) : this.a.x(pVar) : pVar.l(this);
    }
}
