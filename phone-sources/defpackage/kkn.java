package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkn extends AnimatorListenerAdapter {
    final /* synthetic */ kko a;
    final /* synthetic */ RecyclerView.ViewHolder b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ View d;

    public kkn(kko kkoVar, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = kkoVar;
        this.b = viewHolder;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.c.setListener(null);
        this.d.setAlpha(1.0f);
        kko kkoVar = this.a;
        RecyclerView.ViewHolder viewHolder = this.b;
        kkoVar.dispatchRemoveFinished(viewHolder);
        kkoVar.g.remove(viewHolder);
        kkoVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.dispatchRemoveStarting(this.b);
    }
}
