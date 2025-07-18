package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
class bx {
    public final Animation a;
    public final AnimatorSet b;

    public bx(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public bx(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }
}
