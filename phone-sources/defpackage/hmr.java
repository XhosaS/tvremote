package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmr {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile hmp d;

    public hmr() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hmo());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new gfe(this, 15, null));
    }

    public final synchronized hnp a(hlg hlgVar) {
        hmq hmqVar = (hmq) this.a.get(hlgVar);
        if (hmqVar == null) {
            return null;
        }
        hnp hnpVar = (hnp) hmqVar.get();
        if (hnpVar == null) {
            c(hmqVar);
        }
        return hnpVar;
    }

    public final synchronized void b(hlg hlgVar, hnp hnpVar) {
        hmq hmqVar = (hmq) this.a.put(hlgVar, new hmq(hlgVar, hnpVar, this.b));
        if (hmqVar != null) {
            hmqVar.a();
        }
    }

    public final void c(hmq hmqVar) {
        synchronized (this) {
            this.a.remove(hmqVar.a);
            if (hmqVar.b) {
                hnv hnvVar = hmqVar.c;
            }
        }
    }

    final synchronized void d(hlg hlgVar) {
        hmq hmqVar = (hmq) this.a.remove(hlgVar);
        if (hmqVar != null) {
            hmqVar.a();
        }
    }
}
