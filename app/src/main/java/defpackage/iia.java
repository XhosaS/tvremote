package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class iia extends AnimatorListenerAdapter {
    final /* synthetic */ yyk a;
    final /* synthetic */ ObjectAnimator b;
    final /* synthetic */ iic c;
    private boolean d = false;

    public iia(iic iicVar, yyk yykVar, ObjectAnimator objectAnimator) {
        this.a = yykVar;
        this.b = objectAnimator;
        this.c = iicVar;
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
        iic iicVar = this.c;
        int i = iicVar.ah + 1;
        iicVar.ah = i;
        if (i < ((zcg) this.a).d) {
            ObjectAnimator objectAnimator = this.b;
            objectAnimator.setStartDelay(((Long) iic.f.get(i)).longValue());
            objectAnimator.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }
}
