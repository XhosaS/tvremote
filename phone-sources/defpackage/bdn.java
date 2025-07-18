package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdn extends bjl implements bjc, bcb, bdy {
    private bdm a;

    public bdn(int i) {
        bit bitVarB = bjb.b();
        bdm bdmVar = new bdm(bitVarB.v(), i);
        if (!(bitVarB instanceof bim)) {
            bdmVar.n = new bdm(1L, i);
        }
        this.a = bdmVar;
    }

    @Override // defpackage.bcb, defpackage.bdy
    public final /* bridge */ /* synthetic */ Object a() {
        return Integer.valueOf(e());
    }

    @Override // defpackage.bcb
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).intValue());
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.a;
    }

    @Override // defpackage.bjl, defpackage.bjk
    public final bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        if (((bdm) bjmVar2).a == ((bdm) bjmVar3).a) {
            return bjmVar2;
        }
        return null;
    }

    public final int e() {
        return ((bdm) bjb.j(this.a, this)).a;
    }

    @Override // defpackage.bjc
    public final bds f() {
        return bcz.c;
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.a = (bdm) bjmVar;
    }

    public final void h(int i) {
        bit bitVarB;
        bdm bdmVar = (bdm) bjb.e(this.a);
        if (bdmVar.a != i) {
            bdm bdmVar2 = this.a;
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                ((bdm) bjb.i(bdmVar2, this, bitVarB, bdmVar)).a = i;
            }
            bjb.t(bitVarB, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((bdm) bjb.e(this.a)).a + ")@" + hashCode();
    }
}
