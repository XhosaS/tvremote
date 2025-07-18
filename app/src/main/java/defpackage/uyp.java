package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uyp extends AnimatorListenerAdapter {
    final /* synthetic */ HideViewOnScrollBehavior a;

    public uyp(HideViewOnScrollBehavior hideViewOnScrollBehavior) {
        this.a = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c = null;
    }
}
