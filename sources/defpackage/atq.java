package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atq extends atp {
    public static final atq a = new atq();

    private atq() {
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz a(String str, Object obj) {
        HealthStats healthStatsM29m = k$$ExternalSyntheticApiModelOutline1.m29m(obj);
        clo cloVarO = cwr.a.o();
        int iJ = (int) se.j(healthStatsM29m, 50001);
        if (iJ != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwr cwrVar = (cwr) cloVarO.b;
            cwrVar.b |= 1;
            cwrVar.c = iJ;
        }
        int iJ2 = (int) se.j(healthStatsM29m, 50002);
        if (iJ2 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwr cwrVar2 = (cwr) cloVarO.b;
            cwrVar2.b |= 2;
            cwrVar2.d = iJ2;
        }
        if (str != null) {
            cwn cwnVarM = se.m(str);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwr cwrVar3 = (cwr) cloVarO.b;
            cwnVarM.getClass();
            cwrVar3.e = cwnVarM;
            cwrVar3.b |= 4;
        }
        cwr cwrVar4 = (cwr) cloVarO.i();
        if (se.aK(cwrVar4)) {
            return null;
        }
        return cwrVar4;
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz b(cmz cmzVar, cmz cmzVar2) {
        int i;
        int i2;
        cwr cwrVar = (cwr) cmzVar;
        cwr cwrVar2 = (cwr) cmzVar2;
        if (cwrVar == null || cwrVar2 == null) {
            return cwrVar;
        }
        clo cloVarO = cwr.a.o();
        if ((cwrVar.b & 1) != 0 && (i2 = cwrVar.c - cwrVar2.c) != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwr cwrVar3 = (cwr) cloVarO.b;
            cwrVar3.b |= 1;
            cwrVar3.c = i2;
        }
        if ((cwrVar.b & 2) != 0 && (i = cwrVar.d - cwrVar2.d) != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwr cwrVar4 = (cwr) cloVarO.b;
            cwrVar4.b |= 2;
            cwrVar4.d = i;
        }
        cwn cwnVar = cwrVar.e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwr cwrVar5 = (cwr) cloVarO.b;
        cwnVar.getClass();
        cwrVar5.e = cwnVar;
        cwrVar5.b |= 4;
        cwr cwrVar6 = (cwr) cloVarO.i();
        if (se.aK(cwrVar6)) {
            return null;
        }
        return cwrVar6;
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ String c(cmz cmzVar) {
        cwn cwnVar = ((cwr) cmzVar).e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        return cwnVar.d;
    }
}
