package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdr<T> extends bjl implements bjc<T> {
    public final bds a;
    private bdq b;

    public bdr(Object obj, bds bdsVar) {
        this.a = bdsVar;
        bit bitVarB = bjb.b();
        bdq bdqVar = new bdq(bitVarB.v(), obj);
        if (!(bitVarB instanceof bim)) {
            bdqVar.n = new bdq(1L, obj);
        }
        this.b = bdqVar;
    }

    @Override // defpackage.bcb, defpackage.bdy
    public final Object a() {
        return ((bdq) bjb.j(this.b, this)).a;
    }

    @Override // defpackage.bcb
    public final void b(Object obj) {
        bit bitVarB;
        bdq bdqVar = (bdq) bjb.e(this.b);
        if (this.a.a(bdqVar.a, obj)) {
            return;
        }
        bdq bdqVar2 = this.b;
        synchronized (bjb.b) {
            bitVarB = bjb.b();
            ((bdq) bjb.i(bdqVar2, this, bitVarB, bdqVar)).a = obj;
        }
        bjb.t(bitVarB, this);
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.b;
    }

    @Override // defpackage.bjl, defpackage.bjk
    public final bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        if (this.a.a(((bdq) bjmVar2).a, ((bdq) bjmVar3).a)) {
            return bjmVar2;
        }
        return null;
    }

    @Override // defpackage.bjc
    public final bds f() {
        return this.a;
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.b = (bdq) bjmVar;
    }

    public final String toString() {
        return "MutableState(value=" + ((bdq) bjb.e(this.b)).a + ")@" + hashCode();
    }
}
