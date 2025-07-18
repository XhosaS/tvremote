package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pi {
    public static final yjv a = new ga(3);
    private static final yft b = ybn.g(3, new gf(4));

    public static final bji a() {
        return (bji) b.a();
    }

    public static final void b(pf pfVar, pd pdVar, Object obj, Object obj2, np npVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(867041821);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(pfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(pdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? baoVarD.F(obj) : baoVarD.H(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? baoVarD.F(obj2) : baoVarD.H(obj2)) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? baoVarD.F(npVar) : baoVarD.H(npVar)) ? 8192 : 16384;
        }
        if (!baoVarD.L((i2 & 9363) != 9362, i2 & 1)) {
            baoVarD.t();
        } else if (pfVar.A()) {
            pdVar.l(obj, obj2, npVar);
        } else {
            pdVar.m(obj2, npVar);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(pfVar, pdVar, obj, obj2, npVar, i, 1);
        }
    }

    public static final pf c(pj pjVar, String str, bao baoVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && baoVar.F(pjVar)) || (i & 6) == 4;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (z || objT == ban.a) {
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                pf pfVar = new pf(pjVar, null, str);
                bcm.z(bitVarT, bitVarU, yjvVarI);
                basVar.ae(pfVar);
                objT = pfVar;
            } catch (Throwable th) {
                bcm.z(bitVarT, bitVarU, yjvVarI);
                throw th;
            }
        }
        pf pfVar2 = (pf) objT;
        if (pjVar instanceof op) {
            baoVar.x(-1357588631);
            op opVar = (op) pjVar;
            Object objA = opVar.a();
            Object objB = opVar.b();
            boolean z2 = (i2 > 4 && baoVar.F(pjVar)) || (i & 6) == 4;
            Object objT2 = basVar.T();
            if (z2 || objT2 == ban.a) {
                objT2 = new ph(pjVar, null);
                basVar.ae(objT2);
            }
            bbn.e(objA, objB, (yjz) objT2, baoVar);
            basVar.aa();
        } else {
            baoVar.x(-1357127072);
            pfVar2.h(pjVar.b(), baoVar, 0);
            basVar.aa();
        }
        boolean zF = baoVar.F(pfVar2);
        Object objT3 = basVar.T();
        if (zF || objT3 == ban.a) {
            objT3 = new kb(pfVar2, 7);
            basVar.ae(objT3);
        }
        bbn.c(pfVar2, (yjv) objT3, baoVar);
        return pfVar2;
    }

    public static final pf d(Object obj, String str, bao baoVar, int i) {
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj2 = ban.a;
        if (objT == obj2) {
            objT = new pf(new od(obj), null, str);
            basVar.ae(objT);
        }
        pf pfVar = (pf) objT;
        pfVar.h(obj, baoVar, (i & 8) | 48 | (i & 14));
        Object objT2 = basVar.T();
        if (objT2 == obj2) {
            objT2 = new kb(pfVar, 8);
            basVar.ae(objT2);
        }
        bbn.c(pfVar, (yjv) objT2, baoVar);
        return pfVar;
    }

    public static final bdy e(pf pfVar, Object obj, Object obj2, np npVar, bhi bhiVar, bao baoVar, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && baoVar.F(pfVar)) || (i & 6) == 4;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (z || objT == ban.a) {
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                obj3 = obj2;
                obj4 = obj;
                pd pdVar = new pd(pfVar, obj4, hp.y(bhiVar, obj3), bhiVar);
                bcm.z(bitVarT, bitVarU, yjvVarI);
                basVar.ae(pdVar);
                objT = pdVar;
            } catch (Throwable th) {
                bcm.z(bitVarT, bitVarU, yjvVarI);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i4 << 9) | i2 | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i5);
        pd pdVar2 = (pd) objT;
        b(pfVar, pdVar2, obj4, obj3, npVar, baoVar, i6);
        boolean zF = baoVar.F(pdVar2) | ((i3 > 4 && baoVar.F(pfVar)) || (i & 6) == 4);
        Object objT2 = basVar.T();
        if (zF || objT2 == ban.a) {
            objT2 = new ox(pfVar, pdVar2, 5);
            basVar.ae(objT2);
        }
        bbn.c(pdVar2, (yjv) objT2, baoVar);
        return pdVar2;
    }

    public static final hnj f(pf pfVar, bhi bhiVar, bao baoVar, int i) {
        pa paVarB;
        int i2 = (i & 14) ^ 6;
        int i3 = 4;
        boolean z = (i2 > 4 && baoVar.F(pfVar)) || (i & 6) == 4;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (z || objT == ban.a) {
            objT = new hnj(pfVar, bhiVar);
            basVar.ae(objT);
        }
        hnj hnjVar = (hnj) objT;
        boolean zH = baoVar.H(hnjVar) | ((i2 > 4 && baoVar.F(pfVar)) || (i & 6) == 4);
        Object objT2 = basVar.T();
        if (zH || objT2 == ban.a) {
            objT2 = new ox(pfVar, hnjVar, i3);
            basVar.ae(objT2);
        }
        bbn.c(hnjVar, (yjv) objT2, baoVar);
        if (pfVar.A() && (paVarB = hnjVar.b()) != null) {
            pf pfVar2 = (pf) hnjVar.c;
            paVarB.a.l(paVarB.c.a(pfVar2.e().a()), paVarB.c.a(pfVar2.e().b()), (np) paVarB.b.a(pfVar2.e()));
        }
        return hnjVar;
    }
}
