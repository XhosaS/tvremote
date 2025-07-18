package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gu extends AnimatorListenerAdapter {
    final /* synthetic */ ja a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ ik d;

    public gu(ik ikVar, ja jaVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = ikVar;
        this.a = jaVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        ik ikVar = this.d;
        ja jaVar = this.a;
        ikVar.a(jaVar);
        ikVar.k.remove(jaVar);
        ikVar.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
