package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
class bth implements Animation.AnimationListener {
    final /* synthetic */ btl a;

    public bth(btl btlVar) {
        this.a = btlVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.l(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
