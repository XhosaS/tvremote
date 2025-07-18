package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pux implements Application.ActivityLifecycleCallbacks {
    private final qpr a;
    private final pus b;

    public pux(qpr qprVar, pus pusVar) {
        this.a = qprVar;
        this.b = pusVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(activity);
        Intent intent = activity.getIntent();
        if (intent != null) {
            tvn tvnVar = puv.a;
            if (ocv.bs(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 1) {
                this.b.a(activity, intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            tvn tvnVar = puv.a;
            if (ocv.bs(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 0) {
                this.b.a(activity, intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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
