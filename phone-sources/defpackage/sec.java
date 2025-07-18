package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sec extends AnimatorListenerAdapter {
    final /* synthetic */ RecyclerView.ViewHolder a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ sej d;

    public sec(sej sejVar, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = viewHolder;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = sejVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        sej sejVar = this.d;
        RecyclerView.ViewHolder viewHolder = this.a;
        sejVar.dispatchRemoveFinished(viewHolder);
        sejVar.g.remove(viewHolder);
        sejVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.dispatchRemoveStarting(this.a);
    }
}
