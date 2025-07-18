package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.leanback.widget.SearchOrbView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rb(hi hiVar, int i) {
        this.b = i;
        this.a = hiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            ((View) ((ct) ((byj) this.a).a).c.getParent()).invalidate();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((SearchOrbView) this.a).f(valueAnimator.getAnimatedFraction());
                return;
            } else {
                ((SearchOrbView) this.a).e(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            }
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
        hi hiVar = (hi) this.a;
        int i2 = (int) fFloatValue;
        hiVar.b.setAlpha(i2);
        hiVar.c.setAlpha(i2);
        hiVar.d();
    }

    public /* synthetic */ rb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
