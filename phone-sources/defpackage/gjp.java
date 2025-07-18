package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjp extends AnimatorListenerAdapter {
    final /* synthetic */ gju a;

    public gjp(gju gjuVar) {
        this.a = gjuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.r();
        animator.removeListener(this);
    }
}
