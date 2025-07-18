package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usl implements Animator.AnimatorListener {
    final /* synthetic */ uso a;

    public usl(uso usoVar) {
        this.a = usoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        uso usoVar = this.a;
        usoVar.g.a = 4;
        usoVar.d = usoVar.c;
        usoVar.e();
        usoVar.invalidateSelf();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
