package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qdx {
    public static Uri a(Context context, yqt yqtVar) {
        int i = uem.b;
        uel uelVar = new uel(context);
        String str = (yqtVar == null || !yqtVar.g()) ? "datadownload" : (String) yqtVar.c();
        uem.b(str);
        uelVar.c = str;
        if (yqtVar != null && yqtVar.g()) {
            uelVar.b("datadownload");
        }
        return uelVar.a();
    }

    public static Uri b(Context context, yqt yqtVar) {
        return a(context, yqtVar).buildUpon().appendPath("links").build();
    }

    public static Uri c(Context context, String str) {
        int i = ueu.a;
        return uet.a(str, context.getPackageName(), 0L);
    }

    public static String d(String str, yqt yqtVar) {
        if (yqtVar != null && yqtVar.g()) {
            str = str.concat((String) yqtVar.c());
        }
        return str.concat(".pb");
    }

    public static Uri e(Context context, int i, String str, String str2, pkn pknVar, yqt yqtVar, boolean z) {
        try {
            return z ? c(context, str2) : a(context, yqtVar).buildUpon().appendPath(f(i)).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            qce.g(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            pknVar.a();
            return null;
        }
    }

    public static String f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }
}
