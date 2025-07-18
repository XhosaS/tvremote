package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gip implements Animator.AnimatorListener {
    final /* synthetic */ giq a;
    final /* synthetic */ gir b;

    public gip(gir girVar, giq giqVar) {
        this.b = girVar;
        this.a = giqVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        giq giqVar = this.a;
        gir girVar = this.b;
        girVar.a(1.0f, giqVar, true);
        giqVar.e();
        giqVar.f();
        giqVar.g();
        if (!girVar.d) {
            girVar.c += 1.0f;
            return;
        }
        girVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        giqVar.c(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
