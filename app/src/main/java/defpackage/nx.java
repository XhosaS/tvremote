package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class nx extends AnimatorListenerAdapter {
    final /* synthetic */ nz a;
    private boolean b = false;

    public nx(nz nzVar) {
        this.a = nzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        nz nzVar = this.a;
        if (((Float) nzVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            nzVar.q = 0;
            nzVar.b(0);
        } else {
            nzVar.q = 2;
            nzVar.l.invalidate();
        }
    }
}
