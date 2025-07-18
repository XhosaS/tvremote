package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dli extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dli(String str, yih yihVar) {
        super(4, yihVar);
        this.c = str;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        dli dliVar = new dli(this.c, (yih) obj4);
        dliVar.b = (dki) obj2;
        return dliVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.b;
            String str = this.c;
            this.a = 1;
            Object objO = ((dsn) obj2).o(new dka(str), this);
            if (objO != yioVar) {
                objO = ygi.a;
            }
            if (objO == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
