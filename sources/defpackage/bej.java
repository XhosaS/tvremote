package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bej {
    private static final Object a = new Object();
    private static Thread b;
    private static volatile Handler c;

    public static void a() {
        if (c()) {
            throw new bei("Must be called on a background thread");
        }
    }

    public static void b(Runnable runnable) {
        if (c == null) {
            synchronized (a) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        c.post(runnable);
    }

    public static boolean c() {
        return d(Thread.currentThread());
    }

    public static boolean d(Thread thread) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return thread == b;
    }
}
