package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0053g implements InterfaceC0051e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC0048b a;
    public final transient LocalTime b;

    public C0053g(InterfaceC0048b interfaceC0048b, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = interfaceC0048b;
        this.b = localTime;
    }

    public static C0053g V(m mVar, Temporal temporal) {
        C0053g c0053g = (C0053g) temporal;
        if (mVar.equals(c0053g.a.getChronology())) {
            return c0053g;
        }
        throw new ClassCastException(j$.time.e.a("Chronology mismatch, required: ", mVar.getId(), ", actual: ", c0053g.a.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return V(this.a.getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final InterfaceC0056j F(ZoneId zoneId) {
        return l.V(zoneId, null, this);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() ? this.b.H(nVar) : this.a.H(nVar) : nVar.t(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: M */
    public final /* synthetic */ int compareTo(InterfaceC0051e interfaceC0051e) {
        return j$.desugar.sun.nio.fs.g.c(this, interfaceC0051e);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object U(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C0053g b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0048b interfaceC0048b = this.a;
        if (!z) {
            return V(interfaceC0048b.getChronology(), temporalUnit.l(this, j));
        }
        int i = AbstractC0052f.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return X(this.a, 0L, 0L, 0L, j);
            case 2:
                C0053g c0053gZ = Z(interfaceC0048b.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0053gZ.X(c0053gZ.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0053g c0053gZ2 = Z(interfaceC0048b.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0053gZ2.X(c0053gZ2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return X(this.a, 0L, 0L, j, 0L);
            case 5:
                return X(this.a, 0L, j, 0L, 0L);
            case 6:
                return X(this.a, j, 0L, 0L, 0L);
            case 7:
                C0053g c0053gZ3 = Z(interfaceC0048b.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0053gZ3.X(c0053gZ3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(interfaceC0048b.b(j, temporalUnit), localTime);
        }
    }

    public final C0053g X(InterfaceC0048b interfaceC0048b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeA0 = this.b;
        if (j5 == 0) {
            return Z(interfaceC0048b, localTimeA0);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long nanoOfDay = localTimeA0.toNanoOfDay();
        long j10 = j9 + nanoOfDay;
        long jA = j$.desugar.sun.nio.fs.g.A(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jI = j$.desugar.sun.nio.fs.g.I(j10, 86400000000000L);
        if (jI != nanoOfDay) {
            localTimeA0 = LocalTime.a0(jI);
        }
        return Z(interfaceC0048b.b(jA, (TemporalUnit) ChronoUnit.DAYS), localTimeA0);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C0053g a(long j, j$.time.temporal.n nVar) {
        boolean z = nVar instanceof j$.time.temporal.a;
        InterfaceC0048b interfaceC0048b = this.a;
        if (!z) {
            return V(interfaceC0048b.getChronology(), nVar.E(this, j));
        }
        boolean zU = ((j$.time.temporal.a) nVar).U();
        LocalTime localTime = this.b;
        return zU ? Z(interfaceC0048b, localTime.a(j, nVar)) : Z(interfaceC0048b.a(j, nVar), localTime);
    }

    public final C0053g Z(Temporal temporal, LocalTime localTime) {
        InterfaceC0048b interfaceC0048b = this.a;
        return (interfaceC0048b == temporal && this.b == localTime) ? this : new C0053g(AbstractC0050d.V(interfaceC0048b.getChronology(), temporal), localTime);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.U();
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0048b interfaceC0048b = this.a;
        InterfaceC0051e interfaceC0051eK = interfaceC0048b.getChronology().K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.i(this, interfaceC0051eK);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        int iCompareTo = chronoUnit.compareTo(chronoUnit2);
        LocalTime localTime = this.b;
        if (iCompareTo >= 0) {
            InterfaceC0048b localDate = interfaceC0051eK.toLocalDate();
            if (interfaceC0051eK.toLocalTime().compareTo(localTime) < 0) {
                localDate = localDate.x(1L, chronoUnit2);
            }
            return interfaceC0048b.e(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jH = interfaceC0051eK.H(aVar) - interfaceC0048b.H(aVar);
        switch (AbstractC0052f.a[chronoUnit.ordinal()]) {
            case 1:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 86400000000000L);
                break;
            case 2:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 86400000000L);
                break;
            case 3:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 86400000L);
                break;
            case 4:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 86400);
                break;
            case 5:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 1440);
                break;
            case 6:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 24);
                break;
            case 7:
                jH = j$.desugar.sun.nio.fs.g.K(jH, 2);
                break;
        }
        return j$.desugar.sun.nio.fs.g.J(jH, localTime.e(interfaceC0051eK.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0051e) && j$.desugar.sun.nio.fs.g.c(this, (InterfaceC0051e) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final m getChronology() {
        return this.a.getChronology();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() ? this.b.i(nVar) : this.a.i(nVar) : m(nVar).a(H(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(j$.time.h hVar) {
        return Z(hVar, this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (!((j$.time.temporal.a) nVar).U()) {
            return this.a.m(nVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(toLocalDate().I(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().toNanoOfDay(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final InterfaceC0048b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0051e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
