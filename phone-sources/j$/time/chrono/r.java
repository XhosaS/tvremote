package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class r extends AbstractC0085d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public r(p pVar, int i, int i2, int i3) {
        pVar.t(i, i2, i3);
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

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return (r) super.A(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = q.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return R();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.desugar.sun.nio.fs.g.G(D() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((R() - 1) % 7) + 1;
            case 7:
                return D();
            case 8:
                return ((R() - 1) / 7) + 1;
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
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final long D() {
        return this.a.t(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final InterfaceC0086e E(j$.time.i iVar) {
        return new C0088g(this, iVar);
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final n L() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return U(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0085d
    /* renamed from: Q */
    public final InterfaceC0083b l(j$.time.temporal.l lVar) {
        return (r) super.l(lVar);
    }

    public final int R() {
        return this.a.J(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC0085d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final r N(long j) {
        return new r(this.a, D() + j);
    }

    @Override // j$.time.chrono.AbstractC0085d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final r O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jZ = j$.desugar.sun.nio.fs.g.z(j2, 12L);
        int i = this.a.g;
        if (jZ >= i / 12 && jZ <= (((r4.d.length - 1) + i) / 12) - 1) {
            return U((int) jZ, ((int) j$.desugar.sun.nio.fs.g.G(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jZ);
    }

    public final r U(int i, int i2, int i3) {
        p pVar = this.a;
        int iA = pVar.A(i, i2);
        if (i3 > iA) {
            i3 = iA;
        }
        return new r(pVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final r a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (r) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        p pVar = this.a;
        pVar.v(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = q.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return U(i5, i4, i);
            case 2:
                return N(Math.min(i, pVar.J(i5, 12)) - R());
            case 3:
                return N((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return N(j - (((int) j$.desugar.sun.nio.fs.g.G(D() + 3, 7)) + 1));
            case 5:
                return N(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return N(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j);
            case 8:
                return N((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return U(i5, i, i3);
            case 10:
                return O(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return U(i, i4, i3);
            case 12:
                return U(i, i4, i3);
            case 13:
                return U(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b, j$.time.temporal.Temporal
    public final InterfaceC0083b b(long j, TemporalUnit temporalUnit) {
        return (r) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d
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

    @Override // j$.time.chrono.InterfaceC0083b
    public final m getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (r) super.l(localDate);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!j$.desugar.sun.nio.fs.g.k(this, nVar)) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = q.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.v(aVar) : j$.time.temporal.q.f(1L, 5L) : j$.time.temporal.q.f(1L, r3.J(i2, 12)) : j$.time.temporal.q.f(1L, r3.A(i2, this.c));
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    /* renamed from: w */
    public final InterfaceC0083b A(long j, TemporalUnit temporalUnit) {
        return (r) super.A(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (r) super.b(j, temporalUnit);
    }

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.l();
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
        throw new j$.time.b("Hijrah date out of range");
    }
}
