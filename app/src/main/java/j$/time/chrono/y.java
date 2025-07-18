package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class y extends AbstractC0050d {
    public static final j$.time.h d = j$.time.h.h0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.h a;
    public final transient z b;
    public final transient int c;

    public y(j$.time.h hVar) {
        if (hVar.c0(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarC = z.c(hVar);
        this.b = zVarC;
        this.c = (hVar.a - zVarC.b.a) + 1;
        this.a = hVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    /* renamed from: D */
    public final InterfaceC0048b l(j$.time.temporal.l lVar) {
        return (y) super.l(lVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (y) super.x(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.t(this);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        z zVar = this.b;
        j$.time.h hVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (hVar.a0() - zVar.b.a0()) + 1 : hVar.a0();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
            case 8:
                return zVar.a;
            default:
                return hVar.H(nVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final long I() {
        return this.a.I();
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0051e J(LocalTime localTime) {
        return new C0053g(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final n L() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0048b O(TemporalAmount temporalAmount) {
        return (y) super.O(temporalAmount);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int R() {
        /*
            r6 = this;
            j$.time.chrono.z r0 = r6.b
            j$.time.chrono.z r1 = r0.f()
            j$.time.h r2 = r6.a
            r3 = 1
            if (r1 == 0) goto L19
            j$.time.h r1 = r1.b
            int r4 = r1.a
            int r5 = r2.a
            if (r4 != r5) goto L19
            int r1 = r1.a0()
            int r1 = r1 - r3
            goto L1d
        L19:
            int r1 = r2.R()
        L1d:
            int r2 = r6.c
            if (r2 != r3) goto L29
            j$.time.h r0 = r0.b
            int r0 = r0.a0()
            int r0 = r0 - r3
            int r1 = r1 - r0
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.R():int");
    }

    @Override // j$.time.chrono.AbstractC0050d
    public final InterfaceC0048b X(long j) {
        return d0(this.a.l0(j));
    }

    @Override // j$.time.chrono.AbstractC0050d
    public final InterfaceC0048b Y(long j) {
        return d0(this.a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC0050d
    public final InterfaceC0048b Z(long j) {
        return d0(this.a.o0(j));
    }

    public final y a0(long j, ChronoUnit chronoUnit) {
        return (y) super.b(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b, j$.time.temporal.Temporal
    public final InterfaceC0048b b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final y a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (y) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (H(aVar) == j) {
            return this;
        }
        int[] iArr = x.a;
        int i = iArr[aVar.ordinal()];
        j$.time.h hVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            w wVar = w.c;
            int iA = wVar.w(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return d0(hVar.s0(wVar.B(this.b, iA)));
            }
            if (i2 == 8) {
                return d0(hVar.s0(wVar.B(z.h(iA), this.c)));
            }
            if (i2 == 9) {
                return d0(hVar.s0(iA));
            }
        }
        return d0(hVar.a(j, nVar));
    }

    public final y c0(j$.desugar.sun.nio.fs.n nVar) {
        return (y) super.l(nVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b, j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.i(this);
    }

    public final y d0(j$.time.h hVar) {
        return hVar.equals(this.a) ? this : new y(hVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0048b
    public final m getChronology() {
        return w.c;
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    public final Temporal l(j$.time.h hVar) {
        return (y) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!d(nVar)) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = x.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, this.a.d0());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, R());
        }
        if (i != 3) {
            return w.c.w(aVar);
        }
        z zVar = this.b;
        int i2 = zVar.b.a;
        return zVar.f() != null ? j$.time.temporal.q.f(1L, (r6.b.a - i2) + 1) : j$.time.temporal.q.f(1L, 999999999 - i2);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.chrono.InterfaceC0048b
    public final InterfaceC0048b x(long j, TemporalUnit temporalUnit) {
        return (y) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0050d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }

    public y(z zVar, int i, j$.time.h hVar) {
        if (!hVar.c0(d)) {
            this.b = zVar;
            this.c = i;
            this.a = hVar;
            return;
        }
        throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
    }
}
