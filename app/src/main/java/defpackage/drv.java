package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class drv implements View.OnContextClickListener {
    public dtu a;

    @Override // android.view.View.OnContextClickListener
    public final boolean onContextClick(View view) {
        dtu dtuVar = this.a;
        if (dtuVar != null) {
            dyd.a();
            if (dtt.d == null) {
                dtt.d = new dss();
            }
            dtt.d.a = view;
            Object objX = dtuVar.b.n().x(dtuVar, dtt.d);
            dtt.d.a = null;
            if (objX != null && ((Boolean) objX).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
