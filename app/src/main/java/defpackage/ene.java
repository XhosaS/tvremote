package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ene {
    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void b() {
        if (!ema.a && !a()) {
            throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }
}
