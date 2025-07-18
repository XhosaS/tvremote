package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxb extends AnimatorListenerAdapter {
    final /* synthetic */ sxf a;

    public sxb(sxf sxfVar) {
        this.a = sxfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        sxf sxfVar = this.a;
        int i = sxfVar.e;
        int length = sxf.a.length;
        sxfVar.e = (i + 4) % sxfVar.d.e.length;
    }
}
