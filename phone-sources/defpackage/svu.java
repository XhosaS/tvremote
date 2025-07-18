package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ svw b;

    public svu(svw svwVar, float f) {
        this.a = f;
        this.b = svwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
