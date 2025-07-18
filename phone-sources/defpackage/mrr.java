package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mrr extends AnimatorListenerAdapter {
    final /* synthetic */ mrt a;

    public mrr(mrt mrtVar) {
        this.a = mrtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f();
    }
}
