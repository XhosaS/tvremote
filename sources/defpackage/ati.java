package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ati extends atg implements asu, asm, auh {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final asv c;
    private final Executor d;
    private final att e;
    private final crv f;
    private final aue g;
    private final AtomicBoolean h;
    private final asq i;

    /* JADX WARN: Multi-variable type inference failed */
    public ati(auf aufVar, Context context, asv asvVar, asq asqVar, cjd cjdVar, cov covVar, att attVar, crv crvVar, crv crvVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = asqVar;
        this.g = aufVar.a(executor, covVar, crvVar2);
        this.b = context;
        this.c = asvVar;
        this.d = Build.VERSION.SDK_INT < 31 ? executor : cjdVar;
        this.e = attVar;
        this.f = crvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x0676, TryCatch #2 {, blocks: (B:8:0x0014, B:14:0x004d, B:17:0x0051, B:20:0x0057, B:26:0x0097, B:71:0x0126, B:29:0x009e, B:31:0x00a4, B:33:0x00ac, B:36:0x00b1, B:38:0x00b7, B:39:0x00b9, B:41:0x00c0, B:43:0x00c9, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:51:0x00e7, B:53:0x00ed, B:55:0x00f6, B:57:0x00fc, B:59:0x0103, B:61:0x0107, B:63:0x010b, B:66:0x0112, B:68:0x0118, B:70:0x0123, B:23:0x0061, B:24:0x007f, B:11:0x0036), top: B:274:0x0014, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v30, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [crv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.cja q(defpackage.ati r19, defpackage.cwj r20, defpackage.aqe r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ati.q(ati, cwj, aqe):cja");
    }

    private final cja u(final cwj cwjVar) {
        return qm.O(new chs() { // from class: ath
            @Override // defpackage.chs
            public final cja a() {
                return ati.q(this.a, cwjVar, null);
            }
        }, this.d);
    }

    @Override // defpackage.asu
    public void a(Activity activity, Bundle bundle) {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.asm
    public void i(aqe aqeVar) {
        r();
    }

    @Override // defpackage.asm
    public void j(aqe aqeVar) {
        if (this.a.get()) {
            return;
        }
        s();
    }

    public cja r() {
        if (!apr.g(this.b)) {
            return ciw.a;
        }
        try {
            bdq.j(this.a.getAndSet(false));
            return u(cwj.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return new civ(e);
        }
    }

    public cja s() {
        if (!apr.g(this.b)) {
            return ciw.a;
        }
        if (!this.a.getAndSet(true)) {
            return u(cwj.BACKGROUND_TO_FOREGROUND);
        }
        ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).p("App is already in the foreground.");
        return qm.J();
    }

    @Override // defpackage.auh
    public void t() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override // defpackage.asu
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.asu
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
