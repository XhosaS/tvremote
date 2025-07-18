package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afzd implements Runnable {
    final /* synthetic */ afzf a;

    public afzd(afzf afzfVar) {
        this.a = afzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.h(Status.b.withDescription("Handshake timeout exceeded"));
    }
}
