package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class mth implements oby {
    final /* synthetic */ ngv a;
    final /* synthetic */ ogq b;
    final /* synthetic */ obz c;
    final /* synthetic */ nzw d;
    final /* synthetic */ oal e;
    final /* synthetic */ mtx f;

    public mth(mtx mtxVar, ngv ngvVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ngvVar;
        this.b = ogqVar;
        this.c = obzVar;
        this.d = nzwVar;
        this.e = oalVar;
        this.f = mtxVar;
    }

    @Override // defpackage.oby
    public final /* synthetic */ void b(View view, View view2) {
        e(view);
    }

    @Override // defpackage.oby
    public final void e(View view) {
        Set set = mtx.a;
        ngv ngvVar = this.a;
        if (set.contains(ngvVar)) {
            return;
        }
        set.add(ngvVar);
        mtx mtxVar = this.f;
        ogq ogqVar = this.b;
        obz obzVar = this.c;
        nzw nzwVar = this.d;
        oal oalVar = this.e;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 12, null, null, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }
}
