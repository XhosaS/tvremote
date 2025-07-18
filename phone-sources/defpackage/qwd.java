package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwd extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ qwg a;

    public qwd(qwg qwgVar) {
        this.a = qwgVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.c = false;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r10.e.n != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onScroll(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwd.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
