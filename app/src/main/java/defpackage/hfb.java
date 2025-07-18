package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfb extends AnimatorListenerAdapter {
    final /* synthetic */ hff a;

    public hfb(hff hffVar) {
        this.a = hffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.h.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hff hffVar = this.a;
        hffVar.h.b();
        hffVar.i.c();
        hfo hfoVar = hffVar.f;
        if (hfoVar != null) {
            hfoVar.c();
        }
    }
}
