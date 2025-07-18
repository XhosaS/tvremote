package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class ewz extends AnimatorListenerAdapter {
    final /* synthetic */ jpg a;

    public ewz(jpg jpgVar) {
        this.a = jpgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jpg jpgVar = this.a;
        if (jpgVar.A()) {
            return;
        }
        jpgVar.r();
    }
}
