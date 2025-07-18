package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sw implements Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final qv h;
    final int i;
    public final ValueAnimator j;
    boolean k;
    float l;
    float m;
    boolean n = false;
    boolean o = false;
    public float p;

    public sw(qv qvVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = qvVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new sv(this));
        valueAnimatorOfFloat.setTarget(qvVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.p = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.o) {
            this.h.m(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
