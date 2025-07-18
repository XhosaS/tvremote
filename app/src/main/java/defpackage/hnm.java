package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnm extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;

    public hnm(View view, ViewGroup viewGroup) {
        this.a = view;
        this.b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.b;
        viewGroup.setTranslationX(0.0f);
        viewGroup.removeView(this.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(4);
    }
}
