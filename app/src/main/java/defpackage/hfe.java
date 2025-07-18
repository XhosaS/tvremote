package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfe extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ FrameLayout.LayoutParams b;
    final /* synthetic */ hff c;

    public hfe(hff hffVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.a = view;
        this.b = layoutParams;
        this.c = hffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a.removeView(this.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.a.addView(this.a, 0, this.b);
    }
}
