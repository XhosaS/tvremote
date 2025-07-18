package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xuj extends xum implements xvk, xzl {
    public static final Logger q = Logger.getLogger(xuj.class.getName());
    private xsm a;
    private volatile boolean b;
    private final xzm c;
    public final ybx r;
    public final boolean s;

    protected xuj(ybz ybzVar, ybs ybsVar, ybx ybxVar, xsm xsmVar, xpy xpyVar) {
        ybxVar.getClass();
        this.r = ybxVar;
        this.s = !Boolean.TRUE.equals(xpyVar.g(xxc.l));
        this.c = new xzm(this, ybzVar, ybsVar);
        this.a = xsmVar;
    }

    protected abstract xui b();

    @Override // defpackage.xum
    protected /* bridge */ /* synthetic */ xul c() {
        throw null;
    }

    protected abstract xul f();

    @Override // defpackage.xvk
    public final void g(xxi xxiVar) {
        xxiVar.b("remote_addr", a().a(xqx.a));
    }

    @Override // defpackage.xvk
    public final void h(xtk xtkVar) {
        sij.o(!xtkVar.g(), "Should not cancel with OK status");
        this.b = true;
        b().a(xtkVar);
    }

    @Override // defpackage.xzl
    public final void i(yby ybyVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (ybyVar == null && !z) {
            z3 = false;
        }
        sij.o(z3, "null frame before EOS");
        b().b(ybyVar, z, z2, i);
    }

    @Override // defpackage.xvk
    public final void j() {
        if (f().s) {
            return;
        }
        f().s = true;
        xzm xzmVarQ = q();
        if (xzmVarQ.i) {
            return;
        }
        xzmVarQ.i = true;
        yby ybyVar = xzmVarQ.b;
        if (ybyVar != null && ybyVar.a() == 0 && xzmVarQ.b != null) {
            xzmVarQ.b = null;
        }
        xzmVarQ.b(true, true);
    }

    @Override // defpackage.xvk
    public final void k(xqp xqpVar) {
        xsm xsmVar = this.a;
        xsj xsjVar = xxc.a;
        xsmVar.f(xsjVar);
        this.a.h(xsjVar, Long.valueOf(Math.max(0L, xqpVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.xvk
    public final void l(xqs xqsVar) {
        xul xulVarF = f();
        sij.x(xulVarF.q == null, "Already called start");
        xqsVar.getClass();
        xulVarF.r = xqsVar;
    }

    @Override // defpackage.xvk
    public final void m(int i) {
        ((xzi) f().j).b = i;
    }

    @Override // defpackage.xvk
    public final void n(int i) {
        xzm xzmVar = this.c;
        sij.x(xzmVar.a == -1, "max size already set");
        xzmVar.a = i;
    }

    @Override // defpackage.xvk
    public final void o(xvm xvmVar) {
        xul xulVarF = f();
        sij.x(xulVarF.q == null, "Already called setListener");
        xulVarF.q = xvmVar;
        b().c(this.a);
        this.a = null;
    }

    @Override // defpackage.xum, defpackage.ybt
    public final boolean p() {
        return c().h() && !this.b;
    }

    @Override // defpackage.xum
    protected final xzm q() {
        return this.c;
    }
}
