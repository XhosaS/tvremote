package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syu extends AnimatorListenerAdapter {
    final /* synthetic */ syz a;

    public syu(syz syzVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        syz syzVar = this.a;
        syzVar.b.setVisibility(0);
        sym symVar = syzVar.g;
        sin sinVar = symVar.h;
        View view = symVar.e;
        if (view instanceof snr) {
            ((snr) view).a();
        }
        if (view != 0) {
            view.setAlpha(0.0f);
        }
    }
}
