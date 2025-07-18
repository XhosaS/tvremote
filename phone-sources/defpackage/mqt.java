package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mqt extends AnimatorListenerAdapter {
    final /* synthetic */ mqv a;

    public mqt(mqv mqvVar) {
        this.a = mqvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.v();
    }
}
