package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tbz extends AnimatorListenerAdapter {
    final /* synthetic */ tca a;

    public tbz(tca tcaVar) {
        this.a = tcaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.l(false);
    }
}
