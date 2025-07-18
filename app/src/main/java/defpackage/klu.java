package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class klu {
    public static final Method a;
    public static final Method b;
    private static final Method c;
    private static final Method d;
    private static Boolean e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        c = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        d = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        a = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e3) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        b = method4;
        e = null;
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = d;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = c;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = abs.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        e = boolValueOf;
        boolValueOf.getClass();
        return z;
    }
}
