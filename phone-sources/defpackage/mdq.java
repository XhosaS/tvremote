package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mdq extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ lul d;
    final /* synthetic */ mdw e;
    final /* synthetic */ ylb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdq(String str, lul lulVar, mdw mdwVar, ylb ylbVar, yih yihVar) {
        super(2, yihVar);
        this.c = str;
        this.d = lulVar;
        this.e = mdwVar;
        this.f = ylbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mdq) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new mdq(this.c, this.d, this.e, this.f, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        mdl mdlVar;
        ylb ylbVar;
        yio yioVar = yio.a;
        int i = this.b;
        if (i == 0) {
            ybn.f(obj);
            mdl mdlVar2 = new mdl(this.c, this.d);
            ysn ysnVarC = this.e.c();
            this.a = mdlVar2;
            this.b = 1;
            if (ysnVarC.a(mdlVar2, this) != yioVar) {
                mdlVar = mdlVar2;
            }
            return yioVar;
        }
        if (i != 1) {
            ylbVar = (ylb) this.a;
            ybn.f(obj);
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        mdlVar = (mdl) this.a;
        ybn.f(obj);
        ylb ylbVar2 = this.f;
        this.a = ylbVar2;
        this.b = 2;
        Object objZ = mdlVar.e.z(this);
        if (objZ != yioVar) {
            ylbVar = ylbVar2;
            obj = objZ;
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        return yioVar;
    }
}
