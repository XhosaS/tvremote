package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdp extends bjl implements bjc, bcb, bdy {
    private bdo a;

    public bdp(long j) {
        bit bitVarB = bjb.b();
        bdo bdoVar = new bdo(bitVarB.v(), j);
        if (!(bitVarB instanceof bim)) {
            bdoVar.n = new bdo(1L, j);
        }
        this.a = bdoVar;
    }

    @Override // defpackage.bcb, defpackage.bdy
    public final /* bridge */ /* synthetic */ Object a() {
        return Long.valueOf(e());
    }

    @Override // defpackage.bcb
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).longValue());
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.a;
    }

    @Override // defpackage.bjl, defpackage.bjk
    public final bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        if (((bdo) bjmVar2).a == ((bdo) bjmVar3).a) {
            return bjmVar2;
        }
        return null;
    }

    public final long e() {
        return ((bdo) bjb.j(this.a, this)).a;
    }

    @Override // defpackage.bjc
    public final bds f() {
        return bcz.c;
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.a = (bdo) bjmVar;
    }

    public final void h(long j) {
        bit bitVarB;
        bdo bdoVar = (bdo) bjb.e(this.a);
        if (bdoVar.a != j) {
            bdo bdoVar2 = this.a;
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                ((bdo) bjb.i(bdoVar2, this, bitVarB, bdoVar)).a = j;
            }
            bjb.t(bitVarB, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((bdo) bjb.e(this.a)).a + ")@" + hashCode();
    }
}
