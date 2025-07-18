package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0088g implements InterfaceC0086e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC0083b a;
    public final transient j$.time.i b;

    public C0088g(InterfaceC0083b interfaceC0083b, j$.time.i iVar) {
        Objects.a(iVar, "time");
        this.a = interfaceC0083b;
        this.b = iVar;
    }

    public static C0088g K(m mVar, Temporal temporal) {
        C0088g c0088g = (C0088g) temporal;
        if (mVar.equals(c0088g.a.getChronology())) {
            return c0088g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + c0088g.a.getChronology().h());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return K(this.a.getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() ? this.b.C(nVar) : this.a.C(nVar) : nVar.m(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: G */
    public final /* synthetic */ int compareTo(InterfaceC0086e interfaceC0086e) {
        return j$.desugar.sun.nio.fs.g.c(this, interfaceC0086e);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final C0088g b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0083b interfaceC0083b = this.a;
        if (!z) {
            return K(interfaceC0083b.getChronology(), temporalUnit.l(this, j));
        }
        int i = AbstractC0087f.a[((ChronoUnit) temporalUnit).ordinal()];
        j$.time.i iVar = this.b;
        switch (i) {
            case 1:
                return M(this.a, 0L, 0L, 0L, j);
            case 2:
                C0088g c0088gO = O(interfaceC0083b.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), iVar);
                return c0088gO.M(c0088gO.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0088g c0088gO2 = O(interfaceC0083b.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), iVar);
                return c0088gO2.M(c0088gO2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return M(this.a, 0L, 0L, j, 0L);
            case 5:
                return M(this.a, 0L, j, 0L, 0L);
            case 6:
                return M(this.a, j, 0L, 0L, 0L);
            case 7:
                C0088g c0088gO3 = O(interfaceC0083b.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), iVar);
                return c0088gO3.M(c0088gO3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return O(interfaceC0083b.b(j, temporalUnit), iVar);
        }
    }

    public final C0088g M(InterfaceC0083b interfaceC0083b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.i iVarO = this.b;
        if (j5 == 0) {
            return O(interfaceC0083b, iVarO);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jV = iVarO.V();
        long j10 = j9 + jV;
        long jZ = j$.desugar.sun.nio.fs.g.z(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jG = j$.desugar.sun.nio.fs.g.G(j10, 86400000000000L);
        if (jG != jV) {
            iVarO = j$.time.i.O(jG);
        }
        return O(interfaceC0083b.b(jZ, (TemporalUnit) ChronoUnit.DAYS), iVarO);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final C0088g a(long j, j$.time.temporal.n nVar) {
        boolean z = nVar instanceof j$.time.temporal.a;
        InterfaceC0083b interfaceC0083b = this.a;
        if (!z) {
            return K(interfaceC0083b.getChronology(), nVar.t(this, j));
        }
        boolean zC = ((j$.time.temporal.a) nVar).C();
        j$.time.i iVar = this.b;
        return zC ? O(interfaceC0083b, iVar.a(j, nVar)) : O(interfaceC0083b.a(j, nVar), iVar);
    }

    public final C0088g O(Temporal temporal, j$.time.i iVar) {
        InterfaceC0083b interfaceC0083b = this.a;
        return (interfaceC0083b == temporal && this.b == iVar) ? this : new C0088g(AbstractC0085d.K(interfaceC0083b.getChronology(), temporal), iVar);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.C();
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0083b interfaceC0083b = this.a;
        InterfaceC0086e interfaceC0086eF = interfaceC0083b.getChronology().F(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.i(this, interfaceC0086eF);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        int iCompareTo = chronoUnit.compareTo(chronoUnit2);
        j$.time.i iVar = this.b;
        if (iCompareTo >= 0) {
            InterfaceC0083b localDate = interfaceC0086eF.toLocalDate();
            if (interfaceC0086eF.toLocalTime().compareTo(iVar) < 0) {
                localDate = localDate.A(1L, chronoUnit2);
            }
            return interfaceC0083b.e(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jC = interfaceC0086eF.C(aVar) - interfaceC0083b.C(aVar);
        switch (AbstractC0087f.a[chronoUnit.ordinal()]) {
            case 1:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 86400000000000L);
                break;
            case 2:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 86400000000L);
                break;
            case 3:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 86400000L);
                break;
            case 4:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 86400);
                break;
            case 5:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 1440);
                break;
            case 6:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 24);
                break;
            case 7:
                jC = j$.desugar.sun.nio.fs.g.I(jC, 2);
                break;
        }
        return j$.desugar.sun.nio.fs.g.H(jC, iVar.e(interfaceC0086eF.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0086e) && j$.desugar.sun.nio.fs.g.c(this, (InterfaceC0086e) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final m getChronology() {
        return this.a.getChronology();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() ? this.b.i(nVar) : this.a.i(nVar) : m(nVar).a(C(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return O(localDate, this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!((j$.time.temporal.a) nVar).C()) {
            return this.a.m(nVar);
        }
        j$.time.i iVar = this.b;
        iVar.getClass();
        return j$.time.temporal.o.d(iVar, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final InterfaceC0091j n(ZoneOffset zoneOffset) {
        return l.K(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(toLocalDate().D(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().V(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final InterfaceC0083b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0086e
    public final j$.time.i toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
