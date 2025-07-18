package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class sv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ sw a;

    public sv(sw swVar) {
        this.a = swVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
