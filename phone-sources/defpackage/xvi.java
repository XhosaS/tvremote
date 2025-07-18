package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvi implements xvm {
    public xtk a;
    final /* synthetic */ xvj b;
    public final wbb c;

    public xvi(xvj xvjVar, wbb wbbVar) {
        this.b = xvjVar;
        this.c = wbbVar;
    }

    @Override // defpackage.xvm
    public final void a(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        int i = yfl.a;
        xvj xvjVar = this.b;
        xqp xqpVarB = xvjVar.b();
        if (xtkVar.n == xth.CANCELLED && xqpVarB != null) {
            if (xqpVarB.b) {
                xtkVar = xvjVar.g.a();
                xsmVar = new xsm();
            } else if (xqpVarB.a - System.nanoTime() <= 0) {
                xqpVarB.b = true;
                xtkVar = xvjVar.g.a();
                xsmVar = new xsm();
            }
        }
        xvjVar.d.execute(new xvg(this, xtkVar, xsmVar));
    }

    public final void b(xtk xtkVar) {
        this.a = xtkVar;
        this.b.i.h(xtkVar);
    }

    @Override // defpackage.xvm
    public final void c(xsm xsmVar) {
        int i = yfl.a;
        this.b.d.execute(new xve(this, xsmVar));
    }

    @Override // defpackage.ybu
    public final void d() {
        xsp xspVar = xsp.UNARY;
        xvj xvjVar = this.b;
        xsp xspVar2 = xvjVar.c.a;
        if (xspVar2 == xspVar || xspVar2 == xsp.SERVER_STREAMING) {
            return;
        }
        int i = yfl.a;
        xvjVar.d.execute(new xvh(this));
    }

    @Override // defpackage.ybu
    public final void e(xzg xzgVar) {
        int i = yfl.a;
        this.b.d.execute(new xvf(this, xzgVar));
    }
}
