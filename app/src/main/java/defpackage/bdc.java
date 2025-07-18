package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdc extends bbx {
    final /* synthetic */ bde a;

    public bdc(bde bdeVar) {
        this.a = bdeVar;
    }

    @Override // defpackage.bbx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            bdg bdgVar = bdj.a;
            activity.getClass();
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((bdj) fragmentFindFragmentByTag).b = this.a.h;
        }
    }

    @Override // defpackage.bbx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        bde bdeVar = this.a;
        int i = bdeVar.c - 1;
        bdeVar.c = i;
        if (i == 0) {
            bdeVar.e.postDelayed(bdeVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        bdd.a(activity, new bdb(this));
    }

    @Override // defpackage.bbx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r2.b--;
        this.a.c();
    }
}
