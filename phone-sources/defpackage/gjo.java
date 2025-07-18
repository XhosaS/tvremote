package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjo extends AnimatorListenerAdapter {
    final /* synthetic */ ir a;
    final /* synthetic */ gju b;

    public gjo(gju gjuVar, ir irVar) {
        this.b = gjuVar;
        this.a = irVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.j.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.j.add(animator);
    }
}
