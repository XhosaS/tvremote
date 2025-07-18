package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spj extends AnimatorListenerAdapter {
    public boolean a;
    final /* synthetic */ ActionMenuView b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ BottomAppBar e;

    public spj(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.b = actionMenuView;
        this.c = i;
        this.d = z;
        this.e = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        BottomAppBar bottomAppBar = this.e;
        bottomAppBar.q(0);
        bottomAppBar.w(this.b, this.c, this.d);
    }
}
