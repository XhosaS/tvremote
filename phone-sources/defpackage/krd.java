package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krd {
    public static HandlerThread a = null;
    public static Handler b = null;
    public static kre c = null;
    public static boolean d = true;

    private krd() {
    }

    public static String a(String str, Throwable th) {
        StackTraceElement stackTraceElement;
        String name = krd.class.getName();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!z) {
                if (!name.equals(className)) {
                    z = false;
                }
                i++;
            } else if (!name.equals(className)) {
                break;
            }
            z = true;
            i++;
        }
        krc krcVar = new krc(stackTraceElement, new Date(), str, th);
        Handler handler = b;
        if (handler != null) {
            handler.post(new jlr(krcVar, 15));
        }
        return krcVar.a(false);
    }

    public static void b(String str) {
        a(str, null);
    }

    public static void c(String str) {
        Log.e("PlayMovies", a(str, null), null);
    }

    public static void d(String str, Throwable th) {
        Log.e("PlayMovies", a(str, th), th);
    }

    public static void e(String str) {
        a(str, null);
    }

    public static void f(String str) {
        Log.w("PlayMovies", a(str, null), null);
    }

    public static void g(String str, Throwable th) {
        Log.w("PlayMovies", a(str, th), th);
    }
}
