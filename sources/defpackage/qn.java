package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Looper;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qn {
    public static sf a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        sf sfVarN = sf.n(rootWindowInsets);
        sfVarN.r(sfVarN);
        sfVarN.p(view.getRootView());
        return sfVarN;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static void c(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(false);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 256);
            window.setDecorFitsSystemWindows(false);
        }
    }

    public static Animator d(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(R.id.transitionPosition)) != null) {
            f = (r2[0] - i) + translationX;
            f5 = (r2[1] - i2) + translationY;
        }
        int iRound = i + Math.round(f - translationX);
        int iRound2 = i2 + Math.round(f5 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f5);
        if (f == f3 && f5 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f5);
        path.lineTo(f3, f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        vo voVar = new vo(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(voVar);
        objectAnimatorOfFloat.addListener(voVar);
        objectAnimatorOfFloat.addPauseListener(voVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    public static int h(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public void e(agf agfVar) {
        throw null;
    }

    @Deprecated
    public afx f(Context context, Looper looper, aid aidVar, Object obj, agc agcVar, agd agdVar) {
        return g(context, looper, aidVar, obj, agcVar, agdVar);
    }

    public afx g(Context context, Looper looper, aid aidVar, Object obj, agx agxVar, ahl ahlVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
