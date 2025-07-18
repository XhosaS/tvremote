package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqn implements yjz {
    final /* synthetic */ yjz a;
    final /* synthetic */ yjz b;
    final /* synthetic */ yjz c;
    final /* synthetic */ bol d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ long g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ yjz j;
    final /* synthetic */ yjz k;

    public aqn(yjz yjzVar, yjz yjzVar2, yjz yjzVar3, bol bolVar, long j, float f, long j2, long j3, long j4, yjz yjzVar4, yjz yjzVar5) {
        this.a = yjzVar;
        this.b = yjzVar2;
        this.c = yjzVar3;
        this.d = bolVar;
        this.e = j;
        this.f = f;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = yjzVar4;
        this.k = yjzVar5;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            aqo.c(bga.k(1367541877, new acv(this.j, this.k, 15), baoVar), null, this.a, this.b, this.c, this.d, this.e, this.f, arm.f(26, baoVar), this.g, this.h, this.i, baoVar, 6, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
