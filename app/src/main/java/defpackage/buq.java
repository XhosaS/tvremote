package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class buq extends AnimatorListenerAdapter {
    final /* synthetic */ bvc a;

    public buq(bvc bvcVar) {
        this.a = bvcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
