package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes4.dex */
public final class y extends AbstractC0085d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient z b;
    public final transient int c;

    public y(LocalDate localDate) {
        if (localDate.R(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarC = z.c(localDate);
        this.b = zVarC;
        this.c = (localDate.a - zVarC.b.a) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return (y) super.A(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        z zVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.P() - zVar.b.P()) + 1 : localDate.P();
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
                return localDate.C(nVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final long D() {
        return this.a.D();
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final InterfaceC0086e E(j$.time.i iVar) {
        return new C0088g(this, iVar);
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final n L() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b N(long j) {
        return S(this.a.X(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b O(long j) {
        return S(this.a.Y(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b P(long j) {
        return S(this.a.Z(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    /* renamed from: Q */
    public final InterfaceC0083b l(j$.time.temporal.l lVar) {
        return (y) super.l(lVar);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final y a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (y) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (C(aVar) == j) {
            return this;
        }
        int[] iArr = x.a;
        int i = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            int iA = w.c.v(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return T(this.b, iA);
            }
            if (i2 == 8) {
                return T(z.h(iA), this.c);
            }
            if (i2 == 9) {
                return S(localDate.e0(iA));
            }
        }
        return S(localDate.a(j, nVar));
    }

    public final y S(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new y(localDate);
    }

    public final y T(z zVar, int i) {
        w.c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = zVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || zVar != z.c(LocalDate.of(i3, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return S(this.a.e0(i3));
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b, j$.time.temporal.Temporal
    public final InterfaceC0083b b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b, j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.i(this);
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final m getChronology() {
        return w.c;
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (y) super.l(localDate);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.q m(j$.time.temporal.n r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L95
            boolean r0 = r7.d(r8)
            if (r0 == 0) goto L85
            j$.time.temporal.a r8 = (j$.time.temporal.a) r8
            int[] r0 = j$.time.chrono.x.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            j$.time.LocalDate r1 = r7.a
            r2 = 1
            r3 = 1
            if (r0 == r2) goto L7b
            r5 = 2
            j$.time.chrono.z r6 = r7.b
            if (r0 == r5) goto L4a
            r1 = 3
            if (r0 == r1) goto L2a
            j$.time.chrono.w r0 = j$.time.chrono.w.c
            j$.time.temporal.q r8 = r0.v(r8)
            return r8
        L2a:
            j$.time.LocalDate r8 = r6.b
            int r8 = r8.a
            j$.time.chrono.z r0 = r6.f()
            if (r0 == 0) goto L40
            j$.time.LocalDate r0 = r0.b
            int r0 = r0.a
            int r0 = r0 - r8
            int r0 = r0 + r2
            long r0 = (long) r0
            j$.time.temporal.q r8 = j$.time.temporal.q.f(r3, r0)
            return r8
        L40:
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r0 = r0 - r8
            long r0 = (long) r0
            j$.time.temporal.q r8 = j$.time.temporal.q.f(r3, r0)
            return r8
        L4a:
            j$.time.chrono.z r8 = r6.f()
            if (r8 == 0) goto L5e
            j$.time.LocalDate r8 = r8.b
            int r0 = r8.a
            int r5 = r1.a
            if (r0 != r5) goto L5e
            int r8 = r8.P()
            int r8 = r8 - r2
            goto L69
        L5e:
            boolean r8 = r1.S()
            if (r8 == 0) goto L67
            r8 = 366(0x16e, float:5.13E-43)
            goto L69
        L67:
            r8 = 365(0x16d, float:5.11E-43)
        L69:
            int r0 = r7.c
            if (r0 != r2) goto L75
            j$.time.LocalDate r0 = r6.b
            int r0 = r0.P()
            int r0 = r0 - r2
            int r8 = r8 - r0
        L75:
            long r0 = (long) r8
            j$.time.temporal.q r8 = j$.time.temporal.q.f(r3, r0)
            return r8
        L7b:
            int r8 = r1.T()
            long r0 = (long) r8
            j$.time.temporal.q r8 = j$.time.temporal.q.f(r3, r0)
            return r8
        L85:
            j$.time.temporal.p r0 = new j$.time.temporal.p
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        L95:
            j$.time.temporal.q r8 = r8.l(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.m(j$.time.temporal.n):j$.time.temporal.q");
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    /* renamed from: w */
    public final InterfaceC0083b A(long j, TemporalUnit temporalUnit) {
        return (y) super.A(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }
}
