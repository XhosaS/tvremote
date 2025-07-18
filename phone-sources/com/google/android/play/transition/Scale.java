package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Scale extends Transition {
    public static final long ANIMATION_DURATION_MS = 400;
    private static final String[] a = {"play:scale:bounds", "play:scale:windowX", "play:scale:windowY"};
    private final boolean b;
    private final int[] c = new int[2];
    private int d;
    private boolean e;

    public Scale(boolean z) {
        this.b = z;
    }

    private final void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put("play:scale:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        View view2 = transitionValues.view;
        int[] iArr = this.c;
        view2.getLocationInWindow(iArr);
        transitionValues.values.put("play:scale:windowX", Integer.valueOf(iArr[0]));
        transitionValues.values.put("play:scale:windowY", Integer.valueOf(iArr[1]));
    }

    protected static Rect matchAspectRatio(float f, Rect rect) {
        Rect rect2 = new Rect(rect);
        if (rect.width() / rect.height() != f) {
            if (rect.width() > rect.height()) {
                int iWidth = (int) ((rect.width() - (rect.height() * f)) / 2.0f);
                rect2.set(rect.left + iWidth, rect.top, rect.right - iWidth, rect.bottom);
                return rect2;
            }
            int iHeight = (int) ((rect.height() - ((int) (rect.width() * f))) / 2.0f);
            rect2.set(rect.left, rect.top + iHeight, rect.right, rect.bottom - iHeight);
        }
        return rect2;
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        return getHeroAnimator(viewGroup, transitionValues, transitionValues2);
    }

    public Scale forceMaintainAspectRatio(boolean z) {
        this.e = z;
        return this;
    }

    protected Animator getHeroAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float fHeight;
        Rect rectMatchAspectRatio = (Rect) transitionValues.values.get("play:scale:bounds");
        Rect rectMatchAspectRatio2 = (Rect) transitionValues2.values.get("play:scale:bounds");
        boolean z = this.b;
        if (z) {
            int i = this.d;
            rectMatchAspectRatio.inset(i, i);
            if (this.e) {
                rectMatchAspectRatio = matchAspectRatio(rectMatchAspectRatio2.width() / rectMatchAspectRatio2.height(), rectMatchAspectRatio);
            }
        } else {
            int i2 = this.d;
            rectMatchAspectRatio2.inset(i2, i2);
            if (this.e) {
                rectMatchAspectRatio2 = matchAspectRatio(rectMatchAspectRatio.width() / rectMatchAspectRatio.height(), rectMatchAspectRatio2);
            }
        }
        View view = transitionValues2.view;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.X, (Property<View, Float>) View.Y, getPathMotion().getPath(rectMatchAspectRatio.left, rectMatchAspectRatio.top, rectMatchAspectRatio2.left, rectMatchAspectRatio2.top));
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float fWidth = rectMatchAspectRatio.width();
        float fWidth2 = rectMatchAspectRatio2.width();
        float fHeight2 = rectMatchAspectRatio.height();
        float fHeight3 = rectMatchAspectRatio2.height();
        float f = 1.0f;
        if (z || this.d == 0) {
            fHeight = 1.0f;
        } else {
            int iWidth = rectMatchAspectRatio2.width();
            int i3 = this.d;
            int i4 = iWidth - (i3 + i3);
            float fWidth3 = rectMatchAspectRatio2.width();
            int iHeight = rectMatchAspectRatio2.height();
            int i5 = this.d;
            fHeight = (iHeight - (i5 + i5)) / rectMatchAspectRatio2.height();
            f = i4 / fWidth3;
        }
        float f2 = fHeight2 / fHeight3;
        float f3 = fWidth / fWidth2;
        view.setX(rectMatchAspectRatio.left);
        view.setY(rectMatchAspectRatio.top);
        view.setScaleX(f3);
        view.setScaleY(f2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f3, f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f2, fHeight);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat);
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(getInterpolator());
        return animatorSet;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return a;
    }

    public Scale setOriginatingViewInset(int i) {
        this.d = i;
        return this;
    }
}
