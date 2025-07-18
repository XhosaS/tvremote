package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dya {
    private static Handler a;
    public volatile int f = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new dxz(this, new eet(this, 1));

    public abstract Object a();

    public void b(Object obj) {
        throw null;
    }

    public void c() {
        throw null;
    }

    public final void d(Object obj) {
        Handler handler;
        synchronized (dya.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new be(this, obj, 17, (char[]) null));
    }

    final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
