package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkj extends AnimatorListenerAdapter {
    final /* synthetic */ kko a;
    final /* synthetic */ RecyclerView.ViewHolder b;
    final /* synthetic */ View c;
    final /* synthetic */ ViewPropertyAnimator d;

    public kkj(kko kkoVar, RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = kkoVar;
        this.b = viewHolder;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.d.setListener(null);
        kko kkoVar = this.a;
        RecyclerView.ViewHolder viewHolder = this.b;
        kkoVar.dispatchAddFinished(viewHolder);
        kkoVar.e.remove(viewHolder);
        kkoVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.dispatchAddStarting(this.b);
    }
}
