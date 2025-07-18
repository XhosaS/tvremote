package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnf extends ykt implements yjv {
    final /* synthetic */ cny a;
    final /* synthetic */ yjk b;
    final /* synthetic */ cob c;
    final /* synthetic */ cmi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnf(cny cnyVar, yjk yjkVar, cob cobVar, cmi cmiVar) {
        super(1);
        this.a = cnyVar;
        this.b = yjkVar;
        this.c = cobVar;
        this.d = cmiVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cny cnyVar = this.a;
        cnyVar.b.addView(cnyVar, cnyVar.c);
        cnyVar.n(this.b, this.c, this.d);
        return new gd(cnyVar, 14);
    }
}
