package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rpq extends rpp {
    public static final rpq a = new rpq();

    private rpq() {
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj a(String str, Object obj) {
        HealthStats healthStatsM3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        vtw vtwVarM = yzd.a.m();
        int iN = (int) rrx.n(healthStatsM3m, 50001);
        if (iN != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzd yzdVar = (yzd) vtwVarM.b;
            yzdVar.b |= 1;
            yzdVar.c = iN;
        }
        int iN2 = (int) rrx.n(healthStatsM3m, 50002);
        if (iN2 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzd yzdVar2 = (yzd) vtwVarM.b;
            yzdVar2.b |= 2;
            yzdVar2.d = iN2;
        }
        if (str != null) {
            yyz yyzVarQ = rrx.q(str);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzd yzdVar3 = (yzd) vtwVarM.b;
            yyzVarQ.getClass();
            yzdVar3.e = yyzVarQ;
            yzdVar3.b |= 4;
        }
        yzd yzdVar4 = (yzd) vtwVarM.r();
        if (rrx.x(yzdVar4)) {
            return null;
        }
        return yzdVar4;
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj b(vvj vvjVar, vvj vvjVar2) {
        int i;
        int i2;
        yzd yzdVar = (yzd) vvjVar;
        yzd yzdVar2 = (yzd) vvjVar2;
        if (yzdVar == null || yzdVar2 == null) {
            return yzdVar;
        }
        vtw vtwVarM = yzd.a.m();
        if ((yzdVar.b & 1) != 0 && (i2 = yzdVar.c - yzdVar2.c) != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzd yzdVar3 = (yzd) vtwVarM.b;
            yzdVar3.b |= 1;
            yzdVar3.c = i2;
        }
        if ((yzdVar.b & 2) != 0 && (i = yzdVar.d - yzdVar2.d) != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzd yzdVar4 = (yzd) vtwVarM.b;
            yzdVar4.b |= 2;
            yzdVar4.d = i;
        }
        yyz yyzVar = yzdVar.e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yzd yzdVar5 = (yzd) vtwVarM.b;
        yyzVar.getClass();
        yzdVar5.e = yyzVar;
        yzdVar5.b |= 4;
        yzd yzdVar6 = (yzd) vtwVarM.r();
        if (rrx.x(yzdVar6)) {
            return null;
        }
        return yzdVar6;
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ String c(vvj vvjVar) {
        yyz yyzVar = ((yzd) vvjVar).e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        return yyzVar.d;
    }
}
