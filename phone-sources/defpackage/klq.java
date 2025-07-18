package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klq extends yiz implements yka {
    /* synthetic */ Object a;

    public klq(yih yihVar) {
        super(3, yihVar);
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        klq klqVar = new klq((yih) obj3);
        klqVar.a = (Throwable) obj2;
        return klqVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        krd.d("Could not retrieve widget data", (Throwable) this.a);
        return ygi.a;
    }
}
