package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dsc implements View.OnHoverListener {
    public dtu a;
    public dtu b;

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getActionMasked() == 9) {
            dtu dtuVar = this.a;
            dyd.a();
            if (dtt.e == null) {
                dtt.e = new dum();
            }
            dum dumVar = dtt.e;
            dumVar.a = view;
            dumVar.b = motionEvent;
            Object objX = dtuVar.b.n().x(dtuVar, dtt.e);
            dum dumVar2 = dtt.e;
            dumVar2.a = null;
            dumVar2.b = null;
            return objX != null && ((Boolean) objX).booleanValue();
        }
        if (this.b != null && motionEvent.getActionMasked() == 10) {
            dtu dtuVar2 = this.b;
            dyd.a();
            if (dtt.f == null) {
                dtt.f = new dun();
            }
            dun dunVar = dtt.f;
            dunVar.a = view;
            dunVar.b = motionEvent;
            Object objX2 = dtuVar2.b.n().x(dtuVar2, dtt.f);
            dun dunVar2 = dtt.f;
            dunVar2.a = null;
            dunVar2.b = null;
            if (objX2 != null && ((Boolean) objX2).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
