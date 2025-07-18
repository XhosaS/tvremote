package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvx extends dux {
    final /* synthetic */ dvy a;

    public dvx(dvy dvyVar) {
        this.a = dvyVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
