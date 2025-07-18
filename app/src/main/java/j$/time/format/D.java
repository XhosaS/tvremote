package j$.time.format;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0048b;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D implements j$.time.temporal.k {
    public ZoneId b;
    public j$.time.chrono.m c;
    public boolean d;
    public E e;
    public InterfaceC0048b f;
    public LocalTime g;
    public final HashMap a = new HashMap();
    public j$.time.q h = j$.time.q.d;

    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        Objects.a(nVar, "field");
        Long l = (Long) this.a.get(nVar);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC0048b interfaceC0048b = this.f;
        if (interfaceC0048b != null && interfaceC0048b.d(nVar)) {
            return this.f.H(nVar);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.d(nVar)) {
            return this.g.H(nVar);
        }
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return nVar.t(this);
    }

    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.a) {
            return this.b;
        }
        if (nVar == j$.time.temporal.o.b) {
            return this.c;
        }
        if (nVar == j$.time.temporal.o.f) {
            InterfaceC0048b interfaceC0048b = this.f;
            if (interfaceC0048b != null) {
                return j$.time.h.X(interfaceC0048b);
            }
            return null;
        }
        if (nVar == j$.time.temporal.o.g) {
            return this.g;
        }
        if (nVar == j$.time.temporal.o.d) {
            Long l = (Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.e0(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : nVar.c(this);
        }
        if (nVar == j$.time.temporal.o.e) {
            return nVar.c(this);
        }
        if (nVar == j$.time.temporal.o.c) {
            return null;
        }
        return nVar.c(this);
    }

    public final void c(j$.time.temporal.k kVar) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.n nVar = (j$.time.temporal.n) entry.getKey();
            if (kVar.d(nVar)) {
                try {
                    long jH = kVar.H(nVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jH != jLongValue) {
                        throw new j$.time.b("Conflict found: Field " + String.valueOf(nVar) + " " + jH + " differs from " + String.valueOf(nVar) + " " + jLongValue + " derived from " + String.valueOf(kVar));
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (this.a.containsKey(nVar)) {
            return true;
        }
        InterfaceC0048b interfaceC0048b = this.f;
        if (interfaceC0048b != null && interfaceC0048b.d(nVar)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.d(nVar)) {
            return (nVar == null || (nVar instanceof j$.time.temporal.a) || !nVar.i(this)) ? false : true;
        }
        return true;
    }

    public final void f() {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        HashMap map = this.a;
        if (map.containsKey(aVar)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                h(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                h(ZoneOffset.e0(l.intValue()));
            }
        }
    }

    public final void h(ZoneId zoneId) {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        o(this.c.Q(Instant.ofEpochSecond(((Long) this.a.remove(aVar)).longValue()), zoneId).toLocalDate());
        p(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().h0()));
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    public final void j(long j, long j2, long j3, long j4) {
        if (this.e == E.LENIENT) {
            long J = j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(j, 3600000000000L), j$.desugar.sun.nio.fs.g.K(j2, 60000000000L)), j$.desugar.sun.nio.fs.g.K(j3, 1000000000L)), j4);
            n(LocalTime.a0(j$.desugar.sun.nio.fs.g.I(J, 86400000000000L)), j$.time.q.a(0, 0, (int) j$.desugar.sun.nio.fs.g.A(J, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.d.a(j2, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.d.a(j4, aVar2);
        if (this.e == E.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            n(LocalTime.g, j$.time.q.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.d.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        n(LocalTime.Z(iA3, iA, aVar4.d.a(j3, aVar4), iA2), j$.time.q.d);
    }

    public final void k() {
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        HashMap map = this.a;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            E e = this.e;
            if (e == E.STRICT || (e == E.SMART && jLongValue != 0)) {
                aVar.H(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            p(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            E e2 = this.e;
            if (e2 == E.STRICT || (e2 == E.SMART && jLongValue2 != 0)) {
                aVar3.H(jLongValue2);
            }
            p(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.e == E.LENIENT) {
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.desugar.sun.nio.fs.g.J(j$.desugar.sun.nio.fs.g.K(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.H(jLongValue3);
                    aVar5.H(jLongValue3);
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.e != E.LENIENT) {
                aVar6.H(jLongValue5);
            }
            p(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            p(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            p(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            p(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.e != E.LENIENT) {
                aVar7.H(jLongValue6);
            }
            p(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            p(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.e != E.LENIENT) {
                aVar8.H(jLongValue7);
            }
            p(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            p(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.e != E.LENIENT) {
                aVar9.H(jLongValue8);
            }
            p(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            p(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            p(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.e != E.LENIENT) {
                aVar10.H(jLongValue9);
            }
            p(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            p(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            E e3 = this.e;
            E e4 = E.LENIENT;
            if (e3 != e4) {
                aVar11.H(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.e != e4) {
                    aVar12.H(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                p(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.e != e4) {
                    aVar13.H(jLongValue12);
                }
                p(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    j(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public final void n(LocalTime localTime, j$.time.q qVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 == null) {
            this.g = localTime;
            this.h = qVar;
        } else {
            if (!localTime2.equals(localTime)) {
                throw new j$.time.b(j$.time.e.a("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime)));
            }
            j$.time.q qVar2 = this.h;
            qVar2.getClass();
            j$.time.q qVar3 = j$.time.q.d;
            if (qVar2 != qVar3 && qVar != qVar3 && !this.h.equals(qVar)) {
                throw new j$.time.b(j$.time.e.a("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(qVar)));
            }
            this.h = qVar;
        }
    }

    public final void o(InterfaceC0048b interfaceC0048b) {
        InterfaceC0048b interfaceC0048b2 = this.f;
        if (interfaceC0048b2 != null) {
            if (interfaceC0048b != null && !interfaceC0048b2.equals(interfaceC0048b)) {
                throw new j$.time.b(j$.time.e.a("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(interfaceC0048b)));
            }
        } else if (interfaceC0048b != null) {
            if (!this.c.equals(interfaceC0048b.getChronology())) {
                throw new j$.time.b("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.c)));
            }
            this.f = interfaceC0048b;
        }
    }

    public final void p(j$.time.temporal.n nVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) this.a.put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.b("Conflict found: " + String.valueOf(aVar) + " " + l2 + " differs from " + String.valueOf(aVar) + " " + l + " while resolving  " + String.valueOf(nVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC0048b interfaceC0048b = this.f;
            if (interfaceC0048b != null) {
                sb.append(interfaceC0048b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
