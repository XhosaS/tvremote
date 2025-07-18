package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class aid extends AnimatorListenerAdapter {
    final /* synthetic */ aik a;
    final /* synthetic */ View b;

    public aid(aik aikVar, View view) {
        this.a = aikVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aik aikVar = this.a;
        aikVar.a.k(1.0f);
        aig.c(this.b, aikVar);
    }
}
