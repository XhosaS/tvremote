package j$.time;

import j$.time.chrono.InterfaceC0083b;
import j$.time.chrono.InterfaceC0086e;
import j$.time.chrono.InterfaceC0091j;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0091j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime K(j$.time.temporal.k kVar) {
        if (kVar instanceof ZonedDateTime) {
            return (ZonedDateTime) kVar;
        }
        try {
            ZoneId zoneIdK = ZoneId.K(kVar);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return kVar.d(aVar) ? t(kVar.C(aVar), kVar.i(j$.time.temporal.a.NANO_OF_SECOND), zoneIdK) : L(LocalDateTime.N(LocalDate.M(kVar), i.M(kVar)), zoneIdK, null);
        } catch (b e) {
            throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName(), e);
        }
    }

    public static ZonedDateTime L(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.e eVarL = zoneId.L();
        List listF = eVarL.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarL.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.Q(Duration.ofSeconds(bVar.d.a - bVar.c.a).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime t(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.L().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.O(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.C(nVar) : this.b.a : j$.desugar.sun.nio.fs.g.r(this);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this.a.a : j$.desugar.sun.nio.fs.g.o(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.l(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return L(localDateTime.b(j, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeB = localDateTime.b(j, temporalUnit);
        Objects.a(localDateTimeB, "localDateTime");
        Objects.a(zoneOffset, "offset");
        Objects.a(zoneId, "zone");
        return zoneId.L().f(localDateTimeB).contains(zoneOffset) ? new ZonedDateTime(localDateTimeB, zoneId, zoneOffset) : t(j$.desugar.sun.nio.fs.g.q(localDateTimeB, zoneOffset), localDateTimeB.b.d, zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime g(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return t(j$.desugar.sun.nio.fs.g.q(localDateTime, this.b), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = x.a[aVar.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return t(j, localDateTime.b.d, zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return L(localDateTime.a(j, nVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(aVar.d.a(j, aVar));
        return (zoneOffsetS.equals(zoneOffset) || !zoneId.L().f(localDateTime).contains(zoneOffsetS)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetS);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.d(this, (InterfaceC0091j) obj);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeK = K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, zonedDateTimeK);
        }
        ZonedDateTime zonedDateTimeG = zonedDateTimeK.g(this.c);
        LocalDateTime localDateTime = zonedDateTimeG.a;
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime2 = this.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? new OffsetDateTime(localDateTime2, this.b).e(new OffsetDateTime(localDateTime, zonedDateTimeG.b), temporalUnit) : localDateTime2.e(localDateTime, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final j$.time.chrono.m getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.desugar.sun.nio.fs.g.h(this, nVar);
        }
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(nVar) : this.b.a;
        }
        throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return L(LocalDateTime.N(localDate, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).d : this.a.m(nVar) : nVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.r(this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0083b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0086e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final i toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0091j z(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : L(this.a, zoneId, this.b);
    }
}
