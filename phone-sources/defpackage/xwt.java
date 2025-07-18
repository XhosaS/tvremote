package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class xwt implements xvk {
    @Override // defpackage.xvk
    public final xpv a() {
        throw null;
    }

    protected abstract xvk b();

    @Override // defpackage.xvk
    public final void g(xxi xxiVar) {
        b().g(xxiVar);
    }

    @Override // defpackage.xvk
    public final void h(xtk xtkVar) {
        b().h(xtkVar);
    }

    @Override // defpackage.xvk
    public final void j() {
        b().j();
    }

    @Override // defpackage.xvk
    public final void k(xqp xqpVar) {
        b().k(xqpVar);
    }

    @Override // defpackage.xvk
    public final void l(xqs xqsVar) {
        b().l(xqsVar);
    }

    @Override // defpackage.xvk
    public final void m(int i) {
        b().m(i);
    }

    @Override // defpackage.xvk
    public final void n(int i) {
        b().n(i);
    }

    @Override // defpackage.xvk
    public void o(xvm xvmVar) {
        throw null;
    }

    @Override // defpackage.ybt
    public final boolean p() {
        return b().p();
    }

    @Override // defpackage.ybt
    public final void r() {
        b().r();
    }

    @Override // defpackage.ybt
    public final void t() {
        b().t();
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", b());
        return tssVarH.toString();
    }

    @Override // defpackage.ybt
    public final void u(int i) {
        b().u(i);
    }

    @Override // defpackage.ybt
    public final void v(xqh xqhVar) {
        b().v(xqhVar);
    }

    @Override // defpackage.ybt
    public final void w(InputStream inputStream) {
        b().w(inputStream);
    }
}
