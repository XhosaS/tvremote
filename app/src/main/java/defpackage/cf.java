package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class cf implements View.OnAttachStateChangeListener {
    final /* synthetic */ dm a;
    final /* synthetic */ cg b;

    public cf(cg cgVar, dm dmVar) {
        this.b = cgVar;
        this.a = dmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dm dmVar = this.a;
        dmVar.d();
        eo.a.a((ViewGroup) dmVar.b.R.getParent(), this.b.a).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
