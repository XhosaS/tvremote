package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hww extends AnimatorListenerAdapter {
    final /* synthetic */ EditText a;
    final /* synthetic */ int b;

    public hww(EditText editText, int i) {
        this.a = editText;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.setHint(this.b);
    }
}
