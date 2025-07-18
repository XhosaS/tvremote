package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyd {
    public static void a() {
        if (!ebc.a && !b()) {
            throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
