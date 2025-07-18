package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyc extends AnimatorListenerAdapter {
    final /* synthetic */ hye a;

    public hyc(hye hyeVar) {
        this.a = hyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.f.setHint(R.string.assistant_hold_down_button_prompt);
    }
}
