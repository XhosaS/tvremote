package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qjc {
    public static final /* synthetic */ int a = 0;
    private static final String b = "qjc";

    public static InputStream a(String str) throws qja {
        yqw.A(str.startsWith("data:"));
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            Log.e(b, "Comma not found in data URI: ".concat(str));
            throw new qja(1);
        }
        String strSubstring = str.substring(iIndexOf + 1);
        String[] strArrSplit = str.substring(5, iIndexOf).split(";");
        boolean z = false;
        for (int i = 1; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            if (str2.equals("base64")) {
                z = true;
            } else if (!str2.startsWith("charset=")) {
                Log.e(b, a.s(str, str2, "Unknown data-URI option '", "' in "));
                throw new qja(2);
            }
        }
        if (!z) {
            Log.e(b, "We only understand base64-encoded data URIs: ".concat(str));
            throw new qja(3);
        }
        try {
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            Log.i(b, "Successfully decoded data uri: ".concat(str));
            return new ByteArrayInputStream(bArrDecode);
        } catch (IllegalArgumentException unused) {
            Log.e(b, "Invalid base64 payload in data URI: ".concat(str));
            throw new qja(4);
        }
    }
}
