package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lb extends ykt implements yjz {
    final /* synthetic */ pf a;
    final /* synthetic */ Object b;
    final /* synthetic */ yjv c;
    final /* synthetic */ lj d;
    final /* synthetic */ bje e;
    final /* synthetic */ ykb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(pf pfVar, Object obj, yjv yjvVar, lj ljVar, bje bjeVar, ykb ykbVar) {
        super(2);
        this.a = pfVar;
        this.b = obj;
        this.c = yjvVar;
        this.d = ljVar;
        this.e = bjeVar;
        this.f = ykbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            yjv yjvVar = this.c;
            lj ljVar = this.d;
            Object objG = baoVar.g();
            Object obj3 = ban.a;
            if (objG == obj3) {
                objG = (aqx) yjvVar.a(ljVar);
                baoVar.A(objG);
            }
            pf pfVar = this.a;
            aqx aqxVar = (aqx) objG;
            Object objB = pfVar.e().b();
            Object obj4 = this.b;
            boolean zG = baoVar.G(yks.e(objB, obj4));
            Object objG2 = baoVar.g();
            if (zG || objG2 == obj3) {
                objG2 = yks.e(pfVar.e().b(), obj4) ? mg.a : ((aqx) yjvVar.a(ljVar)).c;
                baoVar.A(objG2);
            }
            mg mgVar = (mg) objG2;
            Object objG3 = baoVar.g();
            if (objG3 == obj3) {
                objG3 = new lf(yks.e(obj4, pfVar.g()));
                baoVar.A(objG3);
            }
            Object obj5 = aqxVar.b;
            lf lfVar = (lf) objG3;
            boolean zH = baoVar.H(aqxVar);
            Object objG4 = baoVar.g();
            if (zH || objG4 == obj3) {
                objG4 = new kz(aqxVar);
                baoVar.A(objG4);
            }
            bkp bkpVarJ = bty.j((yka) objG4);
            lfVar.a.b(Boolean.valueOf(yks.e(obj4, pfVar.g())));
            bkp bkpVarA = bkpVarJ.a(lfVar);
            boolean zH2 = baoVar.H(obj4);
            Object objG5 = baoVar.g();
            if (zH2 || objG5 == obj3) {
                objG5 = new lk(obj4, 1);
                baoVar.A(objG5);
            }
            yjv yjvVar2 = (yjv) objG5;
            boolean zF = baoVar.F(mgVar);
            Object objG6 = baoVar.g();
            if (zF || objG6 == obj3) {
                objG6 = new bkl(mgVar, 1);
                baoVar.A(objG6);
            }
            kv.g(pfVar, yjvVar2, bkpVarA, (mf) obj5, mgVar, (yjz) objG6, bga.k(-143346359, new la(this.e, obj4, ljVar, this.f), baoVar), baoVar, 12582912);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
