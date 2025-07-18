package defpackage;

import android.animation.ValueAnimator;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fsz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fsz(hbv hbvVar, int i) {
        this.b = i;
        this.a = hbvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ftk.n((ftk) this.a, valueAnimator);
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.a;
                defaultTimeBar.e = fFloatValue;
                defaultTimeBar.invalidate(defaultTimeBar.a);
                break;
            case 2:
                ftk.n((ftk) this.a, valueAnimator);
                break;
            case 3:
                ((ftk) this.a).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((ftk) this.a).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                hbv hbvVar = (hbv) this.a;
                hfl hflVar = hbvVar.k;
                if (hflVar != null) {
                    hflVar.m(hbvVar.b.c());
                    break;
                }
                break;
            case 6:
                tui tuiVar = jdd.a;
                valueAnimator.getClass();
                View view = (View) this.a;
                float width = view.getWidth();
                float f = 0.15f * width;
                float translationX = view.getTranslationX();
                float f2 = 0.65f * width;
                view.setAlpha(Math.max(Math.max(Math.min(translationX >= f ? 1.0f - ((translationX - f) / f2) : translationX < width * 0.85f ? ((f + translationX) / f2) + 1.0f : 1.0f, 1.0f), 0.0f), 0.0f));
                break;
            case 7:
                ((sej) this.a).i.a(valueAnimator.getAnimatedFraction());
                break;
            case 8:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sqw sqwVar = (sqw) this.a;
                sqwVar.l.setAlpha((int) (255.0f * fFloatValue2));
                sqwVar.t = fFloatValue2;
                break;
            case 9:
                ((ClippableRoundedCornerLayout) this.a).b((float[]) valueAnimator.getAnimatedValue());
                break;
            case 10:
                int i = swl.v;
                ((View) this.a).setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
                break;
            case 11:
                sxi sxiVar = (sxi) this.a;
                sxiVar.b.e = sxiVar.e.getInterpolation(sxiVar.d.getAnimatedFraction());
                break;
            case 12:
                ((DrawerArrowDrawable) this.a).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                ((sue) this.a).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                syz syzVar = (syz) this.a;
                syzVar.d.setAlpha(fFloatValue3);
                syzVar.g.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                ((ImageButton) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tam tamVar = (tam) this.a;
                for (tdg tdgVar : tamVar.d) {
                    tdgVar.j = fFloatValue4;
                    tdgVar.k = fFloatValue4;
                    tdgVar.n = sns.a(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue4);
                    tdgVar.invalidateSelf();
                }
                tamVar.postInvalidateOnAnimation();
                break;
            case 17:
                ((tca) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = ((tca) this.a).h;
                checkableImageButton.setScaleX(fFloatValue5);
                checkableImageButton.setScaleY(fFloatValue5);
                break;
            default:
                ((tck) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ fsz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
