package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnj extends ykt implements yjz {
    final /* synthetic */ coa a;
    final /* synthetic */ yjk b;
    final /* synthetic */ cob c;
    final /* synthetic */ yjz d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnj(coa coaVar, yjk yjkVar, cob cobVar, yjz yjzVar, int i, int i2) {
        super(2);
        this.a = coaVar;
        this.b = yjkVar;
        this.c = cobVar;
        this.d = yjzVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cnk.b(this.a, this.b, this.c, this.d, (bao) obj, bdi.n(this.e | 1), this.f);
        return ygi.a;
    }
}
