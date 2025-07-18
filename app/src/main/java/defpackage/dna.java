package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class dna implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ dnb b;

    public dna(dnb dnbVar, View view) {
        this.a = view;
        this.b = dnbVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        dqm.d().post(new dmz(this, this.a, this));
    }
}
