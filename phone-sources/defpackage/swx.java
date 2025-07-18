package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swx extends AnimatorListenerAdapter {
    final /* synthetic */ sxa a;

    public swx(sxa sxaVar) {
        this.a = sxaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sxa sxaVar = this.a;
        sxaVar.a();
        gku gkuVar = sxaVar.i;
        if (gkuVar != null) {
            gkuVar.b(sxaVar.j);
        }
    }
}
