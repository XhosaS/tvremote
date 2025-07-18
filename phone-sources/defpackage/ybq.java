package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybq {
    private static final ybq c = new ybq();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(ybp ybpVar) {
        return c.b(ybpVar);
    }

    public static void d(ybp ybpVar, Object obj) throws Throwable {
        c.e(ybpVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    final synchronized Object b(ybp ybpVar) {
        ybo yboVar;
        IdentityHashMap identityHashMap = this.a;
        yboVar = (ybo) identityHashMap.get(ybpVar);
        if (yboVar == null) {
            yboVar = new ybo(ybpVar.a());
            identityHashMap.put(ybpVar, yboVar);
        }
        ?? r4 = yboVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            yboVar.c = null;
        }
        yboVar.b++;
        return yboVar.a;
    }

    final synchronized void e(ybp ybpVar, Object obj) throws Throwable {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ybo yboVar = (ybo) this.a.get(ybpVar);
            if (yboVar == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(ybpVar))));
            }
            boolean z = true;
            sij.o(obj == yboVar.a, "Releasing the wrong instance");
            sij.x(yboVar.b > 0, "Refcount has already reached zero");
            int i = yboVar.b - 1;
            yboVar.b = i;
            if (i == 0) {
                if (yboVar.c != null) {
                    z = false;
                }
                sij.x(z, "Destroy task already scheduled");
                if (this.b == null) {
                    try {
                        this.b = Executors.newSingleThreadScheduledExecutor(xxc.i("grpc-shared-destroyer-%d"));
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                yboVar.c = this.b.schedule(new xxx(new ejr(this, yboVar, ybpVar, obj, 19)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
