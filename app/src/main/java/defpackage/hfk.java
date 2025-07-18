package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class hfk extends AnimatorListenerAdapter {
    final /* synthetic */ hfo a;

    public hfk(hfo hfoVar) {
        this.a = hfoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hfo hfoVar = this.a;
        hfoVar.a.setVisibility(8);
        hfoVar.b.setVisibility(8);
    }
}
