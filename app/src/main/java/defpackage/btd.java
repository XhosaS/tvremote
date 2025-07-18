package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
class btd implements Animation.AnimationListener {
    final /* synthetic */ btl a;

    public btd(btl btlVar) {
        this.a = btlVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ejj ejjVar;
        btl btlVar = this.a;
        if (!btlVar.a) {
            btlVar.c();
            return;
        }
        btb btbVar = btlVar.i;
        btbVar.setAlpha(255);
        btbVar.start();
        if (btlVar.j && (ejjVar = btlVar.l) != null) {
            int i = ehp.G;
            ehl ehlVar = new ehl();
            dtu dtuVar = ejjVar.a;
        }
        btlVar.c = btlVar.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
