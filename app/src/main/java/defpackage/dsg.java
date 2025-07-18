package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dsg implements View.OnTouchListener {
    public dtu a;
    public dtu b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dtu dtuVar = this.b;
        if (dtuVar != null) {
            dtt.a(dtuVar, view, motionEvent);
        }
        dtu dtuVar2 = this.a;
        if (dtuVar2 == null) {
            return false;
        }
        dyd.a();
        if (dtt.g == null) {
            dtt.g = new dye();
        }
        dye dyeVar = dtt.g;
        dyeVar.a = view;
        dyeVar.b = motionEvent;
        Object objX = dtuVar2.b.n().x(dtuVar2, dtt.g);
        dye dyeVar2 = dtt.g;
        dyeVar2.a = null;
        dyeVar2.b = null;
        return objX != null && ((Boolean) objX).booleanValue();
    }
}
