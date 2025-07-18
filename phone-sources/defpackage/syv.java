package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syv extends AnimatorListenerAdapter {
    final /* synthetic */ syz a;

    public syv(syz syzVar) {
        this.a = syzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        syz syzVar = this.a;
        syzVar.b.setVisibility(8);
        sys sysVar = syzVar.a;
        if (!sysVar.o()) {
            sysVar.d();
        }
        sysVar.p(2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.p(1);
    }
}
