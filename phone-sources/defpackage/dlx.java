package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlx extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlx(yih yihVar, int i) {
        super(4, yihVar);
        this.d = i;
    }

    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.d != 0) {
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            dlx dlxVar = new dlx((yih) obj4, 1, null);
            dlxVar.b = (dki) obj2;
            dlxVar.c = zBooleanValue;
            return dlxVar.invokeSuspend(ygi.a);
        }
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        dlx dlxVar2 = new dlx((yih) obj4, 0);
        dlxVar2.b = (dki) obj2;
        dlxVar2.c = zBooleanValue2;
        return dlxVar2.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.d == 0) {
            yio yioVar = yio.a;
            if (this.a != 0) {
                ybn.f(obj);
                return obj;
            }
            ybn.f(obj);
            Object obj2 = this.b;
            if (this.c) {
                return null;
            }
            this.a = 1;
            Object objH = ((dki) obj2).h(this);
            return objH == yioVar ? yioVar : objH;
        }
        yio yioVar2 = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj3 = this.b;
            if (this.c) {
                this.a = 1;
                Object objO = ((dsn) obj3).o(dkc.a, this);
                if (objO != yioVar2) {
                    objO = ygi.a;
                }
                if (objO == yioVar2) {
                    return yioVar2;
                }
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlx(yih yihVar, int i, byte[] bArr) {
        super(4, yihVar);
        this.d = i;
    }
}
