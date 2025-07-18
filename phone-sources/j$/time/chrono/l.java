package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class l implements InterfaceC0091j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C0088g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public l(ZoneId zoneId, ZoneOffset zoneOffset, C0088g c0088g) {
        Objects.a(c0088g, "dateTime");
        this.a = c0088g;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static l K(ZoneId zoneId, ZoneOffset zoneOffset, C0088g c0088g) {
        Objects.a(c0088g, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c0088g);
        }
        j$.time.zone.e eVarL = zoneId.L();
        LocalDateTime localDateTimeL = LocalDateTime.L(c0088g);
        List listF = eVarL.f(localDateTimeL);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarL.e(localDateTimeL);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c0088g = c0088g.M(c0088g.a, 0L, 0L, Duration.ofSeconds(bVar.d.a - bVar.c.a).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c0088g = c0088g;
        }
        Objects.a(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, c0088g);
    }

    public static l L(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.L().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new l(zoneId, zoneOffsetD, (C0088g) mVar.F(LocalDateTime.O(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l t(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.getChronology())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + lVar.getChronology().h());
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return t(getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.m(this);
        }
        int i = AbstractC0090i.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? ((C0088g) toLocalDateTime()).C(nVar) : getOffset().a : toEpochSecond();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.o(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return t(getChronology(), temporalUnit.l(this, j));
        }
        return t(getChronology(), this.a.b(j, temporalUnit).t(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return t(getChronology(), nVar.t(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = AbstractC0092k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.r(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0088g c0088g = this.a;
        if (i != 2) {
            return K(zoneId, this.b, c0088g.a(j, nVar));
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(aVar.d.a(j, aVar));
        c0088g.getClass();
        return L(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.q(c0088g, zoneOffsetS), c0088g.b.d), zoneId);
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
        Objects.a(temporal, "endExclusive");
        InterfaceC0091j interfaceC0091jR = getChronology().r(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(interfaceC0091jR.g(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.i(this, interfaceC0091jR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0091j) && j$.desugar.sun.nio.fs.g.d(this, (InterfaceC0091j) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0091j g(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0088g c0088g = this.a;
        c0088g.getClass();
        return L(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.q(c0088g, this.b), c0088g.b.d), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final m getChronology() {
        return toLocalDate().getChronology();
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
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.h(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return t(getChronology(), localDate.t(this));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).d : ((C0088g) toLocalDateTime()).m(nVar) : nVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.r(this);
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0083b toLocalDate() {
        return ((C0088g) toLocalDateTime()).toLocalDate();
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final InterfaceC0086e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0091j
    public final j$.time.i toLocalTime() {
        return ((C0088g) toLocalDateTime()).toLocalTime();
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
        return K(zoneId, this.b, this.a);
    }
}
