package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocx {
    public static final Method a;
    public static final Method b;
    private static Boolean c;

    static {
        Method method;
        Method method2;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (ocv.g()) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (ocv.g()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (ocv.g()) {
            try {
                WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        c = null;
    }

    public static synchronized boolean a(Context context) {
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = czi.b(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        c = boolValueOf;
        boolValueOf.getClass();
        return z;
    }
}
