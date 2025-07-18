package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alz implements yjz {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bkp c;
    final /* synthetic */ amg d;

    public alz(long j, boolean z, bkp bkpVar, amg amgVar) {
        this.a = j;
        this.b = z;
        this.c = bkpVar;
        this.d = amgVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                baoVar.x(3458246);
                boolean z = this.b;
                xe xeVar = z ? xd.b : xd.a;
                bkp bkpVarL = zi.l(this.c, cmc.b(j), cmc.a(j), 0.0f, 0.0f, 12);
                amg amgVar = this.d;
                bvt bvtVarA = zf.a(xeVar, bkb.m, baoVar, 0);
                int iK = a.k(zy.p(baoVar));
                bhu bhuVarO = baoVar.O();
                bkp bkpVarC = bdi.C(baoVar, bkpVarL);
                yjk yjkVar = bxt.a;
                baoVar.c();
                baoVar.z();
                if (baoVar.J()) {
                    baoVar.k(yjkVar);
                } else {
                    baoVar.B();
                }
                beb.a(baoVar, bvtVarA, bxt.d);
                beb.a(baoVar, bhuVarO, bxt.c);
                yjz yjzVar = bxt.e;
                if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    baoVar.A(numValueOf);
                    baoVar.i(numValueOf, yjzVar);
                }
                beb.a(baoVar, bkpVarC, bxt.b);
                bkm bkmVar = bkp.g;
                boolean zH = baoVar.H(amgVar);
                Object objG = baoVar.g();
                if (zH || objG == ban.a) {
                    objG = new ajm(amgVar, 17);
                    baoVar.A(objG);
                }
                hw.x(bkmVar, (yjk) objG, z, baoVar, 6);
                baoVar.o();
                baoVar.p();
            } else {
                baoVar.x(4389176);
                bkp bkpVar = this.c;
                amg amgVar2 = this.d;
                boolean zH2 = baoVar.H(amgVar2);
                Object objG2 = baoVar.g();
                if (zH2 || objG2 == ban.a) {
                    objG2 = new ajm(amgVar2, 18);
                    baoVar.A(objG2);
                }
                hw.x(bkpVar, (yjk) objG2, this.b, baoVar, 0);
                baoVar.p();
            }
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
