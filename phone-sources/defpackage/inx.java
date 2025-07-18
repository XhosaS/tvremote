package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class inx extends yiz implements yjz {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ isf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inx(isf isfVar, String str, yih yihVar) {
        super(2, yihVar);
        this.d = isfVar;
        this.c = str;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((inx) create(bool, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        inx inxVar = new inx(this.d, this.c, yihVar);
        inxVar.b = ((Boolean) obj).booleanValue();
        return inxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ysx ysxVarI = this.d.i(this.c, wod.a, this.b);
            dbi dbiVar = new dbi((yih) null, 3, (short[]) null);
            this.a = 1;
            obj = vyf.A(ysxVarI, dbiVar, this);
            if (obj == yioVar) {
                return yioVar;
            }
        }
        return iob.a((ihz) obj, null);
    }
}
