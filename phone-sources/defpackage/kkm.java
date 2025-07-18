package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkm extends AnimatorListenerAdapter {
    final /* synthetic */ kko a;
    final /* synthetic */ RecyclerView.ViewHolder b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ int e;
    final /* synthetic */ ViewPropertyAnimator f;

    public kkm(kko kkoVar, RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = kkoVar;
        this.b = viewHolder;
        this.c = i;
        this.d = view;
        this.e = i2;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        if (this.b.getAdapterPosition() == -1) {
            return;
        }
        if (this.c != 0) {
            this.d.setTranslationX(0.0f);
        }
        if (this.e != 0) {
            this.d.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.f.setListener(null);
        kko kkoVar = this.a;
        RecyclerView.ViewHolder viewHolder = this.b;
        kkoVar.dispatchMoveFinished(viewHolder);
        kkoVar.f.remove(viewHolder);
        kkoVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.dispatchMoveStarting(this.b);
    }
}
