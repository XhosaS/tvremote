package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggl extends yiz implements yjz {
    int a;
    final /* synthetic */ yil b;
    final /* synthetic */ gex c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ yjv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggl(yil yilVar, gex gexVar, boolean z, boolean z2, yjv yjvVar, yih yihVar) {
        super(2, yihVar);
        this.b = yilVar;
        this.c = gexVar;
        this.d = z;
        this.e = z2;
        this.f = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggl) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ggl(this.b, this.c, this.d, this.e, this.f, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i != 0) {
            return obj;
        }
        yil yilVar = this.b;
        ggn ggnVar = new ggn(this.c, this.d, this.e, this.f, (yih) null, 1);
        this.a = 1;
        Object objL = ykr.l(yilVar, ggnVar, this);
        return objL == yioVar ? yioVar : objL;
    }
}
