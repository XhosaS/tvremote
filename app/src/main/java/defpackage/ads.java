package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ads {
    public static final ads a = b(new LocaleList(new Locale[0]));
    public final adt b;

    private ads(adt adtVar) {
        this.b = adtVar;
    }

    public static ads a(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = adr.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return b(new LocaleList(localeArr));
    }

    public static ads b(LocaleList localeList) {
        return new ads(new adt(localeList));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ads) && this.b.equals(((ads) obj).b);
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    public final String toString() {
        return this.b.a.toString();
    }
}
