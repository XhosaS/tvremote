package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycc extends yiz implements yjz {
    int a;
    final /* synthetic */ xpy b;
    final /* synthetic */ xpz c;
    final /* synthetic */ xsq d;
    final /* synthetic */ xsm e;
    final /* synthetic */ upo f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycc(xpy xpyVar, xpz xpzVar, xsq xsqVar, xsm xsmVar, upo upoVar, yih yihVar) {
        super(2, yihVar);
        this.b = xpyVar;
        this.c = xpzVar;
        this.d = xsqVar;
        this.e = xsmVar;
        this.f = upoVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycc) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ycc yccVar = new ycc(this.b, this.c, this.d, this.e, this.f, yihVar);
        yccVar.g = obj;
        return yccVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ycb ycbVar = new ycb(this.b, this.c, this.d, this.e, (ysy) this.g, this.f, null);
            this.a = 1;
            if (yoz.k(ycbVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
