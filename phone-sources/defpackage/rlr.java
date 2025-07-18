package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlr extends AnimatorListenerAdapter {
    final /* synthetic */ rme a;

    public rlr(rme rmeVar) {
        this.a = rmeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
