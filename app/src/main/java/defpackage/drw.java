package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class drw implements View.OnFocusChangeListener {
    public dtu a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        dtu dtuVar = this.a;
        if (dtuVar != null) {
            dyd.a();
            if (dtt.b == null) {
                dtt.b = new dud();
            }
            dud dudVar = dtt.b;
            dudVar.a = view;
            dudVar.b = z;
            dtuVar.b.n().x(dtuVar, dtt.b);
            dtt.b.a = null;
        }
    }
}
