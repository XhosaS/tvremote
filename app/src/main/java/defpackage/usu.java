package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usu implements Animator.AnimatorListener {
    final /* synthetic */ usx a;

    public usu(usx usxVar) {
        this.a = usxVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        usx usxVar = this.a;
        usxVar.e.a = 4;
        usxVar.d = usxVar.c;
        usxVar.d();
        usxVar.invalidateSelf();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
