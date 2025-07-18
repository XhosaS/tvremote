package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afoz implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ afpn b;

    public afoz(afpn afpnVar, StringBuilder sb) {
        this.a = sb;
        this.b = afpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(Status.e.withDescription(this.a.toString()), true);
    }
}
