package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yfb extends yfa {
    final /* synthetic */ yfc a;

    protected yfb(yfc yfcVar) {
        this.a = yfcVar;
    }

    @Override // defpackage.yfa, defpackage.xrp
    public void f(xqk xqkVar, xrv xrvVar) {
        yfc yfcVar = this.a;
        if (yfcVar.c == xqk.SHUTDOWN) {
            return;
        }
        yfcVar.c = xqkVar;
        yfcVar.d = xrvVar;
        yfe yfeVar = yfcVar.e;
        if (yfeVar.i) {
            return;
        }
        yfeVar.f();
    }

    @Override // defpackage.yfa
    protected final xrp g() {
        return this.a.e.h;
    }
}
