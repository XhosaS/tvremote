package defpackage;

import android.support.v7.appcompat.R;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rup extends rum implements rqf, ruf {
    private static final Callable a = new oym(3);
    private final ruo b;
    private final rva c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yfo] */
    public rup(ruo ruoVar, tst tstVar) {
        this.b = ruoVar;
        this.c = (rva) tstVar.c().b();
    }

    private static uhp e(uhp... uhpVarArr) {
        return sfy.P(uhpVarArr).a(a, ugk.a);
    }

    private final void f(rul rulVar, String str) {
        if (!rul.d(rulVar) && ((rvi) this.c.f.get()).a()) {
            int i = rvb.a;
            str.getClass();
            AtomicReference atomicReference = rvb.c;
            if (atomicReference.get() != null || !a.v(atomicReference, new ruy(str))) {
                ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "start", 67, "Tracer.java")).s("Ignore Tracer.start(), current active trace...");
                return;
            }
            rvb.a = 5;
            rvb.b = 1000;
            rulVar.c = true;
        }
    }

    private final uhp g(rul rulVar, String str) {
        ruy ruyVar;
        if (rulVar == null || rul.d(rulVar)) {
            return uhl.a;
        }
        if (rulVar.c) {
            rva rvaVar = this.c;
            String str2 = true != TextUtils.isEmpty(null) ? null : str;
            int i = rvb.a;
            a.ab(true ^ TextUtils.isEmpty(str2));
            ruy ruyVar2 = (ruy) rvb.c.getAndSet(null);
            if (ruyVar2 != null) {
                ruyVar2.b.b = str2;
            }
            return ruyVar2 == null ? uhl.a : sfy.G(new lhx(rvaVar, ruyVar2, 13), rvaVar.b);
        }
        rqi rqiVar = rulVar.b;
        long jA = rulVar.a();
        if (!TextUtils.isEmpty(str) && jA > 0 && (ruyVar = (ruy) rvb.c.get()) != null) {
            rqj rqjVar = rqiVar.a;
            long j = ruyVar.b.c;
            long j2 = rqjVar.a;
            if (j <= j2) {
                ((tug) ((tug) rnb.a.d()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "sideLoadSpan", R.styleable.AppCompatTheme_tooltipFrameBackground, "TraceData.java")).E("Sideload span: %s. startMs: %d, durationMs: %d", str, Long.valueOf(j2), Long.valueOf(jA));
                rus rusVar = new rus(str, j2, j2 + jA, Thread.currentThread().getId(), 4);
                List list = ruyVar.d;
                synchronized (list) {
                    list.add(rusVar);
                }
                ruyVar.b();
            }
        }
        return uhl.a;
    }

    @Override // defpackage.rum
    public final synchronized rul a() {
        rul rulVarA;
        rulVarA = this.b.a();
        f(rulVarA, "");
        return rulVarA;
    }

    @Override // defpackage.rum
    public final rul b(rmp rmpVar) {
        rul rulVarB = this.b.b(rmpVar);
        f(rulVarB, rmpVar.a);
        return rulVarB;
    }

    @Override // defpackage.rum
    public final uhp c(rul rulVar, rmp rmpVar) {
        return e(this.b.c(rulVar, rmpVar), g(rulVar, rmpVar.a));
    }

    @Override // defpackage.rum
    public final uhp d(rmp rmpVar) {
        ruo ruoVar = this.b;
        ConcurrentHashMap concurrentHashMap = ruoVar.c;
        String str = rmpVar.a;
        return e(ruoVar.d(rmpVar), g((rul) concurrentHashMap.get(str), str));
    }

    @Override // defpackage.rqf
    public final /* synthetic */ void k() {
    }
}
