package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iab extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public iab(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setTranslationY(0.0f);
        view.setAlpha(0.0f);
    }
}
