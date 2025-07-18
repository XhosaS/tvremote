package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxc extends AnimatorListenerAdapter {
    final /* synthetic */ sxf a;

    public sxc(sxf sxfVar) {
        this.a = sxfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sxf sxfVar = this.a;
        sxfVar.a();
        gku gkuVar = sxfVar.h;
        if (gkuVar != null) {
            gkuVar.b(sxfVar.j);
        }
    }
}
