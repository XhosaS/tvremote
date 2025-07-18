package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxl implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afof b;
    final /* synthetic */ afih c;
    final /* synthetic */ afyf d;

    public afxl(afyf afyfVar, Status status, afof afofVar, afih afihVar) {
        this.a = status;
        this.b = afofVar;
        this.c = afihVar;
        this.d = afyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afyf afyfVar = this.d;
        afyfVar.G = true;
        afyfVar.C.a(this.a, this.b, this.c);
    }
}
