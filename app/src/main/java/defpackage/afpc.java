package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpc implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afpn b;

    public afpc(afpn afpnVar, Status status) {
        this.a = status;
        this.b = afpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afeq afeqVar = this.b.b;
        Status status = this.a;
        afeqVar.b(status.getDescription(), status.o);
    }
}
