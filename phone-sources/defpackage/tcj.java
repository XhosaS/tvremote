package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcj extends AnimatorListenerAdapter {
    final /* synthetic */ tck a;

    public tcj(tck tckVar) {
        this.a = tckVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tck tckVar = this.a;
        tckVar.x();
        tckVar.d.start();
    }
}
