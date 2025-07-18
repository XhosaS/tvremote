package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iao implements iak {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/searchbar/widget/SearchBarTextAnimationImpl");
    public AnimatorSet a;
    public View b;
    private View d;
    private float e;
    private final long f;
    private final long g;
    private final long h;
    private final float i;
    private final Interpolator j;
    private final Interpolator k;

    public iao(Context context) {
        context.getClass();
        this.f = context.getResources().getInteger(R.integer.search_bar_text_fade_in_duration_ms);
        this.g = context.getResources().getInteger(R.integer.search_bar_text_fade_out_duration_ms);
        this.h = context.getResources().getInteger(R.integer.search_bar_text_slide_out_duration_ms);
        this.i = context.getResources().getDimension(R.dimen.search_bar_text_slide_out);
        this.j = AnimationUtils.loadInterpolator(context, R.anim.slide_up);
        this.k = AnimationUtils.loadInterpolator(context, R.anim.alpha_curve);
    }

    @Override // defpackage.iak
    public final void a() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.a = null;
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.d = null;
        View view2 = this.b;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.b = null;
    }

    @Override // defpackage.iak
    public final void b(View view, float f, Runnable runnable) {
        View view2;
        view.getClass();
        if ((view == this.d && f == this.e && view.getVisibility() == 0) || (view == this.b && f == this.e && view.getVisibility() == 0)) {
            this.b = null;
            return;
        }
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (view != this.d || view.getVisibility() == 8) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f);
        objectAnimatorOfFloat.setDuration(this.f);
        objectAnimatorOfFloat.setInterpolator(this.k);
        objectAnimatorOfFloat.setTarget(view);
        objectAnimatorOfFloat.getClass();
        if ((view != this.d || f == this.e) && (view2 = this.b) != null) {
            animatorSet2.playSequentially(f(view2), objectAnimatorOfFloat);
        } else {
            animatorSet2.play(objectAnimatorOfFloat);
        }
        animatorSet2.addListener(new ian(this, runnable, view, f));
        animatorSet2.start();
        this.a = animatorSet2;
        this.b = null;
        this.e = f;
        this.d = view;
    }

    @Override // defpackage.iak
    public final void c(View view) {
        view.getClass();
        if (this.b != null) {
            ((zdv) c.c().q("com/google/android/apps/tvsearch/searchbar/widget/SearchBarTextAnimationImpl", "performTextExit", 185, "SearchBarTextAnimationImpl.kt")).u("#performTextExit: exiting != null");
        }
        this.b = view;
    }

    @Override // defpackage.iak
    public final void d(View view, View view2) {
        view.getClass();
        view2.getClass();
        if (view2 == this.d) {
            this.d = null;
        }
        this.b = view;
    }

    @Override // defpackage.iak
    public final void e(View view) {
        view.getClass();
        b(view, 1.0f, null);
    }

    public final Animator f(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
        objectAnimatorOfFloat.setDuration(this.g);
        objectAnimatorOfFloat.setInterpolator(this.k);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", this.i);
        objectAnimatorOfFloat2.setDuration(this.h);
        objectAnimatorOfFloat2.setInterpolator(this.j);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.setTarget(view);
        animatorSet.addListener(new ial(view));
        return animatorSet;
    }
}
