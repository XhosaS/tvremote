package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzu {
    public static final afzu a = new afzu();
    public final IdentityHashMap b = new IdentityHashMap();
    public ScheduledExecutorService c;

    public final synchronized Object a(afzt afztVar) {
        afzs afzsVar;
        IdentityHashMap identityHashMap = this.b;
        afzsVar = (afzs) identityHashMap.get(afztVar);
        if (afzsVar == null) {
            afzsVar = new afzs(afztVar.a());
            identityHashMap.put(afztVar, afzsVar);
        }
        ScheduledFuture scheduledFuture = afzsVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            afzsVar.c = null;
        }
        afzsVar.b++;
        return afzsVar.a;
    }

    public final synchronized void b(afzt afztVar, Object obj) {
        afzs afzsVar = (afzs) this.b.get(afztVar);
        if (afzsVar == null) {
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(afztVar))));
        }
        boolean z = true;
        yqw.B(obj == afzsVar.a, "Releasing the wrong instance");
        yqw.M(afzsVar.b > 0, "Refcount has already reached zero");
        int i = afzsVar.b - 1;
        afzsVar.b = i;
        if (i == 0) {
            if (afzsVar.c != null) {
                z = false;
            }
            yqw.M(z, "Destroy task already scheduled");
            if (this.c == null) {
                this.c = Executors.newSingleThreadScheduledExecutor(afrq.j("grpc-shared-destroyer-%d"));
            }
            afzsVar.c = this.c.schedule(new aftd(new afzr(this, afzsVar, afztVar, obj)), 1L, TimeUnit.SECONDS);
        }
    }
}
