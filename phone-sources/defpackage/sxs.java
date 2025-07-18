package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxs extends AnimatorListenerAdapter {
    final /* synthetic */ sxu a;

    public sxs(sxu sxuVar) {
        this.a = sxuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        sxu sxuVar = this.a;
        sxuVar.c = (sxuVar.c + 1) % sxuVar.b.e.length;
        sxuVar.d = true;
    }
}
