package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mqu extends AnimatorListenerAdapter {
    final /* synthetic */ mqv a;

    public mqu(mqv mqvVar) {
        this.a = mqvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mqv mqvVar = this.a;
        mqvVar.m = 0;
        mqvVar.g.setVisibility(4);
    }
}
