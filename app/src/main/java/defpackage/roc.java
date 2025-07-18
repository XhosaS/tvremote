package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class roc implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ yqt c;
    final /* synthetic */ Set d;
    final /* synthetic */ rnw e;
    final /* synthetic */ agow f;

    public roc(Application application, yqt yqtVar, Set set, rnw rnwVar, agow agowVar) {
        this.b = application;
        this.c = yqtVar;
        this.d = set;
        this.e = rnwVar;
        this.f = agowVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yqi] */
    private final yyk a() {
        if (this.a) {
            int i = yyk.e;
            return zcg.b;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        yzo yzoVar = new yzo();
        yzoVar.i(this.d);
        if (this.e.a()) {
            yzoVar.i((Iterable) this.f.a());
        } else {
            Boolean bool = false;
            bool.getClass();
        }
        yzq yzqVarF = yzoVar.f();
        yyf yyfVarG = yyk.g(yzqVarF.size());
        zdl it = yzqVarF.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((yqz) this.c).a.apply((Application.ActivityLifecycleCallbacks) it.next());
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            yyfVarG.g(activityLifecycleCallbacks);
        }
        return yyfVarG.f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        yyk yykVarA = a();
        int i = ((zcg) yykVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) yykVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        yqw.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        yqw.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        yyk yykVarA = a();
        int i = ((zcg) yykVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) yykVarA.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        yqw.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        yqw.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        yqw.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        yqw.L(this.a);
    }
}
