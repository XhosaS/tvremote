package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class eww extends AnimatorListenerAdapter {
    final /* synthetic */ jpg a;
    final /* synthetic */ jph b;
    final /* synthetic */ exa c;

    public eww(exa exaVar, jpg jpgVar, jph jphVar) {
        this.a = jpgVar;
        this.b = jphVar;
        this.c = exaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        exa exaVar = this.c;
        if (exaVar.j(this.a)) {
            ((zdv) ((zdv) exa.a.d()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread$1", "onAnimationEnd", 150, "HoverActivityThread.java")).u("#handleHideActivity: ready to stop but animation has invalid activity.");
            return;
        }
        jph jphVar = this.b;
        if (jphVar.c != null) {
            exaVar.e(jphVar);
        }
    }
}
