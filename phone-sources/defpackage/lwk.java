package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwk {
    public final ieg a;
    public final String b;
    public final String c;
    public final Locale d;
    public final int e;
    public final String f;
    public final int g;

    public lwk(ieg iegVar, String str, String str2, Locale locale, int i, String str3, int i2) {
        this.g = i2;
        this.a = iegVar;
        krf.c(str);
        this.b = str;
        krf.c(str2);
        this.c = str2;
        this.d = locale;
        this.e = i;
        this.f = str3;
    }

    public static lwk a(ieg iegVar, String str, String str2, int i) {
        return new lwk(iegVar, str, str2, Locale.getDefault(), 145, null, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lwk lwkVar = (lwk) obj;
            if (this.e != lwkVar.e || this.g != lwkVar.g || !this.a.equals(lwkVar.a) || !this.b.equals(lwkVar.b) || !this.c.equals(lwkVar.c)) {
                return false;
            }
            Locale locale = this.d;
            if (locale == null ? lwkVar.d != null : !locale.equals(lwkVar.d)) {
                return false;
            }
            String str = this.f;
            return str == null ? lwkVar.f == null : str.equals(lwkVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Locale locale = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (locale != null ? locale.hashCode() : 0)) * 31) + this.e) * 31;
        String str = this.f;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.g;
    }

    public final String toString() {
        Locale locale = this.d;
        return "KnowledgeRequest{account='" + String.valueOf(this.a) + "', videoId='" + this.b + "', userCountry='" + this.c + "', locale=" + String.valueOf(locale) + ", videoItag=" + this.e + ", videoTimestamp='" + this.f + "', storage=" + this.g + "}";
    }
}
