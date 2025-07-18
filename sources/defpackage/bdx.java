package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdx implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ byg c;
    final /* synthetic */ Set d;
    final /* synthetic */ byg e;
    final /* synthetic */ crv f;
    final /* synthetic */ awy g;

    public bdx(Application application, byg bygVar, Set set, awy awyVar, byg bygVar2, crv crvVar) {
        this.b = application;
        this.c = bygVar;
        this.d = set;
        this.g = awyVar;
        this.e = bygVar2;
        this.f = crvVar;
    }

    private final bzs a() {
        if (this.a) {
            int i = bzs.d;
            return cax.a;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        bzz bzzVar = new bzz();
        bzzVar.g(this.d);
        if (this.g.d() || ((Boolean) this.e.d(false)).booleanValue()) {
            bzzVar.g((Iterable) ((cpj) this.f).a);
        }
        cab cabVarF = bzzVar.f();
        bzo bzoVarJ = bzs.j(cabVarF.size());
        cbj cbjVarListIterator = cabVarF.listIterator();
        while (cbjVarListIterator.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) cbjVarListIterator.next();
            byg bygVar = this.c;
            if (bygVar.f()) {
                activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((byb) bygVar.b()).a(activityLifecycleCallbacks);
            }
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            bzoVarJ.g(activityLifecycleCallbacks);
        }
        return bzoVarJ.f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        bzs bzsVarA = a();
        int i = ((cax) bzsVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) bzsVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        bdq.j(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        bdq.j(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        bzs bzsVarA = a();
        int i = ((cax) bzsVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) bzsVarA.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        bdq.j(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bdq.j(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        bdq.j(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        bdq.j(this.a);
    }
}
