package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o {
    public static final b f = new b(0);
    public o a;
    public final o b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        map.put('Q', gVar);
        map.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.a);
    }

    public o() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(a aVar) {
        f fVar = aVar.a;
        if (fVar.b) {
            fVar = new f(fVar.a, false);
        }
        b(fVar);
    }

    public final int b(g gVar) {
        Objects.a(gVar, "pp");
        o oVar = this.a;
        oVar.getClass();
        oVar.c.add(gVar);
        this.a.e = -1;
        return r2.c.size() - 1;
    }

    public final void c(char c) {
        b(new e(c));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new e(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void e(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w wVar = w.FULL;
        b(new n(aVar, wVar, new c(new s(Collections.singletonMap(wVar, linkedHashMap)))));
    }

    public final void f(j jVar) {
        j jVarA;
        o oVar = this.a;
        int i = oVar.e;
        if (i < 0) {
            oVar.e = b(jVar);
            return;
        }
        j jVar2 = (j) oVar.c.get(i);
        int i2 = jVar.b;
        int i3 = jVar.c;
        if (i2 == i3 && jVar.d == v.NOT_NEGATIVE) {
            jVarA = jVar2.b(i3);
            b(jVar.a());
            this.a.e = i;
        } else {
            jVarA = jVar2.a();
            this.a.e = b(jVar);
        }
        this.a.c.set(i, jVarA);
    }

    public final void g(j$.time.temporal.p pVar, int i) {
        Objects.a(pVar, "field");
        if (i >= 1 && i <= 19) {
            f(new j(pVar, i, i, v.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    public final void h(j$.time.temporal.p pVar, int i, int i2, v vVar) {
        if (i == i2 && vVar == v.NOT_NEGATIVE) {
            g(pVar, i2);
            return;
        }
        Objects.a(pVar, "field");
        Objects.a(vVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            f(new j(pVar, i, i2, vVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public final void i() {
        o oVar = this.a;
        if (oVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (oVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        o oVar2 = this.a;
        f fVar = new f(oVar2.c, oVar2.d);
        this.a = this.a.b;
        b(fVar);
    }

    public final void j() {
        o oVar = this.a;
        oVar.e = -1;
        this.a = new o(oVar);
    }

    public final a k(u uVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), uVar, mVar);
    }

    public final a l(Locale locale, u uVar, j$.time.chrono.m mVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        f fVar = new f(this.c, false);
        t tVar = t.a;
        return new a(fVar, locale, uVar, mVar);
    }

    public o(o oVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = oVar;
        this.d = true;
    }
}
