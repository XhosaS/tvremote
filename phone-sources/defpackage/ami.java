package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ami extends yiz implements yjz {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ long d;
    final /* synthetic */ goe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ami(long j, goe goeVar, CharSequence charSequence, long j2, yih yihVar) {
        super(2, yihVar);
        this.b = j;
        this.e = goeVar;
        this.c = charSequence;
        this.d = j2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ami) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ami(this.b, this.e, this.c, this.d, yihVar);
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
        amh amhVar = new amh(this.e, this.c, this.d, null);
        this.a = 1;
        Object objT = yoz.t(j, amhVar, this);
        return objT == yioVar ? yioVar : objT;
    }
}
