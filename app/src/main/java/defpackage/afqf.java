package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqf implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afqm b;

    public afqf(afqm afqmVar, Status status) {
        this.a = status;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.n(this.a);
    }
}
