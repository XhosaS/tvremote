package j$.time.temporal;

import j$.time.chrono.InterfaceC0048b;
import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r implements n {
    public static final q f = q.f(1, 7);
    public static final q g = q.g(0, 4, 6);
    public static final q h = q.g(0, 52, 54);
    public static final q i = q.g(1, 52, 53);
    public final String a;
    public final s b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final q e;

    public r(String str, s sVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, q qVar) {
        this.a = str;
        this.b = sVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = qVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.n
    public final Temporal E(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.i(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.c);
        }
        s sVar = this.b;
        return e(j$.desugar.sun.nio.fs.g.w(temporal), (int) j, temporal.i(sVar.e), temporal.i(sVar.c));
    }

    public final int b(k kVar) {
        return o.e(kVar.i(a.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(k kVar) {
        int iB = b(kVar);
        int i2 = kVar.i(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int i3 = kVar.i(aVar);
        int iH = h(i3, iB);
        int iA = a(iH, i3);
        return iA == 0 ? i2 - 1 : iA >= a(iH, ((int) kVar.m(aVar).d) + this.b.b) ? i2 + 1 : i2;
    }

    public final int d(k kVar) {
        int iA;
        int iB = b(kVar);
        a aVar = a.DAY_OF_YEAR;
        int i2 = kVar.i(aVar);
        int iH = h(i2, iB);
        int iA2 = a(iH, i2);
        return iA2 == 0 ? d(j$.desugar.sun.nio.fs.g.w(kVar).G(kVar).x(i2, ChronoUnit.DAYS)) : (iA2 <= 50 || iA2 < (iA = a(iH, ((int) kVar.m(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final InterfaceC0048b e(j$.time.chrono.m mVar, int i2, int i3, int i4) {
        InterfaceC0048b interfaceC0048bN = mVar.N(i2, 1, 1);
        int iH = h(1, b(interfaceC0048bN));
        int i5 = i4 - 1;
        return interfaceC0048bN.b(((Math.min(i3, a(iH, interfaceC0048bN.R() + this.b.b) - 1) - 1) * 7) + i5 + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final q f(k kVar, a aVar) {
        int iH = h(kVar.i(aVar), b(kVar));
        q qVarM = kVar.m(aVar);
        return q.f(a(iH, (int) qVarM.a), a(iH, (int) qVarM.d));
    }

    public final q g(k kVar) {
        a aVar = a.DAY_OF_YEAR;
        if (!kVar.d(aVar)) {
            return h;
        }
        int iB = b(kVar);
        int i2 = kVar.i(aVar);
        int iH = h(i2, iB);
        int iA = a(iH, i2);
        if (iA == 0) {
            return g(j$.desugar.sun.nio.fs.g.w(kVar).G(kVar).x(i2 + 7, ChronoUnit.DAYS));
        }
        return iA >= a(iH, this.b.b + ((int) kVar.m(aVar).d)) ? g(j$.desugar.sun.nio.fs.g.w(kVar).G(kVar).b((r0 - i2) + 8, (TemporalUnit) ChronoUnit.DAYS)) : q.f(1L, r1 - 1);
    }

    public final int h(int i2, int i3) {
        int iE = o.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.n
    public final boolean i(k kVar) {
        if (!kVar.d(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return kVar.d(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return kVar.d(a.DAY_OF_YEAR);
        }
        if (temporalUnit == s.h) {
            return kVar.d(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return kVar.d(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final q l(k kVar) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(kVar, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(kVar, a.DAY_OF_YEAR);
        }
        if (temporalUnit == s.h) {
            return g(kVar);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.d;
        }
        throw new IllegalStateException(j$.time.e.a("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.n
    public final k m(Map map, D d, E e) {
        InterfaceC0048b interfaceC0048bB;
        InterfaceC0048b interfaceC0048bB2;
        InterfaceC0048b interfaceC0048bB3;
        s sVar = this.b;
        j$.time.c cVar = sVar.a;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iZ = j$.desugar.sun.nio.fs.g.z(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.e;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jE = o.e((qVar.a(jLongValue, this) - 1) + (cVar.getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iA = aVar.d.a(((Long) map.get(aVar)).longValue(), aVar);
        r rVar = sVar.e;
        r rVar2 = sVar.f;
        int iE = o.e(iA - cVar.getValue()) + 1;
        j$.time.chrono.m mVarW = j$.desugar.sun.nio.fs.g.w(d);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((temporalUnit != s.h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(rVar2) || !map.containsKey(rVar)) {
                return null;
            }
            int iA2 = rVar2.e.a(((Long) map.get(rVar2)).longValue(), rVar2);
            if (e == E.LENIENT) {
                interfaceC0048bB = e(mVarW, iA2, 1, iE).b(j$.desugar.sun.nio.fs.g.L(((Long) map.get(rVar)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                InterfaceC0048b interfaceC0048bE = e(mVarW, iA2, rVar.e.a(((Long) map.get(rVar)).longValue(), rVar), iE);
                if (e == E.STRICT && c(interfaceC0048bE) != iA2) {
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                interfaceC0048bB = interfaceC0048bE;
            }
            map.remove(this);
            map.remove(rVar2);
            map.remove(rVar);
            map.remove(aVar);
            return interfaceC0048bB;
        }
        int iA3 = aVar2.d.a(((Long) map.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j = iZ;
                if (e == E.LENIENT) {
                    InterfaceC0048b interfaceC0048bB4 = mVarW.N(iA3, 1, 1).b(j$.desugar.sun.nio.fs.g.L(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(interfaceC0048bB4);
                    int i2 = interfaceC0048bB4.i(a.DAY_OF_MONTH);
                    interfaceC0048bB3 = interfaceC0048bB4.b(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(j, a(h(i2, iB), i2)), 7), iE - b(interfaceC0048bB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    InterfaceC0048b interfaceC0048bN = mVarW.N(iA3, aVar3.d.a(jLongValue2, aVar3), 1);
                    long jA = qVar.a(j, this);
                    int iB2 = b(interfaceC0048bN);
                    int i3 = interfaceC0048bN.i(a.DAY_OF_MONTH);
                    InterfaceC0048b interfaceC0048bB5 = interfaceC0048bN.b((((int) (jA - a(h(i3, iB2), i3))) * 7) + (iE - b(interfaceC0048bN)), (TemporalUnit) ChronoUnit.DAYS);
                    if (e == E.STRICT && interfaceC0048bB5.H(aVar3) != jLongValue2) {
                        throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                    }
                    interfaceC0048bB3 = interfaceC0048bB5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return interfaceC0048bB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = iZ;
        InterfaceC0048b interfaceC0048bN2 = mVarW.N(iA3, 1, 1);
        if (e == E.LENIENT) {
            int iB3 = b(interfaceC0048bN2);
            int i4 = interfaceC0048bN2.i(a.DAY_OF_YEAR);
            interfaceC0048bB2 = interfaceC0048bN2.b(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j$.desugar.sun.nio.fs.g.L(j2, a(h(i4, iB3), i4)), 7), iE - b(interfaceC0048bN2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = qVar.a(j2, this);
            int iB4 = b(interfaceC0048bN2);
            int i5 = interfaceC0048bN2.i(a.DAY_OF_YEAR);
            InterfaceC0048b interfaceC0048bB6 = interfaceC0048bN2.b((((int) (jA2 - a(h(i5, iB4), i5))) * 7) + (iE - b(interfaceC0048bN2)), (TemporalUnit) ChronoUnit.DAYS);
            if (e == E.STRICT && interfaceC0048bB6.H(aVar2) != iA3) {
                throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
            }
            interfaceC0048bB2 = interfaceC0048bB6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return interfaceC0048bB2;
    }

    @Override // j$.time.temporal.n
    public final q range() {
        return this.e;
    }

    @Override // j$.time.temporal.n
    public final long t(k kVar) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(kVar);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(kVar);
            int i2 = kVar.i(a.DAY_OF_MONTH);
            iC = a(h(i2, iB), i2);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(kVar);
            int i3 = kVar.i(a.DAY_OF_YEAR);
            iC = a(h(i3, iB2), i3);
        } else if (temporalUnit == s.h) {
            iC = d(kVar);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException(j$.time.e.a("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
            }
            iC = c(kVar);
        }
        return iC;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
