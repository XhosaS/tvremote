package defpackage;

import android.util.Pair;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksi {
    private static Calendar a;
    private static Pair b;
    private static Pair c;

    public static synchronized int a(long j) {
        Calendar calendarH;
        calendarH = h();
        calendarH.setTimeInMillis(j * 1000);
        return calendarH.get(1);
    }

    public static int b(int i) {
        return ((i / 60) / 60) / 24;
    }

    public static int c(int i) {
        return (i / 60) / 60;
    }

    public static String d(int i, boolean z) {
        int iMax = Math.max(i, 0) / 1000;
        StringBuilder sb = new StringBuilder(8);
        int i2 = iMax / 3600;
        if (i2 > 0 || z) {
            sb.append(i2);
            sb.append(':');
        }
        int i3 = (iMax / 60) % 60;
        if (i3 < 10) {
            sb.append('0');
        }
        int i4 = iMax % 60;
        sb.append(i3);
        sb.append(':');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        return sb.toString();
    }

    public static synchronized String e(long j) {
        if (j == 0) {
            return "";
        }
        Locale locale = Locale.getDefault();
        Pair pair = c;
        if (pair == null || !ksk.m(pair.first, locale)) {
            DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
            dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            c = Pair.create(locale, dateInstance);
        }
        return ((DateFormat) c.second).format(new Date(j * 1000));
    }

    public static synchronized String f(int i) {
        Calendar calendarH;
        Locale locale = Locale.getDefault();
        Pair pair = b;
        if (pair == null || !ksk.m(pair.first, locale)) {
            b = Pair.create(locale, new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "y"), locale));
        }
        calendarH = h();
        calendarH.set(i, 1, 1);
        return ((SimpleDateFormat) b.second).format(calendarH.getTime());
    }

    public static String g(String str) {
        return str.substring(0, 4);
    }

    private static Calendar h() {
        if (a == null) {
            a = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        }
        return a;
    }
}
