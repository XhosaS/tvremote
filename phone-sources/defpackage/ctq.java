package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ctq {
    public static final /* synthetic */ int a = 0;
    private static long b;
    private static Method c;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
