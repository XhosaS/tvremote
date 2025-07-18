package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctn {
    public static final ctn a = b(new Locale[0]);
    private final cto b;

    private ctn(cto ctoVar) {
        this.b = ctoVar;
    }

    public static ctn b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static ctn c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = ctm.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return b(localeArr);
    }

    public static ctn d(LocaleList localeList) {
        return new ctn(new cto(localeList));
    }

    public final int a() {
        return this.b.a.size();
    }

    public final String e() {
        return this.b.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ctn) && this.b.equals(((ctn) obj).b);
    }

    public final Locale f(int i) {
        return this.b.a.get(i);
    }

    public final boolean g() {
        return this.b.a.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
