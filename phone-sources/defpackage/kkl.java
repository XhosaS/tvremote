package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkl extends AnimatorListenerAdapter {
    final /* synthetic */ kko a;
    final /* synthetic */ kki b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ View d;

    public kkl(kko kkoVar, kki kkiVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = kkoVar;
        this.b = kkiVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.c.setListener(null);
        View view = this.d;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        kko kkoVar = this.a;
        kki kkiVar = this.b;
        kkoVar.dispatchChangeFinished(kkiVar.b, false);
        kkoVar.h.remove(kkiVar.b);
        kkoVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.dispatchChangeStarting(this.b.b, false);
    }
}
