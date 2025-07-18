package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
class bsz implements Animator.AnimatorListener {
    final /* synthetic */ bta a;
    final /* synthetic */ btb b;

    public bsz(btb btbVar, bta btaVar) {
        this.b = btbVar;
        this.a = btaVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        btb btbVar = this.b;
        bta btaVar = this.a;
        btbVar.a(1.0f, btaVar, true);
        btaVar.d();
        int length = btaVar.i.length;
        btaVar.e();
        if (!btbVar.c) {
            btbVar.b += 1.0f;
            return;
        }
        btbVar.c = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        btaVar.b(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
