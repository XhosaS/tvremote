package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0047a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static void i(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.b("Conflict found: " + String.valueOf(aVar) + " " + l + " differs from " + String.valueOf(aVar) + " " + j);
    }

    public static m m(m mVar, String str) {
        String strO;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strO = mVar.o()) != null) {
            b.putIfAbsent(strO, mVar);
        }
        return mVar2;
    }

    public static InterfaceC0048b t(InterfaceC0048b interfaceC0048b, long j, long j2, long j3) {
        long j4;
        InterfaceC0048b interfaceC0048bB = interfaceC0048b.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC0048b interfaceC0048bB2 = interfaceC0048bB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                interfaceC0048bB2 = interfaceC0048bB2.b(j$.desugar.sun.nio.fs.g.L(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC0048bB2.l(new j$.time.temporal.m(j$.time.c.V((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        interfaceC0048bB2 = interfaceC0048bB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return interfaceC0048bB2.l(new j$.time.temporal.m(j$.time.c.V((int) j3).getValue(), 0));
    }

    public void E(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e != j$.time.format.E.LENIENT) {
                aVar.H(l.longValue());
            }
            InterfaceC0048b interfaceC0048bA = l().a(1L, (j$.time.temporal.n) j$.time.temporal.a.DAY_OF_MONTH).a(l.longValue(), (j$.time.temporal.n) aVar);
            i(map, j$.time.temporal.a.MONTH_OF_YEAR, interfaceC0048bA.i(r0));
            i(map, j$.time.temporal.a.YEAR, interfaceC0048bA.i(r0));
        }
    }

    public InterfaceC0048b H(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = w(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (e == j$.time.format.E.LENIENT) {
            long jL = j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return N(iA, 1, 1).b(jL, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = w(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e != j$.time.format.E.SMART) {
            return N(iA, iA2, iA3);
        }
        try {
            return N(iA, iA2, iA3);
        } catch (j$.time.b unused) {
            return N(iA, iA2, 1).l(new j$.desugar.sun.nio.fs.n(3));
        }
    }

    @Override // j$.time.chrono.m
    public InterfaceC0051e K(j$.time.temporal.k kVar) {
        try {
            return G(kVar).J(LocalTime.X(kVar));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(kVar.getClass())), e);
        }
    }

    @Override // j$.time.chrono.m
    public InterfaceC0048b P(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return h(((Long) map.remove(aVar)).longValue());
        }
        E(map, e);
        InterfaceC0048b interfaceC0048bU = U(map, e);
        if (interfaceC0048bU != null) {
            return interfaceC0048bU;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return H(map, e);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        long jL = j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L);
                        return N(iA, 1, 1).b(jL, (TemporalUnit) ChronoUnit.MONTHS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = w(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = w(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    InterfaceC0048b interfaceC0048bB = N(iA, iA2, 1).b((w(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (e != j$.time.format.E.STRICT || interfaceC0048bB.i(aVar3) == iA2) {
                        return interfaceC0048bB;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA4 = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        return t(N(iA4, 1, 1), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA5 = w(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC0048b interfaceC0048bL = N(iA4, iA5, 1).b((w(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).l(new j$.time.temporal.m(j$.time.c.V(w(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (e != j$.time.format.E.STRICT || interfaceC0048bL.i(aVar3) == iA5) {
                        return interfaceC0048bL;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA6 = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e != j$.time.format.E.LENIENT) {
                return r(iA6, w(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return r(iA6, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA7 = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e == j$.time.format.E.LENIENT) {
                return r(iA7, 1).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = w(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            InterfaceC0048b interfaceC0048bB2 = r(iA7, 1).b((w(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (e != j$.time.format.E.STRICT || interfaceC0048bB2.i(aVar2) == iA7) {
                return interfaceC0048bB2;
            }
            throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA9 = w(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (e == j$.time.format.E.LENIENT) {
            return t(r(iA9, 1), 0L, j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar8)).longValue(), 1L), j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC0048b interfaceC0048bL2 = r(iA9, 1).b((w(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).l(new j$.time.temporal.m(j$.time.c.V(w(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (e != j$.time.format.E.STRICT || interfaceC0048bL2.i(aVar2) == iA9) {
            return interfaceC0048bL2;
        }
        throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
    }

    public InterfaceC0048b U(Map map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            w(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        int iA = e != j$.time.format.E.LENIENT ? w(aVar).a(l.longValue(), aVar) : j$.desugar.sun.nio.fs.g.z(l.longValue());
        if (l2 != null) {
            i(map, j$.time.temporal.a.YEAR, B(z(w(r2).a(l2.longValue(), r2)), iA));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            i(map, aVar3, B(r(w(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).L(), iA));
            return null;
        }
        if (e == j$.time.format.E.STRICT) {
            map.put(aVar, l);
            return null;
        }
        if (y().isEmpty()) {
            i(map, aVar3, iA);
            return null;
        }
        i(map, aVar3, B((n) r9.get(r9.size() - 1), iA));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((m) obj).getId());
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0047a) && getId().compareTo(((AbstractC0047a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract /* synthetic */ InterfaceC0048b l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.j] */
    @Override // j$.time.chrono.m
    public InterfaceC0056j q(j$.time.temporal.k kVar) {
        try {
            ZoneId zoneIdV = ZoneId.V(kVar);
            try {
                kVar = Q(Instant.W(kVar), zoneIdV);
                return kVar;
            } catch (j$.time.b unused) {
                return l.V(zoneIdV, null, C0053g.V(this, K(kVar)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(kVar.getClass())), e);
        }
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return getId();
    }
}
