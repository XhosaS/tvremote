package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class moj implements GestureDetector.OnDoubleTapListener {
    private final moi a;

    public moj(moi moiVar) {
        this.a = moiVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        moi moiVar;
        List<mtp> list;
        if (motionEvent.getActionMasked() != 1 || (list = (moiVar = this.a).f) == null) {
            return false;
        }
        for (mtp mtpVar : list) {
            View view = (View) moiVar.a.get();
            nzd nzdVar = new nzd(motionEvent.getX(), motionEvent.getY());
            mtx mtxVar = mtpVar.e;
            oaa oaaVar = mtxVar.b;
            CommandOuterClass$Command commandOuterClass$CommandA = mtpVar.a.a();
            obz obzVar = mtpVar.b;
            nzw nzwVar = mtpVar.c;
            oal oalVar = mtpVar.d;
            oaaVar.a(commandOuterClass$CommandA, mtx.g(view, null, 2, nzdVar, null, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.b(motionEvent);
        return false;
    }
}
