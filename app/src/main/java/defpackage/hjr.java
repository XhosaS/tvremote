package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjr {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/elements/focus/FocusCommandHandler$FocusAnimation");
    public final adeo b;
    public final ValueAnimator c;
    public final ComponentHost d;
    public TransitionDrawable e = null;

    public hjr(ComponentHost componentHost, adeo adeoVar) {
        this.b = adeoVar;
        this.d = componentHost;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, adeoVar.e);
        this.c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hjq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ComponentHost componentHost2 = this.a.d;
                componentHost2.setScaleY(fFloatValue);
                componentHost2.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                componentHost2.invalidate();
            }
        });
        valueAnimatorOfFloat.setDuration(adeoVar.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.PaintDrawable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.graphics.drawable.Drawable[]] */
    final Drawable[] a(mwe mweVar) {
        ?? paintDrawable;
        Object paintDrawable2 = mweVar == null ? new PaintDrawable(0) : mweVar;
        adeo adeoVar = this.b;
        int i = adeoVar.c;
        if ((i & 1) == 0 && (i & 256) == 0) {
            paintDrawable = paintDrawable2;
        } else {
            paintDrawable = new PaintDrawable(adeoVar.d);
            if ((adeoVar.c & 256) != 0) {
                paintDrawable.setCornerRadius(adeoVar.l);
            } else if (mweVar != null) {
                paintDrawable.setCornerRadius(mweVar.d);
            }
        }
        return new Drawable[]{paintDrawable2, paintDrawable};
    }
}
