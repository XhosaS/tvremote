package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apo implements yka {
    final /* synthetic */ apn a;
    final /* synthetic */ apn b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ asb e;

    public apo(apn apnVar, apn apnVar2, List list, asb asbVar, String str) {
        this.a = apnVar;
        this.b = apnVar2;
        this.c = list;
        this.e = asbVar;
        this.d = str;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object avpVar;
        mr mrVar;
        int i;
        int i2;
        Boolean bool;
        Object obj4;
        yjz yjzVar;
        boolean z;
        yjz yjzVar2 = (yjz) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.H(yjzVar2) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && baoVar.K()) {
            baoVar.t();
        } else {
            apn apnVar = this.a;
            boolean zE = yks.e(apnVar, this.b);
            int i3 = true != zE ? 75 : 150;
            int i4 = (!zE || cmq.b(this.c).size() == 1) ? 0 : 75;
            pk pkVar = new pk(i3, i4, no.c);
            boolean zH = baoVar.H(apnVar);
            asb asbVar = this.e;
            boolean zH2 = zH | baoVar.H(asbVar);
            Object objG = baoVar.g();
            if (zH2 || objG == ban.a) {
                objG = new qm(apnVar, asbVar, 16, null);
                baoVar.A(objG);
            }
            yjk yjkVar = (yjk) objG;
            Object objG2 = baoVar.g();
            Object obj5 = ban.a;
            if (objG2 == obj5) {
                objG2 = ms.a(true != zE ? 1.0f : 0.0f);
                baoVar.A(objG2);
            }
            mr mrVar2 = (mr) objG2;
            Boolean boolValueOf = Boolean.valueOf(zE);
            boolean zH3 = baoVar.H(mrVar2) | baoVar.G(zE) | baoVar.H(pkVar) | baoVar.F(yjkVar);
            Object objG3 = baoVar.g();
            if (zH3 || objG3 == obj5) {
                mrVar = mrVar2;
                i = iIntValue;
                i2 = i3;
                bool = boolValueOf;
                obj4 = obj5;
                yjzVar = yjzVar2;
                z = false;
                avpVar = new avp(mrVar, zE, pkVar, yjkVar, null, 1, null);
                baoVar.A(avpVar);
            } else {
                yjzVar = yjzVar2;
                i = iIntValue;
                i2 = i3;
                avpVar = objG3;
                mrVar = mrVar2;
                obj4 = obj5;
                bool = boolValueOf;
                z = false;
            }
            bbn.f(bool, (yjz) avpVar, baoVar);
            mz mzVar = mrVar.a;
            pk pkVar2 = new pk(i2, i4, no.a);
            Object objG4 = baoVar.g();
            if (objG4 == obj4) {
                objG4 = ms.a(true == zE ? 0.8f : 1.0f);
                baoVar.A(objG4);
            }
            mr mrVar3 = (mr) objG4;
            boolean zH4 = baoVar.H(mrVar3) | baoVar.G(zE) | baoVar.H(pkVar2);
            Object objG5 = baoVar.g();
            if (zH4 || objG5 == obj4) {
                alb albVar = new alb(mrVar3, zE, pkVar2, (yih) null, 2);
                baoVar.A(albVar);
                objG5 = albVar;
            }
            bbn.f(bool, (yjz) objG5, baoVar);
            mz mzVar2 = mrVar3.a;
            bkp bkpVarD = bny.d(bkp.g, ((Number) mzVar2.a()).floatValue(), ((Number) mzVar2.a()).floatValue(), ((Number) mzVar.a()).floatValue(), 0.0f, null, 131064);
            boolean zG = baoVar.G(zE);
            String str = this.d;
            boolean zF = zG | baoVar.F(str) | baoVar.H(apnVar);
            Object objG6 = baoVar.g();
            if (zF || objG6 == obj4) {
                objG6 = new abi(zE, str, apnVar, 2);
                baoVar.A(objG6);
            }
            bkp bkpVarB = cfd.b(bkpVarD, false, (yjv) objG6);
            bvt bvtVarA = xo.a(bkb.a, z);
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
            yjz yjzVar3 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar3);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            yjzVar.a(baoVar, Integer.valueOf(i & 14));
            baoVar.o();
        }
        return ygi.a;
    }
}
