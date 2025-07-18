package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class all {
    public static final Object a;
    public static boolean b;
    private static Method c;

    static {
        int i = aev.b;
        a = new Object();
        c = null;
        b = false;
    }

    public static void a(Context context, String str) throws IllegalAccessException, afn, IllegalArgumentException, InvocationTargetException {
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new afn();
        }
    }
}
