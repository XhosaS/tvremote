package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class aya extends AnimatorListenerAdapter {
    final /* synthetic */ ayb a;

    public aya(ayb aybVar) {
        this.a = aybVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.B = null;
    }
}
