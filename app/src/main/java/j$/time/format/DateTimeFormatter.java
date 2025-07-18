package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    public final C0061d a;
    public final Locale b;
    public final C c;
    public final E d;
    public final j$.time.chrono.m e;

    static {
        u uVar = new u();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        F f2 = F.EXCEEDS_PAD;
        uVar.m(aVar, 4, 10, f2);
        uVar.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        uVar.l(aVar2, 2);
        uVar.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        uVar.l(aVar3, 2);
        E e = E.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        DateTimeFormatter dateTimeFormatterP = uVar.p(e, tVar);
        ISO_LOCAL_DATE = dateTimeFormatterP;
        u uVar2 = new u();
        p pVar = p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(dateTimeFormatterP);
        j jVar = j.e;
        uVar2.c(jVar);
        uVar2.p(e, tVar);
        u uVar3 = new u();
        uVar3.c(pVar);
        uVar3.a(dateTimeFormatterP);
        uVar3.o();
        uVar3.c(jVar);
        uVar3.p(e, tVar);
        u uVar4 = new u();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        uVar4.l(aVar4, 2);
        uVar4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar4.l(aVar5, 2);
        uVar4.o();
        uVar4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar4.l(aVar6, 2);
        uVar4.o();
        uVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterP2 = uVar4.p(e, null);
        u uVar5 = new u();
        uVar5.c(pVar);
        uVar5.a(dateTimeFormatterP2);
        uVar5.c(jVar);
        uVar5.p(e, null);
        u uVar6 = new u();
        uVar6.c(pVar);
        uVar6.a(dateTimeFormatterP2);
        uVar6.o();
        uVar6.c(jVar);
        uVar6.p(e, null);
        u uVar7 = new u();
        uVar7.c(pVar);
        uVar7.a(dateTimeFormatterP);
        uVar7.d('T');
        uVar7.a(dateTimeFormatterP2);
        DateTimeFormatter dateTimeFormatterP3 = uVar7.p(e, tVar);
        u uVar8 = new u();
        uVar8.c(pVar);
        uVar8.a(dateTimeFormatterP3);
        p pVar2 = p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        p pVar3 = p.STRICT;
        uVar8.c(pVar3);
        DateTimeFormatter dateTimeFormatterP4 = uVar8.p(e, tVar);
        u uVar9 = new u();
        uVar9.a(dateTimeFormatterP4);
        uVar9.o();
        uVar9.d('[');
        p pVar4 = p.SENSITIVE;
        uVar9.c(pVar4);
        j$.desugar.sun.nio.fs.n nVar = u.h;
        uVar9.c(new s(nVar, "ZoneRegionId()"));
        uVar9.d(']');
        uVar9.p(e, tVar);
        u uVar10 = new u();
        uVar10.a(dateTimeFormatterP3);
        uVar10.o();
        uVar10.c(jVar);
        uVar10.o();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new s(nVar, "ZoneRegionId()"));
        uVar10.d(']');
        uVar10.p(e, tVar);
        u uVar11 = new u();
        uVar11.c(pVar);
        uVar11.m(aVar, 4, 10, f2);
        uVar11.d('-');
        uVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        uVar11.o();
        uVar11.c(jVar);
        uVar11.p(e, tVar);
        u uVar12 = new u();
        uVar12.c(pVar);
        uVar12.m(j$.time.temporal.h.c, 4, 10, f2);
        uVar12.e("-W");
        uVar12.l(j$.time.temporal.h.b, 2);
        uVar12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        uVar12.l(aVar7, 1);
        uVar12.o();
        uVar12.c(jVar);
        uVar12.p(e, tVar);
        u uVar13 = new u();
        uVar13.c(pVar);
        uVar13.c(new C0064g());
        f = uVar13.p(e, null);
        u uVar14 = new u();
        uVar14.c(pVar);
        uVar14.l(aVar, 4);
        uVar14.l(aVar2, 2);
        uVar14.l(aVar3, 2);
        uVar14.o();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.p(e, tVar);
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
        u uVar15 = new u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.o();
        uVar15.h(aVar7, map);
        uVar15.e(", ");
        uVar15.n();
        uVar15.m(aVar3, 1, 2, F.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.h(aVar2, map2);
        uVar15.d(' ');
        uVar15.l(aVar, 4);
        uVar15.d(' ');
        uVar15.l(aVar4, 2);
        uVar15.d(':');
        uVar15.l(aVar5, 2);
        uVar15.o();
        uVar15.d(':');
        uVar15.l(aVar6, 2);
        uVar15.n();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.p(E.SMART, tVar);
    }

    public DateTimeFormatter(C0061d c0061d, Locale locale, E e, j$.time.chrono.m mVar) {
        C c = C.a;
        this.a = c0061d;
        Objects.a(locale, "locale");
        this.b = locale;
        this.c = c;
        Objects.a(e, "resolverStyle");
        this.d = e;
        this.e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0472 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.ofPattern(java.lang.String):j$.time.format.DateTimeFormatter");
    }

    public final String a(j$.time.temporal.k kVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.i(new y(kVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.format.D b(java.lang.CharSequence r28) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.b(java.lang.CharSequence):j$.time.format.D");
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
