package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvy extends dux {
    final /* synthetic */ dwa a;

    public dvy(dwa dwaVar) {
        this.a = dwaVar;
    }

    @Override // defpackage.dux, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = dwh.b;
            activity.getClass();
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((dwh) fragmentFindFragmentByTag).a = this.a.h;
        }
    }

    @Override // defpackage.dux, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        dwa dwaVar = this.a;
        int i = dwaVar.c - 1;
        dwaVar.c = i;
        if (i == 0) {
            dwaVar.e.postDelayed(dwaVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        dvz.a(activity, new dvx(this));
    }

    @Override // defpackage.dux, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r2.b--;
        this.a.c();
    }
}
