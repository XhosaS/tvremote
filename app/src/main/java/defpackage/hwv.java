package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwv extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;

    public hwv(AnimatorSet animatorSet) {
        this.a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.start();
    }
}
