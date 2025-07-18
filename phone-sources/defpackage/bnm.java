package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnm extends bko implements byl {
    public yjv a;

    public bnm(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(j);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new lz(bwjVarU, this, 5, null));
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }

    public final void i() {
        bzq bzqVar = fh.J(this, 2).v;
        if (bzqVar != null) {
            bzqVar.aq(this.a, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }
}
