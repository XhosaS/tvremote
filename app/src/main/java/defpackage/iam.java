package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iam extends AnimatorListenerAdapter {
    final /* synthetic */ iao a;

    public iam(iao iaoVar) {
        this.a = iaoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.a = null;
    }
}
