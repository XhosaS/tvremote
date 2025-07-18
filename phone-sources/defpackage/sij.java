package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sij {
    public static volatile sij a;

    public static void A(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(m(str, obj, obj2));
        }
    }

    public static void B(int i, int i2) {
        String strM;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM = m("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.cf(i2, "negative size: "));
                }
                strM = m("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void C(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ag(i, i2, "index"));
        }
    }

    public static String D(String str) {
        if (F(str)) {
            return null;
        }
        return str;
    }

    public static String E(String str) {
        return str == null ? "" : str;
    }

    public static boolean F(String str) {
        return str == null || str.isEmpty();
    }

    public static tss G(Class cls) {
        return new tss(cls.getSimpleName());
    }

    public static tss H(Object obj) {
        return new tss(obj.getClass().getSimpleName());
    }

    public static Object I(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static String J(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (N(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (N(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String K(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (M(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (M(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean L(CharSequence charSequence, CharSequence charSequence2) {
        int iAh;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iAh = ah(cCharAt)) >= 26 || iAh != ah(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean N(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static int O(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 8) {
            return i != 9 ? 0 : 3;
        }
        return 2;
    }

    public static int P(int i) {
        if (i == 0) {
            return 7;
        }
        if (i == 11) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    public static int Q(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    public static int R(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 8) {
            return 9;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }

    public static int S(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static final /* synthetic */ uws T(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (uws) vucVarO;
    }

    public static final void U(uvt uvtVar, vtw vtwVar) {
        uvtVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uws uwsVar = (uws) vtwVar.b;
        uws uwsVar2 = uws.a;
        uwsVar.d = uvtVar.a();
        uwsVar.b |= 8;
    }

    public static final void V(uvu uvuVar, vtw vtwVar) {
        uvuVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uws uwsVar = (uws) vtwVar.b;
        uws uwsVar2 = uws.a;
        uwsVar.c = uvuVar.a();
        uwsVar.b |= 4;
    }

    public static final /* synthetic */ upq W(vtw vtwVar) {
        vtwVar.getClass();
        return new upq(vtwVar, (byte[]) null);
    }

    public static final /* synthetic */ upq X(vtw vtwVar) {
        vtwVar.getClass();
        return new upq(vtwVar, (byte[]) null);
    }

    public static final /* synthetic */ uwd Y(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (uwd) vucVarO;
    }

    public static boolean Z(int i) {
        return i <= 126 ? i >= 32 || i == 10 || i == 13 || i == 9 || i == 12 : i < 55296 ? i >= 160 : i < 64976 ? i > 57343 : i > 65007 && (i & 65534) != 65534 && i <= 1114111;
    }

    public static tst a(String str) {
        String[] strArrSplit = str.split(" ", -1);
        return strArrSplit.length > 1 ? tst.i(strArrSplit[1]) : trk.a;
    }

    public static String aa(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static String ab(int i) {
        return a.cd(i, "x-goog-ext-", "-bin");
    }

    public static xsj ac(vvd vvdVar) {
        String strAb = ab(vvdVar.a());
        xsg xsgVar = xsm.b;
        int i = xsj.c;
        return new xsf(strAb, xsgVar);
    }

    public static xqc ad(yfo yfoVar) {
        return new utk(new lii(yfoVar, 19), vvj.class, vvj.class);
    }

    public static void ae(xsq xsqVar, Class cls, boolean z) throws xtl {
        Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((yep) (z ? xsqVar.d : xsqVar.e)).a.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        String str = true != z ? "response" : "request";
        String str2 = xsqVar.b;
        throw new xtl(xtk.j.e("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()));
    }

    public static final uqq af(urx urxVar) {
        x(true, "Must provide ResourcePool");
        return new urs(urxVar);
    }

    private static String ag(int i, int i2, String str) {
        if (i < 0) {
            return m("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.cf(i2, "negative size: "));
    }

    private static int ah(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static String b(String str, String str2) {
        return a.cq(str, str2, " ");
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static final File d(Uri uri) throws skb {
        if (!uri.getScheme().equals("file")) {
            throw new skb("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new skb("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new skb("Did not expect uri to have authority");
    }

    public static String e(String str, String str2) {
        return new tsp("").c("com.google.android.libraries.social.peoplekit#", str, ".client_id:", str2);
    }

    public static void f(Context context) {
        rxa.f(context);
        rwv.c(context);
    }

    public static int g(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 14:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return 166;
            case 18:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return 138;
            case 24:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return 141;
            case 27:
                return 512;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 577;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 516;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 132;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case 162:
                return 136;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return 906;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return 153;
            case 100:
                return 933;
            case 109:
                return 629;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return 844;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return 165;
            case 133:
                return 135;
            case 173:
                return 991;
            default:
                return 593;
        }
    }

    public static String h(Context context, String str, long j, int i) throws Resources.NotFoundException, IOException {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(com.google.android.videos.R.id.dummy_placeholder)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new ttt();
        }
    }

    public static void j(boolean z, String str, Object obj) {
        if (!z) {
            throw new ttt(m(str, obj));
        }
    }

    public static void k(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new ttt(m("expected a non-null reference", objArr));
        }
    }

    public static ttm l(ttm ttmVar) {
        return ((ttmVar instanceof tto) || (ttmVar instanceof ttn)) ? ttmVar : ttmVar instanceof Serializable ? new ttn(ttmVar) : new tto(ttmVar);
    }

    public static String m(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static tsv n(tsv tsvVar, tsv tsvVar2) {
        tsvVar.getClass();
        tsvVar2.getClass();
        return new tsw(Arrays.asList(tsvVar, tsvVar2));
    }

    public static void o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void p(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(m(str, Character.valueOf(c)));
        }
    }

    public static void q(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m(str, Integer.valueOf(i)));
        }
    }

    public static void r(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(m(str, Long.valueOf(j)));
        }
    }

    public static void s(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m(str, obj));
        }
    }

    public static void t(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(m(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void u(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(m(str, obj, Integer.valueOf(i)));
        }
    }

    public static void v(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m(str, obj, obj2));
        }
    }

    public static void w(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? ag(i, i3, "start index") : (i2 < 0 || i2 > i3) ? ag(i2, i3, "end index") : m("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void x(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void y(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(m(str, Integer.valueOf(i)));
        }
    }

    public static void z(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m(str, obj));
        }
    }
}
