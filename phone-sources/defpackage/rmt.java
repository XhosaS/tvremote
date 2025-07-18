package defpackage;

import android.support.v7.appcompat.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmt implements rms {
    private final yfo a;
    private final rne b;
    private final yfo c;
    private final yfo d;
    private final yfo e;
    private final yfo f;
    private final yfo g;
    private final vvd h;

    public rmt(yfo yfoVar, rne rneVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, tst tstVar, vvd vvdVar) {
        this.a = yfoVar;
        this.b = rneVar;
        this.c = yfoVar2;
        this.d = yfoVar3;
        this.e = yfoVar4;
        this.f = yfoVar5;
        this.g = yfoVar6;
        this.h = vvdVar;
        if (((Boolean) tstVar.e(false)).booleanValue()) {
            return;
        }
        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", R.styleable.AppCompatTheme_tooltipFrameBackground, "PrimesApiImpl.java")).s("Primes instant initialization");
        try {
            WeakHashMap weakHashMap = tqg.a;
            Iterator it = ((xcs) yfoVar2).b().iterator();
            while (it.hasNext()) {
                ((rqf) it.next()).k();
            }
        } catch (RuntimeException e) {
            tui tuiVar = rnb.a;
            ((tug) ((tug) ((tug) tuiVar.g()).i(e)).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).s("Primes failed to initialize");
            rne rneVar2 = this.b;
            if (rneVar2.a) {
                return;
            }
            rneVar2.a = true;
            ((tug) ((tug) tuiVar.b()).j("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).s("Shutdown ...");
        }
    }

    @Override // defpackage.rms
    public final rul a() {
        return ((rui) this.g).b().a();
    }

    @Override // defpackage.rms
    public final ttm b() {
        return new riu(this.a, 11);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yfo] */
    @Override // defpackage.rms
    public final void c() {
        vvd vvdVar = this.h;
        if (((AtomicBoolean) vvdVar.a).getAndSet(true)) {
            return;
        }
        if (!((tst) vvdVar.d).g()) {
            ((rqz) ((ttd) vvdVar.c).a.b()).l();
        }
        ((rsw) ((ttd) vvdVar.b).a.b()).a();
    }

    @Override // defpackage.rms
    public final void d(rtg rtgVar) {
        ((rtn) this.f).b().a(rtgVar);
    }

    @Override // defpackage.rms
    public final void e(rmp rmpVar) {
        ((rui) this.g).b().b(rmpVar);
    }

    @Override // defpackage.rms
    public final void f() {
        ((rsw) this.e.b()).a();
    }

    @Override // defpackage.rms
    public final boolean g() {
        return ((rmj) this.d).b().b();
    }

    @Override // defpackage.rms
    public final void h(rmp rmpVar) {
        ((rsw) this.e.b()).b(rmpVar);
    }

    @Override // defpackage.rms
    public final void i(rmp rmpVar) {
        ((rui) this.g).b().d(rmpVar);
    }

    @Override // defpackage.rms
    public final void j(rul rulVar, rmp rmpVar) {
        ((rui) this.g).b().c(rulVar, rmpVar);
    }
}
