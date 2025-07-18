package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qtb extends qtc {
    final /* synthetic */ qtd a;

    public qtb(qtd qtdVar) {
        this.a = qtdVar;
    }

    @Override // defpackage.qtc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        qtd qtdVar = this.a;
        int i = qtdVar.b - 1;
        qtdVar.b = i;
        if (i == 0) {
            qtdVar.h = qpi.c(activity.getClass());
            Handler handler = qtdVar.e;
            yry.b(handler);
            Runnable runnable = qtdVar.f;
            yry.b(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.qtc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qtd qtdVar = this.a;
        int i = qtdVar.b + 1;
        qtdVar.b = i;
        if (i == 1) {
            if (qtdVar.c) {
                Iterator it = qtdVar.g.iterator();
                while (it.hasNext()) {
                    ((qsm) it.next()).l(qpi.c(activity.getClass()));
                }
                qtdVar.c = false;
                return;
            }
            Handler handler = qtdVar.e;
            yry.b(handler);
            Runnable runnable = qtdVar.f;
            yry.b(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.qtc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qtd qtdVar = this.a;
        int i = qtdVar.a + 1;
        qtdVar.a = i;
        if (i == 1 && qtdVar.d) {
            for (qsm qsmVar : qtdVar.g) {
                qpi.c(activity.getClass());
            }
            qtdVar.d = false;
        }
    }

    @Override // defpackage.qtc, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        qtd qtdVar = this.a;
        qtdVar.a--;
        qpi.c(activity.getClass());
        qtdVar.a();
    }
}
