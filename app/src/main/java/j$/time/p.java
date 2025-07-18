package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new p(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new p(localTime2, zoneOffset2);
    }

    public p(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.b : this.a.H(nVar) : nVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (((nVar == j$.time.temporal.o.a) || (nVar == j$.time.temporal.o.b)) || nVar == j$.time.temporal.o.f) {
            return null;
        }
        return nVar == j$.time.temporal.o.g ? this.a : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final p b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? X(this.a.b(j, temporalUnit), this.b) : (p) temporalUnit.l(this, j);
    }

    public final long W() {
        return this.a.toNanoOfDay() - (this.b.b * 1000000000);
    }

    public final p X(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new p(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (p) nVar.E(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (nVar != aVar) {
            return X(localTime.a(j, nVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) nVar;
        return X(localTime, ZoneOffset.e0(aVar2.d.a(j, aVar2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        ZoneOffset zoneOffset = pVar.b;
        LocalTime localTime = pVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(W(), pVar.W());
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).U() || nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        p pVar;
        if (temporal instanceof p) {
            pVar = (p) temporal;
        } else {
            try {
                pVar = new p(LocalTime.X(temporal), ZoneOffset.b0(temporal));
            } catch (b e) {
                throw new b(e.a("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, pVar);
        }
        long jW = pVar.W() - W();
        switch (o.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jW;
            case 2:
                return jW / 1000;
            case 3:
                return jW / 1000000;
            case 4:
                return jW / 1000000000;
            case 5:
                return jW / 60000000000L;
            case 6:
                return jW / 3600000000000L;
            case 7:
                return jW / 43200000000000L;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(h hVar) {
        return (p) hVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) nVar).d;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(this.a.toNanoOfDay(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
