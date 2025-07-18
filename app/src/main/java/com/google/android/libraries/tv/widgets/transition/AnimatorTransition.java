package com.google.android.libraries.tv.widgets.transition;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.uvs;
import defpackage.uvt;
import defpackage.uvu;
import defpackage.uvv;
import defpackage.yqw;
import defpackage.yyk;
import defpackage.zcg;
import defpackage.zdv;
import defpackage.zdy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AnimatorTransition extends Transition {
    public static final yyk a;
    public static final String b;
    private static final zdy e = zdy.h("com/google/android/libraries/tv/widgets/transition/AnimatorTransition");
    private static final Property f;
    private static final String[] g;
    public final int c;
    public final int d;

    /* compiled from: PG */
    public final class AnimatorTarget {
        private final View a;
        private final Float[] b;

        public AnimatorTarget(View view, TransitionValues transitionValues) {
            this.a = view;
            this.b = (Float[]) ((Float[]) transitionValues.values.get(AnimatorTransition.b)).clone();
        }

        private final float a(int i) {
            return this.b[i - 1].floatValue();
        }

        private final void b(int i, float f) {
            Float[] fArr = this.b;
            int i2 = i - 1;
            Float fValueOf = Float.valueOf(f);
            fArr[i2] = fValueOf;
            ((Property) AnimatorTransition.a.get(i2)).set(this.a, fValueOf);
        }

        public float getScale() {
            float fA = a(4);
            yqw.L(fA == a(5));
            return fA;
        }

        public float getScaleX() {
            return a(4);
        }

        public float getScaleY() {
            return a(5);
        }

        public float getTransitionAlpha() {
            return a(1);
        }

        public float getTranslationX() {
            return a(2);
        }

        public float getTranslationY() {
            return a(3);
        }

        public void setScale(float f) {
            b(4, f);
            b(5, f);
        }

        public void setScaleX(float f) {
            b(4, f);
        }

        public void setScaleY(float f) {
            b(5, f);
        }

        public void setTransitionAlpha(float f) {
            b(1, f);
        }

        public void setTranslationX(float f) {
            b(2, f);
        }

        public void setTranslationY(float f) {
            b(3, f);
        }
    }

    static {
        uvs uvsVar = new uvs();
        f = uvsVar;
        a = yyk.r(uvsVar, View.TRANSLATION_X, View.TRANSLATION_Y, View.SCALE_X, View.SCALE_Y);
        String strConcat = String.valueOf(AnimatorTransition.class.getName()).concat(":viewstate");
        b = strConcat;
        g = new String[]{strConcat};
    }

    public AnimatorTransition(int i, int i2) {
        yqw.L(i != 0);
        this.c = i;
        this.d = i2;
    }

    private static void a(Animator animator, SparseArray sparseArray) {
        int i = 0;
        if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            int size = childAnimations.size();
            while (i < size) {
                a(childAnimations.get(i), sparseArray);
                i++;
            }
            return;
        }
        if (!(animator instanceof ObjectAnimator)) {
            return;
        }
        String propertyName = ((ObjectAnimator) animator).getPropertyName();
        while (true) {
            yyk yykVar = a;
            if (i >= ((zcg) yykVar).d) {
                return;
            }
            if (((Property) yykVar.get(i)).getName().equals(propertyName)) {
                sparseArray.put(i, null);
            }
            i++;
        }
    }

    private static void b(TransitionValues transitionValues) {
        yyk yykVar = a;
        int i = ((zcg) yykVar).d;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = (Float) ((Property) yykVar.get(i2)).get(transitionValues.view);
        }
        transitionValues.values.put(b, fArr);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) throws Resources.NotFoundException {
        if (transitionValues2 == null) {
            ((zdv) ((zdv) e.c()).q("com/google/android/libraries/tv/widgets/transition/AnimatorTransition", "createAnimator", 118, "AnimatorTransition.java")).u("No endValues for animator");
            return null;
        }
        View view = transitionValues2.view;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(viewGroup.getContext(), this.c);
        SparseArray sparseArray = new SparseArray();
        Float[] fArr = (Float[]) transitionValues.values.get(b);
        sparseArray.clear();
        a(animatorLoadAnimator, sparseArray);
        boolean z = false;
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt == 0) {
                sparseArray.setValueAt(i, Float.valueOf(1.0f));
            } else {
                sparseArray.setValueAt(i, fArr[iKeyAt]);
            }
        }
        animatorLoadAnimator.addPauseListener(new uvt(this, view, transitionValues, animatorLoadAnimator, viewGroup));
        int i2 = this.d;
        if (i2 != 0 && i2 != view.getLayerType()) {
            z = true;
        }
        animatorLoadAnimator.addListener(new uvu(this, z, view, sparseArray));
        return animatorLoadAnimator;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return g;
    }

    public AnimatorTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uvv.a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.c = resourceId;
        yqw.L(resourceId != 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
