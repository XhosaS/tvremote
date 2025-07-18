package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class kc implements View.OnAttachStateChangeListener {
    final /* synthetic */ kd a;

    public kc(kd kdVar) {
        this.a = kdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kd kdVar = this.a;
        ViewTreeObserver viewTreeObserver = kdVar.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                kdVar.d = view.getViewTreeObserver();
            }
            kdVar.d.removeGlobalOnLayoutListener(kdVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
