package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iai extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public iai(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.a;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }
}
