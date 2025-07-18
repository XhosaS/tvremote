package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ian extends AnimatorListenerAdapter {
    final /* synthetic */ iao a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ View c;
    final /* synthetic */ float d;

    public ian(iao iaoVar, Runnable runnable, View view, float f) {
        this.a = iaoVar;
        this.b = runnable;
        this.c = view;
        this.d = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        View view = this.c;
        view.setTranslationY(0.0f);
        view.setAlpha(this.d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.a = null;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
