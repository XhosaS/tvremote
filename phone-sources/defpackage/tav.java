package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tav extends AnimatorListenerAdapter {
    final /* synthetic */ taz a;

    public tav(taz tazVar) {
        this.a = tazVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }
}
