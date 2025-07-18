package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mti implements oby {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mti(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.oby
    public final void b(View view, View view2) {
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        mtx mtxVar = this.e;
        oaa oaaVar = mtxVar.b;
        oal oalVar = this.d;
        oaaVar.a(this.a.a(), mtx.g(view, view2, 13, null, null, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }

    @Override // defpackage.oby
    public final void e(View view) {
        throw null;
    }
}
