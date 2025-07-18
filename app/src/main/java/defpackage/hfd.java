package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfd extends AnimatorListenerAdapter {
    final /* synthetic */ hff a;

    public hfd(hff hffVar) {
        this.a = hffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hff hffVar = this.a;
        hfo hfoVar = hffVar.f;
        if (hfoVar != null) {
            hfoVar.d(0.0f);
        }
        hffVar.g.setTranslationY(0.0f);
    }
}
