package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wkt implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof wgr) {
            raq raqVar = raq.a;
            long jF = ((wgr) activity).F();
            quj qujVar = new quj(jF, jF);
            qvf qvfVar = raqVar.n.b;
            if (uea.d(Thread.currentThread()) && raqVar.b != null) {
                long j = qujVar.a;
                if (j <= SystemClock.elapsedRealtime() && ((qvfVar == null || j <= ((quj) qvfVar).a) && raqVar.g == null)) {
                    raqVar.g = qujVar;
                }
            }
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
