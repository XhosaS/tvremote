package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svq extends svh {
    public float f;
    public Rect g;
    public Rect h;
    public float[] i;
    private final float j;
    private final float k;

    public svq(View view) {
        super(view);
        Resources resources = view.getResources();
        this.j = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.k = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private static final int j(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public final AnimatorSet e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.a;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new svp(view));
        return animatorSet;
    }

    public final void f(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSetE = e(view);
        View view2 = this.a;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view2;
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: svo
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    float f2 = fArr[0];
                    float f3 = fArr2[0];
                    TimeInterpolator timeInterpolator = sns.a;
                    float f4 = fArr[1];
                    float f5 = f4 + ((fArr2[1] - f4) * f);
                    float f6 = fArr[2];
                    float f7 = f6 + ((fArr2[2] - f6) * f);
                    float f8 = fArr[3];
                    float f9 = f8 + ((fArr2[3] - f8) * f);
                    float f10 = fArr[4];
                    float f11 = f10 + ((fArr2[4] - f10) * f);
                    float f12 = fArr[5];
                    float f13 = f12 + ((fArr2[5] - f12) * f);
                    float f14 = fArr[6];
                    float f15 = f14 + ((fArr2[6] - f14) * f);
                    float f16 = fArr[7];
                    return new float[]{f2 + ((f3 - f2) * f), f5, f7, f9, f11, f13, f15, f16 + ((fArr2[7] - f16) * f)};
                }
            }, clippableRoundedCornerLayout.b, i());
            valueAnimatorOfObject.addUpdateListener(new fsz(clippableRoundedCornerLayout, 9));
            animatorSetE.playTogether(valueAnimatorOfObject);
        }
        animatorSetE.setDuration(this.d);
        animatorSetE.start();
        g();
    }

    public final void g() {
        this.f = 0.0f;
        this.g = null;
        this.h = null;
    }

    public final void h(fd fdVar, View view, float f) {
        if (super.d(fdVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        int i = fdVar.c;
        float f2 = fdVar.b;
        float f3 = fdVar.a;
        float fA = a(f2);
        View view2 = this.a;
        float width = view2.getWidth();
        float height = view2.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        TimeInterpolator timeInterpolator = sns.a;
        float f4 = (-0.100000024f) * fA;
        float f5 = this.j;
        float fMax = ((Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f5) + 0.0f) * fA) + 0.0f;
        int i2 = i != 0 ? -1 : 1;
        float f6 = f4 + 1.0f;
        float fMin = Math.min(Math.max(0.0f, ((height - (f6 * height)) / 2.0f) - f5), this.k);
        float f7 = f3 - this.f;
        float fAbs = (((Math.abs(f7) / height) * (fMin + 0.0f)) + 0.0f) * Math.signum(f7);
        if (Float.isNaN(f6)) {
            return;
        }
        float f8 = fMax * i2;
        if (Float.isNaN(f8) || Float.isNaN(fAbs)) {
            return;
        }
        view2.setScaleX(f6);
        view2.setScaleY(f6);
        view2.setTranslationX(f8);
        view2.setTranslationY(fAbs);
        if (view2 instanceof ClippableRoundedCornerLayout) {
            float[] fArrI = i();
            float f9 = fArrI[0];
            float f10 = fArrI[1];
            float f11 = fArrI[2];
            float f12 = fArrI[3];
            float f13 = fArrI[4];
            float f14 = fArrI[5];
            float f15 = fArrI[6];
            float f16 = fArrI[7];
            ((ClippableRoundedCornerLayout) view2).b(new float[]{f9 + ((f - f9) * fA), f10 + ((f - f10) * fA), f11 + ((f - f11) * fA), f12 + ((f - f12) * fA), f13 + ((f - f13) * fA), f14 + ((f - f14) * fA), f15 + ((f - f15) * fA), f16 + (fA * (f - f16))});
        }
    }

    public final float[] i() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        int i;
        char c;
        int iJ;
        int iJ2;
        char c2;
        if (this.i == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.a).getRootWindowInsets()) == null) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i4 = iArr[0];
                int i5 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                if (i4 != 0) {
                    i = i4;
                    c = 7;
                    iJ = 0;
                } else if (i5 == 0) {
                    i = 0;
                    iJ = j(rootWindowInsets, 0);
                    c = 7;
                    i5 = 0;
                } else {
                    iJ = 0;
                    i = 0;
                    c = 7;
                }
                int i6 = i + width;
                if (i6 < i2 || i5 != 0) {
                    iJ2 = 0;
                    c2 = 6;
                } else {
                    iJ2 = j(rootWindowInsets, 1);
                    c2 = 6;
                    i5 = 0;
                }
                int iJ3 = (i6 < i2 || i5 + height < i3) ? 0 : j(rootWindowInsets, 2);
                int iJ4 = (i != 0 || i5 + height < i3) ? 0 : j(rootWindowInsets, 3);
                fArr = new float[8];
                float f = iJ;
                fArr[0] = f;
                fArr[1] = f;
                float f2 = iJ2;
                fArr[2] = f2;
                fArr[3] = f2;
                float f3 = iJ3;
                fArr[4] = f3;
                fArr[5] = f3;
                float f4 = iJ4;
                fArr[c2] = f4;
                fArr[c] = f4;
            }
            this.i = fArr;
        }
        return this.i;
    }
}
