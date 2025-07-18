package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxl extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ nxb b;

    public cxl(nxb nxbVar, View view) {
        this.b = nxbVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nxb nxbVar = this.b;
        nxbVar.r(1.0f);
        cxn.d(this.a, nxbVar);
    }
}
