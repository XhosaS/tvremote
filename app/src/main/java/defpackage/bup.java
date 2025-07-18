package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class bup extends AnimatorListenerAdapter {
    final /* synthetic */ we a;
    final /* synthetic */ bvc b;

    public bup(bvc bvcVar, we weVar) {
        this.b = bvcVar;
        this.a = weVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }
}
