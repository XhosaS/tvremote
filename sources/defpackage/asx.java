package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asx extends asy {
    final /* synthetic */ asz a;

    public asx(asz aszVar) {
        this.a = aszVar;
    }

    @Override // defpackage.asy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        asz aszVar = this.a;
        int i = aszVar.b - 1;
        aszVar.b = i;
        if (i == 0) {
            aszVar.h = aqe.a(activity.getClass());
            Handler handler = aszVar.e;
            bit.j(handler);
            Runnable runnable = aszVar.f;
            bit.j(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.asy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        asz aszVar = this.a;
        int i = aszVar.b + 1;
        aszVar.b = i;
        if (i == 1) {
            if (aszVar.c) {
                Iterator it = aszVar.g.iterator();
                while (it.hasNext()) {
                    ((ask) it.next()).l(aqe.a(activity.getClass()));
                }
                aszVar.c = false;
                return;
            }
            Handler handler = aszVar.e;
            bit.j(handler);
            Runnable runnable = aszVar.f;
            bit.j(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.asy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        asz aszVar = this.a;
        int i = aszVar.a + 1;
        aszVar.a = i;
        if (i == 1 && aszVar.d) {
            for (ask askVar : aszVar.g) {
                aqe.a(activity.getClass());
            }
            aszVar.d = false;
        }
    }

    @Override // defpackage.asy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        asz aszVar = this.a;
        aszVar.a--;
        aqe.a(activity.getClass());
        aszVar.a();
    }
}
