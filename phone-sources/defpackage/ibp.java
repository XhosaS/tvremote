package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibp extends yiz implements yjz {
    int a;
    final /* synthetic */ ysx b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Throwable d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibp(ysx ysxVar, yih yihVar, boolean z, Throwable th) {
        super(2, yihVar);
        this.b = ysxVar;
        this.c = z;
        this.d = th;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibp) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ibp ibpVar = new ibp(this.b, yihVar, this.c, this.d);
        ibpVar.e = obj;
        return ibpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ysy ysyVar = (ysy) this.e;
            ysx ysxVar = this.b;
            ibo iboVar = new ibo(ysyVar, this.c, this.d);
            this.a = 1;
            if (ysxVar.a(iboVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
