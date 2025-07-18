package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import defpackage.qm;
import defpackage.qn;
import defpackage.ux;
import defpackage.uy;
import defpackage.uz;
import defpackage.va;
import defpackage.vb;
import defpackage.vc;
import defpackage.vd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {
    final qm f;
    private Visibility h;
    private float i;
    private qm j;
    private static final TimeInterpolator g = new DecelerateInterpolator();
    static final qm a = new uy();
    static final qm b = new uz();
    static final qm c = new va();
    static final qm d = new vb();
    static final qm e = new vc();

    public FadeAndShortSlide() {
        this(8388611);
    }

    private static final void d(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final float a(ViewGroup viewGroup) {
        float f = this.i;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.h.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f = this.i;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }

    public final void c(int i) {
        qm qmVar;
        if (i == 48) {
            qmVar = e;
        } else if (i == 80) {
            qmVar = d;
        } else if (i == 112) {
            qmVar = this.f;
        } else if (i == 8388611) {
            qmVar = a;
        } else if (i == 8388613) {
            qmVar = b;
        } else {
            if (i != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            qmVar = c;
        }
        this.j = qmVar;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.h.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        d(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.h.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        d(transitionValues);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.h = (Visibility) this.h.clone();
        return fadeAndShortSlide;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        Animator animatorD = qn.d(view, transitionValues2, i, i2, this.j.s(this, viewGroup, view, iArr), this.j.t(this, viewGroup, view, iArr), translationX, view.getTranslationY(), g, this);
        Animator animatorOnAppear = this.h.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorD == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return animatorD;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorD).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator animatorD = qn.d(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.j.s(this, viewGroup, view, iArr), this.j.t(this, viewGroup, view, iArr), g, this);
        Animator animatorOnDisappear = this.h.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorD == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return animatorD;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorD).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.h.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.h.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public FadeAndShortSlide(int i) {
        this.h = new Fade();
        this.i = -1.0f;
        this.f = new vd(this);
        c(i);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Fade();
        this.i = -1.0f;
        this.f = new vd(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ux.g);
        c(typedArrayObtainStyledAttributes.getInt(3, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }
}
