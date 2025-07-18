package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class nj extends AnimatorListenerAdapter {
    final /* synthetic */ nl a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ nn d;

    public nj(nn nnVar, nl nlVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = nnVar;
        this.a = nlVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        nn nnVar = this.d;
        nl nlVar = this.a;
        nnVar.l(nlVar.a);
        nnVar.g.remove(nlVar.a);
        nnVar.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        qv qvVar = this.a.a;
    }
}
