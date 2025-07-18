package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
class avw implements Animation.AnimationListener {
    final /* synthetic */ awc a;

    public avw(awc awcVar) {
        this.a = awcVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        awc awcVar = this.a;
        if (awcVar.e == 0.0d) {
            for (int i = 0; i < awcVar.a.size(); i++) {
                ((View) awcVar.a.get(i)).setVisibility(8);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
