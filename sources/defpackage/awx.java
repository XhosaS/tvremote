package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awx implements asu {
    private final Window$OnFrameMetricsAvailableListener a;
    private final cov b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public awx(cov covVar, cjd cjdVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = covVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
            return;
        }
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).p("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 109, "WindowTracker.java")).p("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 101, "WindowTracker.java")).p("Activity is null or isn't being tracked");
    }

    @Override // defpackage.asu
    public void b(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.asu
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.asu
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public synchronized void i() {
        this.d = true;
        k();
    }

    public synchronized void j() {
        this.d = false;
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
