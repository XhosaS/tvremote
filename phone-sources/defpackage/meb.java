package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class meb implements Application.ActivityLifecycleCallbacks, idb {
    public static final meb a = new meb(new mea(3000), new mea(kwx.JSON3));
    public boolean b;
    public final mea c;
    private final mea d;

    private meb(mea meaVar, mea meaVar2) {
        this.d = meaVar;
        this.c = meaVar2;
    }

    @Override // defpackage.idb
    public final boolean a() {
        return this.d.d();
    }

    public final void b(Runnable runnable) {
        this.d.b(runnable);
    }

    public final void c(Runnable runnable) {
        mea meaVar = this.d;
        meaVar.a.add(runnable);
        if (meaVar.d()) {
            runnable.run();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.d.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.d.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.c.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.c.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
