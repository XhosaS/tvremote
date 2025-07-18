package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alc extends yiz implements yjz {
    final /* synthetic */ alg a;
    final /* synthetic */ bte b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alc(alg algVar, bte bteVar, boolean z, yih yihVar) {
        super(2, yihVar);
        this.a = algVar;
        this.b = bteVar;
        this.c = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alc) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        alc alcVar = new alc(this.a, this.b, this.c, yihVar);
        alcVar.d = obj;
        return alcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        yow yowVar = (yow) this.d;
        bte bteVar = this.b;
        alg algVar = this.a;
        ykr.q(yowVar, null, 4, new qd(algVar, bteVar, (yih) null, 20, (short[]) null), 1);
        boolean z = this.c;
        ykr.q(yowVar, null, 4, new alb(bteVar, algVar, z, (yih) null, 1), 1);
        return ykr.q(yowVar, null, 4, new alb(algVar, bteVar, z, (yih) null, 0), 1);
    }
}
