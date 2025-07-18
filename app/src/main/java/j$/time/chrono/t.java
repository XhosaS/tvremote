package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t extends AbstractC0047a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final int B(n nVar, int i) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final void E(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e != j$.time.format.E.LENIENT) {
                aVar.H(l.longValue());
            }
            AbstractC0047a.i(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.desugar.sun.nio.fs.g.I(l.longValue(), r4)) + 1);
            AbstractC0047a.i(map, j$.time.temporal.a.YEAR, j$.desugar.sun.nio.fs.g.A(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b G(j$.time.temporal.k kVar) {
        return j$.time.h.X(kVar);
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b H(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.d.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (e == j$.time.format.E.LENIENT) {
            return j$.time.h.h0(iA, 1, 1).m0(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).l0(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.d.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.d.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e == j$.time.format.E.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                j$.time.k kVar = j$.time.k.FEBRUARY;
                long j = iA;
                int i = j$.time.t.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, kVar.W(z));
            }
        }
        return j$.time.h.h0(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0051e K(j$.time.temporal.k kVar) {
        return LocalDateTime.W(kVar);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b N(int i, int i2, int i3) {
        return j$.time.h.h0(i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0048b P(Map map, j$.time.format.E e) {
        return (j$.time.h) super.P(map, e);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0056j Q(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return ZonedDateTime.t(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.m
    public final boolean T(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b U(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            aVar2.H(((Long) map.get(aVar2)).longValue());
            return null;
        }
        if (e != j$.time.format.E.LENIENT) {
            aVar.H(l.longValue());
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                AbstractC0047a.i(map, j$.time.temporal.a.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                AbstractC0047a.i(map, j$.time.temporal.a.YEAR, j$.desugar.sun.nio.fs.g.L(1L, l.longValue()));
                return null;
            }
            throw new j$.time.b("Invalid value for era: " + l2);
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        Long l3 = (Long) map.get(aVar3);
        if (e != j$.time.format.E.STRICT) {
            AbstractC0047a.i(map, aVar3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.desugar.sun.nio.fs.g.L(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(aVar, l);
            return null;
        }
        long jLongValue = l3.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= 0) {
            jLongValue2 = j$.desugar.sun.nio.fs.g.L(1L, jLongValue2);
        }
        AbstractC0047a.i(map, aVar3, jLongValue2);
        return null;
    }

    @Override // j$.time.chrono.m
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b h(long j) {
        return j$.time.h.i0(j);
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b l() {
        return j$.time.h.X(j$.time.h.g0(new j$.time.a(ZoneId.systemDefault())));
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "iso8601";
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0056j q(j$.time.temporal.k kVar) {
        return ZonedDateTime.V(kVar);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b r(int i, int i2) {
        return j$.time.h.j0(i, i2);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q w(j$.time.temporal.a aVar) {
        return aVar.d;
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final List y() {
        return j$.desugar.sun.nio.fs.g.C(u.values());
    }

    @Override // j$.time.chrono.m
    public final n z(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
