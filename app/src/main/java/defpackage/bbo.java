package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbo {
    public static Calendar a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }
}
