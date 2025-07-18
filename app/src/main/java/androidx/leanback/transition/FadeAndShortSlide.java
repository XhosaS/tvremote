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
import defpackage.atk;
import defpackage.auq;
import defpackage.aur;
import defpackage.aus;
import defpackage.aut;
import defpackage.auu;
import defpackage.auv;
import defpackage.auw;
import defpackage.avo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {
    public float f;
    final auw g;
    private auw i;
    private Visibility j;
    private static final TimeInterpolator h = new DecelerateInterpolator();
    static final auw a = new auq();
    static final auw b = new aur();
    static final auw c = new aus();
    static final auw d = new aut();
    static final auw e = new auu();

    public FadeAndShortSlide() {
        this(8388611);
    }

    private final void d(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final float a(ViewGroup viewGroup) {
        float f = this.f;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.j.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f = this.f;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }

    public final void c(int i) {
        auw auwVar;
        if (i == 48) {
            auwVar = e;
        } else if (i == 80) {
            auwVar = d;
        } else if (i == 112) {
            auwVar = this.g;
        } else if (i == 8388611) {
            auwVar = a;
        } else if (i == 8388613) {
            auwVar = b;
        } else {
            if (i != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            auwVar = c;
        }
        this.i = auwVar;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.j.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        d(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.j.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        d(transitionValues);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.j = (Visibility) this.j.clone();
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
        Animator animatorA = avo.a(view, transitionValues2, i, i2, this.i.a(this, viewGroup, view, iArr), this.i.b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), h, this);
        Animator animatorOnAppear = this.j.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator animatorA = avo.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.i.a(this, viewGroup, view, iArr), this.i.b(this, viewGroup, view, iArr), h, this);
        Animator animatorOnDisappear = this.j.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.j.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.j.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public FadeAndShortSlide(int i) {
        this.j = new Fade();
        this.f = -1.0f;
        this.g = new auv(this);
        c(i);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Fade();
        this.f = -1.0f;
        this.g = new auv(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, atk.j);
        c(typedArrayObtainStyledAttributes.getInt(3, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }
}
