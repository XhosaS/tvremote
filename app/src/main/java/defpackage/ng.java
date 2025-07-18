package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class ng extends AnimatorListenerAdapter {
    final /* synthetic */ qv a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ nn d;

    public ng(nn nnVar, qv qvVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = nnVar;
        this.a = qvVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        nn nnVar = this.d;
        qv qvVar = this.a;
        nnVar.l(qvVar);
        nnVar.f.remove(qvVar);
        nnVar.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
