package defpackage;

import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eci {
    private eci() {
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalStateException((String) obj2);
        }
    }

    public static void g(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            h(spannable, obj2, i, i2);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static void h(Spannable spannable, Object obj, int i, int i2) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }

    public static String i(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String j(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static boolean k(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return k(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean m(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return m(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static Uri o(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri p(String str, String str2) {
        return Uri.parse(q(str, str2));
    }

    public static String q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrR = r(str2);
        if (iArrR[0] != -1) {
            sb.append(str2);
            s(sb, iArrR[1], iArrR[2]);
            return sb.toString();
        }
        if (str == null) {
            str = "";
        }
        int[] iArrR2 = r(str);
        if (iArrR[3] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrR[2] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrR[1] != 0) {
            int i = iArrR2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return s(sb, iArrR[1] + i, i + iArrR[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, iArrR2[1]);
            sb.append(str2);
            int i2 = iArrR2[1];
            return s(sb, i2, iArrR[2] + i2);
        }
        int i3 = iArrR2[0] + 2;
        int i4 = iArrR2[1];
        if (i3 >= i4 || i4 != iArrR2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrR2[2] - 1);
            int i5 = iLastIndexOf == -1 ? iArrR2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return s(sb, iArrR2[1], i5 + iArrR[2]);
        }
        sb.append((CharSequence) str, 0, i4);
        sb.append('/');
        sb.append(str2);
        int i6 = iArrR2[1];
        return s(sb, i6, iArrR[2] + i6 + 1);
    }

    public static int[] r(String str) {
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1 || iIndexOf2 > length) {
            iIndexOf2 = length;
        }
        int iIndexOf3 = str.indexOf(47);
        if (iIndexOf3 == -1 || iIndexOf3 > iIndexOf2) {
            iIndexOf3 = iIndexOf2;
        }
        int iIndexOf4 = str.indexOf(58);
        if (iIndexOf4 > iIndexOf3) {
            iIndexOf4 = -1;
        }
        int i = iIndexOf4 + 2;
        int iIndexOf5 = iIndexOf4 + 1;
        if (i < iIndexOf2 && str.charAt(iIndexOf5) == '/' && str.charAt(i) == '/' && ((iIndexOf5 = str.indexOf(47, iIndexOf4 + 3)) == -1 || iIndexOf5 > iIndexOf2)) {
            iIndexOf5 = iIndexOf2;
        }
        iArr[0] = iIndexOf4;
        iArr[1] = iIndexOf5;
        iArr[2] = iIndexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static String s(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int iLastIndexOf = i5;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else {
                    i3 = i5 + 1;
                    if (sb.charAt(i5) != '/') {
                        i5 = i3;
                    }
                }
                int i6 = iLastIndexOf + 1;
                if (i5 == i6 && sb.charAt(iLastIndexOf) == '.') {
                    sb.delete(iLastIndexOf, i3);
                    i4 = i3 - iLastIndexOf;
                } else if (i5 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", iLastIndexOf - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i4 = i3 - i7;
                } else {
                    iLastIndexOf = i5 + 1;
                    i5 = iLastIndexOf;
                }
                i2 -= i4;
                i5 = iLastIndexOf;
            }
        }
        return sb.toString();
    }
}
