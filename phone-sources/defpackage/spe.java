package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spe extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    public spe(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        if (bottomAppBar.m) {
            return;
        }
        bottomAppBar.p(bottomAppBar.d, bottomAppBar.n);
    }
}
