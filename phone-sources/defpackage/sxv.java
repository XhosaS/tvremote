package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxv extends AnimatorListenerAdapter {
    final /* synthetic */ sxy a;

    public sxv(sxy sxyVar) {
        this.a = sxyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        sxy sxyVar = this.a;
        sxyVar.e = (sxyVar.e + 1) % sxyVar.d.e.length;
        sxyVar.f = true;
    }
}
