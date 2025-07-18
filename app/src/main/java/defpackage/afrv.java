package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afrv implements Runnable {
    final /* synthetic */ afta a;

    public afrv(afta aftaVar) {
        this.a = aftaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.a.g(Status.l.withDescription("Keepalive failed. The connection is likely gone"));
    }
}
