package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class suj implements suk {
    private final /* synthetic */ int a;

    @Override // defpackage.suk
    public final void a(ValueAnimator valueAnimator, View view) {
        int i = this.a;
        if (i == 0) {
            int i2 = sul.a;
            Float f = (Float) valueAnimator.getAnimatedValue();
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
            return;
        }
        if (i == 1) {
            int i3 = sul.a;
            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i != 2) {
            int i4 = sul.a;
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            int i5 = sul.a;
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
