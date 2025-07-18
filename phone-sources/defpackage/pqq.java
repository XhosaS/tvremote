package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ pqw a;

    public pqq(pqw pqwVar) {
        this.a = pqwVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.e();
        return true;
    }
}
