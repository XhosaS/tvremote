package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rge extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ yau b;

    public rge(yau yauVar) {
        this.b = yauVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.b.b || this.a) {
            return;
        }
        animator.setStartDelay(416L);
        animator.start();
    }
}
