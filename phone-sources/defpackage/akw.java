package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akw extends yiz implements yka {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ alg c;
    final /* synthetic */ kw d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akw(kw kwVar, alg algVar, yih yihVar) {
        super(3, yihVar);
        this.d = kwVar;
        this.c = algVar;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((bmx) obj2).a;
        akw akwVar = new akw(this.d, this.c, (yih) obj3);
        akwVar.e = (uz) obj;
        akwVar.b = j;
        return akwVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.e;
            long j = this.b;
            kw kwVar = this.d;
            if (kwVar != null) {
                akv akvVar = new akv((uz) obj2, this.c, j, kwVar, null);
                this.a = 1;
                if (yoz.k(akvVar, this) == yioVar) {
                    return yioVar;
                }
            }
        }
        return ygi.a;
    }
}
