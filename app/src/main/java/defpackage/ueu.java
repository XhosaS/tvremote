package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueu {
    public static final /* synthetic */ int a = 0;
    private static final yrl b = yrl.c(".");

    public static void a(Uri uri) throws ufu {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (b.g(str).size() == 1) {
                return;
            }
            if (str.endsWith(".lease") && !TextUtils.equals(str, ".lease")) {
                return;
            }
        }
        throw new ufu(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", uri.getPath()));
    }

    public static void b(Uri uri) throws ufu {
        if (TextUtils.isEmpty(uri.getQuery())) {
            return;
        }
        if (uri.getQueryParameterNames().size() != 1 || uri.getQueryParameter("expiryDateSecs") == null) {
            throw new ufu(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", uri.getQuery()));
        }
    }

    static boolean c(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    static byte[] d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return zkl.f.f().j((CharSequence) b.g(str).get(0));
    }
}
