package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class u {
    public static final j$.desugar.sun.nio.fs.n h = new j$.desugar.sun.nio.fs.n(2);
    public static final HashMap i;
    public u a;
    public final u b;
    public final ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
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

    public u() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        C0061d c0061d = dateTimeFormatter.a;
        if (c0061d.b) {
            c0061d = new C0061d(c0061d.a, false);
        }
        c(c0061d);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new C0063f(aVar, i2, i3, z));
        } else {
            j(new C0063f(aVar, i2, i3, z));
        }
    }

    public final int c(InterfaceC0062e interfaceC0062e) {
        Objects.a(interfaceC0062e, "pp");
        u uVar = this.a;
        int i2 = uVar.e;
        if (i2 > 0) {
            k kVar = new k(interfaceC0062e, i2, uVar.f);
            uVar.e = 0;
            uVar.f = (char) 0;
            interfaceC0062e = kVar;
        }
        uVar.c.add(interfaceC0062e);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    public final void d(char c) {
        c(new C0060c(c));
    }

    public final void e(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C0060c(str.charAt(0)));
        } else {
            c(new C0065h(1, str));
        }
    }

    public final void f(G g) {
        Objects.a(g, "style");
        if (g != G.FULL && g != G.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new C0065h(0, g));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void h(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        G g = G.FULL;
        c(new q(aVar, g, new C0058a(new A(Collections.singletonMap(g, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.n nVar, G g) {
        Objects.a(g, "textStyle");
        c(new q(nVar, g, B.c));
    }

    public final void j(i iVar) {
        i iVarD;
        u uVar = this.a;
        int i2 = uVar.g;
        if (i2 < 0) {
            uVar.g = c(iVar);
            return;
        }
        i iVar2 = (i) uVar.c.get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == F.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            iVarD = iVar2.d();
            this.a.g = c(iVar);
        }
        this.a.c.set(i2, iVarD);
    }

    public final void k(j$.time.temporal.n nVar) {
        j(new i(nVar, 1, 19, F.NORMAL));
    }

    public final void l(j$.time.temporal.n nVar, int i2) {
        Objects.a(nVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            j(new i(nVar, i2, i2, F.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void m(j$.time.temporal.n nVar, int i2, int i3, F f) {
        if (i2 == i3 && f == F.NOT_NEGATIVE) {
            l(nVar, i3);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(f, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            j(new i(nVar, i2, i3, f));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        u uVar = this.a;
        if (uVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (uVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        u uVar2 = this.a;
        C0061d c0061d = new C0061d(uVar2.c, uVar2.d);
        this.a = this.a.b;
        c(c0061d);
    }

    public final void o() {
        u uVar = this.a;
        uVar.g = -1;
        this.a = new u(uVar);
    }

    public final DateTimeFormatter p(E e, j$.time.chrono.m mVar) {
        return q(Locale.getDefault(), e, mVar);
    }

    public final DateTimeFormatter q(Locale locale, E e, j$.time.chrono.m mVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        C0061d c0061d = new C0061d(this.c, false);
        C c = C.a;
        return new DateTimeFormatter(c0061d, locale, e, mVar);
    }

    public u(u uVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = uVar;
        this.d = true;
    }
}
