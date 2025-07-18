package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcc {
    public static Locale a;

    static {
        Locale locale;
        new HashMap();
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i == availableLocales.length) {
                    locale = Locale.getDefault();
                    break;
                } else {
                    if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                        locale = availableLocales[i];
                        break;
                    }
                    i++;
                }
            }
        } else {
            locale = Locale.getDefault();
        }
        a = locale;
    }
}
