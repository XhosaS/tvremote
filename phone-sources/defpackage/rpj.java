package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpj extends rrx implements rox, roq, rqf {
    final AtomicBoolean a;
    public final yfo b;
    public final rqd c;
    public final cb d;
    public final ulp e;
    private final Context f;
    private final Executor g;
    private final AtomicBoolean h;
    private final rou i;

    /* JADX WARN: Multi-variable type inference failed */
    public rpj(yyh yyhVar, Context context, cb cbVar, rou rouVar, uht uhtVar, xbw xbwVar, ulp ulpVar, yfo yfoVar, yfo yfoVar2, Executor executor) {
        super(null);
        this.a = new AtomicBoolean();
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = rouVar;
        this.c = yyhVar.f(executor, xbwVar, yfoVar2);
        this.f = context;
        this.d = cbVar;
        this.g = Build.VERSION.SDK_INT < 31 ? executor : uhtVar;
        this.e = ulpVar;
        this.b = yfoVar;
    }

    private final void aG(final int i) {
        sfy.G(new ufv() { // from class: rpi
            /* JADX WARN: Removed duplicated region for block: B:259:0x0640  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: all -> 0x067d, TryCatch #3 {, blocks: (B:8:0x0016, B:14:0x004f, B:17:0x0053, B:20:0x0059, B:27:0x0090, B:72:0x012b, B:30:0x0097, B:32:0x009d, B:37:0x00ad, B:39:0x00b3, B:40:0x00b5, B:42:0x00bd, B:44:0x00c8, B:46:0x00ce, B:48:0x00d9, B:50:0x00df, B:52:0x00ea, B:54:0x00f0, B:56:0x00fb, B:58:0x0101, B:60:0x0108, B:62:0x010c, B:64:0x0110, B:67:0x0117, B:69:0x011d, B:71:0x0128, B:24:0x0064, B:25:0x0076, B:11:0x0038), top: B:277:0x0016, inners: #0 }] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yfo] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, yfo] */
            @Override // defpackage.ufv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.uhp a() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rpi.a():uhp");
            }
        }, this.g);
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        if (!osx.g(this.f)) {
            uhp uhpVar = uhl.a;
            return;
        }
        try {
            a.ab(this.a.getAndSet(false));
            aG(2);
        } catch (Exception e) {
            sfy.B(e);
        }
    }

    @Override // defpackage.rox
    public final void h() {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.roq
    public final void j(rmp rmpVar) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        if (!osx.g(this.f)) {
            uhp uhpVar = uhl.a;
        } else if (!atomicBoolean.getAndSet(true)) {
            aG(3);
        } else {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 140, "BatteryMetricServiceImpl.java")).s("App is already in the foreground.");
            sfy.A();
        }
    }

    @Override // defpackage.rqf
    public final void k() {
        this.i.a(this);
        this.d.x(this);
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
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void f(int i) {
    }
}
