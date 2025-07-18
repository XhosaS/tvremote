package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mte extends AnimatorListenerAdapter {
    final /* synthetic */ gag a;

    public mte(gag gagVar) {
        this.a = gagVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mqp] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.g(false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mqp] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.p();
    }
}
