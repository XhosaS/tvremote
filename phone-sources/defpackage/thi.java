package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.play.transition.CircularReveal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thi extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ CircularReveal b;

    public thi(CircularReveal circularReveal, View view) {
        this.a = view;
        this.b = circularReveal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.isRevealing()) {
            return;
        }
        View view = this.a;
        view.setVisibility(4);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
