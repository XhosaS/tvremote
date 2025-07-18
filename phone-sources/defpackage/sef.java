package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sef extends AnimatorListenerAdapter {
    final /* synthetic */ seh a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ sej d;

    public sef(sej sejVar, seh sehVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = sehVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = sejVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        sej sejVar = this.d;
        seh sehVar = this.a;
        sejVar.dispatchChangeFinished(sehVar.a, true);
        sejVar.h.remove(sehVar.a);
        sejVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.dispatchChangeStarting(this.a.a, true);
    }
}
