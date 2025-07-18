package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btt {
    public static final btt a = new btt();
    public static long b;
    public static Method c;
    public static Method d;
    private static Method e;
    private static Method f;

    private btt() {
    }

    public static final void b(String str) {
        str.getClass();
        Trace.beginSection(a.a(str));
    }

    public static final void d(String str, int i) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(a.a(str), i);
            return;
        }
        btt bttVar = a;
        String strA = bttVar.a(str);
        try {
            if (f == null) {
                f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = f;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(b), strA, Integer.valueOf(i));
        } catch (Exception e2) {
            bttVar.c("traceCounter", e2);
        }
    }

    public static final boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        btt bttVar = a;
        try {
            if (e == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = e;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(b));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            bttVar.c("isTagEnabled", e2);
            return false;
        }
    }

    public final String a(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 127);
        strSubstring.getClass();
        return strSubstring;
    }

    public final void c(String str, Exception exc) throws Throwable {
        if (!(exc instanceof InvocationTargetException)) {
            Log.v("Trace", a.e(str, "Unable to call ", " via reflection"), exc);
            return;
        }
        Throwable cause = exc.getCause();
        if (!(cause instanceof RuntimeException)) {
            throw new RuntimeException(cause);
        }
        throw cause;
    }
}
