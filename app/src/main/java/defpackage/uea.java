package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uea {
    private static final Object a = new Object();
    private static Thread b;
    private static volatile Handler c;

    public static Handler a() {
        if (c == null) {
            synchronized (a) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static void b() {
        if (d(Thread.currentThread())) {
            throw new udz("Must be called on a background thread");
        }
    }

    public static void c() {
        if (!d(Thread.currentThread())) {
            throw new udz("Must be called on the main thread");
        }
    }

    public static boolean d(Thread thread) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return thread == b;
    }
}
