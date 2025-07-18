package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class hfj extends AnimatorListenerAdapter {
    final /* synthetic */ hfo a;

    public hfj(hfo hfoVar) {
        this.a = hfoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(8);
    }
}
