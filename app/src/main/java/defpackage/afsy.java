package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsy implements Runnable {
    final /* synthetic */ aftc a;

    public afsy(aftc aftcVar) {
        this.a = aftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        aftc aftcVar = this.a;
        synchronized (aftcVar) {
            if (aftcVar.i != 6) {
                aftcVar.i = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            aftc aftcVar2 = this.a;
            aftcVar2.j.a.g(Status.l.withDescription("Keepalive failed. The connection is likely gone"));
        }
    }
}
