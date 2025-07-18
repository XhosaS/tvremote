package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfo {
    public final View a;
    public final View b;
    public final AnimatorSet c;
    public AnimatorSet d;
    public final hgj e;
    private final ViewGroup f;
    private final ViewGroup g;
    private final AnimatorSet h;

    public hfo(ViewGroup viewGroup, ViewGroup viewGroup2, hgj hgjVar) throws Resources.NotFoundException {
        this.e = hgjVar;
        View viewFindViewById = viewGroup.findViewById(R.id.keyboard_arrow_up);
        this.a = viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.chevron_discover_text);
        this.b = viewFindViewById2;
        this.g = viewGroup;
        this.f = viewGroup2;
        Animator animatorA = a(viewFindViewById);
        Animator animatorB = b(viewFindViewById);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(viewFindViewById.getContext(), R.animator.chevron_transition);
        animatorLoadAnimator.setTarget(viewFindViewById);
        animatorLoadAnimator.addListener(new hfn(viewFindViewById));
        Animator animatorA2 = a(viewFindViewById);
        Animator animatorA3 = a(viewFindViewById2);
        Animator animatorB2 = b(viewFindViewById2);
        Animator animatorB3 = b(viewFindViewById2);
        animatorB3.setStartDelay(viewFindViewById2.getContext().getResources().getInteger(R.integer.chevron_transition_duration_ms));
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playSequentially(animatorA, animatorLoadAnimator, animatorA3, animatorB3, animatorA2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        animatorSet2.playTogether(animatorB, animatorB2);
        animatorSet2.addListener(new hfj(this));
        animatorSet2.addListener(new hfk(this));
        this.d = animatorSet2;
    }

    static Animator a(View view) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(view.getContext(), R.animator.chevron_enter);
        animatorLoadAnimator.setTarget(view);
        animatorLoadAnimator.addListener(new hfl(view));
        return animatorLoadAnimator;
    }

    public static Animator b(View view) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(view.getContext(), R.animator.chevron_exit);
        animatorLoadAnimator.setTarget(view);
        animatorLoadAnimator.addListener(new hfm(view));
        return animatorLoadAnimator;
    }

    public final void c() {
        AnimatorSet animatorSet = this.d;
        AnimatorSet animatorSet2 = this.h;
        if (animatorSet == animatorSet2) {
            return;
        }
        if (animatorSet != null && animatorSet.isRunning()) {
            this.d.cancel();
        }
        this.d = animatorSet2;
        if (this.a.getVisibility() == 8 && this.b.getVisibility() == 8) {
            return;
        }
        this.d.start();
    }

    final void d(float f) {
        this.a.setTranslationY(f);
        this.b.setTranslationY(f);
    }

    public final boolean e() {
        if (this.d != this.c) {
            return false;
        }
        if (this.f.hasFocus()) {
            return true;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            return false;
        }
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == viewGroup) {
            viewFindFocus = null;
        }
        return FocusFinder.getInstance().findNextFocus(viewGroup, viewFindFocus, 130) == null;
    }

    public final boolean f() {
        ViewGroup viewGroup;
        if (this.d != this.c || (viewGroup = this.g) == null) {
            return false;
        }
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == viewGroup) {
            viewFindFocus = null;
        }
        return FocusFinder.getInstance().findNextFocus(viewGroup, viewFindFocus, 33) == null;
    }
}
