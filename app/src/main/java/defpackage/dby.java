package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dby {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile dbw d;

    public dby() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new dbu());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new dbv(this));
    }

    public final synchronized ddh a(daj dajVar) {
        dbx dbxVar = (dbx) this.a.get(dajVar);
        if (dbxVar == null) {
            return null;
        }
        ddh ddhVar = (ddh) dbxVar.get();
        if (ddhVar == null) {
            c(dbxVar);
        }
        return ddhVar;
    }

    public final synchronized void b(daj dajVar, ddh ddhVar) {
        dbx dbxVar = (dbx) this.a.put(dajVar, new dbx(dajVar, ddhVar, this.b));
        if (dbxVar != null) {
            dbxVar.c = null;
            dbxVar.clear();
        }
    }

    final void c(dbx dbxVar) {
        synchronized (this) {
            this.a.remove(dbxVar.a);
            if (dbxVar.b) {
                ddp ddpVar = dbxVar.c;
            }
        }
    }

    final synchronized void d(daj dajVar) {
        dbx dbxVar = (dbx) this.a.remove(dajVar);
        if (dbxVar != null) {
            dbxVar.c = null;
            dbxVar.clear();
        }
    }
}
