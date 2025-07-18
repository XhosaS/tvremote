package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awb implements asu {
    private final cov a;
    private boolean b = false;
    private Activity c;

    public awb(cov covVar, final byg bygVar, Executor executor) {
        this.a = covVar;
        executor.execute(new Runnable() { // from class: awa
            @Override // java.lang.Runnable
            public final void run() {
                awb.i(this.a, bygVar);
            }
        });
    }

    public static /* synthetic */ void i(awb awbVar, byg bygVar) {
        if (!bygVar.f() || ((Boolean) ((crv) bygVar.b()).a()).booleanValue()) {
            synchronized (awbVar) {
                awbVar.b = true;
                Activity activity = awbVar.c;
                if (activity != null) {
                    awbVar.d(activity);
                }
                awbVar.c = null;
            }
        }
    }

    @Override // defpackage.asu
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((awh) this.a.a()).b(activity);
        } else if (!activity.equals(this.c)) {
            ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).z("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
        }
        this.c = null;
    }

    @Override // defpackage.asu
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((awh) this.a.a()).d(activity);
        } else {
            this.c = activity;
        }
    }

    @Override // defpackage.asu
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
