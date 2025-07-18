package defpackage;

import androidx.compose.foundation.layout.VerticalAlignElement;
import com.google.android.apps.googletv.app.presentation.widgets.actions.VirtualRemoteClickAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfc implements yka {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kfc(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yjk] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                bao baoVar = (bao) obj2;
                ((Number) obj3).intValue();
                ((dse) obj).getClass();
                djf djfVar = djh.b;
                djh djhVarK = cyf.k(djfVar, 0.0f, 16.0f, 24.0f, 16.0f, 1);
                boolean z = this.a;
                djh djhVarK2 = cry.k(djhVarK, z ? ((klm) this.b).g : ((klm) this.b).f("searchButton"));
                Object obj4 = this.b;
                cyf.n(djhVarK2, dro.b, bga.k(-2032500133, new kie(obj4, 4), baoVar), baoVar, 384);
                klm klmVar = (klm) obj4;
                cyf.n(cry.k(cyf.j(dse.a(cyg.k(djfVar)), 0.0f, 16.0f, 1), klmVar.f("topGoogleTvButton")), dro.c, bga.k(-286211182, new kie(obj4, 5), baoVar), baoVar, 384);
                cyf.n(cry.k(cyf.k(djfVar, 24.0f, 16.0f, 0.0f, 16.0f, 4), z ? new dna(VirtualRemoteClickAction.class, cry.i(new djr[0])) : klmVar.f("virtualRemoteButton")), dro.d, bga.k(932068435, new kie(obj4, 6), baoVar), baoVar, 384);
                return ygi.a;
            }
            bkp bkpVar = (bkp) obj;
            bao baoVar2 = (bao) obj2;
            ((Number) obj3).intValue();
            baoVar2.x(-196777734);
            final long j = ((ank) baoVar2.f(anl.a)).a;
            boolean zE = baoVar2.E(j);
            final ?? r6 = this.b;
            boolean zF = zE | baoVar2.F(r6);
            final boolean z2 = this.a;
            boolean zG = zF | baoVar2.G(z2);
            Object objG = baoVar2.g();
            if (zG || objG == ban.a) {
                objG = new yjv() { // from class: amb
                    @Override // defpackage.yjv
                    public final Object a(Object obj5) {
                        blr blrVar = (blr) obj5;
                        return blrVar.p(new abh(r6, z2, hw.z(blrVar, Float.intBitsToFloat((int) (blrVar.m() >> 32)) / 2.0f), new bnl(j, 5), 2));
                    }
                };
                baoVar2.A(objG);
            }
            bkp bkpVarT = bga.t(bkpVar, (yjv) objG);
            baoVar2.p();
            return bkpVarT;
        }
        bao baoVar3 = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((xx) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar3.K()) {
            baoVar3.t();
        } else {
            bkp bkpVarB = zi.b(wv.p(zi.a(bkp.g, 1.0f), 8.0f), 48.0f);
            Object obj5 = this.b;
            boolean z3 = this.a;
            xf xfVarE = xk.e(16.0f);
            bkh bkhVar = bkb.n;
            bvt bvtVarA = zf.a(xfVarE, bkhVar, baoVar3, 54);
            int iK = a.k(zy.p(baoVar3));
            bhu bhuVarO = baoVar3.O();
            bkp bkpVarC = bdi.C(baoVar3, bkpVarB);
            yjk yjkVar = bxt.a;
            baoVar3.c();
            baoVar3.z();
            if (baoVar3.J()) {
                baoVar3.k(yjkVar);
            } else {
                baoVar3.B();
            }
            beb.a(baoVar3, bvtVarA, bxt.d);
            beb.a(baoVar3, bhuVarO, bxt.c);
            yjz yjzVar = bxt.e;
            if (baoVar3.J() || !yks.e(baoVar3.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar3.A(numValueOf);
                baoVar3.i(numValueOf, yjzVar);
            }
            beb.a(baoVar3, bkpVarC, bxt.b);
            kdh kdhVar = (kdh) obj5;
            wlx wlxVarC = kdhVar.c();
            vun vunVar = (wlxVarC.b == 3 ? (wlw) wlxVarC.c : wlw.a).b;
            vunVar.getClass();
            wlv wlvVar = (wlv) yfm.U(vunVar);
            if (wlvVar == null || (str = wlvVar.b) == null) {
                str = "";
            }
            wlx wlxVarC2 = kdhVar.c();
            String str2 = (wlxVarC2.b == 1 ? (wlu) wlxVarC2.c : wlu.a).b;
            str2.getClass();
            if (!ylh.L(str2) || !ylh.L(str)) {
                baoVar3.x(-411528851);
                kfb.a.c(kdhVar, baoVar3, 48);
                baoVar3.p();
            } else if (((wtv) kdhVar.a).f) {
                baoVar3.x(-411525430);
                kfb.a.a(z3, baoVar3, 48);
                baoVar3.p();
            } else {
                baoVar3.x(-411520823);
                kfb.a.b(z3, baoVar3, 48);
                baoVar3.p();
            }
            String str3 = kdhVar.b().b;
            str3.getClass();
            axa.b(str3, new VerticalAlignElement(bkhVar), wv.K(baoVar3).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar3).h, baoVar3, 0, 0, 131064);
            baoVar3.o();
        }
        return ygi.a;
    }

    public kfc(boolean z, klm klmVar, int i) {
        this.c = i;
        this.a = z;
        this.b = klmVar;
    }
}
