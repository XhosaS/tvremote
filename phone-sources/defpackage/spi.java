package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spi extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    public spi(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        bottomAppBar.n();
        bottomAppBar.m = false;
        bottomAppBar.c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.o();
    }
}
