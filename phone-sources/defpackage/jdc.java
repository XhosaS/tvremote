package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdc extends AnimatorListenerAdapter {
    final /* synthetic */ jdd a;

    public jdc(jdd jddVar) {
        this.a = jddVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        jdd jddVar = this.a;
        jdg jdgVar = jddVar.E;
        if (jdgVar != null) {
            jdgVar.b(false);
        }
        jdh jdhVar = jddVar.O;
        if (jdhVar == null) {
            yks.c("bingeWatchHelper");
            jdhVar = null;
        }
        jdhVar.c = 5;
    }
}
