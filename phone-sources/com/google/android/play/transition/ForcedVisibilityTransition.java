package com.google.android.play.transition;

import android.transition.Transition;
import android.transition.TransitionValues;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ForcedVisibilityTransition extends Transition {
    public static final int HIDE = 2;
    public static final int SHOW = 1;
    private static final String[] a = {"play:forcedVisibility:visibility"};
    private final int b;

    public ForcedVisibilityTransition(int i) {
        this.b = i;
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        transitionValues.values.put("play:forcedVisibility:visibility", Integer.valueOf(this.b == 2 ? 4 : transitionValues.view.getVisibility()));
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        transitionValues.values.put("play:forcedVisibility:visibility", Integer.valueOf(this.b == 1 ? 4 : transitionValues.view.getVisibility()));
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return a;
    }

    public boolean isRevealing() {
        return (this.b & 1) != 0;
    }
}
