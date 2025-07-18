package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w extends AbstractC0047a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final int B(n nVar, int i) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((z) nVar).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || nVar != z.c(j$.time.h.h0(i3, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b G(j$.time.temporal.k kVar) {
        return kVar instanceof y ? (y) kVar : new y(j$.time.h.X(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b N(int i, int i2, int i3) {
        return new y(j$.time.h.h0(i, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0048b P(Map map, j$.time.format.E e) {
        return (y) super.P(map, e);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0056j Q(Instant instant, ZoneId zoneId) {
        return l.W(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final boolean T(long j) {
        return t.c.T(j);
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b U(Map map, j$.time.format.E e) {
        y yVarC0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        z zVarH = l != null ? z.h(w(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? w(aVar2).a(l2.longValue(), aVar2) : 0;
        if (zVarH == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && e != j$.time.format.E.STRICT) {
            z[] zVarArr = z.e;
            zVarH = ((z[]) Arrays.copyOf(zVarArr, zVarArr.length))[((z[]) Arrays.copyOf(zVarArr, zVarArr.length)).length - 1];
        }
        if (l2 != null && zVarH != null) {
            j$.time.h hVar = zVarH.b;
            int i = hVar.a;
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        return new y(j$.time.h.h0((hVar.a + iA) - 1, 1, 1)).a0(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).a0(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = w(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = w(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (e != j$.time.format.E.SMART) {
                        j$.time.h hVar2 = y.d;
                        j$.time.h hVarH0 = j$.time.h.h0((i + iA) - 1, iA2, iA3);
                        if (hVarH0.c0(hVar) || zVarH != z.c(hVarH0)) {
                            throw new j$.time.b("year, month, and day not valid for Era");
                        }
                        return new y(zVarH, iA, hVarH0);
                    }
                    if (iA < 1) {
                        throw new j$.time.b("Invalid YearOfEra: " + iA);
                    }
                    int i2 = (hVar.a + iA) - 1;
                    try {
                        yVarC0 = new y(j$.time.h.h0(i2, iA2, iA3));
                    } catch (j$.time.b unused) {
                        yVarC0 = new y(j$.time.h.h0(i2, iA2, 1)).c0(new j$.desugar.sun.nio.fs.n(3));
                    }
                    if (yVarC0.b == zVarH || j$.time.temporal.o.a(yVarC0, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return yVarC0;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + String.valueOf(zVarH) + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (e == j$.time.format.E.LENIENT) {
                    return new y(j$.time.h.j0((hVar.a + iA) - 1, 1)).a0(j$.desugar.sun.nio.fs.g.L(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = w(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.h hVar3 = y.d;
                j$.time.h hVarJ0 = iA == 1 ? j$.time.h.j0(i, (hVar.a0() + iA4) - 1) : j$.time.h.j0((i + iA) - 1, iA4);
                if (hVarJ0.c0(hVar) || zVarH != z.c(hVarJ0)) {
                    throw new j$.time.b("Invalid parameters");
                }
                return new y(zVarH, iA, hVarJ0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b h(long j) {
        return new y(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b l() {
        return new y(j$.time.h.X(j$.time.h.g0(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b r(int i, int i2) {
        return new y(j$.time.h.j0(i, i2));
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q w(j$.time.temporal.a aVar) {
        switch (v.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(aVar)));
            case 5:
                z[] zVarArr = z.e;
                int i = zVarArr[zVarArr.length - 1].b.a;
                int iMin = 1000000000 - zVarArr[zVarArr.length - 1].b.a;
                int i2 = zVarArr[0].b.a;
                for (int i3 = 1; i3 < zVarArr.length; i3++) {
                    z zVar = zVarArr[i3];
                    iMin = Math.min(iMin, (zVar.b.a - i2) + 1);
                    i2 = zVar.b.a;
                }
                return j$.time.temporal.q.g(1L, iMin, 999999999 - i);
            case 6:
                z zVar2 = z.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.d.c;
                long jMin = j;
                for (z zVar3 : z.e) {
                    long jMin2 = Math.min(jMin, (zVar3.b.R() - zVar3.b.a0()) + 1);
                    jMin = zVar3.f() != null ? Math.min(jMin2, zVar3.f().b.a0() - 1) : jMin2;
                }
                return j$.time.temporal.q.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.d.d);
            case 7:
                return j$.time.temporal.q.f(y.d.a, 999999999L);
            case 8:
                long j2 = z.d.a;
                z[] zVarArr2 = z.e;
                return j$.time.temporal.q.f(j2, zVarArr2[zVarArr2.length - 1].a);
            default:
                return aVar.d;
        }
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final List y() {
        z[] zVarArr = z.e;
        return j$.desugar.sun.nio.fs.g.C((z[]) Arrays.copyOf(zVarArr, zVarArr.length));
    }

    @Override // j$.time.chrono.m
    public final n z(int i) {
        return z.h(i);
    }
}
