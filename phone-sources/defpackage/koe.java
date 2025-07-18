package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koe extends yiz implements yjz {
    int a;
    final /* synthetic */ sj b;
    final /* synthetic */ float c;
    final /* synthetic */ bcb d;
    final /* synthetic */ bcb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koe(sj sjVar, float f, bcb bcbVar, bcb bcbVar2, yih yihVar) {
        super(2, yihVar);
        this.b = sjVar;
        this.c = f;
        this.d = bcbVar;
        this.e = bcbVar2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((koe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new koe(this.b, this.c, this.d, this.e, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ysx ysxVarBS = a.bS(new kih(this.b, 10));
            jze jzeVar = new jze(this.d, 10);
            this.a = 1;
            if (ysxVarBS.a(jzeVar, this) == yioVar) {
                return yioVar;
            }
        }
        sj sjVar = this.b;
        if (sjVar.b() < this.c || !sjVar.i()) {
            this.e.b(false);
        }
        return ygi.a;
    }
}
