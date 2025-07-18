package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hev extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public hev(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        view.setVisibility(0);
        view.setAlpha(0.0f);
    }
}
