package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class org {
    public static final Handler a;
    private static final Thread b;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        a = handler;
        new ori(new emk(handler, 9));
        b = Looper.getMainLooper().getThread();
        new ori(new fba(6));
    }

    public static void a() {
        a.ah(b == Thread.currentThread(), "Not on the main thread");
    }
}
