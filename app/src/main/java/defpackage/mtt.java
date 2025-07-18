package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtt implements obp {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtt(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obp
    public final boolean a(View view, ofs ofsVar) {
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        mtx mtxVar = this.e;
        mtxVar.b.a(this.a.a(), mtx.g(view, null, 3, ofsVar, null, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
        return true;
    }
}
