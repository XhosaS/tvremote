package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vqk implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ vql a;

    public vqk(vql vqlVar) {
        this.a = vqlVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        vql vqlVar = this.a;
        int i = vqlVar.c + 1;
        vqlVar.c = i;
        if (i == 1) {
            vqlVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        vql vqlVar = this.a;
        int i = vqlVar.c - 1;
        vqlVar.c = i;
        if (i != 0 || activity.isChangingConfigurations()) {
            return;
        }
        vqlVar.a(false);
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
