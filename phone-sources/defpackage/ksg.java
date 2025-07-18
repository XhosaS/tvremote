package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksg {
    public static final Charset a = StandardCharsets.UTF_8;
    private static final Map b = new HashMap();

    public static int a(String str, String str2) {
        int length;
        int i = 0;
        String[] strArrSplit = str == null ? new String[0] : str.split("[-_]");
        String[] strArrSplit2 = str2 == null ? new String[0] : str2.split("[-_]");
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length || i >= strArrSplit2.length || !strArrSplit[i].equalsIgnoreCase(strArrSplit2[i])) {
                break;
            }
            i2++;
            i++;
        }
        return i2 == Math.max(length, strArrSplit2.length) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i2;
    }

    public static String b(Locale locale) {
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public static String c(String str) {
        Map map = b;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String strF = ksh.f(localeForLanguageTag.getDisplayName(localeForLanguageTag), localeForLanguageTag);
        map.put(str, strF);
        return strF;
    }

    public static String d(String str) {
        String str2 = str + "#" + Locale.getDefault().getLanguage();
        Map map = b;
        String str3 = (String) map.get(str2);
        if (str3 != null) {
            return str3;
        }
        Locale locale = Locale.getDefault();
        String strF = ksh.f(Locale.forLanguageTag(str).getDisplayName(locale), locale);
        map.put(str2, strF);
        return strF;
    }

    public static boolean e(Locale locale) {
        return locale.getISO3Country() != null;
    }
}
