package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vn extends AnimatorListenerAdapter {
    private boolean a = false;
    private float b;
    private final View c;
    private final float d;
    private final float e;
    private final int f;
    private final Property g;

    public vn(View view, Property property, float f, float f2, int i) {
        this.g = property;
        this.c = view;
        this.e = f;
        this.d = f2;
        this.f = i;
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.c;
        view.setTag(R.id.lb_slide_transition_value, new float[]{view.getTranslationX(), view.getTranslationY()});
        this.g.set(view, Float.valueOf(this.e));
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.g.set(this.c, Float.valueOf(this.e));
        }
        this.c.setVisibility(this.f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Property property = this.g;
        View view = this.c;
        this.b = ((Float) property.get(view)).floatValue();
        property.set(view, Float.valueOf(this.d));
        view.setVisibility(this.f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        Float fValueOf = Float.valueOf(this.b);
        Property property = this.g;
        View view = this.c;
        property.set(view, fValueOf);
        view.setVisibility(0);
    }
}
