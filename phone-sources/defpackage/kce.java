package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kce extends yiz implements yjz {
    final /* synthetic */ bcb a;
    final /* synthetic */ yjv b;
    final /* synthetic */ yow c;
    final /* synthetic */ yjk d;
    final /* synthetic */ bcb e;
    final /* synthetic */ ovq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kce(bcb bcbVar, yjv yjvVar, yow yowVar, ovq ovqVar, yjk yjkVar, bcb bcbVar2, yih yihVar) {
        super(2, yihVar);
        this.a = bcbVar;
        this.b = yjvVar;
        this.c = yowVar;
        this.f = ovqVar;
        this.d = yjkVar;
        this.e = bcbVar2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kce) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new kce(this.a, this.b, this.c, this.f, this.d, this.e, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        bcb bcbVar = this.a;
        Boolean boolF = jxl.f(bcbVar);
        if (boolF != null) {
            yjv yjvVar = this.b;
            yow yowVar = this.c;
            ovq ovqVar = this.f;
            yjk yjkVar = this.d;
            bcb bcbVar2 = this.e;
            boolean zBooleanValue = boolF.booleanValue();
            yjvVar.a(boolF);
            if (zBooleanValue) {
                bcbVar2.b(ykr.q(yowVar, null, 0, new ixs(ovqVar, yjkVar, bcbVar, (yih) null, 14), 3));
            } else {
                yqe yqeVarG = jxl.g(bcbVar2);
                if (yqeVarG != null) {
                    yqeVarG.t(null);
                }
                jxl.i(ovqVar);
            }
        }
        return ygi.a;
    }
}
