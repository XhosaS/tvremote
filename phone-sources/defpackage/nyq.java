package defpackage;

import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class nyq implements Runnable {
    final /* synthetic */ nyr b;

    public nyq(nyr nyrVar) {
        this.b = nyrVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock = this.b.b;
        lock.lock();
        try {
            try {
            } catch (RuntimeException e) {
                nyz nyzVar = this.b.a.e;
                nyzVar.sendMessage(nyzVar.obtainMessage(2, e));
            }
            if (Thread.interrupted()) {
                lock.unlock();
            } else {
                a();
            }
        } finally {
            this.b.b.unlock();
        }
    }
}
