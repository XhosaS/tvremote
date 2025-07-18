package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxp {
    private static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new zxo(str, 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new zxo(str, 2)) : str2;
    }

    public static boolean b(String str) {
        try {
            String strA = a(str);
            if (strA == null || strA.length() != 4) {
                return false;
            }
            if (strA.charAt(0) != 't' && strA.charAt(0) != 'T') {
                return false;
            }
            if (strA.charAt(1) != 'r' && strA.charAt(1) != 'R') {
                return false;
            }
            if (strA.charAt(2) != 'u' && strA.charAt(2) != 'U') {
                return false;
            }
            if (strA.charAt(3) != 'e') {
                if (strA.charAt(3) != 'E') {
                    return false;
                }
            }
            return true;
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
