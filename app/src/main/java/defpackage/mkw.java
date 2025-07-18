package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
class mkw implements Animator.AnimatorListener {
    private final Runnable a;

    public mkw(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
