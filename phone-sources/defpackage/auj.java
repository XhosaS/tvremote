package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auj extends yiz implements yjz {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ mr c;
    final /* synthetic */ yjv d;
    final /* synthetic */ yow e;
    final /* synthetic */ bcb f;
    final /* synthetic */ bcb g;
    final /* synthetic */ bdl h;
    final /* synthetic */ bhi i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auj(bhi bhiVar, bdl bdlVar, mr mrVar, yjv yjvVar, yow yowVar, bcb bcbVar, bcb bcbVar2, yih yihVar) {
        super(2, yihVar);
        this.i = bhiVar;
        this.h = bdlVar;
        this.c = mrVar;
        this.d = yjvVar;
        this.e = yowVar;
        this.f = bcbVar;
        this.g = bcbVar2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auj) create((ysx) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        auj aujVar = new auj(this.i, this.h, this.c, this.d, this.e, this.f, this.g, yihVar);
        aujVar.b = obj;
        return aujVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ysx ysxVar = (ysx) this.b;
            bhi bhiVar = this.i;
            aui auiVar = new aui(this.h, ysxVar, this.c, this.d, this.e, this.f, this.g, null);
            this.a = 1;
            if (yoz.k(new rx(rv.a, bhiVar, auiVar, null, 0, null), this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
