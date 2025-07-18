package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spl extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    public spl(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        bottomAppBar.r.onAnimationStart(animator);
        FloatingActionButton floatingActionButtonL = bottomAppBar.l();
        if (floatingActionButtonL != null) {
            floatingActionButtonL.setTranslationX(bottomAppBar.e());
        }
    }
}
