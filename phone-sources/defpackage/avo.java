package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avo implements yka {
    final /* synthetic */ asb a;
    final /* synthetic */ String b;
    final /* synthetic */ avq c;
    final /* synthetic */ avq d;

    public avo(avq avqVar, avq avqVar2, asb asbVar, String str) {
        this.c = avqVar;
        this.d = avqVar2;
        this.a = asbVar;
        this.b = str;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object avpVar;
        mz mzVar;
        yjz yjzVar = (yjz) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.H(yjzVar) ? 2 : 4;
        }
        if (baoVar.L((iIntValue & 19) != 18, iIntValue & 1)) {
            Object obj5 = this.c;
            boolean zE = yks.e(obj5, this.d);
            np npVarF = wv.F(5, baoVar);
            boolean zF = baoVar.F(obj5);
            Object obj6 = this.a;
            boolean zH = zF | baoVar.H(obj6);
            Object objG = baoVar.g();
            if (zH || objG == ban.a) {
                objG = new qm(obj5, obj6, 20, null);
                baoVar.A(objG);
            }
            yjk yjkVar = (yjk) objG;
            Object objG2 = baoVar.g();
            Object obj7 = ban.a;
            if (objG2 == obj7) {
                objG2 = ms.a(true != zE ? 1.0f : 0.0f);
                baoVar.A(objG2);
            }
            mr mrVar = (mr) objG2;
            Boolean boolValueOf = Boolean.valueOf(zE);
            boolean zH2 = baoVar.H(mrVar) | baoVar.G(zE) | baoVar.H(npVarF) | baoVar.F(yjkVar);
            Object objG3 = baoVar.g();
            if (zH2 || objG3 == obj7) {
                obj4 = obj7;
                avpVar = new avp(mrVar, zE, npVarF, yjkVar, (yih) null, 0);
                baoVar.A(avpVar);
            } else {
                avpVar = objG3;
                obj4 = obj7;
            }
            bbn.f(boolValueOf, (yjz) avpVar, baoVar);
            mz mzVar2 = mrVar.a;
            np npVarF2 = wv.F(2, baoVar);
            Object objG4 = baoVar.g();
            if (objG4 == obj4) {
                objG4 = ms.a(true == zE ? 0.8f : 1.0f);
                baoVar.A(objG4);
            }
            mr mrVar2 = (mr) objG4;
            boolean zH3 = baoVar.H(mrVar2) | baoVar.G(zE) | baoVar.H(npVarF2);
            Object objG5 = baoVar.g();
            if (zH3 || objG5 == obj4) {
                mzVar = mzVar2;
                Object albVar = new alb(mrVar2, zE, npVarF2, null, 3, null);
                baoVar.A(albVar);
                objG5 = albVar;
            } else {
                mzVar = mzVar2;
            }
            bbn.f(boolValueOf, (yjz) objG5, baoVar);
            mz mzVar3 = mrVar2.a;
            bkp bkpVarD = bny.d(bkp.g, ((Number) mzVar3.a()).floatValue(), ((Number) mzVar3.a()).floatValue(), ((Number) mzVar.a()).floatValue(), 0.0f, null, 131064);
            boolean zG = baoVar.G(zE) | baoVar.F(obj5);
            Object obj8 = this.b;
            boolean zF2 = zG | baoVar.F(obj8);
            Object objG6 = baoVar.g();
            if (zF2 || objG6 == obj4) {
                objG6 = new abi(zE, obj8, obj5, i);
                baoVar.A(objG6);
            }
            bkp bkpVarB = cfd.b(bkpVarD, false, (yjv) objG6);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO = zy.o(baoVar);
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarB);
            yjk yjkVar2 = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar2);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA, bxt.d);
            beb.a(baoVar, bhuVarO, bxt.c);
            yjz yjzVar2 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                Object objValueOf = Integer.valueOf(iO);
                baoVar.A(objValueOf);
                baoVar.i(objValueOf, yjzVar2);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            yjzVar.a(baoVar, Integer.valueOf(iIntValue & 14));
            baoVar.o();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
