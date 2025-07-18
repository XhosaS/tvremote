package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jcb extends GestureDetector.SimpleOnGestureListener {
    private long a;
    private int b;

    public abstract void a(int i);

    public abstract void b();

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i;
        motionEvent.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.a < 700) {
            i = this.b + 1;
            this.b = i;
        } else {
            this.b = 1;
            i = 1;
        }
        a(i);
        this.a = jCurrentTimeMillis;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.b = 0;
        this.a = 0L;
        b();
        return true;
    }
}
