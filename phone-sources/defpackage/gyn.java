package defpackage;

import android.webkit.MimeTypeMap;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyn implements gyi {
    private static final zbm a;
    private static final zbm b;
    private final String c;
    private final gzy d;
    private final yft e;
    private final yft f;

    static {
        zbl zblVar = new zbl();
        zblVar.b();
        zblVar.a = true;
        a = zblVar.a();
        zbl zblVar2 = new zbl();
        zblVar2.b();
        zblVar2.c();
        b = zblVar2.a();
    }

    public gyn(String str, gzy gzyVar, yft yftVar, yft yftVar2) {
        this.c = str;
        this.d = gzyVar;
        this.e = yftVar;
        this.f = yftVar2;
    }

    public static final String c(String str, zcg zcgVar) {
        String str2 = zcgVar != null ? zcgVar.c : null;
        if (str2 == null || ylh.ac(str2, WebViewActivity.URL_MIME_TYPE)) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            singleton.getClass();
            String strC = hat.c(singleton, str);
            if (strC != null) {
                return strC;
            }
        }
        if (str2 == null) {
            return null;
        }
        int iT = ylh.T(str2, ';', 0, 6);
        if (iT == -1) {
            return str2;
        }
        String strSubstring = str2.substring(0, iT);
        strSubstring.getClass();
        return strSubstring;
    }

    private final gxu d(zcn zcnVar) {
        return fki.al(zcnVar.c(), this.d.a);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    private final zcj e() {
        zxk zxkVar = new zxk();
        String strConcat = this.c;
        if (ylh.A(strConcat, "ws:", true)) {
            String strSubstring = strConcat.substring(3);
            strSubstring.getClass();
            strConcat = "http:".concat(strSubstring);
        } else if (ylh.A(strConcat, "wss:", true)) {
            String strSubstring2 = strConcat.substring(4);
            strSubstring2.getClass();
            strConcat = "https:".concat(strSubstring2);
        }
        char[] cArr = zce.a;
        zcd zcdVar = new zcd();
        zcdVar.c(null, strConcat);
        zxkVar.d = zcdVar.a();
        gzy gzyVar = this.d;
        zxkVar.c = gzyVar.i.f();
        for (Map.Entry entry : gzyVar.j.b.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                zxkVar.b.remove(cls);
            } else {
                if (zxkVar.b.isEmpty()) {
                    zxkVar.b = new LinkedHashMap();
                }
                ?? r5 = zxkVar.b;
                Object objCast = cls.cast(value);
                objCast.getClass();
                r5.put(cls, objCast);
            }
        }
        gzn gznVar = gzyVar.m;
        gzn gznVar2 = gzyVar.n;
        boolean z = gznVar.e;
        boolean z2 = gznVar2.e;
        if (!z2 && z) {
            zxkVar.b(zbm.b);
        } else if (!z2 || z) {
            if (!z2) {
                zxkVar.b(b);
            }
        } else if (gznVar.f) {
            zxkVar.b(zbm.a);
        } else {
            zxkVar.b(a);
        }
        return zxkVar.a();
    }

    private final zgr f() {
        Object objA = this.f.a();
        objA.getClass();
        return (zgr) ((zdg) objA).c;
    }

    private final gxu g(gyd gydVar) {
        return fki.am(gydVar.a.a(1), f(), this.c, gydVar);
    }

    private final gzg h(gyd gydVar) throws Throwable {
        Throwable th;
        gzg gzgVar;
        try {
            zhi zhiVar = new zhi(f().f(gydVar.a()));
            try {
                gzgVar = new gzg(zhiVar);
                try {
                    zhiVar.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    zhiVar.close();
                } catch (Throwable th4) {
                    ybn.h(th3, th4);
                }
                th = th3;
                gzgVar = null;
            }
            if (th == null) {
                return gzgVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private static final zcn i(zcl zclVar) {
        zcn zcnVar = zclVar.g;
        if (zcnVar != null) {
            return zcnVar;
        }
        throw new IllegalStateException("response body == null");
    }

    private static final int j(zcl zclVar) {
        return zclVar.h != null ? 4 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ba A[Catch: Exception -> 0x0433, TRY_ENTER, TryCatch #11 {Exception -> 0x0433, blocks: (B:207:0x03ba, B:209:0x03c8, B:211:0x03ce, B:213:0x03d7, B:215:0x03df, B:224:0x041b), top: B:258:0x03b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d7 A[Catch: Exception -> 0x0433, TryCatch #11 {Exception -> 0x0433, blocks: (B:207:0x03ba, B:209:0x03c8, B:211:0x03ce, B:213:0x03d7, B:215:0x03df, B:224:0x041b), top: B:258:0x03b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: Exception -> 0x0050, TRY_ENTER, TryCatch #1 {Exception -> 0x0050, blocks: (B:20:0x0049, B:81:0x01cf, B:33:0x0082, B:40:0x00ac, B:42:0x00b6, B:44:0x00d3, B:46:0x00df, B:68:0x014c, B:47:0x00ea, B:49:0x00f2, B:50:0x00f9, B:52:0x0101, B:53:0x010c, B:55:0x0114, B:56:0x0119, B:58:0x0121, B:60:0x0130, B:66:0x0146, B:71:0x017a, B:73:0x0182, B:75:0x0186, B:78:0x01b8, B:36:0x0094, B:38:0x009c, B:77:0x019d), top: B:240:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d A[Catch: Exception -> 0x0050, TryCatch #1 {Exception -> 0x0050, blocks: (B:20:0x0049, B:81:0x01cf, B:33:0x0082, B:40:0x00ac, B:42:0x00b6, B:44:0x00d3, B:46:0x00df, B:68:0x014c, B:47:0x00ea, B:49:0x00f2, B:50:0x00f9, B:52:0x0101, B:53:0x010c, B:55:0x0114, B:56:0x0119, B:58:0x0121, B:60:0x0130, B:66:0x0146, B:71:0x017a, B:73:0x0182, B:75:0x0186, B:78:0x01b8, B:36:0x0094, B:38:0x009c, B:77:0x019d), top: B:240:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyn.a(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.zcj r9, defpackage.yih r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyn.b(zcj, yih):java.lang.Object");
    }
}
