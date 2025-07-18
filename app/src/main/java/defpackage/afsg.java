package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsg implements Runnable {
    final /* synthetic */ afsh a;

    public afsg(afsh afshVar) {
        this.a = afshVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsv afsvVar = this.a.b;
        afvc afvcVar = afsvVar.m;
        afsvVar.l = null;
        afsvVar.m = null;
        afvcVar.f(Status.l.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
