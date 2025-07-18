package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tap extends AnimatorListenerAdapter {
    final /* synthetic */ taz a;

    public tap(taz tazVar) {
        this.a = tazVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l();
    }
}
