package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class att implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ yjz b;
    final /* synthetic */ yka c;
    final /* synthetic */ yjz d;
    final /* synthetic */ yjz e;
    final /* synthetic */ ayy f;
    final /* synthetic */ yjz g;

    public att(int i, yjz yjzVar, yka ykaVar, yjz yjzVar2, yjz yjzVar3, ayy ayyVar, yjz yjzVar4) {
        this.a = i;
        this.b = yjzVar;
        this.c = ykaVar;
        this.d = yjzVar2;
        this.e = yjzVar3;
        this.f = ayyVar;
        this.g = yjzVar4;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            wv.D(this.a, this.b, this.c, this.d, this.e, this.f, this.g, baoVar, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
