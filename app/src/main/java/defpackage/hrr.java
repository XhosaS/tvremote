package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrr extends AnimatorListenerAdapter {
    final /* synthetic */ hrt a;

    public hrr(hrt hrtVar) {
        this.a = hrtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.e.setVisibility(0);
    }
}
