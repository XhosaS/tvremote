package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class iik extends AnimatorListenerAdapter {
    final /* synthetic */ yyk a;
    final /* synthetic */ ObjectAnimator b;
    final /* synthetic */ iim c;
    private boolean d = false;

    public iik(iim iimVar, yyk yykVar, ObjectAnimator objectAnimator) {
        this.a = yykVar;
        this.b = objectAnimator;
        this.c = iimVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.d) {
            return;
        }
        iim iimVar = this.c;
        int i = iimVar.ah + 1;
        iimVar.ah = i;
        if (i < ((zcg) this.a).d) {
            ObjectAnimator objectAnimator = this.b;
            objectAnimator.setStartDelay(((Long) iim.f.get(i)).longValue());
            objectAnimator.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }
}
