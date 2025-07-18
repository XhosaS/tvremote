package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avo {
    public static Animator a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
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
        avn avnVar = new avn(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(avnVar);
        objectAnimatorOfFloat.addListener(avnVar);
        objectAnimatorOfFloat.addPauseListener(avnVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }
}
