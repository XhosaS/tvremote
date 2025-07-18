package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter e;
    public final d a;
    public final Locale b;
    public final q c;
    public final j$.time.chrono.m d;

    static {
        m mVar = new m();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        s sVar = s.EXCEEDS_PAD;
        mVar.h(aVar, 4, 10, sVar);
        mVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        mVar.g(aVar2, 2);
        mVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        mVar.g(aVar3, 2);
        r rVar = r.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        DateTimeFormatter dateTimeFormatterK = mVar.k(rVar, tVar);
        ISO_LOCAL_DATE = dateTimeFormatterK;
        m mVar2 = new m();
        j jVar = j.INSENSITIVE;
        mVar2.b(jVar);
        mVar2.a(dateTimeFormatterK);
        i iVar = i.e;
        mVar2.b(iVar);
        mVar2.k(rVar, tVar);
        m mVar3 = new m();
        mVar3.b(jVar);
        mVar3.a(dateTimeFormatterK);
        mVar3.j();
        mVar3.b(iVar);
        mVar3.k(rVar, tVar);
        m mVar4 = new m();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        mVar4.g(aVar4, 2);
        mVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        mVar4.g(aVar5, 2);
        mVar4.j();
        mVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        mVar4.g(aVar6, 2);
        mVar4.j();
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
        f fVar = new f(aVar7, 0, 9, true, 0);
        Objects.a(aVar7, "field");
        j$.time.temporal.q qVar = aVar7.d;
        if (qVar.a != qVar.b || qVar.c != qVar.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(aVar7)));
        }
        mVar4.b(fVar);
        DateTimeFormatter dateTimeFormatterK2 = mVar4.k(rVar, null);
        m mVar5 = new m();
        mVar5.b(jVar);
        mVar5.a(dateTimeFormatterK2);
        mVar5.b(iVar);
        mVar5.k(rVar, null);
        m mVar6 = new m();
        mVar6.b(jVar);
        mVar6.a(dateTimeFormatterK2);
        mVar6.j();
        mVar6.b(iVar);
        mVar6.k(rVar, null);
        m mVar7 = new m();
        mVar7.b(jVar);
        mVar7.a(dateTimeFormatterK);
        mVar7.c('T');
        mVar7.a(dateTimeFormatterK2);
        DateTimeFormatter dateTimeFormatterK3 = mVar7.k(rVar, tVar);
        m mVar8 = new m();
        mVar8.b(jVar);
        mVar8.a(dateTimeFormatterK3);
        j jVar2 = j.LENIENT;
        mVar8.b(jVar2);
        mVar8.b(iVar);
        j jVar3 = j.STRICT;
        mVar8.b(jVar3);
        DateTimeFormatter dateTimeFormatterK4 = mVar8.k(rVar, tVar);
        m mVar9 = new m();
        mVar9.a(dateTimeFormatterK4);
        mVar9.j();
        mVar9.c('[');
        j jVar4 = j.SENSITIVE;
        mVar9.b(jVar4);
        mVar9.b(new g(1));
        mVar9.c(']');
        mVar9.k(rVar, tVar);
        m mVar10 = new m();
        mVar10.a(dateTimeFormatterK3);
        mVar10.j();
        mVar10.b(iVar);
        mVar10.j();
        mVar10.c('[');
        mVar10.b(jVar4);
        mVar10.b(new g(1));
        mVar10.c(']');
        mVar10.k(rVar, tVar);
        m mVar11 = new m();
        mVar11.b(jVar);
        mVar11.h(aVar, 4, 10, sVar);
        mVar11.c('-');
        mVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        mVar11.j();
        mVar11.b(iVar);
        mVar11.k(rVar, tVar);
        m mVar12 = new m();
        mVar12.b(jVar);
        mVar12.h(j$.time.temporal.h.c, 4, 10, sVar);
        mVar12.d("-W");
        mVar12.g(j$.time.temporal.h.b, 2);
        mVar12.c('-');
        j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_WEEK;
        mVar12.g(aVar8, 1);
        mVar12.j();
        mVar12.b(iVar);
        mVar12.k(rVar, tVar);
        m mVar13 = new m();
        mVar13.b(jVar);
        mVar13.b(new g(0));
        e = mVar13.k(rVar, null);
        m mVar14 = new m();
        mVar14.b(jVar);
        mVar14.g(aVar, 4);
        mVar14.g(aVar2, 2);
        mVar14.g(aVar3, 2);
        mVar14.j();
        mVar14.b(jVar2);
        mVar14.b(new i("+HHMMss", "Z"));
        mVar14.b(jVar3);
        mVar14.k(rVar, tVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        m mVar15 = new m();
        mVar15.b(jVar);
        mVar15.b(jVar2);
        mVar15.j();
        mVar15.e(aVar8, map);
        mVar15.d(", ");
        mVar15.i();
        mVar15.h(aVar3, 1, 2, s.NOT_NEGATIVE);
        mVar15.c(' ');
        mVar15.e(aVar2, map2);
        mVar15.c(' ');
        mVar15.g(aVar, 4);
        mVar15.c(' ');
        mVar15.g(aVar4, 2);
        mVar15.c(':');
        mVar15.g(aVar5, 2);
        mVar15.j();
        mVar15.c(':');
        mVar15.g(aVar6, 2);
        mVar15.i();
        mVar15.c(' ');
        mVar15.b(new i("+HHMM", "GMT"));
        mVar15.k(r.SMART, tVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, r rVar, j$.time.chrono.m mVar) {
        q qVar = q.a;
        this.a = dVar;
        Objects.a(locale, "locale");
        this.b = locale;
        this.c = qVar;
        Objects.a(rVar, "resolverStyle");
        this.d = mVar;
    }

    public final String a(j$.time.temporal.k kVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.i(new o(kVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.b(e2.getMessage(), e2);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
