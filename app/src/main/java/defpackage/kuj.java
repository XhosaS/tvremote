package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class kuj {
    private static volatile Handler b;
    public volatile long a;
    private final lco c;
    private final Runnable d;

    public kuj(lco lcoVar) {
        kkk.k(lcoVar);
        this.c = lcoVar;
        this.d = new kui(this, lcoVar);
    }

    private final Handler e() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (kuj.class) {
            if (b == null) {
                b = new kos(this.c.az().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    final void a() {
        this.a = 0L;
        e().removeCallbacks(this.d);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            lco lcoVar = this.c;
            lcoVar.aD();
            this.a = System.currentTimeMillis();
            if (e().postDelayed(this.d, j)) {
                return;
            }
            lcoVar.aB().c.b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.a != 0;
    }
}
