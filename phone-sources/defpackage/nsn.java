package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsn {
    public static final Object a = new Object();
    nsm d;
    Runnable e;
    private final long f;
    private final String g;
    long b = -1;
    long c = 0;
    private final Handler h = new ogh(Looper.getMainLooper());

    public nsn(long j, String str) {
        this.f = j;
        this.g = str;
        new nsf("RequestTracker", str);
    }

    private final void g(int i, Object obj) {
        nsf.e();
        Object obj2 = a;
        synchronized (obj2) {
            if (this.d != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                nsm nsmVar = this.d;
                ocv.aF(nsmVar);
                nsmVar.a(this.g, this.b, i, obj, this.c, jCurrentTimeMillis);
            }
            this.b = -1L;
            this.d = null;
            synchronized (obj2) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    this.h.removeCallbacks(runnable);
                    this.e = null;
                }
            }
        }
    }

    public final void a(long j, nsm nsmVar) {
        nsm nsmVar2;
        long j2;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = a;
        synchronized (obj) {
            nsmVar2 = this.d;
            j2 = this.b;
            j3 = this.c;
            this.b = j;
            this.d = nsmVar;
            this.c = jCurrentTimeMillis;
        }
        if (nsmVar2 != null) {
            nsmVar2.b(this.g, j2, j3, jCurrentTimeMillis);
        }
        synchronized (obj) {
            Runnable runnable = this.e;
            if (runnable != null) {
                this.h.removeCallbacks(runnable);
            }
            mpz mpzVar = new mpz(this, 20);
            this.e = mpzVar;
            this.h.postDelayed(mpzVar, this.f);
        }
    }

    public final boolean b(long j) {
        boolean z;
        synchronized (a) {
            long j2 = this.b;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (a) {
            z = this.b != -1;
        }
        return z;
    }

    public final void d(int i) {
        synchronized (a) {
            if (c()) {
                String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.b));
                g(i, null);
            }
        }
    }

    public final void e(long j, int i) {
        f(j, i, null);
    }

    public final void f(long j, int i, Object obj) {
        synchronized (a) {
            if (b(j)) {
                String.format(Locale.ROOT, "request %d completed", Long.valueOf(j));
                g(i, obj);
            }
        }
    }
}
