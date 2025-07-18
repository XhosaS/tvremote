package defpackage;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wve implements Runnable {
    final /* synthetic */ wvh a;

    public wve(wvh wvhVar) {
        this.a = wvhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    wvh wvhVar = this.a;
                    if (wvhVar.c.isShutdown()) {
                        try {
                            this.a.c.execute(this);
                            return;
                        } catch (RejectedExecutionException e) {
                            Iterator it = wvh.a.keySet().iterator();
                            while (it.hasNext()) {
                                ((wvg) it.next()).a.q(e);
                            }
                            return;
                        }
                    }
                    wvf wvfVar = ((wvg) wvhVar.b.remove()).a;
                    int i = wvf.b;
                    wvfVar.p(null);
                } catch (InterruptedException unused) {
                    this.a.c.execute(this);
                    return;
                } catch (Throwable th) {
                    try {
                        this.a.c.execute(this);
                    } catch (RejectedExecutionException e2) {
                        Iterator it2 = wvh.a.keySet().iterator();
                        while (it2.hasNext()) {
                            ((wvg) it2.next()).a.q(e2);
                        }
                    }
                    throw th;
                }
            } catch (RejectedExecutionException e3) {
                Iterator it3 = wvh.a.keySet().iterator();
                while (it3.hasNext()) {
                    ((wvg) it3.next()).a.q(e3);
                }
                return;
            }
        }
    }
}
