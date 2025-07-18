package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahs extends bxw implements cad, bmb, bmn {
    public yjk a;
    public boolean b;
    private final bts c;

    public ahs(yjk yjkVar) {
        this.a = yjkVar;
        qi qiVar = new qi(this, 7);
        bsr bsrVar = btm.a;
        bts btsVar = new bts(null, null, qiVar);
        O(btsVar);
        this.c = btsVar;
    }

    @Override // defpackage.cad
    public final void bV() {
        this.c.bV();
    }

    @Override // defpackage.cad
    public final long cf() {
        return byb.a(fh.L(this));
    }

    @Override // defpackage.bko
    public final /* synthetic */ void cg() {
        cbp.N(this);
    }

    @Override // defpackage.bmb
    public final void ck(bmp bmpVar) {
        this.b = bmpVar.b();
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        this.c.m(bsrVar, bssVar, j);
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }
}
