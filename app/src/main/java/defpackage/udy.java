package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udy {
    public static final Method a;
    private static final Method b;
    private static final Method c;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method method3 = null;
        try {
            try {
                cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                try {
                    method2 = cls.getMethod("getInt", String.class, Integer.TYPE);
                } catch (Exception e) {
                    e = e;
                    method2 = null;
                } catch (Throwable th) {
                    th = th;
                    method2 = null;
                    b = method;
                    a = method2;
                    c = method3;
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                method = null;
                method2 = null;
            } catch (Throwable th2) {
                th = th2;
                method = null;
                method2 = null;
            }
            try {
                cls.getMethod("getLong", String.class, Long.TYPE);
                method3 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                b = method;
                a = method2;
                c = method3;
            }
            b = method;
            a = method2;
            c = method3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str, String str2) {
        Exception e;
        String str3;
        try {
            Object[] objArr = {str, str2};
            str3 = null;
            String str4 = (String) b.invoke(null, objArr);
            if (str2 == null) {
                try {
                    if ("".equals(str4)) {
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("SystemProperties", "get error", e);
                    return str3;
                }
            }
            return str4;
        } catch (Exception e3) {
            e = e3;
            str3 = str2;
        }
    }

    public static boolean b(String str) {
        try {
            Method method = c;
            if (method != null) {
                return ((Boolean) method.invoke(null, str, false)).booleanValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return false;
    }
}
