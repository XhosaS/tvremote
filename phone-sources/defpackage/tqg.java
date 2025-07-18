package defpackage;

import android.os.Build;
import android.os.Trace;
import com.google.common.collect.ImmutableSet;
import j$.lang.Iterable$EL;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqg {
    private static final ImmutableSet c = ImmutableSet.of("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
    private static final AtomicReference d = new AtomicReference(ImmutableSet.of());
    static final ulp b = new ulp("tiktok_systrace");
    public static final WeakHashMap a = new WeakHashMap();
    private static final tqf e = new tqf();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqt] */
    public static tqt a() {
        return d().c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqt] */
    public static tqt b() {
        yau yauVarD = d();
        ?? r1 = yauVarD.c;
        if (r1 != 0) {
            return r1;
        }
        tpx tpxVar = tqi.a;
        UUID uuidB = tqh.a.b();
        String strEy = tpw.ey(uuidB);
        ImmutableSet immutableSetC = c();
        if (!immutableSetC.isEmpty()) {
            Iterable$EL.forEach(immutableSetC, new mig(8));
        }
        return new tqi(uuidB, strEy, tqi.a, yauVarD);
    }

    public static ImmutableSet c() {
        return (ImmutableSet) d.get();
    }

    public static yau d() {
        return (yau) e.get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqt] */
    public static tqt e(yau yauVar, tqt tqtVar) {
        tqt tqtVar2;
        Object obj = yauVar.a;
        ?? r0 = yauVar.c;
        if (r0 != tqtVar) {
            if (r0 == 0) {
                yauVar.b = Build.VERSION.SDK_INT >= 29 ? tqc.a() : "true".equals(sjj.a((String) b.a, "false"));
            }
            if (yauVar.b) {
                if (r0 != 0) {
                    if (tqtVar == null) {
                        tqtVar2 = null;
                    } else if (r0.a() == tqtVar && !sss.i(r0)) {
                        Trace.endSection();
                    } else if (r0 != tqtVar.a() || sss.i(tqtVar)) {
                        tqtVar2 = tqtVar;
                    } else {
                        sss.f(tqtVar);
                    }
                    sss.h(r0);
                } else {
                    tqtVar2 = tqtVar;
                }
                if (tqtVar2 != null) {
                    sss.g(tqtVar2);
                }
            }
            if (r0 != tqtVar) {
                if (tqtVar == null) {
                    tqtVar = null;
                }
                yauVar.c = tqtVar;
                return r0;
            }
        }
        return tqtVar;
    }
}
