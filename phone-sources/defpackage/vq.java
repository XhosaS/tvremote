package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vq extends yiz implements yjz {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ vr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(vr vrVar, yih yihVar) {
        super(2, yihVar);
        this.c = vrVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vq) create(new bmx(((bmx) obj).a), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vq vqVar = new vq(this.c, yihVar);
        vqVar.b = ((bmx) obj).a;
        return vqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        vr vrVar = this.c;
        this.a = 1;
        Object objA = vk.a(vrVar.i, j, this);
        return objA == yioVar ? yioVar : objA;
    }
}
