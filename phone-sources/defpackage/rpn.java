package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpn extends rpp {
    public static final rpn a = new rpn();

    private rpn() {
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj a(String str, Object obj) {
        HealthStats healthStatsM3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        vtw vtwVarM = yza.a.m();
        vtwVarM.aR(rpq.a.d(rrx.p(healthStatsM3m, 40001)));
        vtwVarM.aS(rpm.a.d((healthStatsM3m == null || !healthStatsM3m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM3m.getMeasurements(40002)));
        if (str != null) {
            yyz yyzVarQ = rrx.q(str);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yza yzaVar = (yza) vtwVarM.b;
            yyzVarQ.getClass();
            yzaVar.e = yyzVarQ;
            yzaVar.b |= 1;
        }
        yza yzaVar2 = (yza) vtwVarM.r();
        if (rrx.v(yzaVar2)) {
            return null;
        }
        return yzaVar2;
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj b(vvj vvjVar, vvj vvjVar2) {
        yza yzaVar = (yza) vvjVar;
        yza yzaVar2 = (yza) vvjVar2;
        if (yzaVar == null || yzaVar2 == null) {
            return yzaVar;
        }
        vtw vtwVarM = yza.a.m();
        vtwVarM.aR(rpq.a.e(yzaVar.c, yzaVar2.c));
        vtwVarM.aS(rpm.a.e(yzaVar.d, yzaVar2.d));
        yyz yyzVar = yzaVar.e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yza yzaVar3 = (yza) vtwVarM.b;
        yyzVar.getClass();
        yzaVar3.e = yyzVar;
        yzaVar3.b |= 1;
        yza yzaVar4 = (yza) vtwVarM.r();
        if (rrx.v(yzaVar4)) {
            return null;
        }
        return yzaVar4;
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ String c(vvj vvjVar) {
        yyz yyzVar = ((yza) vvjVar).e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        return yyzVar.d;
    }
}
