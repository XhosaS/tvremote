package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqt extends AnimatorListenerAdapter {
    final /* synthetic */ pqw a;

    public pqt(pqw pqwVar) {
        this.a = pqwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pqw pqwVar = this.a;
        pqwVar.p = null;
        if (pqwVar.r) {
            return;
        }
        pqwVar.n(pqwVar.a());
    }
}
