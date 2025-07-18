package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class egn extends AnimatorListenerAdapter {
    final /* synthetic */ egp a;
    final /* synthetic */ float b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    public egn(egp egpVar, float f, boolean z, int i) {
        this.a = egpVar;
        this.b = f;
        this.c = z;
        this.d = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            this.a.setScrollX(this.d);
        } else {
            this.a.setScrollX(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(final Animator animator) {
        animator.pause();
        animator.getClass();
        this.a.postDelayed(new Runnable() { // from class: egm
            @Override // java.lang.Runnable
            public final void run() {
                animator.resume();
            }
        }, (long) (this.b * 1000.0f));
    }
}
