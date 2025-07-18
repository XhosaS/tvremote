package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class see extends AnimatorListenerAdapter {
    final /* synthetic */ RecyclerView.ViewHolder a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ sej f;

    public see(sej sejVar, RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = viewHolder;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
        this.f = sejVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.a.getAdapterPosition() == -1) {
            return;
        }
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        sej sejVar = this.f;
        RecyclerView.ViewHolder viewHolder = this.a;
        sejVar.dispatchMoveFinished(viewHolder);
        sejVar.f.remove(viewHolder);
        sejVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.dispatchMoveStarting(this.a);
    }
}
