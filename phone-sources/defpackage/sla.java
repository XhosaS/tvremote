package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class sla implements ufv {
    public final /* synthetic */ uhp a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ sla(Object obj, uhp uhpVar, ufw ufwVar, Executor executor, int i) {
        this.e = i;
        this.b = obj;
        this.a = uhpVar;
        this.c = ufwVar;
        this.d = executor;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, ufw] */
    @Override // defpackage.ufv
    public final uhp a() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ufn.j(this.a, trc.c(new oyy(this.b, this.c, this.d, 10, (byte[]) null)), ugk.a);
                }
                Object obj = this.b;
                sls slsVar = new sls(obj, 5);
                ?? r2 = this.d;
                ?? r4 = this.c;
                uhp uhpVar = this.a;
                ugk ugkVar = ugk.a;
                uhp uhpVarJ = ufn.j(uhpVar, slsVar, ugkVar);
                uhp uhpVarJ2 = ufn.j(uhpVarJ, r4, r2);
                return ufn.j(uhpVarJ2, trc.c(new oyy(obj, uhpVarJ, uhpVarJ2, 9, (byte[]) null)), ugkVar);
            }
            Object obj2 = this.d;
            try {
                Map map = (Map) ((tst) sfy.J(this.c)).f();
                if (map != null) {
                    vtw vtwVar = (vtw) obj2;
                    long j = ((yzz) vtwVar.b).c;
                    for (Map.Entry entry : map.entrySet()) {
                        Integer num = (Integer) entry.getKey();
                        num.intValue();
                        long jLongValue = ((Long) entry.getValue()).longValue() - j;
                        if (!vtwVar.b.A()) {
                            vtwVar.u();
                        }
                        yzz yzzVar = (yzz) vtwVar.b;
                        vve vveVar = yzzVar.w;
                        if (!vveVar.b) {
                            yzzVar.w = vveVar.a();
                        }
                        yzzVar.w.put(num, Long.valueOf(jLongValue));
                    }
                }
            } catch (Exception e) {
                ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).s("Failed to get custom timestamps future");
            }
            Object obj3 = this.b;
            rpz rpzVarA = rqa.a();
            vtw vtwVarM = zba.a.m();
            vtw vtwVarM2 = yzv.a.m();
            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            yzv yzvVar = (yzv) vucVar;
            yzvVar.b |= 1;
            yzvVar.c = leastSignificantBits;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            yzv yzvVar2 = (yzv) vucVar2;
            yzvVar2.d = 2;
            yzvVar2.b = 2 | yzvVar2.b;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            yzv yzvVar3 = (yzv) vtwVarM2.b;
            yzz yzzVar2 = (yzz) ((vtw) obj2).r();
            yzzVar2.getClass();
            yzvVar3.f = yzzVar2;
            yzvVar3.b |= 16;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            Object obj4 = ((rwb) obj3).b;
            uhp uhpVar2 = this.a;
            zba zbaVar = (zba) vtwVarM.b;
            yzv yzvVar4 = (yzv) vtwVarM2.r();
            yzvVar4.getClass();
            zbaVar.m = yzvVar4;
            zbaVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
            rpzVarA.f((zba) vtwVarM.r());
            rpzVarA.b = (yzi) ((tst) sfy.J(uhpVar2)).f();
            rpzVarA.c = null;
            rpzVarA.d(true);
            return ((rqd) obj4).b(rpzVarA.a());
        }
        Uri uri = (Uri) sfy.J(this.c);
        Set set = (Set) sfy.J(this.a);
        sle sleVar = new sle(set);
        Iterator it = set.iterator();
        while (true) {
            Object obj5 = this.b;
            if (!it.hasNext()) {
                Object obj6 = this.d;
                ttl ttlVarC = ttl.c(trj.a);
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                Integer num2 = (Integer) obj6;
                slf slfVar = (slf) obj5;
                uhi uhiVarW = uhi.v(sleVar.a).w(num2.intValue(), slfVar.g, null);
                pgc pgcVar = new pgc(atomicBoolean, 17);
                ugk ugkVar2 = ugk.a;
                uhp uhpVarI = ues.i(uhiVarW, TimeoutException.class, pgcVar, ugkVar2);
                sfy.K(uhpVarI, new slb(slfVar, atomicBoolean, set, ttlVarC, sleVar, num2), ugkVar2);
                return uhpVarI;
            }
            String str = (String) it.next();
            sle sleVar2 = sleVar;
            Intent intent = new Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            a.p().booleanValue();
            intent.setData(uri);
            intent.setPackage(str);
            intent.setFlags(268435456);
            slf slfVar2 = (slf) obj5;
            slfVar2.b.sendOrderedBroadcast(intent, null, sleVar2, slfVar2.e, -1, null, null);
            sleVar = sleVar2;
        }
    }

    public /* synthetic */ sla(rwb rwbVar, vtw vtwVar, uhp uhpVar, uhp uhpVar2, int i) {
        this.e = i;
        this.b = rwbVar;
        this.d = vtwVar;
        this.c = uhpVar;
        this.a = uhpVar2;
    }

    public /* synthetic */ sla(slf slfVar, uhp uhpVar, uhp uhpVar2, Integer num, int i) {
        this.e = i;
        this.b = slfVar;
        this.c = uhpVar;
        this.a = uhpVar2;
        this.d = num;
    }
}
