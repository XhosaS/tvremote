package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuf extends yiz implements yjz {
    /* synthetic */ int a;

    public yuf(yih yihVar) {
        super(2, yihVar);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yuf) create(Integer.valueOf(((Number) obj).intValue()), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        yuf yufVar = new yuf(yihVar);
        yufVar.a = ((Number) obj).intValue();
        return yufVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        return Boolean.valueOf(this.a > 0);
    }
}
