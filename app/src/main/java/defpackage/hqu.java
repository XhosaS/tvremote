package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hqu extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ TextView b;

    public hqu(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(4);
    }
}
