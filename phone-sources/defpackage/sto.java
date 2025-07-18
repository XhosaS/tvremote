package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sto extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ sts b;
    final /* synthetic */ tko c;

    public sto(sts stsVar, boolean z, tko tkoVar) {
        this.a = z;
        this.c = tkoVar;
        this.b = stsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sts stsVar = this.b;
        stsVar.A = 0;
        stsVar.v = null;
        tko tkoVar = this.c;
        if (tkoVar != null) {
            tkoVar.c();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        sts stsVar = this.b;
        stsVar.E.j(0, this.a);
        stsVar.A = 2;
        stsVar.v = animator;
    }
}
