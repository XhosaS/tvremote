package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stb extends AnimatorListenerAdapter {
    final /* synthetic */ stt a;
    private boolean b;

    public stb(stt sttVar) {
        this.a = sttVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        stt sttVar = this.a;
        sttVar.f();
        if (this.b) {
            return;
        }
        sttVar.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g(animator);
        this.b = false;
    }
}
