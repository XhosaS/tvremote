package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class iet implements Application.ActivityLifecycleCallbacks {
    final Activity a;
    final ifb b;

    public iet(Activity activity, ifb ifbVar) {
        this.a = activity;
        this.b = ifbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.a;
        if (activity2 == activity) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
