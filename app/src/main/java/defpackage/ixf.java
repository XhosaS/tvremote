package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixf extends AnimatorListenerAdapter {
    final /* synthetic */ String a;
    final /* synthetic */ ixi b;

    public ixf(String str, ixi ixiVar) {
        this.a = str;
        this.b = ixiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        int i = ixi.g;
        TextView textView = this.b.f;
        if (textView != null) {
            textView.setText(this.a);
        }
    }
}
