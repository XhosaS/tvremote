package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fct extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, fcm {
    private final GestureDetector d;
    private final fcr f;
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private final float c = 25.0f;
    private volatile float e = 3.1415927f;

    public fct(Context context, fcr fcrVar) {
        this.f = fcrVar;
        this.d = new GestureDetector(context, this);
    }

    @Override // defpackage.fcm
    public final void a(float[] fArr, float f) {
        this.e = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        PointF pointF = this.a;
        float x = motionEvent2.getX() - pointF.x;
        float y = motionEvent2.getY() - pointF.y;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.e;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f3 = this.c;
        float f4 = y / f3;
        float f5 = x / f3;
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * f5) - (fSin * f4);
        pointF2.y += (fSin * f5) + (fCos * f4);
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, pointF2.y));
        this.f.b(pointF2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f.a.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.d.onTouchEvent(motionEvent);
    }
}
