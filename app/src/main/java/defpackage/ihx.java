package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class ihx extends AnimatorListenerAdapter {
    final /* synthetic */ Animator a;
    final /* synthetic */ ihy b;

    public ihx(ihy ihyVar, Animator animator) {
        this.a = animator;
        this.b = ihyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.f.ah = 0;
        long jLongValue = ((Long) iic.f.get(0)).longValue();
        Animator animator2 = this.a;
        animator2.setStartDelay(jLongValue);
        animator2.start();
    }
}
