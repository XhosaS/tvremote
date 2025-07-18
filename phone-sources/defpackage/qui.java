package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qui extends AnimatorListenerAdapter {
    final /* synthetic */ quj a;

    public qui(quj qujVar) {
        this.a = qujVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        quj qujVar = this.a;
        qujVar.a.setVisibility(8);
        qujVar.b.f(null);
    }
}
