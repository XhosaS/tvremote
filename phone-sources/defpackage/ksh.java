package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksh {
    public static final Pattern a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern b = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final uof c = uof.g(',').f().i();

    public static float a(String str, float f) {
        if (str != null) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    public static int b(String str, int i) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static ieg c(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? ieg.a : ieg.f(charSequence);
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static String e(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String f(String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int iOffsetByCodePoints = str.offsetByCodePoints(0, 1);
        return String.valueOf(str.substring(0, iOffsetByCodePoints).toUpperCase(locale)).concat(String.valueOf(str.substring(iOffsetByCodePoints)));
    }

    public static ArrayList g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            arrayList.add(Integer.valueOf(str2.trim()));
        }
        return arrayList;
    }
}
