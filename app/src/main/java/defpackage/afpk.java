package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpk implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afih b;
    final /* synthetic */ afpm c;

    public afpk(afpm afpmVar, Status status, afih afihVar) {
        this.a = status;
        this.b = afihVar;
        this.c = afpmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
