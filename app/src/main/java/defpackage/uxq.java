package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uxq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dxz a;

    public uxq(dxz dxzVar) {
        this.a = dxzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        dtl dtlVar = (dtl) this.a.a;
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        dtlVar.a(f);
    }
}
