package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ato extends atp {
    public static final ato a = new ato();

    private ato() {
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz a(String str, Object obj) {
        HealthStats healthStatsM29m = k$$ExternalSyntheticApiModelOutline1.m29m(obj);
        clo cloVarO = cwq.a.o();
        long j = se.j(healthStatsM29m, 30001);
        if (j != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar = (cwq) cloVarO.b;
            cwqVar.b |= 1;
            cwqVar.c = j;
        }
        long j2 = se.j(healthStatsM29m, 30002);
        if (j2 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar2 = (cwq) cloVarO.b;
            cwqVar2.b |= 2;
            cwqVar2.d = j2;
        }
        long j3 = se.j(healthStatsM29m, 30003);
        if (j3 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar3 = (cwq) cloVarO.b;
            cwqVar3.b |= 4;
            cwqVar3.e = j3;
        }
        long j4 = se.j(healthStatsM29m, 30004);
        if (j4 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar4 = (cwq) cloVarO.b;
            cwqVar4.b |= 8;
            cwqVar4.f = j4;
        }
        long j5 = se.j(healthStatsM29m, 30005);
        if (j5 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar5 = (cwq) cloVarO.b;
            cwqVar5.b |= 16;
            cwqVar5.g = j5;
        }
        long j6 = se.j(healthStatsM29m, 30006);
        if (j6 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar6 = (cwq) cloVarO.b;
            cwqVar6.b |= 32;
            cwqVar6.h = j6;
        }
        if (str != null) {
            cwn cwnVarM = se.m(str);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwq cwqVar7 = (cwq) cloVarO.b;
            cwnVarM.getClass();
            cwqVar7.i = cwnVarM;
            cwqVar7.b |= 64;
        }
        cwq cwqVar8 = (cwq) cloVarO.i();
        if (se.s(cwqVar8)) {
            return null;
        }
        return cwqVar8;
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz b(cmz cmzVar, cmz cmzVar2) {
        cwq cwqVar = (cwq) cmzVar;
        cwq cwqVar2 = (cwq) cmzVar2;
        if (cwqVar == null || cwqVar2 == null) {
            return cwqVar;
        }
        clo cloVarO = cwq.a.o();
        if ((cwqVar.b & 1) != 0) {
            long j = cwqVar.c - cwqVar2.c;
            if (j != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar3 = (cwq) cloVarO.b;
                cwqVar3.b |= 1;
                cwqVar3.c = j;
            }
        }
        if ((cwqVar.b & 2) != 0) {
            long j2 = cwqVar.d - cwqVar2.d;
            if (j2 != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar4 = (cwq) cloVarO.b;
                cwqVar4.b |= 2;
                cwqVar4.d = j2;
            }
        }
        if ((cwqVar.b & 4) != 0) {
            long j3 = cwqVar.e - cwqVar2.e;
            if (j3 != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar5 = (cwq) cloVarO.b;
                cwqVar5.b |= 4;
                cwqVar5.e = j3;
            }
        }
        if ((cwqVar.b & 8) != 0) {
            long j4 = cwqVar.f - cwqVar2.f;
            if (j4 != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar6 = (cwq) cloVarO.b;
                cwqVar6.b |= 8;
                cwqVar6.f = j4;
            }
        }
        if ((cwqVar.b & 16) != 0) {
            long j5 = cwqVar.g - cwqVar2.g;
            if (j5 != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar7 = (cwq) cloVarO.b;
                cwqVar7.b |= 16;
                cwqVar7.g = j5;
            }
        }
        if ((cwqVar.b & 32) != 0) {
            long j6 = cwqVar.h - cwqVar2.h;
            if (j6 != 0) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwq cwqVar8 = (cwq) cloVarO.b;
                cwqVar8.b |= 32;
                cwqVar8.h = j6;
            }
        }
        cwn cwnVar = cwqVar.i;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwq cwqVar9 = (cwq) cloVarO.b;
        cwnVar.getClass();
        cwqVar9.i = cwnVar;
        cwqVar9.b |= 64;
        cwq cwqVar10 = (cwq) cloVarO.i();
        if (se.s(cwqVar10)) {
            return null;
        }
        return cwqVar10;
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ String c(cmz cmzVar) {
        cwn cwnVar = ((cwq) cmzVar).i;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        return cwnVar.d;
    }
}
