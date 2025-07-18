package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import defpackage.thi;
import defpackage.thj;
import defpackage.thn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CircularReveal extends ForcedVisibilityTransition {
    private List a;

    public CircularReveal(int i) {
        this(i, 0.0f, 1.0f);
    }

    public CircularReveal addKeyFrame(float f, float f2) {
        addKeyFrame(f, f2, null);
        return this;
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.view;
        float fSqrt = (float) Math.sqrt((view.getWidth() * view.getWidth()) + (view.getHeight() * view.getHeight()));
        int measuredWidth = view.getMeasuredWidth() / 2;
        int measuredHeight = view.getMeasuredHeight() / 2;
        if (!isRevealing()) {
            Collections.reverse(this.a);
        }
        ArrayList arrayList = new ArrayList(this.a.size() - 1);
        Iterator it = this.a.iterator();
        thj thjVar = (thj) it.next();
        while (it.hasNext()) {
            float f = fSqrt / 2.0f;
            thj thjVar2 = (thj) it.next();
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, measuredWidth, measuredHeight, thjVar.b.floatValue() * f, thjVar2.b.floatValue() * f);
            float duration = getDuration();
            animatorCreateCircularReveal.setDuration((long) (isRevealing() ? Math.abs((thjVar2.a.floatValue() * duration) - (thjVar.a.floatValue() * duration)) : Math.abs(((1.0f - thjVar2.a.floatValue()) * duration) - ((1.0f - thjVar.a.floatValue()) * duration))));
            animatorCreateCircularReveal.setInterpolator(isRevealing() ? thjVar2.c : thjVar.c);
            arrayList.add(animatorCreateCircularReveal);
            thjVar = thjVar2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setDuration(getDuration());
        animatorSet.addListener(new thi(this, view));
        return new thn(animatorSet);
    }

    @Override // android.transition.Transition
    public TimeInterpolator getInterpolator() {
        return ((thj) this.a.get(r0.size() - 1)).c;
    }

    @Override // android.transition.Transition
    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        ((thj) this.a.get(r0.size() - 1)).c = timeInterpolator;
        return this;
    }

    public CircularReveal(int i, float f, float f2) {
        super(i);
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        linkedList.add(new thj(0.0f, f, null));
        this.a.add(new thj(1.0f, f2, null));
    }

    public CircularReveal addKeyFrame(float f, float f2, TimeInterpolator timeInterpolator) {
        if (f == 0.0f) {
            this.a.remove(0);
            this.a.add(new thj(f, f2, timeInterpolator));
        } else if (f == 1.0f) {
            this.a.remove(r0.size() - 1);
            this.a.add(new thj(f, f2, timeInterpolator));
        } else {
            this.a.add(new thj(f, f2, timeInterpolator));
        }
        Collections.sort(this.a);
        return this;
    }
}
