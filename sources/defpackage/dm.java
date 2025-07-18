package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dm implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.b != 1) {
            return;
        }
        View view2 = (View) this.a;
        view2.removeOnAttachStateChangeListener(this);
        int[] iArr = qv.a;
        qk.j(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            ViewOnKeyListenerC0000do viewOnKeyListenerC0000do = (ViewOnKeyListenerC0000do) this.a;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0000do.e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0000do.e = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0000do.e.removeGlobalOnLayoutListener(viewOnKeyListenerC0000do.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            em emVar = (em) this.a;
            ViewTreeObserver viewTreeObserver2 = emVar.d;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    emVar.d = view.getViewTreeObserver();
                }
                emVar.d.removeGlobalOnLayoutListener(emVar.b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }
}
