package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r extends AbstractC0007d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public r(p pVar, int i, int i2, int i3) {
        pVar.l(i, i2, i3);
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final n E() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: F */
    public final InterfaceC0005b t(long j, j$.time.temporal.r rVar) {
        return (r) super.t(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final InterfaceC0005b I(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return N(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: J */
    public final InterfaceC0005b j(j$.time.temporal.n nVar) {
        return (r) super.j(nVar);
    }

    public final int K() {
        return this.a.x(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r G(long j) {
        return new r(this.a, y() + j);
    }

    @Override // j$.time.chrono.AbstractC0007d
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final r H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jD = j$.nio.file.attribute.a.D(j2, 12L);
        int i = this.a.g;
        if (jD >= i / 12 && jD <= (((r4.d.length - 1) + i) / 12) - 1) {
            return N((int) jD, ((int) j$.nio.file.attribute.a.E(j2, 12L)) + 1, this.d);
        }
        throw new C0003b("Invalid Hijrah year: " + jD);
    }

    public final r N(int i, int i2, int i3) {
        p pVar = this.a;
        int iO = pVar.o(i, i2);
        if (i3 > iO) {
            i3 = iO;
        }
        return new r(pVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final r c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (r) super.c(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        p pVar2 = this.a;
        pVar2.q(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = q.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return N(i5, i4, i);
            case 2:
                return G(Math.min(i, pVar2.x(i5, 12)) - K());
            case 3:
                return G((j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return G(j - (((int) j$.nio.file.attribute.a.E(y() + 3, 7)) + 1));
            case 5:
                return G(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return G(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar2, j);
            case 8:
                return G((j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return N(i5, i, i3);
            case 10:
                return H(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return N(i, i4, i3);
            case 12:
                return N(i, i4, i3);
            case 13:
                return N(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
    }

    @Override // j$.time.chrono.InterfaceC0005b
    public final m a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b, j$.time.temporal.l
    public final InterfaceC0005b d(long j, j$.time.temporal.r rVar) {
        return (r) super.d(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC0007d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.a.equals(rVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l j(j$.time.f fVar) {
        return (r) super.j(fVar);
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
        int i = q.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.q(aVar) : j$.time.temporal.t.f(1L, 5L) : j$.time.temporal.t.f(1L, r3.x(i2, 12)) : j$.time.temporal.t.f(1L, r3.o(i2, this.c));
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l t(long j, j$.time.temporal.b bVar) {
        return (r) super.t(j, bVar);
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = q.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return K();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.nio.file.attribute.a.E(y() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((K() - 1) % 7) + 1;
            case 7:
                return y();
            case 8:
                return ((K() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final long y() {
        return this.a.l(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.chrono.InterfaceC0005b
    public final InterfaceC0008e z(j$.time.j jVar) {
        return new C0010g(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC0007d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.r rVar) {
        return (r) super.d(j, rVar);
    }

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.j();
        if (i >= pVar.e && i < pVar.f) {
            int iBinarySearch = Arrays.binarySearch(pVar.d, i);
            iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
            int i2 = pVar.g;
            int[] iArr = {(iBinarySearch + i2) / 12, ((i2 + iBinarySearch) % 12) + 1, (i - pVar.d[iBinarySearch]) + 1};
            this.a = pVar;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = iArr[2];
            return;
        }
        throw new C0003b("Hijrah date out of range");
    }
}
