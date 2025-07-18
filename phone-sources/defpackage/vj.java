package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vj extends yiz implements yjz {
    int a;
    final /* synthetic */ vx b;
    final /* synthetic */ long c;
    final /* synthetic */ ylc d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(vx vxVar, long j, ylc ylcVar, yih yihVar) {
        super(2, yihVar);
        this.b = vxVar;
        this.c = j;
        this.d = ylcVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vj) create((pku) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vj vjVar = new vj(this.b, this.c, this.d, yihVar);
        vjVar.e = obj;
        return vjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            pku pkuVar = (pku) this.e;
            vx vxVar = this.b;
            long j = this.c;
            ylc ylcVar = this.d;
            float fB = vxVar.b(j);
            vi viVar = new vi(ylcVar, vxVar, pkuVar, 0);
            this.a = 1;
            if (og.k(0.0f, fB, null, viVar, this, 12) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
