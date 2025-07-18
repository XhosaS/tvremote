package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaj {
    private final Context a;
    private final gph b;
    private final Resources c;

    public iaj(Context context, gph gphVar) {
        context.getClass();
        this.a = context;
        this.b = gphVar;
        this.c = context.getResources();
    }

    public final Animator a(View view) {
        view.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        Resources resources = this.c;
        objectAnimatorOfFloat.setDuration(resources.getInteger(R.integer.search_exit_alpha_duration_ms));
        objectAnimatorOfFloat.getClass();
        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
        gph gphVar = this.b;
        gph gphVar2 = gph.a;
        int i = R.dimen.search_bar_motion_amati;
        if (gphVar != gphVar2 && gphVar != gph.c) {
            i = R.dimen.search_bar_height;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, resources.getDimensionPixelSize(i));
        objectAnimatorOfFloat2.setDuration(resources.getInteger(R.integer.search_exit_duration_ms));
        objectAnimatorOfFloat2.setInterpolator(AnimationUtils.loadInterpolator(this.a, R.anim.exit_curve));
        objectAnimatorOfFloat2.getClass();
        builderPlay.with(objectAnimatorOfFloat2);
        animatorSet.addListener(new iai(view));
        return animatorSet;
    }

    public final Animator b(View view) {
        view.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        Resources resources = this.c;
        objectAnimatorOfFloat.setDuration(resources.getInteger(R.integer.search_enter_alpha_duration_ms));
        objectAnimatorOfFloat.addListener(new iah(view));
        objectAnimatorOfFloat.getClass();
        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
        gph gphVar = this.b;
        gph gphVar2 = gph.a;
        int i = R.dimen.search_bar_motion_amati;
        if (gphVar != gphVar2 && gphVar != gph.c) {
            i = R.dimen.search_bar_height;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", resources.getDimensionPixelSize(i), 0.0f);
        objectAnimatorOfFloat2.setDuration(resources.getInteger(R.integer.search_enter_duration_ms));
        objectAnimatorOfFloat2.setInterpolator(AnimationUtils.loadInterpolator(this.a, R.anim.enter_curve));
        objectAnimatorOfFloat2.getClass();
        builderPlay.with(objectAnimatorOfFloat2);
        return animatorSet;
    }
}
