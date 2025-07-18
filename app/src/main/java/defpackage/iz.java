package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class iz implements View.OnAttachStateChangeListener {
    final /* synthetic */ jd a;

    public iz(jd jdVar) {
        this.a = jdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jd jdVar = this.a;
        ViewTreeObserver viewTreeObserver = jdVar.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                jdVar.e = view.getViewTreeObserver();
            }
            jdVar.e.removeGlobalOnLayoutListener(jdVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
