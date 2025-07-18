package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxw extends AnimatorListenerAdapter {
    final /* synthetic */ sxy a;

    public sxw(sxy sxyVar) {
        this.a = sxyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sxy sxyVar = this.a;
        sxyVar.a();
        gku gkuVar = sxyVar.h;
        if (gkuVar != null) {
            gkuVar.b(sxyVar.j);
        }
    }
}
