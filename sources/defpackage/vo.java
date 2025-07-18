package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vo extends AnimatorListenerAdapter implements Transition.TransitionListener {
    private final View a;
    private final View b;
    private final int c;
    private final int d;
    private int[] e;
    private float f;
    private float g;
    private final float h;
    private final float i;

    public vo(View view, View view2, int i, int i2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.c = i - Math.round(view.getTranslationX());
        this.d = i2 - Math.round(view.getTranslationY());
        this.h = f;
        this.i = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transitionPosition);
        this.e = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transitionPosition, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.e == null) {
            this.e = new int[2];
        }
        int[] iArr = this.e;
        int i = this.c;
        View view = this.b;
        iArr[0] = Math.round(i + view.getTranslationX());
        this.e[1] = Math.round(this.d + view.getTranslationY());
        this.a.setTag(R.id.transitionPosition, this.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.b;
        this.f = view.getTranslationX();
        this.g = view.getTranslationY();
        view.setTranslationX(this.h);
        view.setTranslationY(this.i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        View view = this.b;
        view.setTranslationX(this.h);
        view.setTranslationY(this.i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
