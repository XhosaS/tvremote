package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class kr implements Runnable {
    final /* synthetic */ kw a;
    private final ku b;

    public kr(kw kwVar, ku kuVar) {
        this.a = kwVar;
        this.b = kuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh jhVar;
        kw kwVar = this.a;
        jj jjVar = kwVar.c;
        if (jjVar != null && (jhVar = jjVar.b) != null) {
            jhVar.C(jjVar);
        }
        View view = (View) kwVar.f;
        if (view != null && view.getWindowToken() != null) {
            ku kuVar = this.b;
            if (kuVar.h()) {
                kwVar.j = kuVar;
            }
        }
        kwVar.l = null;
    }
}
