package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oi {
    public static final oi a = b(new Locale[0]);
    private final oj b;

    private oi(oj ojVar) {
        this.b = ojVar;
    }

    public static oi b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static oi c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = oh.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return b(localeArr);
    }

    public static oi d(LocaleList localeList) {
        return new oi(new oj(localeList));
    }

    public final int a() {
        return this.b.a.size();
    }

    public final String e() {
        return this.b.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oi) && this.b.equals(((oi) obj).b);
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
