package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyb extends AnimatorListenerAdapter {
    final /* synthetic */ hye a;

    public hyb(hye hyeVar) {
        this.a = hyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.f.setTranslationY(0.0f);
    }
}
