package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syw extends AnimatorListenerAdapter {
    final /* synthetic */ syz a;

    public syw(syz syzVar) {
        this.a = syzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sys sysVar = this.a.a;
        if (!sysVar.o()) {
            sysVar.g();
        }
        sysVar.p(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        syz syzVar = this.a;
        syzVar.b.setVisibility(0);
        syzVar.a.p(3);
    }
}
