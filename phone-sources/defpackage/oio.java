package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oio implements Application.ActivityLifecycleCallbacks {
    private final Activity a;
    private final oip b;

    public oio(Activity activity, oip oipVar) {
        this.a = activity;
        this.b = oipVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.a) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.a) {
            try {
                this.b.q(1);
            } catch (RemoteException unused) {
            }
        }
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
