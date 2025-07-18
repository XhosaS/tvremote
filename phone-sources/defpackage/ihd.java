package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihd extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ihe a;

    public ihd(ihe iheVar) {
        this.a = iheVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        if (motionEvent == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f2) >= 50.0f && Math.abs(y) >= 100.0f) {
            if (y > 0.0f) {
                krd.b("Swipe down detected.");
                this.a.a();
            } else {
                krd.b("Swipe up detected.");
                this.a.d();
            }
            return true;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(f) < 50.0f || Math.abs(x) < 100.0f) {
            return false;
        }
        if (x > 0.0f) {
            krd.b("Swipe right detected.");
            this.a.c(x);
        } else {
            krd.b("Swipe left detected.");
            this.a.b(x);
        }
        return true;
    }
}
