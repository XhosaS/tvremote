package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class enq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ enr a;

    public enq(enr enrVar) {
        this.a = enrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }
}
