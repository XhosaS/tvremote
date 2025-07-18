package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjj {
    private static final Method a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            a = method;
        }
    }

    public static String a(String str, String str2) {
        Exception e;
        String str3;
        try {
            Object[] objArr = {str, str2};
            str3 = null;
            String str4 = (String) a.invoke(null, objArr);
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
}
