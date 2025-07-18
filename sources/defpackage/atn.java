package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atn extends atp {
    public static final atn a = new atn();

    private atn() {
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz a(String str, Object obj) {
        HealthStats healthStatsM29m = k$$ExternalSyntheticApiModelOutline1.m29m(obj);
        clo cloVarO = cwo.a.o();
        cloVarO.r(atq.a.d(se.l(healthStatsM29m, 40001)));
        cloVarO.s(atm.a.d((healthStatsM29m == null || !healthStatsM29m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM29m.getMeasurements(40002)));
        if (str != null) {
            cwn cwnVarM = se.m(str);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwo cwoVar = (cwo) cloVarO.b;
            cwnVarM.getClass();
            cwoVar.e = cwnVarM;
            cwoVar.b |= 1;
        }
        cwo cwoVar2 = (cwo) cloVarO.i();
        if (se.r(cwoVar2)) {
            return null;
        }
        return cwoVar2;
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz b(cmz cmzVar, cmz cmzVar2) {
        cwo cwoVar = (cwo) cmzVar;
        cwo cwoVar2 = (cwo) cmzVar2;
        if (cwoVar == null || cwoVar2 == null) {
            return cwoVar;
        }
        clo cloVarO = cwo.a.o();
        cloVarO.r(atq.a.e(cwoVar.c, cwoVar2.c));
        cloVarO.s(atm.a.e(cwoVar.d, cwoVar2.d));
        cwn cwnVar = cwoVar.e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwo cwoVar3 = (cwo) cloVarO.b;
        cwnVar.getClass();
        cwoVar3.e = cwnVar;
        cwoVar3.b |= 1;
        cwo cwoVar4 = (cwo) cloVarO.i();
        if (se.r(cwoVar4)) {
            return null;
        }
        return cwoVar4;
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ String c(cmz cmzVar) {
        cwn cwnVar = ((cwo) cmzVar).e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        return cwnVar.d;
    }
}
