package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgs extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    public tgs(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.run();
    }
}
