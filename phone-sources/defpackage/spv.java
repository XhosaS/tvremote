package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public spv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                szk szkVar = ((BottomSheetBehavior) this.a).f;
                if (szkVar != null) {
                    szkVar.O(fFloatValue);
                    break;
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) this.a).e(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.a;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
            case 3:
                ((taz) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tay tayVar = ((taz) this.a).j;
                tayVar.setScaleX(fFloatValue3);
                tayVar.setScaleY(fFloatValue3);
                break;
            case 5:
                ((taz) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                ((taz) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) this.a).q.B(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
