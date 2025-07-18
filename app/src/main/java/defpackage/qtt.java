package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtt extends qtr implements qsw, qsn, quz {
    public final qsx a;
    final AtomicBoolean b = new AtomicBoolean();
    public final que c;
    public final agow d;
    public final qux e;
    private final Context f;
    private final Executor g;
    private final AtomicBoolean h;
    private final qst i;

    /* JADX WARN: Multi-variable type inference failed */
    public qtt(quy quyVar, Context context, qsx qsxVar, qst qstVar, zyh zyhVar, aehf aehfVar, que queVar, agow agowVar, agow agowVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = qstVar;
        this.e = quyVar.a(executor, aehfVar, agowVar2);
        this.f = context;
        this.a = qsxVar;
        this.g = Build.VERSION.SDK_INT < 31 ? executor : zyhVar;
        this.c = queVar;
        this.d = agowVar;
    }

    private final void l(final int i) {
        zxn.l(new zvh() { // from class: qts
            /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x050f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x07aa, TryCatch #3 {, blocks: (B:8:0x0016, B:11:0x0020, B:19:0x0033, B:20:0x0034, B:26:0x005b, B:29:0x005f, B:32:0x0065, B:39:0x00a6, B:84:0x0141, B:42:0x00ae, B:44:0x00b4, B:49:0x00c4, B:51:0x00ca, B:52:0x00cc, B:54:0x00d3, B:56:0x00de, B:58:0x00e4, B:60:0x00ef, B:62:0x00f5, B:64:0x0100, B:66:0x0106, B:68:0x0111, B:70:0x0117, B:72:0x011e, B:74:0x0122, B:76:0x0126, B:79:0x012d, B:81:0x0133, B:83:0x013e, B:36:0x007a, B:37:0x008c, B:23:0x0046, B:12:0x0021, B:14:0x0025, B:15:0x002e), top: B:337:0x0016, inners: #1, #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:319:0x0775  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x07aa, TryCatch #3 {, blocks: (B:8:0x0016, B:11:0x0020, B:19:0x0033, B:20:0x0034, B:26:0x005b, B:29:0x005f, B:32:0x0065, B:39:0x00a6, B:84:0x0141, B:42:0x00ae, B:44:0x00b4, B:49:0x00c4, B:51:0x00ca, B:52:0x00cc, B:54:0x00d3, B:56:0x00de, B:58:0x00e4, B:60:0x00ef, B:62:0x00f5, B:64:0x0100, B:66:0x0106, B:68:0x0111, B:70:0x0117, B:72:0x011e, B:74:0x0122, B:76:0x0126, B:79:0x012d, B:81:0x0133, B:83:0x013e, B:36:0x007a, B:37:0x008c, B:23:0x0046, B:12:0x0021, B:14:0x0025, B:15:0x002e), top: B:337:0x0016, inners: #1, #5 }] */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 1965
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qts.a():zyd");
            }
        }, this.g);
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        if (!mhv.h(this.f)) {
            zyd zydVar = zxy.a;
            return;
        }
        try {
            yqw.L(this.b.getAndSet(false));
            l(2);
        } catch (Exception e) {
            zxn.g(e);
        }
    }

    @Override // defpackage.qsw
    public final void h() {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.qsn
    public final void j(qpi qpiVar) {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            return;
        }
        if (!mhv.h(this.f)) {
            zyd zydVar = zxy.a;
        } else if (!atomicBoolean.getAndSet(true)) {
            l(3);
        } else {
            ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 140, "BatteryMetricServiceImpl.java")).u("App is already in the foreground.");
            zxn.f();
        }
    }

    @Override // defpackage.quz
    public final void k() {
        this.i.c.a(this);
        this.a.a.a(this);
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void f(int i) {
    }
}
