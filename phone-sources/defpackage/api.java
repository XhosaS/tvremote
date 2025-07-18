package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class api implements yka {
    final /* synthetic */ aov a;
    final /* synthetic */ zr b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ yjz f;
    final /* synthetic */ yka g;
    final /* synthetic */ yjz h;
    final /* synthetic */ yjz i;
    final /* synthetic */ yka j;
    final /* synthetic */ cb k;

    public api(aov aovVar, zr zrVar, long j, long j2, int i, yjz yjzVar, yka ykaVar, yjz yjzVar2, yjz yjzVar3, yka ykaVar2, cb cbVar) {
        this.a = aovVar;
        this.b = zrVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = yjzVar;
        this.g = ykaVar;
        this.h = yjzVar2;
        this.i = yjzVar3;
        this.j = ykaVar2;
        this.k = cbVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bkp bkpVar = (bkp) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(bkpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && baoVar.K()) {
            baoVar.t();
        } else {
            aov aovVar = this.a;
            boolean zF = baoVar.F(aovVar);
            zr zrVar = this.b;
            boolean zF2 = zF | baoVar.F(zrVar);
            Object objG = baoVar.g();
            if (zF2 || objG == ban.a) {
                objG = new afk(aovVar, zrVar, 11, null);
                baoVar.A(objG);
            }
            og.F(zt.b(bkpVar, (yjv) objG), null, this.c, this.d, 0.0f, bga.k(-1761194824, new aph(this.e, this.f, this.g, this.h, aovVar, this.i, this.j, this.k), baoVar), baoVar, 1572864, 50);
        }
        return ygi.a;
    }
}
