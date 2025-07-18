package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
class mpa extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ mpb a;

    public mpa(mpb mpbVar) {
        this.a = mpbVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        mpb mpbVar = this.a;
        mpbVar.j = motionEvent.getX();
        mpbVar.k = motionEvent.getY();
        mpbVar.l = 1;
        return true;
    }
}
