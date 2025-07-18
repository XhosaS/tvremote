package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class eyo implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ eyp a;

    public eyo(eyp eypVar) {
        this.a = eypVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        eyp eypVar = this.a;
        ezc ezcVarA = eypVar.a(activity);
        if (ezcVarA != null) {
            eypVar.b.r(ezcVarA.c(), "destroy");
        }
        eypVar.d = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        eyp eypVar = this.a;
        ezc ezcVarA = eypVar.a(activity);
        if (ezcVarA != null) {
            eypVar.b.r(ezcVarA.c(), "pause");
            eyq.b.contains(ezcVarA.c());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        eyp eypVar = this.a;
        ezc ezcVarA = eypVar.a(activity);
        if (ezcVarA != null) {
            eypVar.b.r(ezcVarA.c(), "resume");
            eyq.b.contains(ezcVarA.c());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        eyp eypVar = this.a;
        ezc ezcVarA = eypVar.a(activity);
        if (ezcVarA != null) {
            String strC = ezcVarA.c();
            if ("assistantSetupActivityKey".equals(strC) || "assistantHotwordSetupActivityKey".equals(strC) || "assistantDscActivityKey".equals(strC) || "assistantHomegraphSetupActivityKey".equals(strC)) {
                eypVar.c++;
            }
            eypVar.b.r(strC, "start");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        eyp eypVar = this.a;
        ezc ezcVarA = eypVar.a(activity);
        if (ezcVarA != null) {
            String strC = ezcVarA.c();
            if ("assistantSetupActivityKey".equals(strC) || "assistantHotwordSetupActivityKey".equals(strC) || "assistantDscActivityKey".equals(strC) || "assistantHomegraphSetupActivityKey".equals(strC)) {
                eypVar.c--;
            }
            eypVar.b.r(strC, "stop");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
