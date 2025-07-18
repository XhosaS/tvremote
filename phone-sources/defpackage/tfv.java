package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ tfw a;

    public tfv(tfw tfwVar) {
        this.a = tfwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
