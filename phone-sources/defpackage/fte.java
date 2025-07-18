package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fte extends AnimatorListenerAdapter {
    final /* synthetic */ PlayerControlView a;
    final /* synthetic */ ftk b;

    public fte(ftk ftkVar, PlayerControlView playerControlView) {
        this.a = playerControlView;
        this.b = ftkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ftk ftkVar = this.b;
        ftkVar.k(2);
        if (ftkVar.u) {
            this.a.post(ftkVar.o);
            ftkVar.u = false;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k(3);
    }
}
