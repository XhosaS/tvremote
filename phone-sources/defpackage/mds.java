package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mds extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ boolean f;
    final /* synthetic */ mdw g;
    final /* synthetic */ ylb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mds(String str, String str2, int i, boolean z, mdw mdwVar, ylb ylbVar, yih yihVar) {
        super(2, yihVar);
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = mdwVar;
        this.h = ylbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mds) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new mds(this.c, this.d, this.e, this.f, this.g, this.h, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        mdm mdmVar;
        ylb ylbVar;
        yio yioVar = yio.a;
        int i = this.b;
        if (i == 0) {
            ybn.f(obj);
            mdm mdmVar2 = new mdm(this.c, this.d, this.e, this.f);
            ysn ysnVarC = this.g.c();
            this.a = mdmVar2;
            this.b = 1;
            if (ysnVarC.a(mdmVar2, this) != yioVar) {
                mdmVar = mdmVar2;
            }
            return yioVar;
        }
        if (i != 1) {
            ylbVar = (ylb) this.a;
            ybn.f(obj);
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        mdmVar = (mdm) this.a;
        ybn.f(obj);
        ylb ylbVar2 = this.h;
        this.a = ylbVar2;
        this.b = 2;
        Object objZ = mdmVar.e.z(this);
        if (objZ != yioVar) {
            ylbVar = ylbVar2;
            obj = objZ;
            ylbVar.a = ((Boolean) obj).booleanValue();
            return ygi.a;
        }
        return yioVar;
    }
}
