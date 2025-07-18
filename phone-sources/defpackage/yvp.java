package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvp extends yvm {
    public final yka e;

    public yvp(yka ykaVar, ysx ysxVar, yil yilVar, int i, int i2) {
        super(ysxVar, yilVar, i, i2);
        this.e = ykaVar;
    }

    @Override // defpackage.yvl
    protected final yvl c(yil yilVar, int i, int i2) {
        return new yvp(this.e, this.d, yilVar, i, i2);
    }

    @Override // defpackage.yvm
    public final Object g(ysy ysyVar, yih yihVar) {
        boolean z = yoy.a;
        Object objK = yoz.k(new axy(this, ysyVar, (yih) null, 9), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public /* synthetic */ yvp(yka ykaVar, ysx ysxVar) {
        this(ykaVar, ysxVar, yim.a, -2, 1);
    }
}
