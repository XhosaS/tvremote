package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import j$.lang.Iterable$EL;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwv {
    public static final WeakHashMap a;
    static final asv b;
    private static final AtomicReference c;
    private static final bwu d;

    static {
        cab.l(5, "android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        c = new AtomicReference(cbd.a);
        b = new asv();
        a = new WeakHashMap();
        d = new bwu();
        new ArrayDeque();
        new ArrayDeque();
    }

    public static bxj a() {
        return (bxj) d.get();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bxk, java.lang.Object] */
    public static bxk b() {
        bxj bxjVarA = a();
        ?? r1 = bxjVarA.b;
        if (r1 != 0) {
            return r1;
        }
        bwm bwmVar = bwx.a;
        UUID uuidB = bww.a.b();
        String strAR = bwl.aR(uuidB);
        cab cabVarD = d();
        if (!cabVarD.isEmpty()) {
            Iterable$EL.forEach(cabVarD, new bwy(1));
        }
        return new bwx(uuidB, strAR, bwx.a, bxjVarA);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bxk, java.lang.Object] */
    public static bxk c(bxj bxjVar, bxk bxkVar) {
        bxk bxkVar2;
        boolean zEquals;
        Object obj = bxjVar.c;
        ?? r0 = bxjVar.b;
        if (r0 == bxkVar) {
            return bxkVar;
        }
        if (r0 == 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                zEquals = bwr.a();
            } else {
                Object obj2 = b.a;
                Method method = beh.a;
                String str = "false";
                try {
                    str = (String) beh.a.invoke(null, "tiktok_systrace", "false");
                } catch (Exception e) {
                    Log.e("SystemProperties", "get error", e);
                }
                zEquals = "true".equals(str);
            }
            bxjVar.a = zEquals;
        }
        Object obj3 = bxjVar.c;
        if (bxjVar.a) {
            if (r0 != 0) {
                if (bxkVar == null) {
                    bxkVar2 = null;
                } else if (r0.a() == bxkVar && !awn.k(r0)) {
                    Trace.endSection();
                } else if (r0 != bxkVar.a() || awn.k(bxkVar)) {
                    bxkVar2 = bxkVar;
                } else {
                    awn.f(bxkVar);
                }
                awn.h(r0);
            } else {
                bxkVar2 = bxkVar;
            }
            if (bxkVar2 != null) {
                awn.g(bxkVar2);
            }
        }
        if (r0 == bxkVar) {
            return bxkVar;
        }
        if (bxkVar == null) {
            bxkVar = null;
        }
        bxjVar.b = bxkVar;
        return r0;
    }

    public static cab d() {
        return (cab) c.get();
    }
}
