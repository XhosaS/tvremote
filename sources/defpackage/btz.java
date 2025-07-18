package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class btz implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int a;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.a != 0) {
            throw null;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = (View) ((ObjectAnimator) valueAnimator).getTarget();
        view.setTranslationX((-fFloatValue) * view.getMeasuredWidth() * 0.5f);
        view.setAlpha(1.0f - fFloatValue);
    }
}
