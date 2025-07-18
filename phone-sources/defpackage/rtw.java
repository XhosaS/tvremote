package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rtw implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ rtx b;

    public rtw(rtx rtxVar, Application application) {
        this.b = rtxVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rtx rtxVar = this.b;
        rtt rttVar = rtxVar.n;
        if (rttVar.b != null) {
            rttVar = rtxVar.o;
        }
        rttVar.a = activity.getClass().getSimpleName();
        rttVar.b = rqj.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rtx rtxVar = this.b;
        rtt rttVar = rtxVar.o;
        if (rttVar.b == null) {
            rttVar = rtxVar.n;
        }
        if (rttVar.d == null) {
            rttVar.d = rqj.a();
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new rtu(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new rtv(this, viewFindViewById));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        rtx rtxVar = this.b;
        rtt rttVar = rtxVar.o;
        if (rttVar.b == null) {
            rttVar = rtxVar.n;
        }
        if (rttVar.c == null) {
            rttVar.c = rqj.a();
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
