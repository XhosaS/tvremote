package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tby extends AnimatorListenerAdapter {
    final /* synthetic */ tca a;

    public tby(tca tcaVar) {
        this.a = tcaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.l(true);
    }
}
