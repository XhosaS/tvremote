package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class m {
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(1);
    public m a;
    public final m b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
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
        map.put('g', j$.time.temporal.j.a);
    }

    public m() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
    }

    public final int b(e eVar) {
        Objects.a(eVar, "pp");
        m mVar = this.a;
        mVar.getClass();
        mVar.c.add(eVar);
        this.a.e = -1;
        return r2.c.size() - 1;
    }

    public final void c(char c) {
        b(new c(c));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new k(str));
        }
    }

    public final void e(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        t tVar = t.FULL;
        b(new l(aVar, tVar, new a(new j$.desugar.sun.nio.fs.h(Collections.singletonMap(tVar, linkedHashMap)))));
    }

    public final void f(h hVar) {
        h hVarA;
        m mVar = this.a;
        int i = mVar.e;
        if (i < 0) {
            mVar.e = b(hVar);
            return;
        }
        h hVar2 = (h) mVar.c.get(i);
        int i2 = hVar.b;
        int i3 = hVar.c;
        if (i2 == i3 && hVar.d == s.NOT_NEGATIVE) {
            hVarA = hVar2.b(i3);
            b(hVar.a());
            this.a.e = i;
        } else {
            hVarA = hVar2.a();
            this.a.e = b(hVar);
        }
        this.a.c.set(i, hVarA);
    }

    public final void g(j$.time.temporal.n nVar, int i) {
        Objects.a(nVar, "field");
        if (i >= 1 && i <= 19) {
            f(new h(nVar, i, i, s.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    public final void h(j$.time.temporal.n nVar, int i, int i2, s sVar) {
        if (i == i2 && sVar == s.NOT_NEGATIVE) {
            g(nVar, i2);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(sVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            f(new h(nVar, i, i2, sVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public final void i() {
        m mVar = this.a;
        if (mVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (mVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        m mVar2 = this.a;
        d dVar = new d(mVar2.c, mVar2.d);
        this.a = this.a.b;
        b(dVar);
    }

    public final void j() {
        m mVar = this.a;
        mVar.e = -1;
        this.a = new m(mVar);
    }

    public final DateTimeFormatter k(r rVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), rVar, mVar);
    }

    public final DateTimeFormatter l(Locale locale, r rVar, j$.time.chrono.m mVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        d dVar = new d(this.c, false);
        q qVar = q.a;
        return new DateTimeFormatter(dVar, locale, rVar, mVar);
    }

    public m(m mVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = mVar;
        this.d = true;
    }
}
