package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
class nv implements Runnable {
    final /* synthetic */ nz a;

    public nv(nz nzVar) {
        this.a = nzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nz nzVar = this.a;
        int i = nzVar.q;
        if (i == 1) {
            nzVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        nzVar.q = 3;
        ValueAnimator valueAnimator = nzVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
    }
}
