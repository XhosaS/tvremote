package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmu implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afof b;
    final /* synthetic */ afih c;
    final /* synthetic */ afmv d;

    public afmu(afmv afmvVar, Status status, afof afofVar, afih afihVar) {
        this.a = status;
        this.b = afofVar;
        this.c = afihVar;
        this.d = afmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.h(this.a, this.b, this.c);
    }
}
