package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aph implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ yjz b;
    final /* synthetic */ yka c;
    final /* synthetic */ yjz d;
    final /* synthetic */ aov e;
    final /* synthetic */ yjz f;
    final /* synthetic */ yka g;
    final /* synthetic */ cb h;

    public aph(int i, yjz yjzVar, yka ykaVar, yjz yjzVar2, aov aovVar, yjz yjzVar3, yka ykaVar2, cb cbVar) {
        this.a = i;
        this.b = yjzVar;
        this.c = ykaVar;
        this.d = yjzVar2;
        this.e = aovVar;
        this.f = yjzVar3;
        this.g = ykaVar2;
        this.h = cbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            apj.a(this.a, this.b, this.c, bga.k(545329543, new acv(this.g, this.h, 6), baoVar), this.d, this.e, this.f, baoVar, 24576);
        }
        return ygi.a;
    }
}
