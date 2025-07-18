package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ri extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ apl b;

    public ri(apl aplVar, View view) {
        this.b = aplVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        apl aplVar = this.b;
        aplVar.h(1.0f);
        rl.d(this.a, aplVar);
    }
}
