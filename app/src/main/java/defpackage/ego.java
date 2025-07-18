package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class ego implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ egp a;

    public ego(egp egpVar) {
        this.a = egpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
        this.a.setScrollX(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
    }
}
