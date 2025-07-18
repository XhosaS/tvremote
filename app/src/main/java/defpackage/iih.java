package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class iih extends AnimatorListenerAdapter {
    final /* synthetic */ Animator a;
    final /* synthetic */ iii b;

    public iih(iii iiiVar, Animator animator) {
        this.a = animator;
        this.b = iiiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.f.ah = 0;
        long jLongValue = ((Long) iim.f.get(0)).longValue();
        Animator animator2 = this.a;
        animator2.setStartDelay(jLongValue);
        animator2.start();
    }
}
