package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class koi extends yiz implements yka {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ yjk d;
    final /* synthetic */ yjk e;
    final /* synthetic */ yjk f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koi(int i, yjk yjkVar, yjk yjkVar2, yjk yjkVar3, yih yihVar) {
        super(3, yihVar);
        this.c = i;
        this.d = yjkVar;
        this.e = yjkVar2;
        this.f = yjkVar3;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((bmx) obj2).a;
        koi koiVar = new koi(this.c, this.d, this.e, this.f, (yih) obj3);
        koiVar.g = (uz) obj;
        koiVar.b = j;
        return koiVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                Object obj2 = this.g;
                if (Float.intBitsToFloat((int) (this.b >> 32)) < this.c * 0.4f) {
                    this.d.a();
                } else {
                    this.e.a();
                }
                this.a = 1;
                if (((uz) obj2).m(this) == yioVar) {
                    return yioVar;
                }
            }
            this.f.a();
            return ygi.a;
        } catch (Throwable th) {
            this.f.a();
            throw th;
        }
    }
}
