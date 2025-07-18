package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rff {
    public static final /* synthetic */ int a = 0;
    private static final we b = new we();

    private rff() {
    }

    public static synchronized Uri a(String str) {
        we weVar = b;
        Uri uri = (Uri) weVar.get(str);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
        weVar.put(str, uri2);
        return uri2;
    }

    public static String b(String str) {
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            return str.substring(0, iIndexOf);
        }
        if (str.contains("@")) {
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
        }
        return str;
    }

    public static String c(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
