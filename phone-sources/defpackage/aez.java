package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aez implements yjz {
    final /* synthetic */ ahy a;
    final /* synthetic */ aic b;
    final /* synthetic */ chc c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ akb f;
    final /* synthetic */ alg g;
    final /* synthetic */ bnn h;
    final /* synthetic */ boolean i;
    final /* synthetic */ sj j;
    final /* synthetic */ uv k;
    final /* synthetic */ boolean l;
    final /* synthetic */ afw m;
    final /* synthetic */ lhr n;
    final /* synthetic */ nxb o;

    public aez(ahy ahyVar, aic aicVar, lhr lhrVar, chc chcVar, boolean z, boolean z2, akb akbVar, alg algVar, bnn bnnVar, boolean z3, sj sjVar, uv uvVar, nxb nxbVar, boolean z4, afw afwVar) {
        this.a = ahyVar;
        this.b = aicVar;
        this.n = lhrVar;
        this.c = chcVar;
        this.d = z;
        this.e = z2;
        this.f = akbVar;
        this.g = algVar;
        this.h = bnnVar;
        this.i = z3;
        this.j = sjVar;
        this.k = uvVar;
        this.o = nxbVar;
        this.l = z4;
        this.m = afwVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            ahy ahyVar = this.a;
            if (ahyVar == null) {
                ahyVar = afc.a;
            }
            ahyVar.a(bga.k(1969169726, new aey(this.b, this.n, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.o, this.l, this.m), baoVar), baoVar, 6);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
