package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes4.dex */
public final class D extends AbstractC0085d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public D(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return (D) super.A(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = C.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 4) {
            int iR = R();
            if (iR < 1) {
                iR = 1 - iR;
            }
            return iR;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((R() * 12) + localDate.b) - 1;
        }
        if (i == 6) {
            return R();
        }
        if (i != 7) {
            return localDate.C(nVar);
        }
        return R() < 1 ? 0 : 1;
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
        return R() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b N(long j) {
        return T(this.a.X(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b O(long j) {
        return T(this.a.Y(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final InterfaceC0083b P(long j) {
        return T(this.a.Z(j));
    }

    @Override // j$.time.chrono.AbstractC0085d
    /* renamed from: Q */
    public final InterfaceC0083b l(j$.time.temporal.l lVar) {
        return (D) super.l(lVar);
    }

    public final int R() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.D a(long r9, j$.time.temporal.n r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L98
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.C(r0)
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
            j$.time.LocalDate r6 = r8.a
            if (r2 == r5) goto L4a
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L4a
            if (r2 == r3) goto L4a
            goto L60
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.c
            j$.time.temporal.q r11 = r11.v(r0)
            r11.b(r9, r0)
            int r11 = r8.R()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            short r11 = r6.b
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r6.Y(r9)
            j$.time.chrono.D r9 = r8.T(r9)
            return r9
        L4a:
            j$.time.chrono.B r2 = j$.time.chrono.B.c
            j$.time.temporal.q r2 = r2.v(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L83
            if (r0 == r4) goto L78
            if (r0 == r3) goto L69
        L60:
            j$.time.LocalDate r9 = r6.a(r9, r11)
            j$.time.chrono.D r9 = r8.T(r9)
            return r9
        L69:
            int r9 = r8.R()
            int r9 = 1912 - r9
            j$.time.LocalDate r9 = r6.e0(r9)
            j$.time.chrono.D r9 = r8.T(r9)
            return r9
        L78:
            int r2 = r2 + 1911
            j$.time.LocalDate r9 = r6.e0(r2)
            j$.time.chrono.D r9 = r8.T(r9)
            return r9
        L83:
            int r9 = r8.R()
            r10 = 1
            if (r9 < r10) goto L8d
            int r2 = r2 + 1911
            goto L8f
        L8d:
            int r2 = 1912 - r2
        L8f:
            j$.time.LocalDate r9 = r6.e0(r2)
            j$.time.chrono.D r9 = r8.T(r9)
            return r9
        L98:
            j$.time.chrono.b r9 = super.a(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.a(long, j$.time.temporal.n):j$.time.chrono.D");
    }

    public final D T(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new D(localDate);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b, j$.time.temporal.Temporal
    public final InterfaceC0083b b(long j, TemporalUnit temporalUnit) {
        return (D) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.a.equals(((D) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0083b
    public final m getChronology() {
        return B.c;
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    public final int hashCode() {
        B.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (D) super.l(localDate);
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
        int i = C.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.m(nVar);
        }
        if (i != 4) {
            return B.c.v(aVar);
        }
        j$.time.temporal.q qVar = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.q.f(1L, R() <= 0 ? (-qVar.a) + 1912 : qVar.d - 1911);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.chrono.InterfaceC0083b
    /* renamed from: w */
    public final InterfaceC0083b A(long j, TemporalUnit temporalUnit) {
        return (D) super.A(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0085d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (D) super.b(j, temporalUnit);
    }
}
