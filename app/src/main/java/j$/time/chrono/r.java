package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class r extends AbstractC0050d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public r(p pVar, int i, int i2, int i3) {
        pVar.Y(i, i2, i3);
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

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    /* renamed from: D */
    public final InterfaceC0048b l(j$.time.temporal.l lVar) {
        return (r) super.l(lVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (r) super.x(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.t(this);
        }
        int i = q.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return a0();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.desugar.sun.nio.fs.g.I(I() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((a0() - 1) % 7) + 1;
            case 7:
                return I();
            case 8:
                return ((a0() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i4;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final long I() {
        return this.a.Y(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0051e J(LocalTime localTime) {
        return new C0053g(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final n L() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0048b O(TemporalAmount temporalAmount) {
        return (r) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final int R() {
        return this.a.b0(this.b, 12);
    }

    @Override // j$.time.chrono.AbstractC0050d
    public final InterfaceC0048b Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return d0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int a0() {
        return this.a.b0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b, j$.time.temporal.Temporal
    public final InterfaceC0048b b(long j, TemporalUnit temporalUnit) {
        return (r) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0050d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final r X(long j) {
        return new r(this.a, I() + j);
    }

    @Override // j$.time.chrono.AbstractC0050d
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final r Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jA = j$.desugar.sun.nio.fs.g.A(j2, 12L);
        p pVar = this.a;
        if (jA >= pVar.X(0) && jA <= pVar.X(pVar.d.length - 1) - 1) {
            return d0((int) jA, ((int) j$.desugar.sun.nio.fs.g.I(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jA);
    }

    public final r d0(int i, int i2, int i3) {
        p pVar = this.a;
        int iZ = pVar.Z(i, i2);
        if (i3 > iZ) {
            i3 = iZ;
        }
        return new r(pVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final r a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (r) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        p pVar = this.a;
        pVar.w(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = q.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return d0(i5, i4, i);
            case 2:
                return X(Math.min(i, R()) - a0());
            case 3:
                return X((j - H(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return X(j - (((int) j$.desugar.sun.nio.fs.g.I(I() + 3, 7)) + 1));
            case 5:
                return X(j - H(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return X(j - H(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j);
            case 8:
                return X((j - H(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return d0(i5, i, i3);
            case 10:
                return Y(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return d0(i, i4, i3);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return d0(i, i4, i3);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return d0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
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

    @Override // j$.time.chrono.InterfaceC0048b
    public final m getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    public final Temporal l(j$.time.h hVar) {
        return (r) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!j$.desugar.sun.nio.fs.g.k(this, nVar)) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = q.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.w(aVar) : j$.time.temporal.q.f(1L, 5L) : j$.time.temporal.q.f(1L, R()) : j$.time.temporal.q.f(1L, r2.Z(this.b, this.c));
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final boolean v() {
        return this.a.T(this.b);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0048b x(long j, TemporalUnit temporalUnit) {
        return (r) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (r) super.b(j, temporalUnit);
    }

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.V();
        if (i >= pVar.e && i < pVar.f) {
            int iBinarySearch = Arrays.binarySearch(pVar.d, i);
            iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
            int[] iArr = {pVar.X(iBinarySearch), ((pVar.g + iBinarySearch) % 12) + 1, (i - pVar.d[iBinarySearch]) + 1};
            this.a = pVar;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = iArr[2];
            return;
        }
        throw new j$.time.b("Hijrah date out of range");
    }
}
