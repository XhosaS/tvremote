package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pnx extends AnimatorListenerAdapter {
    private final ko a = new ko();

    public final boolean a(Animator animator) {
        ko koVar = this.a;
        return koVar.containsKey(animator) && ((Boolean) koVar.get(animator)).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, false);
    }
}
