package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwx extends AnimatorListenerAdapter {
    final /* synthetic */ EditText a;
    final /* synthetic */ Animator b;

    public hwx(EditText editText, Animator animator) {
        this.a = editText;
        this.b = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.b.end();
        this.a.setHint("");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.a.setTranslationY(0.0f);
    }
}
