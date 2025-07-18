package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afrc implements afoe {
    @Override // defpackage.afoe
    public final afeh a() {
        throw null;
    }

    protected abstract afoe b();

    @Override // defpackage.afzx
    public final void c() {
        b().c();
    }

    @Override // defpackage.afzx
    public final void d() {
        b().d();
    }

    @Override // defpackage.afzx
    public final void e(int i) {
        b().e(i);
    }

    @Override // defpackage.afzx
    public final void f(affa affaVar) {
        b().f(affaVar);
    }

    @Override // defpackage.afzx
    public final void h(InputStream inputStream) {
        b().h(inputStream);
    }

    @Override // defpackage.afzx
    public final boolean i() {
        return b().i();
    }

    @Override // defpackage.afoe
    public final void m(afry afryVar) {
        b().m(afryVar);
    }

    @Override // defpackage.afoe
    public final void n(Status status) {
        b().n(status);
    }

    @Override // defpackage.afoe
    public final void p() {
        b().p();
    }

    @Override // defpackage.afoe
    public final void q(afft afftVar) {
        b().q(afftVar);
    }

    @Override // defpackage.afoe
    public final void r(affw affwVar) {
        b().r(affwVar);
    }

    @Override // defpackage.afoe
    public final void s(int i) {
        b().s(i);
    }

    @Override // defpackage.afoe
    public final void t(int i) {
        b().t(i);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", b());
        return yqqVarB.toString();
    }

    @Override // defpackage.afoe
    public void u(afog afogVar) {
        throw null;
    }
}
