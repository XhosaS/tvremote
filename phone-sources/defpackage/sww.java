package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sww extends AnimatorListenerAdapter {
    final /* synthetic */ sxa a;

    public sww(sxa sxaVar) {
        this.a = sxaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        sxa sxaVar = this.a;
        sxaVar.f = (sxaVar.f + 4) % sxaVar.e.e.length;
    }
}
