package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpo extends rpp {
    public static final rpo a = new rpo();

    private rpo() {
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj a(String str, Object obj) {
        HealthStats healthStatsM3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        vtw vtwVarM = yzc.a.m();
        long jN = rrx.n(healthStatsM3m, 30001);
        if (jN != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar = (yzc) vtwVarM.b;
            yzcVar.b |= 1;
            yzcVar.c = jN;
        }
        long jN2 = rrx.n(healthStatsM3m, 30002);
        if (jN2 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar2 = (yzc) vtwVarM.b;
            yzcVar2.b |= 2;
            yzcVar2.d = jN2;
        }
        long jN3 = rrx.n(healthStatsM3m, 30003);
        if (jN3 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar3 = (yzc) vtwVarM.b;
            yzcVar3.b |= 4;
            yzcVar3.e = jN3;
        }
        long jN4 = rrx.n(healthStatsM3m, 30004);
        if (jN4 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar4 = (yzc) vtwVarM.b;
            yzcVar4.b |= 8;
            yzcVar4.f = jN4;
        }
        long jN5 = rrx.n(healthStatsM3m, 30005);
        if (jN5 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar5 = (yzc) vtwVarM.b;
            yzcVar5.b |= 16;
            yzcVar5.g = jN5;
        }
        long jN6 = rrx.n(healthStatsM3m, 30006);
        if (jN6 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar6 = (yzc) vtwVarM.b;
            yzcVar6.b |= 32;
            yzcVar6.h = jN6;
        }
        if (str != null) {
            yyz yyzVarQ = rrx.q(str);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzc yzcVar7 = (yzc) vtwVarM.b;
            yyzVarQ.getClass();
            yzcVar7.i = yyzVarQ;
            yzcVar7.b |= 64;
        }
        yzc yzcVar8 = (yzc) vtwVarM.r();
        if (rrx.w(yzcVar8)) {
            return null;
        }
        return yzcVar8;
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj b(vvj vvjVar, vvj vvjVar2) {
        yzc yzcVar = (yzc) vvjVar;
        yzc yzcVar2 = (yzc) vvjVar2;
        if (yzcVar == null || yzcVar2 == null) {
            return yzcVar;
        }
        vtw vtwVarM = yzc.a.m();
        if ((yzcVar.b & 1) != 0) {
            long j = yzcVar.c - yzcVar2.c;
            if (j != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar3 = (yzc) vtwVarM.b;
                yzcVar3.b |= 1;
                yzcVar3.c = j;
            }
        }
        if ((yzcVar.b & 2) != 0) {
            long j2 = yzcVar.d - yzcVar2.d;
            if (j2 != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar4 = (yzc) vtwVarM.b;
                yzcVar4.b |= 2;
                yzcVar4.d = j2;
            }
        }
        if ((yzcVar.b & 4) != 0) {
            long j3 = yzcVar.e - yzcVar2.e;
            if (j3 != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar5 = (yzc) vtwVarM.b;
                yzcVar5.b |= 4;
                yzcVar5.e = j3;
            }
        }
        if ((yzcVar.b & 8) != 0) {
            long j4 = yzcVar.f - yzcVar2.f;
            if (j4 != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar6 = (yzc) vtwVarM.b;
                yzcVar6.b |= 8;
                yzcVar6.f = j4;
            }
        }
        if ((yzcVar.b & 16) != 0) {
            long j5 = yzcVar.g - yzcVar2.g;
            if (j5 != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar7 = (yzc) vtwVarM.b;
                yzcVar7.b |= 16;
                yzcVar7.g = j5;
            }
        }
        if ((yzcVar.b & 32) != 0) {
            long j6 = yzcVar.h - yzcVar2.h;
            if (j6 != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzc yzcVar8 = (yzc) vtwVarM.b;
                yzcVar8.b |= 32;
                yzcVar8.h = j6;
            }
        }
        yyz yyzVar = yzcVar.i;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yzc yzcVar9 = (yzc) vtwVarM.b;
        yyzVar.getClass();
        yzcVar9.i = yyzVar;
        yzcVar9.b |= 64;
        yzc yzcVar10 = (yzc) vtwVarM.r();
        if (rrx.w(yzcVar10)) {
            return null;
        }
        return yzcVar10;
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ String c(vvj vvjVar) {
        yyz yyzVar = ((yzc) vvjVar).i;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        return yyzVar.d;
    }
}
