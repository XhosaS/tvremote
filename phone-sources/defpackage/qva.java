package defpackage;

import android.util.Log;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimaps;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qva {
    public final String a;
    public final ofi b;
    public final String c;
    public final String d;
    public final String e;

    public qva() {
        throw null;
    }

    public static qva a(String str, ofi ofiVar) {
        int i;
        String str2;
        String strSubstring;
        String strSubstring2;
        uee ueeVar;
        ueg uegVar;
        ofh ofhVar = ofiVar.i;
        if (ofhVar == null) {
            ofhVar = ofh.a;
        }
        int iAX = a.aX(ofhVar.b);
        if (iAX == 0 || iAX != 3) {
            Log.e("OneGoogle", "Target type of Critical alert data is not of type Octarine.");
            return null;
        }
        String str3 = ofhVar.c;
        Charset charset = uef.a;
        str3.getClass();
        charset.getClass();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str3.length() && ":/\\?#".indexOf(str3.charAt(i3)) < 0) {
            i3++;
        }
        boolean z = true;
        if (i3 <= 0 || !str3.startsWith(":", i3)) {
            i = 0;
            str2 = null;
        } else {
            String strSubstring3 = str3.substring(0, i3);
            i = i3 + 1;
            str2 = strSubstring3;
        }
        if (str3.startsWith("//", i)) {
            int i4 = i + 2;
            int i5 = i4;
            while (i5 < str3.length() && "/\\?#".indexOf(str3.charAt(i5)) < 0) {
                i5++;
            }
            strSubstring = str3.substring(i4, i5);
            i = i5;
        } else {
            strSubstring = null;
        }
        int i6 = i;
        while (i6 < str3.length() && "?#".indexOf(str3.charAt(i6)) < 0) {
            i6++;
        }
        String strSubstring4 = i6 > i ? str3.substring(i, i6) : null;
        if (str3.startsWith("?", i6)) {
            int i7 = i6 + 1;
            while (i6 < str3.length() && str3.charAt(i6) != '#') {
                i6++;
            }
            strSubstring2 = str3.substring(i7, i6);
        } else {
            strSubstring2 = null;
        }
        String strSubstring5 = str3.startsWith("#", i6) ? str3.substring(i6 + 1) : null;
        if ((str2 == null || str2.equals(uee.a(str2))) && charset.equals(charset)) {
            String str4 = strSubstring5;
            ueeVar = new uee(str2, strSubstring, strSubstring4, strSubstring2, str4, charset, str3);
        } else {
            String str5 = strSubstring5;
            ueeVar = new uee(str2, strSubstring, strSubstring4, strSubstring2, str5, charset);
        }
        if (ueeVar.c == null) {
            String str6 = ueeVar.a;
            if (str6 == null) {
                uegVar = ueg.a;
            } else {
                Charset charset2 = ueeVar.b;
                ueg uegVar2 = ueg.a;
                charset2.getClass();
                ueg uegVar3 = new ueg(LinkedListMultimap.create());
                if (!str6.isEmpty()) {
                    String strName = charset2.name();
                    int length = strName.length();
                    if ((length < 9 || !strName.regionMatches(true, length - 9, "SHIFT_JIS", 0, 9)) && (length < 11 || !strName.regionMatches(true, length - 11, "WINDOWS-31J", 0, 11))) {
                        z = false;
                    }
                    while (i2 <= str6.length()) {
                        int iIndexOf = str6.indexOf(38, i2);
                        if (iIndexOf == -1) {
                            iIndexOf = str6.length();
                        }
                        int iIndexOf2 = str6.indexOf(61, i2);
                        if (iIndexOf2 > iIndexOf) {
                            iIndexOf2 = -1;
                        }
                        uegVar3.put(ueg.a(str6, i2, iIndexOf2 == -1 ? iIndexOf : iIndexOf2, charset2, z), iIndexOf2 == -1 ? "" : ueg.a(str6, iIndexOf2 + 1, iIndexOf, charset2, z));
                        i2 = iIndexOf + 1;
                    }
                }
                uegVar = new ueg(Multimaps.unmodifiableListMultimap(uegVar3.b));
            }
            ueeVar.c = uegVar;
        }
        ueg uegVar4 = ueeVar.c;
        String strB = b(uegVar4, "rfn");
        String strB2 = b(uegVar4, "rfnc");
        String strB3 = b(uegVar4, "eid");
        if (strB != null && strB2 != null && strB3 != null) {
            return new qva(str, ofiVar, strB, strB2, strB3);
        }
        Log.e("OneGoogle", "Critical alert URL data is not valid.");
        return null;
    }

    private static String b(ueg uegVar, String str) {
        List list = uegVar.get((ueg) str);
        if (list.size() != 1) {
            return null;
        }
        return (String) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qva) {
            qva qvaVar = (qva) obj;
            if (this.a.equals(qvaVar.a) && this.b.equals(qvaVar.b) && this.c.equals(qvaVar.c) && this.d.equals(qvaVar.d) && this.e.equals(qvaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        ofi ofiVar = this.b;
        if (ofiVar.A()) {
            iJ = ofiVar.j();
        } else {
            int iJ2 = ofiVar.M;
            if (iJ2 == 0) {
                iJ2 = ofiVar.j();
                ofiVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (((((((iHashCode * 1000003) ^ iJ) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ValidCriticalAlertData{accountId=" + this.a + ", criticalAlertData=" + this.b.toString() + ", rfn=" + this.c + ", rfnc=" + this.d + ", securityEventId=" + this.e + "}";
    }

    public qva(String str, ofi ofiVar, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null accountId");
        }
        this.a = str;
        if (ofiVar == null) {
            throw new NullPointerException("Null criticalAlertData");
        }
        this.b = ofiVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
