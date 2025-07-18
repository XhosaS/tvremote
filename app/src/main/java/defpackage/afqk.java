package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqk implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afof b;
    final /* synthetic */ afih c;
    final /* synthetic */ afql d;

    public afqk(afql afqlVar, Status status, afof afofVar, afih afihVar) {
        this.a = status;
        this.b = afofVar;
        this.c = afihVar;
        this.d = afqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
