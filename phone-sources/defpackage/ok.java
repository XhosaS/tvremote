package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ok extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ op d;
    final /* synthetic */ pf e;
    final /* synthetic */ float f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Object obj, Object obj2, op opVar, pf pfVar, float f, yih yihVar) {
        super(2, yihVar);
        this.b = obj;
        this.c = obj2;
        this.d = opVar;
        this.e = pfVar;
        this.f = f;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ok) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ok okVar = new ok(this.b, this.c, this.d, this.e, this.f, yihVar);
        okVar.g = obj;
        return okVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.g;
            Object obj2 = this.b;
            Object obj3 = this.c;
            if (yks.e(obj2, obj3)) {
                op opVar = this.d;
                opVar.g = null;
                if (yks.e(opVar.a(), obj2)) {
                    return ygi.a;
                }
            } else {
                this.d.m();
            }
            if (!yks.e(obj2, obj3)) {
                pf pfVar = this.e;
                pfVar.x(obj2);
                pfVar.r(0L);
                this.d.q(obj2);
                pfVar.o(this.f);
            }
            op opVar2 = this.d;
            opVar2.p(this.f);
            if (opVar2.k.g()) {
                ykr.q(yowVar, null, 0, new qy(opVar2, (yih) null, 1), 3);
            } else {
                opVar2.f = Long.MIN_VALUE;
            }
            this.a = 1;
            if (opVar2.k(this) == yioVar) {
                return yioVar;
            }
        }
        this.d.o();
        return ygi.a;
    }
}
