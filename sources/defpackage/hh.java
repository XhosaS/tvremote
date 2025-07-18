package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hh extends AnimatorListenerAdapter {
    final /* synthetic */ hi a;
    private boolean b = false;

    public hh(hi hiVar) {
        this.a = hiVar;
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
        hi hiVar = this.a;
        if (((Float) hiVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            hiVar.q = 0;
            hiVar.e(0);
        } else {
            hiVar.q = 2;
            hiVar.d();
        }
    }
}
