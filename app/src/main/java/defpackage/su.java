package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class su extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ sz b;

    public su(sz szVar) {
        this.b = szVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        sz szVar;
        View viewC;
        if (this.a && (viewC = (szVar = this.b).c(motionEvent)) != null && szVar.p.l(viewC) != null && szVar.l.h(szVar.p)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = szVar.k;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                szVar.c = x;
                szVar.d = y;
                szVar.h = 0.0f;
                szVar.g = 0.0f;
            }
        }
    }
}
