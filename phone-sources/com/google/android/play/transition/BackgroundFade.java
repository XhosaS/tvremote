package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackgroundFade extends Visibility {
    private final int a;
    private final int b;

    public BackgroundFade(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(view, "backgroundColor", this.a, this.b);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        return objectAnimatorOfInt;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(view, "backgroundColor", this.b, this.a);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        return objectAnimatorOfInt;
    }
}
