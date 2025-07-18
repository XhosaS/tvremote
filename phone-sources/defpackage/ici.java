package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ici extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ iom c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici(iom iomVar, yih yihVar) {
        super(3, yihVar);
        this.c = iomVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ici iciVar = new ici(this.c, (yih) obj3);
        iciVar.b = (Throwable) obj2;
        return iciVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.b;
            iom iomVar = this.c;
            icb icbVar = new icb((Throwable) obj2);
            this.a = 1;
            if (iomVar.b.a(icbVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
