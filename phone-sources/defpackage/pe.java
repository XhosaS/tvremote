package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pe extends yiz implements yjz {
    float a;
    int b;
    final /* synthetic */ pf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(pf pfVar, yih yihVar) {
        super(2, yihVar);
        this.c = pfVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        pe peVar = new pe(this.c, yihVar);
        peVar.d = obj;
        return peVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yow yowVar;
        float f;
        yio yioVar = yio.a;
        if (this.b != 0) {
            f = this.a;
            yowVar = (yow) this.d;
            ybn.f(obj);
        } else {
            ybn.f(obj);
            yowVar = (yow) this.d;
            f = og.f(yowVar.c());
        }
        while (yoz.p(yowVar)) {
            sh shVar = new sh(this.c, f, 1);
            this.d = yowVar;
            this.a = f;
            this.b = 1;
            if (bcm.e(shVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
