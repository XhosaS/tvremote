package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class dmz implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ ViewTreeObserver.OnDrawListener b;
    final /* synthetic */ dna c;

    public dmz(dna dnaVar, View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.a = view;
        this.b = onDrawListener;
        this.c = dnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkh dkhVarA = dkh.a();
        dqm.f();
        dkhVarA.b.set(true);
        dnb dnbVar = this.c.b;
        dnbVar.b = true;
        this.a.getViewTreeObserver().removeOnDrawListener(this.b);
        dnbVar.a.clear();
    }
}
