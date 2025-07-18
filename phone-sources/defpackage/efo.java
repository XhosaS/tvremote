package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efo {
    private static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                edb.c("HttpUtil", a.cg(str, "Unexpected Content-Length [", "]"));
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j3 = (j2 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j3;
            }
            if (j == j3) {
                return j;
            }
            edb.e("HttpUtil", a.ci(str2, str, "Inconsistent headers [", "] [", "]"));
            return Math.max(j, j3);
        } catch (NumberFormatException unused2) {
            edb.c("HttpUtil", a.cg(str2, "Unexpected Content-Range [", "]"));
            return j;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String c(long j, long j2) {
        if (j == 0) {
            if (j2 == -1) {
                return null;
            }
            j = 0;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static void d(String str, Map map, CookieHandler cookieHandler) throws IOException {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e) {
            edb.f("HttpUtil", "Failed to store cookies in CookieHandler", e);
        }
    }
}
