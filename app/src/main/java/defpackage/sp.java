package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class sp implements qh {
    final /* synthetic */ sz a;

    public sp(sz szVar) {
        this.a = szVar;
    }

    @Override // defpackage.qh
    public final void a(boolean z) {
        if (z) {
            this.a.m(null, 0);
        }
    }

    @Override // defpackage.qh
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        sz szVar = this.a;
        szVar.t.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        sw swVar = null;
        if (actionMasked == 0) {
            szVar.k = motionEvent.getPointerId(0);
            szVar.c = motionEvent.getX();
            szVar.d = motionEvent.getY();
            szVar.h();
            if (szVar.b == null) {
                List list = szVar.n;
                if (!list.isEmpty()) {
                    View viewC = szVar.c(motionEvent);
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        sw swVar2 = (sw) list.get(size);
                        if (swVar2.h.a == viewC) {
                            swVar = swVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (swVar != null) {
                    szVar.c -= swVar.l;
                    szVar.d -= swVar.m;
                    qv qvVar = swVar.h;
                    szVar.e(qvVar, true);
                    if (szVar.a.remove(qvVar.a)) {
                        szVar.l.c(qvVar);
                    }
                    szVar.m(qvVar, swVar.i);
                    szVar.n(motionEvent, szVar.m, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            szVar.k = -1;
            szVar.m(null, 0);
        } else {
            int i = szVar.k;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                szVar.d(actionMasked, motionEvent, iFindPointerIndex);
            }
        }
        VelocityTracker velocityTracker = szVar.r;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return szVar.b != null;
    }

    @Override // defpackage.qh
    public final void h(MotionEvent motionEvent) {
        sz szVar = this.a;
        szVar.t.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = szVar.r;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (szVar.k == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(szVar.k);
        if (iFindPointerIndex >= 0) {
            szVar.d(actionMasked, motionEvent, iFindPointerIndex);
        }
        qv qvVar = szVar.b;
        if (qvVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        szVar.n(motionEvent, szVar.m, iFindPointerIndex);
                        szVar.f(qvVar);
                        Runnable runnable = szVar.q;
                        szVar.p.removeCallbacks(runnable);
                        runnable.run();
                        szVar.p.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == szVar.k) {
                        szVar.k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        szVar.n(motionEvent, szVar.m, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = szVar.r;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            szVar.m(null, 0);
            szVar.k = -1;
        }
    }
}
