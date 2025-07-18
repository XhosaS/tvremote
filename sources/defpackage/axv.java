package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axv extends awc implements asm, auh {
    public final aue d;
    public final cov e;
    public final cov f;
    private final cjd g;
    private final Object h;
    private ArrayList i;
    private final AtomicInteger j;

    public axv(auf aufVar, asq asqVar, cjd cjdVar, cov covVar, cov covVar2, crv crvVar, Executor executor) {
        super(null);
        this.h = new Object();
        this.i = new ArrayList(0);
        this.j = new AtomicInteger();
        this.d = aufVar.a(executor, covVar, crvVar);
        this.g = cjdVar;
        this.e = covVar;
        this.f = covVar2;
        asqVar.a(this);
    }

    public final cja e() {
        if (this.j.get() > 0) {
            ave aveVar = new ave(this, 5);
            cjd cjdVar = this.g;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cjs cjsVar = new cjs(aveVar);
            cjsVar.m(new bsk(cjdVar.schedule(cjsVar, 1L, timeUnit), 7), chz.a);
            return cjsVar;
        }
        synchronized (this.h) {
            if (this.i.isEmpty()) {
                return ciw.a;
            }
            final ArrayList arrayList = this.i;
            this.i = new ArrayList(0);
            return qm.O(new chs() { // from class: axu
                @Override // defpackage.chs
                public final cja a() {
                    axv axvVar = this.a;
                    axt axtVar = (axt) axvVar.f.a();
                    clo cloVarO = cxe.a.o();
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        clo cloVarO2 = cym.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        cym cymVar = (cym) cloVarO2.b;
                        cxe cxeVar = (cxe) cloVarO.i();
                        cxeVar.getClass();
                        cymVar.g = cxeVar;
                        cymVar.b |= 32;
                        cym cymVar2 = (cym) cloVarO2.i();
                        try {
                            byg bygVar = ((axr) axvVar.e.a()).a;
                        } catch (Exception e) {
                            ((cbs) ((cbs) aqn.a.g().i(e)).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", 191, "NetworkMetricServiceImpl.java")).p("Exception while getting network metric extension!");
                        }
                        aue aueVar = axvVar.d;
                        aua auaVarA = aub.a();
                        auaVarA.f(cymVar2);
                        auaVarA.b = null;
                        return aueVar.a(auaVarA.a());
                    }
                    axs axsVar = (axs) it.next();
                    clo cloVarO3 = cxd.a.o();
                    int i = axsVar.d;
                    int i2 = axsVar.c;
                    long j = axsVar.b;
                    long j2 = axsVar.a;
                    int i3 = axsVar.g;
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cxd cxdVar = (cxd) cloVarO3.b;
                    cxdVar.b |= 32;
                    cxdVar.c = 0;
                    int i4 = axsVar.j;
                    clo cloVarO4 = cxf.a.o();
                    int i5 = axsVar.j;
                    if (!cloVarO4.b.A()) {
                        cloVarO4.l();
                    }
                    cxf cxfVar = (cxf) cloVarO4.b;
                    cxfVar.b |= 1;
                    cxfVar.c = 0;
                    cxf cxfVar2 = (cxf) cloVarO4.i();
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cxd cxdVar2 = (cxd) cloVarO3.b;
                    cxfVar2.getClass();
                    cxdVar2.g = cxfVar2;
                    cxdVar2.b |= 4194304;
                    String str = axsVar.h;
                    String str2 = axsVar.f;
                    if (!bdq.q(null)) {
                        throw null;
                    }
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cxd cxdVar3 = (cxd) cloVarO3.b;
                    cxdVar3.d = 0;
                    cxdVar3.b |= 256;
                    ((apz) axtVar.a).a();
                    String str3 = axsVar.e;
                    cxq cxqVar = axsVar.i;
                    throw null;
                }
            }, this.g);
        }
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        e();
    }

    @Override // defpackage.auh
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.asm
    public final /* synthetic */ void j(aqe aqeVar) {
    }
}
