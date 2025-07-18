package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mrs extends AnimatorListenerAdapter {
    final /* synthetic */ float a;
    final /* synthetic */ mrt b;

    public mrs(mrt mrtVar, float f) {
        this.a = f;
        this.b = mrtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.g(this.a);
    }
}
