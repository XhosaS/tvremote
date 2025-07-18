package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
class bdb extends bbx {
    final /* synthetic */ bdc a;

    public bdb(bdc bdcVar) {
        this.a = bdcVar;
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
