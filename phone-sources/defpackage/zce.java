package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zce {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final String f;
    public final boolean g;
    private final String h;
    private final String i;
    private final String j;

    public zce(String str, String str2, String str3, String str4, int i, List list, String str5, String str6) {
        this.b = str;
        this.h = str2;
        this.i = str3;
        this.c = str4;
        this.d = i;
        this.e = list;
        this.j = str5;
        this.f = str6;
        this.g = yks.e(str, "https");
    }

    public final String a() {
        if (this.i.length() == 0) {
            return "";
        }
        String str = this.f;
        String strSubstring = str.substring(ylh.T(str, ':', this.b.length() + 3, 4) + 1, ylh.T(str, '@', 0, 6));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.f;
        int iT = ylh.T(str, '/', length + 3, 4);
        String strSubstring = str.substring(iT, zcr.b(str, "?#", iT, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String c() {
        if (this.e == null) {
            return null;
        }
        String str = this.f;
        int iT = ylh.T(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iT, zcr.a(str, '#', iT, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String d() {
        if (this.h.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.f;
        int length = str.length() + 3;
        String strSubstring = str2.substring(length, zcr.b(str2, ":@", length, str2.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public final String e() {
        zcd zcdVarH = h("/...");
        zcdVarH.getClass();
        zcdVarH.b = wbb.R("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        zcdVarH.c = wbb.R("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return zcdVarH.a().f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zce) && yks.e(((zce) obj).f, this.f);
    }

    public final URI f() {
        String strSubstring;
        zcd zcdVar = new zcd();
        String str = this.b;
        zcdVar.a = str;
        zcdVar.b = d();
        zcdVar.c = a();
        zcdVar.d = this.c;
        int i = this.d;
        if (i == wbb.N(str)) {
            i = -1;
        }
        zcdVar.e = i;
        List list = zcdVar.f;
        list.clear();
        list.addAll(g());
        zcdVar.b(c());
        if (this.j == null) {
            strSubstring = null;
        } else {
            String str2 = this.f;
            strSubstring = str2.substring(ylh.T(str2, '#', 0, 6) + 1);
            strSubstring.getClass();
        }
        zcdVar.h = strSubstring;
        String str3 = zcdVar.d;
        zcdVar.d = str3 != null ? new ynj("[\"<>^`{|}]").d(str3) : null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, wbb.R((String) list.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list2 = zcdVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) list2.get(i3);
                list2.set(i3, str4 != null ? wbb.R(str4, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str5 = zcdVar.h;
        zcdVar.h = str5 != null ? wbb.R(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = zcdVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new ynj("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").d(string));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final List g() {
        int length = this.b.length();
        String str = this.f;
        int iT = ylh.T(str, '/', length + 3, 4);
        int iB = zcr.b(str, "?#", iT, str.length());
        ArrayList arrayList = new ArrayList();
        while (iT < iB) {
            int i = iT + 1;
            int iA = zcr.a(str, '/', i, iB);
            String strSubstring = str.substring(i, iA);
            strSubstring.getClass();
            arrayList.add(strSubstring);
            iT = iA;
        }
        return arrayList;
    }

    public final zcd h(String str) {
        try {
            zcd zcdVar = new zcd();
            zcdVar.c(this, str);
            return zcdVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}
