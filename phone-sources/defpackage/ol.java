package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ol extends yiz implements yjv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ op d;
    final /* synthetic */ pf e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(Object obj, Object obj2, op opVar, pf pfVar, float f, yih yihVar) {
        super(1, yihVar);
        this.b = obj;
        this.c = obj2;
        this.d = opVar;
        this.e = pfVar;
        this.f = f;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ol(this.b, this.c, this.d, this.e, this.f, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new ol(this.b, this.c, this.d, this.e, this.f, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ok okVar = new ok(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (yoz.k(okVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
