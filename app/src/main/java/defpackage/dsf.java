package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class dsf implements View.OnLongClickListener {
    public dtu a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        dtu dtuVar = this.a;
        if (dtuVar != null) {
            dyd.a();
            if (dtt.c == null) {
                dtt.c = new dwc();
            }
            dtt.c.a = view;
            Object objX = dtuVar.b.n().x(dtuVar, dtt.c);
            dtt.c.a = null;
            if (objX != null && ((Boolean) objX).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
