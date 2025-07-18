package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stn extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ sts b;
    final /* synthetic */ tko c;
    private boolean d;

    public stn(sts stsVar, boolean z, tko tkoVar) {
        this.a = z;
        this.c = tkoVar;
        this.b = stsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sts stsVar = this.b;
        stsVar.A = 0;
        stsVar.v = null;
        if (this.d) {
            return;
        }
        FloatingActionButton floatingActionButton = stsVar.E;
        boolean z = this.a;
        floatingActionButton.j(true != z ? 4 : 8, z);
        tko tkoVar = this.c;
        if (tkoVar != null) {
            tkoVar.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        sts stsVar = this.b;
        stsVar.E.j(0, this.a);
        stsVar.A = 1;
        stsVar.v = animator;
        this.d = false;
    }
}
