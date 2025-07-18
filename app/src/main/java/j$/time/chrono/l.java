package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
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

/* loaded from: classes3.dex */
public final class l implements InterfaceC0056j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C0053g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public l(ZoneId zoneId, ZoneOffset zoneOffset, C0053g c0053g) {
        Objects.a(c0053g, "dateTime");
        this.a = c0053g;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static l V(ZoneId zoneId, ZoneOffset zoneOffset, C0053g c0053g) {
        Objects.a(c0053g, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c0053g);
        }
        j$.time.zone.e eVarW = zoneId.W();
        LocalDateTime localDateTimeW = LocalDateTime.W(c0053g);
        List listF = eVarW.f(localDateTimeW);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarW.e(localDateTimeW);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c0053g = c0053g.X(c0053g.a, 0L, 0L, Duration.ofSeconds(bVar.d.b - bVar.c.b).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c0053g = c0053g;
        }
        Objects.a(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, c0053g);
    }

    public static l W(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.W().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new l(zoneId, zoneOffsetD, (C0053g) mVar.K(LocalDateTime.Z(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l t(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.getChronology())) {
            return lVar;
        }
        throw new ClassCastException(j$.time.e.a("Chronology mismatch, required: ", mVar.getId(), ", actual: ", lVar.getChronology().getId()));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final InterfaceC0056j C(ZoneId zoneId) {
        return V(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return t(getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.t(this);
        }
        int i = AbstractC0055i.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? ((C0053g) toLocalDateTime()).H(nVar) : getOffset().b : toEpochSecond();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object U(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.o(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return t(getChronology(), temporalUnit.l(this, j));
        }
        return t(getChronology(), this.a.b(j, temporalUnit).t(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return t(getChronology(), nVar.E(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = AbstractC0057k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.r(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0053g c0053g = this.a;
        if (i != 2) {
            return V(zoneId, this.b, c0053g.a(j, nVar));
        }
        ZoneOffset zoneOffsetE0 = ZoneOffset.e0(aVar.d.a(j, aVar));
        c0053g.getClass();
        return W(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.q(c0053g, zoneOffsetE0), c0053g.b.d), zoneId);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.d(this, (InterfaceC0056j) obj);
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
        InterfaceC0056j interfaceC0056jQ = getChronology().q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(interfaceC0056jQ.g(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.i(this, interfaceC0056jQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0056j) && j$.desugar.sun.nio.fs.g.d(this, (InterfaceC0056j) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final InterfaceC0056j g(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0053g c0053g = this.a;
        c0053g.getClass();
        return W(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.q(c0053g, this.b), c0053g.b.d), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final m getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.f(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(j$.time.h hVar) {
        return t(getChronology(), hVar.t(this));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).d : ((C0053g) toLocalDateTime()).m(nVar) : nVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.r(this);
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final InterfaceC0048b toLocalDate() {
        return ((C0053g) toLocalDateTime()).toLocalDate();
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final InterfaceC0051e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0056j
    public final LocalTime toLocalTime() {
        return ((C0053g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }
}
