package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pny extends pnx {
    public final Animator a;
    public int c;
    private final poa d = new poa(this);
    public final int b = -1;

    public pny(Animator animator) {
        this.a = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        ((poc) poc.a.get()).a(this.d);
    }
}
