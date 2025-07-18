package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
class avu implements Animation.AnimationListener {
    final /* synthetic */ awc a;

    public avu(awc awcVar) {
        this.a = awcVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        awc awcVar = this.a;
        if (awcVar.c == 0.0f) {
            for (int i = 0; i < awcVar.b.size(); i++) {
                ((View) awcVar.b.get(i)).setVisibility(8);
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
