package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwt extends ykt implements yjz {
    final /* synthetic */ bkp a;
    final /* synthetic */ yjz b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwt(bkp bkpVar, yjz yjzVar, int i, int i2) {
        super(2);
        this.a = bkpVar;
        this.b = yjzVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iN = bdi.n(this.c | 1);
        int i = this.d;
        bwu.a(this.a, this.b, (bao) obj, iN, i);
        return ygi.a;
    }
}
