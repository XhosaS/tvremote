package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhj extends AnimatorListenerAdapter {
    final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public bhj(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c = null;
    }
}
