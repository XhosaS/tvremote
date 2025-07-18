package defpackage;

import android.content.res.Resources;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlr implements idy {
    final /* synthetic */ DetailsActivity a;
    private final idy b;
    private final /* synthetic */ int c;
    private final kuw d;

    public mlr(DetailsActivity detailsActivity, idy idyVar, kuw kuwVar, int i) {
        this.c = i;
        this.a = detailsActivity;
        this.b = idyVar;
        this.d = kuwVar;
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) throws Resources.NotFoundException {
        int i = this.c;
        if (i == 0) {
            kvj kvjVar = (kvj) obj;
            String str = kvjVar.b;
            this.b.c(ieg.f(str));
            DetailsActivity detailsActivity = this.a;
            detailsActivity.setTitle(str);
            detailsActivity.b.d(str);
            this.d.m(kvjVar.d);
            itk itkVar = detailsActivity.v;
            vtw vtwVarM = wlx.a.m();
            vtw vtwVarM2 = wlw.a.m();
            vtw vtwVarM3 = wlv.a.m();
            String string = kvjVar.c.toString();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wlv wlvVar = (wlv) vtwVarM3.b;
            string.getClass();
            wlvVar.b = string;
            vtwVarM2.aL((wlv) vtwVarM3.r());
            wlw wlwVar = (wlw) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wlx wlxVar = (wlx) vtwVarM.b;
            wlwVar.getClass();
            wlxVar.c = wlwVar;
            wlxVar.b = 3;
            itkVar.l(str, (wlx) vtwVarM.r());
            return;
        }
        if (i != 1) {
            kwn kwnVar = (kwn) obj;
            String str2 = kwnVar.g;
            this.b.c(ieg.f(str2));
            DetailsActivity detailsActivity2 = this.a;
            detailsActivity2.setTitle(str2);
            detailsActivity2.b.d(str2);
            this.d.m(kwnVar.h);
            itk itkVar2 = detailsActivity2.v;
            vtw vtwVarM4 = wlx.a.m();
            vtw vtwVarM5 = wlw.a.m();
            vtw vtwVarM6 = wlv.a.m();
            String string2 = kwnVar.e.toString();
            if (!vtwVarM6.b.A()) {
                vtwVarM6.u();
            }
            wlv wlvVar2 = (wlv) vtwVarM6.b;
            string2.getClass();
            wlvVar2.b = string2;
            vtwVarM5.aL((wlv) vtwVarM6.r());
            wlw wlwVar2 = (wlw) vtwVarM5.r();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            wlx wlxVar2 = (wlx) vtwVarM4.b;
            wlwVar2.getClass();
            wlxVar2.c = wlwVar2;
            wlxVar2.b = 3;
            itkVar2.l(str2, (wlx) vtwVarM4.r());
            return;
        }
        kvf kvfVar = (kvf) obj;
        String strE = kvfVar.E();
        this.b.c(ieg.f(strE));
        DetailsActivity detailsActivity3 = this.a;
        detailsActivity3.setTitle(strE);
        detailsActivity3.b.d(strE);
        this.d.m(kvfVar.h());
        itk itkVar3 = detailsActivity3.v;
        vtw vtwVarM7 = wlx.a.m();
        vtw vtwVarM8 = wlw.a.m();
        vtw vtwVarM9 = wlv.a.m();
        String string3 = kvfVar.g().toString();
        if (!vtwVarM9.b.A()) {
            vtwVarM9.u();
        }
        wlv wlvVar3 = (wlv) vtwVarM9.b;
        string3.getClass();
        wlvVar3.b = string3;
        vtwVarM8.aL((wlv) vtwVarM9.r());
        wlw wlwVar3 = (wlw) vtwVarM8.r();
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        wlx wlxVar3 = (wlx) vtwVarM7.b;
        wlwVar3.getClass();
        wlxVar3.c = wlwVar3;
        wlxVar3.b = 3;
        itkVar3.l(strE, (wlx) vtwVarM7.r());
    }
}
