package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vn extends yiz implements yjz {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(long j, yih yihVar) {
        super(2, yihVar);
        this.a = j;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vn) create((pku) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vn vnVar = new vn(this.a, yihVar);
        vnVar.b = obj;
        return vnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        ((pku) this.b).F(this.a);
        return ygi.a;
    }
}
