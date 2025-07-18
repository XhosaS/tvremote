package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vb extends yiz implements yjz {
    final /* synthetic */ ylc a;
    final /* synthetic */ float b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(ylc ylcVar, float f, yih yihVar) {
        super(2, yihVar);
        this.a = ylcVar;
        this.b = f;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vb) create((vc) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vb vbVar = new vb(this.a, this.b, yihVar);
        vbVar.c = obj;
        return vbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        this.a.a = ((vc) this.c).a(this.b);
        return ygi.a;
    }
}
