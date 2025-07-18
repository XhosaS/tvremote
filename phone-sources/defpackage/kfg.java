package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfg implements yjz {
    final /* synthetic */ kfh a;
    final /* synthetic */ SearchQueryPageActivity b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bdy d;
    final /* synthetic */ bdy e;

    public kfg(kfh kfhVar, SearchQueryPageActivity searchQueryPageActivity, boolean z, bdy bdyVar, bdy bdyVar2) {
        this.a = kfhVar;
        this.b = searchQueryPageActivity;
        this.c = z;
        this.d = bdyVar;
        this.e = bdyVar2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else if (ylh.L(kev.b(this.d))) {
            baoVar.x(-927956900);
            kfh kfhVar = this.a;
            bdy bdyVarI = dad.i(kfhVar.d, baoVar);
            bdy bdyVarI2 = dad.i(kfhVar.e, baoVar);
            SearchQueryPageActivity searchQueryPageActivity = this.b;
            bkm bkmVar = bkp.g;
            bvt bvtVarA = xu.a(xk.c, bkb.j, baoVar, 0);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkmVar);
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
                Object objValueOf = Integer.valueOf(iK);
                baoVar.A(objValueOf);
                baoVar.i(objValueOf, yjzVar);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            baoVar.x(507032377);
            if (searchQueryPageActivity.v().c() && !a.i(bdyVarI).isEmpty()) {
                baoVar.x(5004770);
                boolean zH = baoVar.H(searchQueryPageActivity);
                Object objG = baoVar.g();
                if (zH || objG == ban.a) {
                    objG = new kah(searchQueryPageActivity, 11);
                    baoVar.A(objG);
                }
                yjv yjvVar = (yjv) objG;
                baoVar.p();
                baoVar.x(5004770);
                boolean zH2 = baoVar.H(kfhVar);
                Object objG2 = baoVar.g();
                if (zH2 || objG2 == ban.a) {
                    objG2 = new kah(kfhVar, 12);
                    baoVar.A(objG2);
                }
                baoVar.p();
                kff.c(yjvVar, (yjv) objG2, a.i(bdyVarI), wv.v(bkmVar, 0.0f, 0.0f, 0.0f, 28.0f, 7), baoVar, 3072);
            }
            baoVar.p();
            baoVar.x(507046820);
            if (!a.i(bdyVarI2).isEmpty()) {
                List listI = a.i(bdyVarI2);
                baoVar.x(5004770);
                boolean zH3 = baoVar.H(searchQueryPageActivity);
                Object objG3 = baoVar.g();
                if (zH3 || objG3 == ban.a) {
                    objG3 = new kah(searchQueryPageActivity, 13);
                    baoVar.A(objG3);
                }
                baoVar.p();
                kff.b(listI, (yjv) objG3, wv.u(bkmVar, 20.0f, 0.0f, 2), baoVar, 384);
            }
            baoVar.p();
            baoVar.o();
            baoVar.p();
        } else {
            baoVar.x(-927054025);
            List listI2 = a.i(this.e);
            bkp bkpVarU = wv.u(bkp.g, 20.0f, 0.0f, 2);
            baoVar.x(5004770);
            Object obj3 = this.b;
            boolean zH4 = baoVar.H(obj3);
            Object objG4 = baoVar.g();
            if (zH4 || objG4 == ban.a) {
                objG4 = new kah(obj3, 14);
                baoVar.A(objG4);
            }
            baoVar.p();
            kff.d(listI2, (yjv) objG4, bkpVarU, this.c, baoVar, 384);
            baoVar.p();
        }
        return ygi.a;
    }
}
