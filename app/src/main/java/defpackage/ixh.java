package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixh extends AnimatorListenerAdapter {
    final /* synthetic */ agwe a;
    final /* synthetic */ ixi b;

    public ixh(agwe agweVar, ixi ixiVar) {
        this.a = agweVar;
        this.b = ixiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.a.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        final ixi ixiVar = this.b;
        Handler handler = new Handler(ixiVar.getMainLooper());
        final agwe agweVar = this.a;
        handler.post(new Runnable() { // from class: ixg
            @Override // java.lang.Runnable
            public final void run() {
                ixc ixcVar;
                ixi ixiVar2 = ixiVar;
                ixiVar2.eD();
                if (agweVar.a || (ixcVar = ixiVar2.e) == null) {
                    return;
                }
                ixcVar.j();
            }
        });
    }
}
