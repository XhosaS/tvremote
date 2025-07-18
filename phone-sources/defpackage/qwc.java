package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwc extends AnimatorListenerAdapter {
    final /* synthetic */ qwd a;

    public qwc(qwd qwdVar) {
        this.a = qwdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.setEnabled(true);
    }
}
