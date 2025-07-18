package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class jvq extends Thread {
    final CountDownLatch a;
    private final WeakReference b;
    private final long c;

    public jvq(jvs jvsVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new WeakReference(jvsVar);
        this.c = j;
        this.a = new CountDownLatch(1);
        start();
    }

    private final void a() {
        jvs jvsVar = (jvs) this.b.get();
        if (jvsVar != null) {
            jvsVar.a();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
