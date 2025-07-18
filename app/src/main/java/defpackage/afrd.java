package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afrd implements afog {
    @Override // defpackage.afog
    public void a(Status status, afof afofVar, afih afihVar) {
        throw null;
    }

    protected abstract afog b();

    @Override // defpackage.afog
    public final void c(afih afihVar) {
        b().c(afihVar);
    }

    @Override // defpackage.afzz
    public final void d(afzy afzyVar) {
        b().d(afzyVar);
    }

    @Override // defpackage.afzz
    public final void e() {
        b().e();
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", b());
        return yqqVarB.toString();
    }
}
