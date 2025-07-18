package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etm implements aejl {
    public final eup a;
    private final etn b;
    private final int c;

    public etm(eup eupVar, etn etnVar, int i) {
        this.a = eupVar;
        this.b = etnVar;
        this.c = i;
    }

    @Override // defpackage.agow
    public final Object a() {
        switch (this.c) {
            case 0:
                eup eupVar = this.a;
                return new iwh((jdt) eupVar.mc.a(), (fda) eupVar.fS.a(), eupVar.bj());
            case 1:
                eup eupVar2 = this.a;
                return new itn((Context) eupVar2.n.a(), eupVar2.sc, (ztw) eupVar2.ao.a());
            case 2:
                eup eupVar3 = this.a;
                ActivityManager activityManager = (ActivityManager) eupVar3.V.a();
                PackageManager packageManagerK = eupVar3.k();
                grl grlVar = (grl) eupVar3.lt.a();
                ztw ztwVar = (ztw) eupVar3.ao.a();
                return new itr(activityManager, eupVar3.sd, packageManagerK, grlVar, eupVar3.se, ztwVar);
            case 3:
                eup eupVar4 = this.a;
                return new iub((fiu) eupVar4.eY.a(), eupVar4.gJ(), eupVar4.gI(), (fxu) eupVar4.t.a(), (gtu) eupVar4.bE.a(), (hab) eupVar4.fe.a(), eupVar4.ct(), eupVar4.sf, eupVar4.sg, (ztw) eupVar4.ao.a());
            case 4:
                eup eupVar5 = this.a;
                return new itg((fby) eupVar5.hh.a(), eupVar5.sh, (ztw) eupVar5.ao.a());
            case 5:
                eup eupVar6 = this.a;
                return new iuf((fiu) eupVar6.eY.a(), eupVar6.ee(), (gzu) eupVar6.R.a(), (gpd) eupVar6.si.a(), eupVar6.sj, eupVar6.sk, (ztw) eupVar6.ao.a());
            case 6:
                eup eupVar7 = this.a;
                return new iui(eupVar7.J(), (gnz) eupVar7.bt.a(), eupVar7.kU, (ztw) eupVar7.ao.a(), (ghp) eupVar7.ar.a(), (ghr) eupVar7.fg.a());
            case 7:
                eup eupVar8 = this.a;
                return new itk((fiu) eupVar8.eY.a(), (fxu) eupVar8.t.a(), eupVar8.sl, (ztw) eupVar8.ao.a());
            case 8:
                eup eupVar9 = this.a;
                return new iuk((PowerManager) eupVar9.aP.a(), (ewc) eupVar9.gM.a(), eupVar9.sm, (ztw) eupVar9.ao.a());
            case 9:
                eup eupVar10 = this.a;
                return new iul(eupVar10.fU, (fcu) eupVar10.fb.a(), eupVar10.so, (ztw) eupVar10.ao.a(), (fco) eupVar10.kS.a());
            case 10:
                eup eupVar11 = this.a;
                return new iup((ahbt) eupVar11.y.a(), (Context) eupVar11.n.a(), eupVar11.kW, (ztw) eupVar11.ao.a(), eupVar11.sp, eupVar11.bE());
            case 11:
                return new etl(this);
            default:
                eup eupVar12 = this.a;
                aejl aejlVar = eupVar12.aY;
                return new vmt((vhq) aejlVar.a(), (vin) aejlVar.a(), (Executor) eupVar12.m.a(), new wtd((wxc) this.b.b.ii.a()));
        }
    }
}
