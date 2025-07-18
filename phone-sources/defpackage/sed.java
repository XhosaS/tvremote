package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sed extends AnimatorListenerAdapter {
    final /* synthetic */ RecyclerView.ViewHolder a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ sej d;

    public sed(sej sejVar, RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = viewHolder;
        this.b = view;
        this.c = viewPropertyAnimator;
        this.d = sejVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        sej sejVar = this.d;
        RecyclerView.ViewHolder viewHolder = this.a;
        sejVar.dispatchAddFinished(viewHolder);
        sejVar.e.remove(viewHolder);
        sejVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.dispatchAddStarting(this.a);
    }
}
