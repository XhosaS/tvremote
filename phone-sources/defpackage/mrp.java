package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mrp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ mrt a;

    public mrp(mrt mrtVar) {
        this.a = mrtVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
