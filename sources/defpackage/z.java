package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class z implements View.OnAttachStateChangeListener {
    final /* synthetic */ ar a;
    final /* synthetic */ aa b;

    public z(aa aaVar, ar arVar) {
        this.b = aaVar;
        this.a = arVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ar arVar = this.a;
        arVar.d();
        bf.c((ViewGroup) arVar.a.L.getParent(), this.b.a).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
