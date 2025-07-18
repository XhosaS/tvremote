package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsy implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private final qpd d;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private final AtomicInteger i = new AtomicInteger();
    private boolean j = false;

    public qsy(qpd qpdVar) {
        this.d = qpdVar;
    }

    private final void a() {
        if (!this.j && this.e.get() == 0) {
            qpd qpdVar = this.d;
            if (!qpd.b()) {
                zdv zdvVar = (zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedOutOfOrderLifecycleEvent", 43, "CrashOnBadPrimesConfiguration.java");
                String str = qpdVar.a;
                zdvVar.x("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", str);
                if (!qpdVar.a()) {
                    throw new IllegalStateException(String.format("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", str));
                }
            }
            this.j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.e.incrementAndGet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.i.getAndIncrement() == 0) {
            a();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            a();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            a();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            a();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            a();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).e(activity);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qsw) it.next()).f(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
