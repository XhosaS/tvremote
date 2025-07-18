package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrc extends rqz implements rqf, rox, roq {
    volatile rmp a;
    public final xbw b;
    public final yfo d;
    public final yfo e;
    public final rvg f;
    public final lhr g;
    public final ulp h;
    private final Executor j;
    private final rqd k;
    private final tst l;
    private final rou m;
    private final yfo r;
    private final tst s;
    private final yfo t;
    private final yfo u;
    private final cb v;
    private final ulp w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public rrc(yyh yyhVar, Executor executor, xbw xbwVar, tst tstVar, cb cbVar, rou rouVar, ulp ulpVar, yfo yfoVar, yfo yfoVar2, yfo yfoVar3, lhr lhrVar, rvg rvgVar, tst tstVar2, yfo yfoVar4, yfo yfoVar5, ulp ulpVar2) {
        this.b = xbwVar;
        this.l = tstVar;
        this.v = cbVar;
        this.m = rouVar;
        this.w = ulpVar;
        this.k = yyhVar.f(ugk.a, xbwVar, null);
        this.j = executor;
        this.r = yfoVar;
        this.d = yfoVar2;
        this.e = yfoVar3;
        this.g = lhrVar;
        this.f = rvgVar;
        this.s = tstVar2;
        this.t = yfoVar4;
        this.u = yfoVar5;
        this.h = ulpVar2;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        sfy.G(new ufv() { // from class: rra
            @Override // defpackage.ufv
            public final uhp a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return uhl.a;
                }
                int i2 = i;
                rrc rrcVar = this.a;
                return rrcVar.o(i2, (rqq) rrcVar.b.b());
            }
        }, this.j);
    }

    @Override // defpackage.rox
    public final void c(Activity activity) {
        sfy.G(new osv(this, 5), this.j);
    }

    @Override // defpackage.rox
    public final void d(Activity activity) {
        this.a = rmp.b(activity.getClass());
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        this.a = null;
    }

    @Override // defpackage.rox
    public final void h() {
        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 419, "CrashMetricServiceImpl.java")).s("onActivityCreated");
        if (this.q.getAndSet(true)) {
            return;
        }
        q(4, this.o);
    }

    @Override // defpackage.rqf
    public final void k() {
        tst tstVar = this.l;
        if (tstVar.g()) {
            ((rri) ((yfo) tstVar.c()).b()).a();
        }
        this.v.x(this);
        this.m.a(this);
        q(3, this.n);
        sfy.G(new osv(this, 4), this.j);
    }

    @Override // defpackage.rqz
    public final void l() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new rrb(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:5|(1:7)(1:8)|9|(23:11|(3:13|(1:15)|16)(2:17|(3:19|(1:21)|22)(19:23|(2:25|(3:69|(1:71)|72)(4:28|(1:30)|31|(3:33|(1:35)|36)(4:37|(4:40|(1:42)|43|(5:117|44|115|45|46))(0)|59|(3:61|(1:63)|64)(3:65|(1:67)|68))))(0)|118|84|(1:86)(1:87)|88|(1:90)|91|121|(2:96|94)|120|97|(1:102)|123|(2:111|103)|122|(2:107|105)|124|(2:109|110)(1:127)))|73|(1:75)|76|(1:81)|118|84|(0)(0)|88|(0)|91|121|(1:94)|120|97|(2:100|102)|123|(1:103)|122|(1:105)|124|(0)(0))(1:82)|83|118|84|(0)(0)|88|(0)|91|121|(1:94)|120|97|(0)|123|(1:103)|122|(1:105)|124|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02aa, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02eb A[LOOP:2: B:105:0x02e3->B:107:0x02eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f5 A[LOOP:1: B:103:0x02db->B:111:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e A[Catch: InterruptedException -> 0x02aa, all -> 0x02b1, TryCatch #5 {InterruptedException -> 0x02aa, all -> 0x02b1, blocks: (B:84:0x0228, B:86:0x022e, B:88:0x0243, B:90:0x0258, B:91:0x025b, B:87:0x0239), top: B:118:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239 A[Catch: InterruptedException -> 0x02aa, all -> 0x02b1, TryCatch #5 {InterruptedException -> 0x02aa, all -> 0x02b1, blocks: (B:84:0x0228, B:86:0x022e, B:88:0x0243, B:90:0x0258, B:91:0x025b, B:87:0x0239), top: B:118:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0258 A[Catch: InterruptedException -> 0x02aa, all -> 0x02b1, TryCatch #5 {InterruptedException -> 0x02aa, all -> 0x02b1, blocks: (B:84:0x0228, B:86:0x022e, B:88:0x0243, B:90:0x0258, B:91:0x025b, B:87:0x0239), top: B:118:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9 A[LOOP:0: B:94:0x02b1->B:96:0x02b9, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, ttm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.zan r26, defpackage.rrr r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrc.m(zan, rrr):void");
    }

    public final boolean n() {
        return ((rqs) this.e.b()).b;
    }

    public final uhp o(int i, rqq rqqVar) {
        return p(i, rqqVar, rqqVar.a / 100.0f);
    }

    public final uhp p(int i, rqq rqqVar, float f) {
        if (!rqqVar.b()) {
            return uhl.a;
        }
        if (!this.w.aG(f).a()) {
            return uhl.a;
        }
        rqd rqdVar = this.k;
        rpz rpzVarA = rqa.a();
        vtw vtwVarM = zba.a.m();
        vtw vtwVarM2 = zaz.a.m();
        float f2 = 1.0f / f;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        int i2 = (int) f2;
        vuc vucVar = vtwVarM2.b;
        zaz zazVar = (zaz) vucVar;
        zazVar.b |= 2;
        zazVar.d = i2;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        zaz zazVar2 = (zaz) vtwVarM2.b;
        zazVar2.c = i - 1;
        zazVar2.b |= 1;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        zba zbaVar = (zba) vtwVarM.b;
        zaz zazVar3 = (zaz) vtwVarM2.r();
        zazVar3.getClass();
        zbaVar.v = zazVar3;
        zbaVar.b |= 16777216;
        rpzVarA.f((zba) vtwVarM.r());
        return rqdVar.b(rpzVarA.a());
    }

    @Override // defpackage.rox
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.roq
    public final /* synthetic */ void j(rmp rmpVar) {
    }
}
