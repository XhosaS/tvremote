package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awf implements yjz {
    final /* synthetic */ long a;
    final /* synthetic */ bol b;
    final /* synthetic */ yy c;
    final /* synthetic */ cmi d;
    final /* synthetic */ yka e;

    public awf(long j, bol bolVar, yy yyVar, cmi cmiVar, yka ykaVar) {
        this.a = j;
        this.b = bolVar;
        this.c = yyVar;
        this.d = cmiVar;
        this.e = ykaVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            zy.x(this.a, wv.N(baoVar).m, bga.k(802238160, new awe(this.b, this.c, this.d, this.e, 0), baoVar), baoVar, 384);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
