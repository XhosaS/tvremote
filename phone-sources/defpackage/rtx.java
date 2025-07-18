package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.ActivityChooserView;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtx {
    public static final rtx a = new rtx();
    public volatile rqj b;
    public volatile rqj c;
    public volatile rqj d;
    public volatile rqj e;
    public volatile rqj f;
    public volatile rqj g;
    public volatile rqj h;
    public volatile rqj i;
    public volatile rqj j;
    public volatile rqj k;
    public volatile rqj l;
    public volatile rmp m;
    private volatile int p = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public final rtt n = new rtt();
    public final rtt o = new rtt();

    public static void f(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j - Process.getStartElapsedRealtime());
            Trace.setCounter(str, 0L);
        }
    }

    public final Closeable a(Application application) {
        if (!sjl.g() || this.c != null) {
            return new rtq(2);
        }
        this.c = rqj.a();
        int i = 0;
        sjl.e(new rtr(this, i));
        application.registerActivityLifecycleCallbacks(new rtw(this, application));
        return new rts(this, i);
    }

    public final void b(int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            sjl.e(new csl(this, i, 17));
        }
    }

    public final void c() {
        rqj rqjVarA = rqj.a();
        rqj rqjVar = this.n.b;
        if (!sjl.g() || this.b == null) {
            return;
        }
        long j = rqjVarA.a;
        if (j <= SystemClock.elapsedRealtime()) {
            if ((rqjVar == null || j <= rqjVar.a) && this.g == null) {
                this.g = rqjVarA;
            }
        }
    }

    public final void d() {
        if (this.b == null) {
            this.b = rqj.a();
        }
    }

    public final void e(Activity activity) {
        if (sjl.g() && this.l == null) {
            this.l = rqj.a();
            f("Primes-tti-end-and-length-ms", this.l.a);
            try {
                activity.reportFullyDrawn();
            } catch (RuntimeException unused) {
            }
        }
    }

    final boolean g(long j) {
        return ((long) this.p) < j;
    }
}
