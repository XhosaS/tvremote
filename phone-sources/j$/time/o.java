package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class o implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final i a;
    public final ZoneOffset b;

    static {
        i iVar = i.e;
        ZoneOffset zoneOffset = ZoneOffset.f;
        iVar.getClass();
        new o(iVar, zoneOffset);
        i iVar2 = i.f;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        iVar2.getClass();
        new o(iVar2, zoneOffset2);
    }

    public o(i iVar, ZoneOffset zoneOffset) {
        Objects.a(iVar, "time");
        this.a = iVar;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal A(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.a : this.a.C(nVar) : nVar.m(this);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (((nVar == j$.time.temporal.o.a) || (nVar == j$.time.temporal.o.b)) || nVar == j$.time.temporal.o.f) {
            return null;
        }
        return nVar == j$.time.temporal.o.g ? this.a : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final o b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? M(this.a.b(j, temporalUnit), this.b) : (o) temporalUnit.l(this, j);
    }

    public final long L() {
        return this.a.V() - (this.b.a * 1000000000);
    }

    public final o M(i iVar, ZoneOffset zoneOffset) {
        return (this.a == iVar && this.b.equals(zoneOffset)) ? this : new o(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (o) nVar.t(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        i iVar = this.a;
        if (nVar != aVar) {
            return M(iVar.a(j, nVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) nVar;
        return M(iVar, ZoneOffset.S(aVar2.d.a(j, aVar2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        ZoneOffset zoneOffset = oVar.b;
        i iVar = oVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        i iVar2 = this.a;
        if (zEquals) {
            return iVar2.compareTo(iVar);
        }
        int iCompare = Long.compare(L(), oVar.L());
        return iCompare == 0 ? iVar2.compareTo(iVar) : iCompare;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).C() || nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        o oVar;
        if (temporal instanceof o) {
            oVar = (o) temporal;
        } else {
            try {
                oVar = new o(i.M(temporal), ZoneOffset.P(temporal));
            } catch (b e) {
                throw new b("Unable to obtain OffsetTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.i(this, oVar);
        }
        long jL = oVar.L() - L();
        switch (n.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jL;
            case 2:
                return jL / 1000;
            case 3:
                return jL / 1000000;
            case 4:
                return jL / 1000000000;
            case 5:
                return jL / 60000000000L;
            case 6:
                return jL / 3600000000000L;
            case 7:
                return jL / 43200000000000L;
            default:
                throw new j$.time.temporal.p("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.a;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(LocalDate localDate) {
        return (o) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) nVar).d;
        }
        i iVar = this.a;
        iVar.getClass();
        return j$.time.temporal.o.d(iVar, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(this.a.V(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }
}
