package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class bsy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bta a;
    final /* synthetic */ btb b;

    public bsy(btb btbVar, bta btaVar) {
        this.b = btbVar;
        this.a = btaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bta btaVar = this.a;
        btb btbVar = this.b;
        btbVar.e(fFloatValue, btaVar);
        btbVar.a(fFloatValue, btaVar, false);
        btbVar.invalidateSelf();
    }
}
