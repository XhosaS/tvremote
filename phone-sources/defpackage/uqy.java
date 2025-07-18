package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uqy implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ uqy(rwb rwbVar, uhp uhpVar, uhp uhpVar2, uhp uhpVar3, int i) {
        this.e = i;
        this.c = rwbVar;
        this.b = uhpVar;
        this.a = uhpVar2;
        this.d = uhpVar3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ura] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.e == 0) {
            boolean zBooleanValue = ((Boolean) ((xpy) ((vvd) this.a).d).g(uqz.a)).booleanValue();
            ?? r1 = this.d;
            Object obj = this.c;
            ?? r3 = this.b;
            return zBooleanValue ? r3.a((uqx) obj, r1) : r3.b((uqx) obj, r1);
        }
        vtw vtwVarM = rwa.a.m();
        boolean zA = vtwVarM.b.A();
        ?? r2 = this.d;
        ?? r32 = this.a;
        ?? r4 = this.b;
        if (!zA) {
            vtwVarM.u();
        }
        Object obj2 = this.c;
        rwa rwaVar = (rwa) vtwVarM.b;
        rwaVar.b |= 1;
        rwb rwbVar = (rwb) obj2;
        rwaVar.c = (String) rwbVar.c;
        vtwVarM.ak((String) rwbVar.a);
        vtwVarM.ak((String) rwbVar.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        rwa rwaVar2 = (rwa) vucVar;
        rwaVar2.b |= 2;
        rwaVar2.d = false;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        rwa rwaVar3 = (rwa) vtwVarM.b;
        rwaVar3.b |= 16;
        rwaVar3.h = false;
        try {
            tst tstVar = (tst) sfy.J(r4);
            if (tstVar.g()) {
                String str = (String) tstVar.c();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rwa rwaVar4 = (rwa) vtwVarM.b;
                rwaVar4.b |= 8;
                rwaVar4.f = str;
            }
        } catch (Exception e) {
            ((tug) ((tug) ((tug) rnb.a.b()).i(e)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'b', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set Account Name, falling back to Zwieback logging.");
        }
        try {
            List list = (List) sfy.J(r32);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            rwa rwaVar5 = (rwa) vtwVarM.b;
            vuj vujVar = rwaVar5.g;
            if (!vujVar.c()) {
                rwaVar5.g = vuc.q(vujVar);
            }
            vsf.h(list, rwaVar5.g);
        } catch (Exception e2) {
            ((tug) ((tug) ((tug) rnb.a.b()).i(e2)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'j', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set external Experiment Ids.");
        }
        try {
            tst tstVar2 = (tst) sfy.J(r2);
            if (tstVar2.g()) {
                String str2 = (String) tstVar2.c();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rwa rwaVar6 = (rwa) vtwVarM.b;
                rwaVar6.b |= 4;
                rwaVar6.e = str2;
            }
        } catch (Exception e3) {
            ((tug) ((tug) ((tug) rnb.a.b()).i(e3)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 't', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set Zwieback.");
        }
        vty vtyVar = (vty) rvv.a.m();
        vtyVar.bL(rwa.j, (rwa) vtwVarM.r());
        return (rvv) vtyVar.r();
    }

    public /* synthetic */ uqy(vvd vvdVar, ura uraVar, uqx uqxVar, Set set, int i) {
        this.e = i;
        this.a = vvdVar;
        this.b = uraVar;
        this.c = uqxVar;
        this.d = set;
    }
}
