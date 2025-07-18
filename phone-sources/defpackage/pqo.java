package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqo extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ pqw b;

    public pqo(pqw pqwVar, Runnable runnable) {
        this.a = runnable;
        this.b = pqwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pqw pqwVar = this.b;
        pqwVar.r = false;
        if (pqwVar.p()) {
            ((TextView) pqwVar.g).setTextColor(pqwVar.i);
        }
        if (pqwVar.q()) {
            pqwVar.g.setDrawingCacheEnabled(pqwVar.n);
        }
        pqwVar.setVisibility(8);
        pqwVar.p = null;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.r = true;
    }
}
