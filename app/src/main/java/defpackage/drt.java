package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class drt implements View.OnClickListener {
    private final dtu a;

    public drt(dtu dtuVar) {
        this.a = dtuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = ebc.a;
        dtu dtuVar = this.a;
        dyd.a();
        if (dtt.a == null) {
            dtt.a = new drf();
        }
        dtt.a.a = view;
        dtuVar.b.n().x(dtuVar, dtt.a);
        dtt.a.a = null;
    }
}
