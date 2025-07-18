package defpackage;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbn {
    public final Locale a;
    public final String[] b;

    public bbn(Locale locale) {
        this.a = locale;
        this.b = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i = minimum; i <= maximum; i++) {
            strArr[i - minimum] = String.format("%02d", Integer.valueOf(i));
        }
    }
}
