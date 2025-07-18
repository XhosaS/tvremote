package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
class akr implements Runnable {
    final /* synthetic */ aks a;

    public akr(aks aksVar) {
        this.a = aksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aks aksVar = this.a;
        if (aksVar.e) {
            if (aksVar.c) {
                aksVar.c = false;
                akq akqVar = aksVar.a;
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                akqVar.e = jCurrentAnimationTimeMillis;
                akqVar.g = -1L;
                akqVar.f = jCurrentAnimationTimeMillis;
                akqVar.h = 0.5f;
            }
            akq akqVar2 = aksVar.a;
            if ((akqVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > akqVar2.g + akqVar2.i) || !aksVar.c()) {
                aksVar.e = false;
                return;
            }
            if (aksVar.d) {
                aksVar.d = false;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                aksVar.b.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            if (akqVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float fA = akqVar2.a(jCurrentAnimationTimeMillis2);
            long j = jCurrentAnimationTimeMillis2 - akqVar2.f;
            akqVar2.f = jCurrentAnimationTimeMillis2;
            aksVar.d((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * akqVar2.d));
            View view = aksVar.b;
            int[] iArr = ahj.a;
            view.postOnAnimation(this);
        }
    }
}
