package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rap implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ raq b;

    public rap(raq raqVar, Application application) {
        this.b = raqVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        raq raqVar = this.b;
        rah rahVar = raqVar.n;
        if (rahVar.b != null) {
            rahVar = raqVar.o;
        }
        rahVar.a = activity.getClass().getSimpleName();
        rahVar.b = qvf.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        raq raqVar = this.b;
        rah rahVar = raqVar.o;
        if (rahVar.b == null) {
            rahVar = raqVar.n;
        }
        if (rahVar.d == null) {
            rahVar.d = qvf.c();
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new ral(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new rao(this, viewFindViewById));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        raq raqVar = this.b;
        rah rahVar = raqVar.o;
        if (rahVar.b == null) {
            rahVar = raqVar.n;
        }
        if (rahVar.c == null) {
            rahVar.c = qvf.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
