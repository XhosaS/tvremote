package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieu extends iet {
    public ieu(Activity activity, ifb ifbVar) {
        super(activity, ifbVar);
    }

    @Override // defpackage.iet, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == this.a) {
            this.b.b();
        }
    }

    @Override // defpackage.iet, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.a) {
            this.b.c();
        }
    }
}
