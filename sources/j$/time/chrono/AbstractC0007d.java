package j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0007d implements InterfaceC0005b, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static InterfaceC0005b D(m mVar, j$.time.temporal.l lVar) {
        InterfaceC0005b interfaceC0005b = (InterfaceC0005b) lVar;
        if (mVar.equals(interfaceC0005b.a())) {
            return interfaceC0005b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.h() + ", actual: " + interfaceC0005b.a().h());
    }

    @Override // java.lang.Comparable
    /* renamed from: B */
    public final /* synthetic */ int compareTo(InterfaceC0005b interfaceC0005b) {
        return j$.nio.file.attribute.a.e(this, interfaceC0005b);
    }

    public n E() {
        return a().r(j$.time.temporal.q.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC0005b t(long j, j$.time.temporal.r rVar) {
        return D(a(), j$.time.temporal.q.b(this, j, rVar));
    }

    public abstract InterfaceC0005b G(long j);

    public abstract InterfaceC0005b H(long j);

    public abstract InterfaceC0005b I(long j);

    @Override // j$.time.temporal.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public InterfaceC0005b j(j$.time.temporal.n nVar) {
        return D(a(), nVar.o(this));
    }

    @Override // j$.time.chrono.InterfaceC0005b, j$.time.temporal.m
    public /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.o(this, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0005b) && j$.nio.file.attribute.a.e(this, (InterfaceC0005b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public int hashCode() {
        long jY = y();
        return a().hashCode() ^ ((int) (jY ^ (jY >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public /* synthetic */ j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.q(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return j$.nio.file.attribute.a.c(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final String toString() {
        long jX = x(j$.time.temporal.a.YEAR_OF_ERA);
        long jX2 = x(j$.time.temporal.a.MONTH_OF_YEAR);
        long jX3 = x(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(E());
        sb.append(" ");
        sb.append(jX);
        sb.append(jX2 < 10 ? "-0" : "-");
        sb.append(jX2);
        sb.append(jX3 < 10 ? "-0" : "-");
        sb.append(jX3);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public long y() {
        return x(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public InterfaceC0008e z(j$.time.j jVar) {
        return new C0010g(this, jVar);
    }

    @Override // j$.time.temporal.l
    public InterfaceC0005b c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return D(a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.l
    public InterfaceC0005b d(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.b;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
            }
            return D(a(), rVar.i(this, j));
        }
        switch (AbstractC0006c.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return G(j);
            case 2:
                return G(j$.nio.file.attribute.a.C(j, 7));
            case 3:
                return H(j);
            case 4:
                return I(j);
            case 5:
                return I(j$.nio.file.attribute.a.C(j, 10));
            case 6:
                return I(j$.nio.file.attribute.a.C(j, 100));
            case 7:
                return I(j$.nio.file.attribute.a.C(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.nio.file.attribute.a.F(x(aVar), j), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: ".concat(String.valueOf(rVar)));
        }
    }
}
