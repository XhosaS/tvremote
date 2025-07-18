package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ob implements Runnable {
    final /* synthetic */ oc a;

    public ob(oc ocVar) {
        this.a = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc ocVar = this.a;
        ocVar.d();
        View view = ocVar.c;
        if (view.isEnabled() && !view.isLongClickable() && ocVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            ocVar.d = true;
        }
    }
}
