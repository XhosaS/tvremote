package defpackage;

import android.os.Build;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfa implements yka {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kfa(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v23, types: [djl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bkp, java.lang.Object] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bkp bkpVarF;
        ixm ixmVar;
        int i = this.d;
        if (i == 0) {
            bao baoVar = (bao) obj2;
            int iIntValue = ((Number) obj3).intValue();
            ((xx) obj).getClass();
            if ((iIntValue & 17) == 16 && baoVar.K()) {
                baoVar.t();
            } else {
                baoVar.x(5004770);
                Object obj4 = this.b;
                boolean zF = baoVar.F(obj4);
                Object objG = baoVar.g();
                int i2 = 6;
                if (zF || objG == ban.a) {
                    objG = new keu(obj4, i2);
                    baoVar.A(objG);
                }
                baoVar.p();
                hp.f((yjk) objG, baoVar, 6);
                baoVar.x(471525081);
                if (this.a) {
                    bkp bkpVarA = bkp.g.a(zi.c);
                    long j = wv.K(baoVar).p;
                    aeh aehVar = wv.M(baoVar).f;
                    aei aeiVar = aek.a;
                    bkpVarF = hq.f(bkpVarA, j, aeh.b(aehVar, null, null, aeiVar, aeiVar, 3));
                } else {
                    bkpVarF = bkp.g;
                }
                bkp bkpVar = bkpVarF;
                baoVar.p();
                ?? r1 = this.c;
                bkp bkpVarV = wv.v(bkpVar, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                bvt bvtVarA = xo.a(bkb.a, false);
                int iK = a.k(zy.p(baoVar));
                bhu bhuVarO = baoVar.O();
                bkp bkpVarC = bdi.C(baoVar, bkpVarV);
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
                r1.a(baoVar, 0);
                baoVar.o();
            }
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj2;
            ((Number) obj3).intValue();
            ((irc) obj).getClass();
            jzq jzqVar = (jzq) this.c;
            ixm ixmVar2 = jzqVar.a;
            if (ixmVar2 == null) {
                yks.c("composeComponentManager");
                ixmVar = null;
            } else {
                ixmVar = ixmVar2;
            }
            jzr jzrVar = new jzr(jzqVar.d, this.a);
            wlf wlfVar = jzqVar.d;
            wkx wkxVar = wlfVar.c == 3 ? (wkx) wlfVar.d : wkx.a;
            wkxVar.getClass();
            jbr.ag(ixmVar, wkxVar, this.b, jzrVar, baoVar2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 0);
            return ygi.a;
        }
        if (i != 2) {
            bao baoVar3 = (bao) obj2;
            ((Number) obj3).intValue();
            ((drs) obj).getClass();
            woy woyVar = (woy) this.c;
            String str = woyVar.c;
            djf djfVar = djh.b;
            cry.m(this.b, str, cyg.l(cyg.k(djfVar)).a(Build.VERSION.SDK_INT >= 31 ? cwk.j(djfVar) : djfVar), 1, baoVar3, 0, 16);
            if (this.a) {
                String str2 = woyVar.d;
                str2.getClass();
                czu.r(str2, cyf.k(djfVar, 0.0f, 8.0f, 0.0f, 0.0f, 13), new due(new dul(bnq.b), new cmk(clw.w(4294967296L, 14.0f)), null, R.styleable.AppCompatTheme_windowMinWidthMajor), 0, baoVar3, 0, 8);
            }
            return ygi.a;
        }
        bao baoVar4 = (bao) obj2;
        ((Number) obj3).intValue();
        ((drs) obj).getClass();
        djf djfVar2 = djh.b;
        djh djhVarJ = cyf.j(cyg.k(djfVar2), 8.0f, 0.0f, 2);
        boolean z = this.a;
        klm klmVar = (klm) this.b;
        klmVar.p(djhVarJ, z, baoVar4, 0);
        Object obj5 = this.c;
        if (obj5 instanceof klx) {
            baoVar4.x(-776290437);
            vun vunVar = ((klx) obj5).a.c;
            vunVar.getClass();
            long j2 = ((cmc) baoVar4.f(diy.a)).a;
            yfw yfwVar = a.s(j2, klm.e) ? new yfw(1, false) : (a.s(j2, klm.d) || a.s(j2, klm.b)) ? new yfw(2, false) : new yfw(2, true);
            klmVar.n(cyf.k(djfVar2, 0.0f, 0.0f, 0.0f, 8.0f, 7).a(new dry(duh.a)), vunVar, ((Number) yfwVar.a).intValue(), ((Boolean) yfwVar.b).booleanValue(), z, baoVar4, 0);
            if (!z) {
                klmVar.l(cyf.l(cyg.k(djfVar2)), baoVar4, 0);
            }
            baoVar4.p();
        } else if (obj5 instanceof klw) {
            baoVar4.x(-775581870);
            klmVar.j(baoVar4, 0);
            baoVar4.p();
        } else if (obj5 instanceof klu) {
            baoVar4.x(-775505300);
            klmVar.g(cry.k(cyf.l(cyg.j(djfVar2)), klmVar.f("emptyWidgetResult")), ((klu) obj5).a, baoVar4, 0);
            baoVar4.p();
        } else if (obj5 instanceof klv) {
            baoVar4.x(-775214830);
            klmVar.h(baoVar4, 0);
            baoVar4.p();
        } else {
            baoVar4.x(-775171337);
            baoVar4.p();
        }
        return ygi.a;
    }

    public kfa(jzq jzqVar, boolean z, bkp bkpVar, int i) {
        this.d = i;
        this.c = jzqVar;
        this.a = z;
        this.b = bkpVar;
    }

    public kfa(woy woyVar, djl djlVar, boolean z, int i) {
        this.d = i;
        this.c = woyVar;
        this.b = djlVar;
        this.a = z;
    }
}
