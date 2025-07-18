package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdl extends bjl implements bjc, bcb, bdy {
    private bdk a;

    public bdl(float f) {
        bit bitVarB = bjb.b();
        bdk bdkVar = new bdk(bitVarB.v(), f);
        if (!(bitVarB instanceof bim)) {
            bdkVar.n = new bdk(1L, f);
        }
        this.a = bdkVar;
    }

    @Override // defpackage.bcb, defpackage.bdy
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(e());
    }

    @Override // defpackage.bcb
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).floatValue());
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.a;
    }

    @Override // defpackage.bjl, defpackage.bjk
    public final bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        if (((bdk) bjmVar2).a == ((bdk) bjmVar3).a) {
            return bjmVar2;
        }
        return null;
    }

    public final float e() {
        return ((bdk) bjb.j(this.a, this)).a;
    }

    @Override // defpackage.bjc
    public final bds f() {
        return bcz.c;
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.a = (bdk) bjmVar;
    }

    public final void h(float f) {
        bit bitVarB;
        bdk bdkVar = (bdk) bjb.e(this.a);
        if (bdkVar.a == f) {
            return;
        }
        bdk bdkVar2 = this.a;
        synchronized (bjb.b) {
            bitVarB = bjb.b();
            ((bdk) bjb.i(bdkVar2, this, bitVarB, bdkVar)).a = f;
        }
        bjb.t(bitVarB, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((bdk) bjb.e(this.a)).a + ")@" + hashCode();
    }
}
