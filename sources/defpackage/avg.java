package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avg extends avd implements auh, asu, asm {
    volatile aqe a;
    public final cov b;
    public final crv d;
    public final crv e;
    public final auv f;
    public final asv g;
    public final ayv h;
    private final Executor j;
    private final aue k;
    private final byg l;
    private final asv m;
    private final asq n;
    private final crv s;
    private final byg t;
    private final crv u;
    private final crv v;
    private final att w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public avg(auf aufVar, Executor executor, cov covVar, byg bygVar, asv asvVar, asq asqVar, att attVar, crv crvVar, crv crvVar2, crv crvVar3, auv auvVar, ayv ayvVar, byg bygVar2, crv crvVar4, crv crvVar5, asv asvVar2) {
        this.b = covVar;
        this.l = bygVar;
        this.m = asvVar;
        this.n = asqVar;
        this.w = attVar;
        this.k = aufVar.a(chz.a, covVar, null);
        this.j = executor;
        this.s = crvVar;
        this.d = crvVar2;
        this.e = crvVar3;
        this.f = auvVar;
        this.h = ayvVar;
        this.t = bygVar2;
        this.u = crvVar4;
        this.v = crvVar5;
        this.g = asvVar2;
    }

    private final void p(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        qm.O(new axj(this, atomicInteger, i, 1), this.j);
    }

    @Override // defpackage.asu
    public final void a(Activity activity, Bundle bundle) {
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 419, "CrashMetricServiceImpl.java")).p("onActivityCreated");
        if (this.r.getAndSet(true)) {
            return;
        }
        p(4, this.p);
    }

    @Override // defpackage.asu
    public final void d(Activity activity) {
        qm.O(new ave(this, 2), this.j);
    }

    @Override // defpackage.asu
    public final void f(Activity activity) {
        this.a = aqe.a(activity.getClass());
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        this.a = null;
    }

    @Override // defpackage.avd
    public final void k() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new avf(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235 A[PHI: r2
  0x0235: PHI (r2v1 cxy) = (r2v0 cxy), (r2v25 cxy), (r2v25 cxy) binds: [B:16:0x004b, B:83:0x022e, B:85:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.cxy r17, defpackage.avx r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avg.l(cxy, avx):void");
    }

    public final boolean m() {
        return ((auw) this.e.a()).b;
    }

    public final cja n(int i, aut autVar) {
        return o(i, autVar, autVar.a / 100.0f);
    }

    public final cja o(int i, aut autVar, float f) {
        if (!autVar.b()) {
            return ciw.a;
        }
        ayx ayxVarB = this.w.b(f);
        if (ayxVarB.b.nextFloat() >= ayxVarB.a) {
            return ciw.a;
        }
        aue aueVar = this.k;
        aua auaVarA = aub.a();
        clo cloVarO = cym.a.o();
        clo cloVarO2 = cyl.a.o();
        float f2 = 1.0f / f;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        int i2 = (int) f2;
        clt cltVar = cloVarO2.b;
        cyl cylVar = (cyl) cltVar;
        cylVar.b |= 2;
        cylVar.d = i2;
        if (!cltVar.A()) {
            cloVarO2.l();
        }
        cyl cylVar2 = (cyl) cloVarO2.b;
        cylVar2.c = i - 1;
        cylVar2.b |= 1;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cym cymVar = (cym) cloVarO.b;
        cyl cylVar3 = (cyl) cloVarO2.i();
        cylVar3.getClass();
        cymVar.y = cylVar3;
        cymVar.b |= 16777216;
        auaVarA.f((cym) cloVarO.i());
        return aueVar.a(auaVarA.a());
    }

    @Override // defpackage.auh
    public final void t() {
        byg bygVar = this.l;
        if (bygVar.f()) {
            ((avn) ((crv) bygVar.b()).a()).a();
        }
        this.m.a(this);
        this.n.a(this);
        p(3, this.o);
        qm.O(new ave(this, 0), this.j);
    }

    @Override // defpackage.asu
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.asm
    public final /* synthetic */ void j(aqe aqeVar) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
