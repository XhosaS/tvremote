package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbj extends yiz implements yka {
    int a;
    final /* synthetic */ dbz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbj(dbz dbzVar, yih yihVar) {
        super(3, yihVar);
        this.b = dbzVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new dbj(this.b, (yih) obj3).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            dbz dbzVar = this.b;
            this.a = 1;
            if (dbzVar.c(this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
