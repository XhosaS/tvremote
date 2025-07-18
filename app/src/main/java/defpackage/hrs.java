package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrs extends AnimatorListenerAdapter {
    final /* synthetic */ hrt a;

    public hrs(hrt hrtVar) {
        this.a = hrtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hrt hrtVar = this.a;
        hrtVar.d.removeView(hrtVar.f);
        hrtVar.f = null;
    }
}
