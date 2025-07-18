package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class htp extends AnimatorListenerAdapter {
    final /* synthetic */ htq a;

    public htp(htq htqVar) {
        this.a = htqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aj.c();
    }
}
