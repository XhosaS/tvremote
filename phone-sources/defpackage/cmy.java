package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmy extends ykt implements yjz {
    final /* synthetic */ yjv a;
    final /* synthetic */ bkp b;
    final /* synthetic */ yjv c;
    final /* synthetic */ yjv d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmy(yjv yjvVar, bkp bkpVar, yjv yjvVar2, yjv yjvVar3, int i) {
        super(2);
        this.a = yjvVar;
        this.b = bkpVar;
        this.c = yjvVar2;
        this.d = yjvVar3;
        this.e = i;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cna.b(this.a, this.b, this.c, this.d, (bao) obj, bdi.n(this.e | 1));
        return ygi.a;
    }
}
