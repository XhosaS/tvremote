package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class roz extends rpa {
    final /* synthetic */ rpb a;

    public roz(rpb rpbVar) {
        this.a = rpbVar;
    }

    @Override // defpackage.rpa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        rpb rpbVar = this.a;
        int i = rpbVar.b - 1;
        rpbVar.b = i;
        if (i == 0) {
            rpbVar.h = rmp.b(activity.getClass());
            Handler handler = rpbVar.e;
            sij.k(handler);
            Runnable runnable = rpbVar.f;
            sij.k(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.rpa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rpb rpbVar = this.a;
        int i = rpbVar.b + 1;
        rpbVar.b = i;
        if (i == 1) {
            if (rpbVar.c) {
                Iterator it = rpbVar.g.iterator();
                while (it.hasNext()) {
                    ((roo) it.next()).l(rmp.b(activity.getClass()));
                }
                rpbVar.c = false;
                return;
            }
            Handler handler = rpbVar.e;
            sij.k(handler);
            Runnable runnable = rpbVar.f;
            sij.k(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.rpa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        rpb rpbVar = this.a;
        int i = rpbVar.a + 1;
        rpbVar.a = i;
        if (i == 1 && rpbVar.d) {
            for (roo rooVar : rpbVar.g) {
                rmp.b(activity.getClass());
            }
            rpbVar.d = false;
        }
    }

    @Override // defpackage.rpa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        rpb rpbVar = this.a;
        rpbVar.a--;
        rmp.b(activity.getClass());
        rpbVar.a();
    }
}
