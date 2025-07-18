package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends AbstractC0007d {
    public static final j$.time.f d = j$.time.f.L(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.f a;
    public final transient z b;
    public final transient int c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(j$.time.f r7) {
        /*
            r6 = this;
            r6.<init>()
            j$.time.f r0 = j$.time.chrono.y.d
            boolean r1 = j$.time.x.a(r0)
            r2 = 1
            if (r1 == 0) goto L16
            r7.getClass()
            int r0 = r7.D(r0)
            if (r0 >= 0) goto L24
            goto L22
        L16:
            long r3 = r7.y()
            long r0 = r0.y()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L24
        L22:
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3a
            j$.time.chrono.z r0 = j$.time.chrono.z.h(r7)
            r6.b = r0
            int r1 = r7.a
            j$.time.f r0 = r0.b
            int r0 = r0.a
            int r1 = r1 - r0
            int r1 = r1 + r2
            r6.c = r1
            r6.a = r7
            return
        L3a:
            j$.time.b r7 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 is not supported"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.<init>(j$.time.f):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final n E() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: F */
    public final InterfaceC0005b t(long j, j$.time.temporal.r rVar) {
        return (y) super.t(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b G(long j) {
        return L(this.a.O(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b H(long j) {
        return L(this.a.P(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b I(long j) {
        return L(this.a.Q(j));
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: J */
    public final InterfaceC0005b j(j$.time.temporal.n nVar) {
        return (y) super.j(nVar);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final y c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (y) super.c(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (x(aVar) == j) {
            return this;
        }
        int[] iArr = x.a;
        int i = iArr[aVar.ordinal()];
        j$.time.f fVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            int iA = w.c.q(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return M(this.b, iA);
            }
            if (i2 == 8) {
                return M(z.q(iA), this.c);
            }
            if (i2 == 9) {
                return L(fVar.V(iA));
            }
        }
        return L(fVar.c(j, pVar));
    }

    public final y L(j$.time.f fVar) {
        return fVar.equals(this.a) ? this : new y(fVar);
    }

    public final y M(z zVar, int i) {
        w.c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = zVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || zVar != z.h(j$.time.f.L(i3, 1, 1)))) {
            throw new C0003b("Invalid yearOfEra value");
        }
        return L(this.a.V(i3));
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final m a() {
        return w.c;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b, j$.time.temporal.l
    public final InterfaceC0005b d(long j, j$.time.temporal.r rVar) {
        return (y) super.d(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b, j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isDateBased() : pVar != null && pVar.i(this);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l j(j$.time.f fVar) {
        return (y) super.j(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.t k(j$.time.temporal.p r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L95
            boolean r0 = r7.e(r8)
            if (r0 == 0) goto L85
            j$.time.temporal.a r8 = (j$.time.temporal.a) r8
            int[] r0 = j$.time.chrono.x.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            j$.time.f r1 = r7.a
            r2 = 1
            r3 = 1
            if (r0 == r2) goto L7b
            r5 = 2
            j$.time.chrono.z r6 = r7.b
            if (r0 == r5) goto L4a
            r1 = 3
            if (r0 == r1) goto L2a
            j$.time.chrono.w r0 = j$.time.chrono.w.c
            j$.time.temporal.t r8 = r0.q(r8)
            return r8
        L2a:
            j$.time.f r8 = r6.b
            int r8 = r8.a
            j$.time.chrono.z r0 = r6.n()
            if (r0 == 0) goto L40
            j$.time.f r0 = r0.b
            int r0 = r0.a
            int r0 = r0 - r8
            int r0 = r0 + r2
            long r0 = (long) r0
            j$.time.temporal.t r8 = j$.time.temporal.t.f(r3, r0)
            return r8
        L40:
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r0 = r0 - r8
            long r0 = (long) r0
            j$.time.temporal.t r8 = j$.time.temporal.t.f(r3, r0)
            return r8
        L4a:
            j$.time.chrono.z r8 = r6.n()
            if (r8 == 0) goto L5e
            j$.time.f r8 = r8.b
            int r0 = r8.a
            int r5 = r1.a
            if (r0 != r5) goto L5e
            int r8 = r8.I()
            int r8 = r8 - r2
            goto L69
        L5e:
            boolean r8 = r1.J()
            if (r8 == 0) goto L67
            r8 = 366(0x16e, float:5.13E-43)
            goto L69
        L67:
            r8 = 365(0x16d, float:5.11E-43)
        L69:
            int r0 = r7.c
            if (r0 != r2) goto L75
            j$.time.f r0 = r6.b
            int r0 = r0.I()
            int r0 = r0 - r2
            int r8 = r8 - r0
        L75:
            long r0 = (long) r8
            j$.time.temporal.t r8 = j$.time.temporal.t.f(r3, r0)
            return r8
        L7b:
            int r8 = r1.K()
            long r0 = (long) r8
            j$.time.temporal.t r8 = j$.time.temporal.t.f(r3, r0)
            return r8
        L85:
            j$.time.temporal.s r0 = new j$.time.temporal.s
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        L95:
            j$.time.temporal.t r8 = r8.j(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.k(j$.time.temporal.p):j$.time.temporal.t");
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return (y) super.t(j, bVar);
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = x.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        z zVar = this.b;
        j$.time.f fVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (fVar.I() - zVar.b.I()) + 1 : fVar.I();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
            case 8:
                return zVar.a;
            default:
                return fVar.x(pVar);
        }
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
        return (y) super.d(j, rVar);
    }
}
