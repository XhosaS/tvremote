package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class D extends AbstractC0007d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient j$.time.f a;

    public D(j$.time.f fVar) {
        Objects.a(fVar, "isoDate");
        this.a = fVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final n E() {
        return K() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: F */
    public final InterfaceC0005b t(long j, j$.time.temporal.r rVar) {
        return (D) super.t(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b G(long j) {
        return M(this.a.O(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b H(long j) {
        return M(this.a.P(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b I(long j) {
        return M(this.a.Q(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: J */
    public final InterfaceC0005b j(j$.time.temporal.n nVar) {
        return (D) super.j(nVar);
    }

    public final int K() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.D c(long r9, j$.time.temporal.p r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L98
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.x(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            j$.time.f r6 = r8.a
            if (r2 == r5) goto L4a
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L4a
            if (r2 == r3) goto L4a
            goto L60
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.c
            j$.time.temporal.t r11 = r11.q(r0)
            r11.b(r9, r0)
            int r11 = r8.K()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            short r11 = r6.b
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.f r9 = r6.P(r9)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L4a:
            j$.time.chrono.B r2 = j$.time.chrono.B.c
            j$.time.temporal.t r2 = r2.q(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L83
            if (r0 == r4) goto L78
            if (r0 == r3) goto L69
        L60:
            j$.time.f r9 = r6.c(r9, r11)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L69:
            int r9 = r8.K()
            int r9 = 1912 - r9
            j$.time.f r9 = r6.V(r9)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L78:
            int r2 = r2 + 1911
            j$.time.f r9 = r6.V(r2)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L83:
            int r9 = r8.K()
            r10 = 1
            if (r9 < r10) goto L8d
            int r2 = r2 + 1911
            goto L8f
        L8d:
            int r2 = 1912 - r2
        L8f:
            j$.time.f r9 = r6.V(r2)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L98:
            j$.time.chrono.b r9 = super.c(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.c(long, j$.time.temporal.p):j$.time.chrono.D");
    }

    public final D M(j$.time.f fVar) {
        return fVar.equals(this.a) ? this : new D(fVar);
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final m a() {
        return B.c;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b, j$.time.temporal.l
    public final InterfaceC0005b d(long j, j$.time.temporal.r rVar) {
        return (D) super.d(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.a.equals(((D) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final int hashCode() {
        B.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l j(j$.time.f fVar) {
        return (D) super.j(fVar);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!j$.nio.file.attribute.a.o(this, pVar)) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = C.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(pVar);
        }
        if (i != 4) {
            return B.c.q(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(1L, K() <= 0 ? (-tVar.a) + 1912 : tVar.d - 1911);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return (D) super.t(j, bVar);
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = C.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 4) {
            int iK = K();
            if (iK < 1) {
                iK = 1 - iK;
            }
            return iK;
        }
        j$.time.f fVar = this.a;
        if (i == 5) {
            return ((K() * 12) + fVar.b) - 1;
        }
        if (i == 6) {
            return K();
        }
        if (i != 7) {
            return fVar.x(pVar);
        }
        return K() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final long y() {
        return this.a.y();
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final InterfaceC0008e z(j$.time.j jVar) {
        return new C0010g(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.r rVar) {
        return (D) super.d(j, rVar);
    }
}
