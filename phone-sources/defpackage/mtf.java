package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtf extends AnimatorListenerAdapter {
    final /* synthetic */ gag a;

    public mtf(gag gagVar) {
        this.a = gagVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mqv mqvVar = (mqv) this.a.a;
        mqvVar.l = true;
        mqvVar.v();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mqp] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.g(true);
    }
}
