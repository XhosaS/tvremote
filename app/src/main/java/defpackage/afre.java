package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afre implements afot {
    @Override // defpackage.afot
    public final afeh a() {
        return e().a();
    }

    @Override // defpackage.afoh
    public afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        throw null;
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return e().c();
    }

    @Override // defpackage.afvc
    public final Runnable d(afvb afvbVar) {
        return e().d(afvbVar);
    }

    protected abstract afot e();

    @Override // defpackage.afvc
    public void f(Status status) {
        e().f(status);
    }

    @Override // defpackage.afvc
    public void g(Status status) {
        e().g(status);
    }

    @Override // defpackage.afoh
    public final void i(afta aftaVar, Executor executor) {
        throw null;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", e());
        return yqqVarB.toString();
    }
}
