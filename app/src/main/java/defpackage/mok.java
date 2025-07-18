package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class mok implements GestureDetector.OnGestureListener {
    private final moi a;
    private final boolean b;

    public mok(moi moiVar, boolean z) {
        this.a = moiVar;
        this.b = z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        moi moiVar = this.a;
        View view = (View) moiVar.a.get();
        List list = moiVar.k;
        if (list == null || view == null) {
            return false;
        }
        nzd nzdVar = motionEvent != null ? new nzd(motionEvent.getX(), motionEvent.getY()) : null;
        nzd nzdVar2 = new nzd(motionEvent2.getX(), motionEvent2.getY());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((obt) it.next()).a(view, nzdVar, nzdVar2, f, f2);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        moi moiVar = this.a;
        if (moiVar.m(this.b)) {
            moiVar.a(motionEvent);
        } else if (moiVar.d()) {
            moiVar.a(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawX;
        float rawY;
        moi moiVar = this.a;
        View view = (View) moiVar.a.get();
        ofs ofsVar = moiVar.q;
        List list = moiVar.i;
        if (list == null || view == null) {
            return false;
        }
        if (ofsVar != null) {
            nzd nzdVar = (nzd) ofsVar;
            rawX = motionEvent2.getRawX() - nzdVar.a;
            rawY = motionEvent2.getRawY() - nzdVar.b;
        } else {
            rawX = 0.0f;
            rawY = 0.0f;
        }
        nzd nzdVar2 = motionEvent != null ? new nzd(motionEvent.getX(), motionEvent.getY()) : null;
        nzd nzdVar3 = new nzd(motionEvent2.getX(), motionEvent2.getY());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((obm) it.next()).a(view, nzdVar2, nzdVar3, rawX, rawY);
        }
        moiVar.q = new nzd(motionEvent2.getRawX(), motionEvent2.getRawY());
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        moi moiVar = this.a;
        if (!moiVar.m(this.b) || moiVar.d()) {
            return false;
        }
        moiVar.b(motionEvent);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
