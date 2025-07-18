package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class heu extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ CharSequence b;

    public heu(TextView textView, CharSequence charSequence) {
        this.a = textView;
        this.b = charSequence;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setText(this.b);
    }
}
