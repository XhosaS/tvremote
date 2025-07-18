package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime V(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.W().d(instant);
        return new OffsetDateTime(LocalDateTime.Z(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.t(this);
        }
        int i = n.a[((j$.time.temporal.a) nVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.H(nVar) : zoneOffset.b;
        }
        localDateTime.getClass();
        return j$.desugar.sun.nio.fs.g.q(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (nVar == j$.time.temporal.o.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.n nVar2 = j$.time.temporal.o.f;
        LocalDateTime localDateTime = this.a;
        return nVar == nVar2 ? localDateTime.a : nVar == j$.time.temporal.o.g ? localDateTime.b : nVar == j$.time.temporal.o.b ? j$.time.chrono.t.c : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? X(this.a.b(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.l(this, j);
    }

    public final OffsetDateTime X(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) nVar.E(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = n.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? X(localDateTime.a(j, nVar), zoneOffset) : X(localDateTime, ZoneOffset.e0(aVar.d.a(j, aVar))) : V(Instant.ofEpochSecond(j, localDateTime.b.d), zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompareTo;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        LocalDateTime localDateTime = offsetDateTime2.a;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iCompareTo = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime2 = this.a;
            localDateTime2.getClass();
            long jQ = j$.desugar.sun.nio.fs.g.q(localDateTime2, zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            localDateTime.getClass();
            int iCompare = Long.compare(jQ, j$.desugar.sun.nio.fs.g.q(localDateTime, zoneOffset3));
            iCompareTo = iCompare == 0 ? localDateTime2.b.d - localDateTime.b.d : iCompare;
        }
        return iCompareTo == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompareTo;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetB0 = ZoneOffset.b0(temporal);
                h hVar = (h) temporal.U(j$.time.temporal.o.f);
                LocalTime localTime = (LocalTime) temporal.U(j$.time.temporal.o.g);
                temporal = (hVar == null || localTime == null) ? V(Instant.W(temporal), zoneOffsetB0) : new OffsetDateTime(LocalDateTime.Y(hVar, localTime), zoneOffsetB0);
            } catch (b e) {
                throw new b(e.a("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        OffsetDateTime offsetDateTime = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = new OffsetDateTime(temporal.a.b0(zoneOffset2.b - zoneOffset.b), zoneOffset2);
        }
        return this.a.e(offsetDateTime.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
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
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(this, nVar);
        }
        int i = n.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(nVar) : this.b.b;
        }
        throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(h hVar) {
        LocalDateTime localDateTime = this.a;
        return X(localDateTime.e0(hVar, localDateTime.b), this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).d : this.a.m(nVar) : nVar.l(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.a(localDateTime.a.I(), aVar).a(localDateTime.b.toNanoOfDay(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
