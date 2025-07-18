package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class ny implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ nz a;

    public ny(nz nzVar) {
        this.a = nzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
        nz nzVar = this.a;
        int i = (int) fFloatValue;
        nzVar.b.setAlpha(i);
        nzVar.c.setAlpha(i);
        nzVar.l.invalidate();
    }
}
