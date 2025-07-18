package com.google.android.apps.tvsearch.results.activity;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingAnimationDelegate {
    public final ObjectAnimator a;
    private final int b;
    private final int c;
    private final int d;
    private final View e;
    private float f;

    public PaddingAnimationDelegate(FrameLayout frameLayout, View view, float f) {
        float paddingTop = view.getPaddingTop();
        this.e = view;
        this.b = view.getPaddingBottom();
        this.c = view.getPaddingEnd();
        this.d = view.getPaddingStart();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "topPadding", f, paddingTop);
        this.a = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(frameLayout.getResources().getInteger(R.integer.launch_full_screen_duration_ms));
        objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(frameLayout.getContext(), R.anim.enter_curve));
    }

    public float getTopPadding() {
        return this.f;
    }

    public void setTopPadding(float f) {
        this.e.setPaddingRelative(this.d, (int) f, this.c, this.b);
        this.f = f;
    }
}
