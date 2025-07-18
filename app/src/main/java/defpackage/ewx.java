package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class ewx extends AnimatorListenerAdapter {
    final /* synthetic */ jpg a;
    final /* synthetic */ jph b;
    final /* synthetic */ exg c;
    final /* synthetic */ exa d;

    public ewx(exa exaVar, jpg jpgVar, jph jphVar, exg exgVar) {
        this.a = jpgVar;
        this.b = jphVar;
        this.c = exgVar;
        this.d = exaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        exa exaVar = this.d;
        jpg jpgVar = this.a;
        if (exaVar.j(jpgVar)) {
            ((zdv) ((zdv) exa.a.d()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread$2", "onAnimationEnd", 253, "HoverActivityThread.java")).u("#handleDestroyActivity: ready to stop but animation has invalid activity.");
            return;
        }
        jph jphVar = this.b;
        if (!jphVar.d) {
            exaVar.e(jphVar);
        }
        if (exaVar.j(jpgVar)) {
            ((zdv) ((zdv) exa.a.d()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread$2", "onAnimationEnd", 262, "HoverActivityThread.java")).u("#handleDestroyActivity: ready to destroy but animation has invalid activity.");
            return;
        }
        jpgVar.q();
        this.c.c();
        exaVar.c.o();
    }
}
