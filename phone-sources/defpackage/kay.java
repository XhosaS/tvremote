package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kay implements ykb {
    final /* synthetic */ List a;
    final /* synthetic */ kbc b;
    final /* synthetic */ yjv c;
    final /* synthetic */ ixm d;
    final /* synthetic */ boolean e;
    final /* synthetic */ bdy f;
    final /* synthetic */ bdy g;
    final /* synthetic */ bdy h;
    final /* synthetic */ bje i;

    public kay(List list, kbc kbcVar, yjv yjvVar, ixm ixmVar, boolean z, bdy bdyVar, bdy bdyVar2, bdy bdyVar3, bje bjeVar) {
        this.a = list;
        this.b = kbcVar;
        this.c = yjvVar;
        this.d = ixmVar;
        this.e = z;
        this.f = bdyVar;
        this.g = bdyVar2;
        this.h = bdyVar3;
        this.i = bjeVar;
    }

    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        abe abeVar = (abe) obj;
        int iIntValue = ((Number) obj2).intValue();
        bao baoVar = (bao) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != baoVar.F(abeVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != baoVar.D(iIntValue) ? 16 : 32;
        }
        if (baoVar.L((i & 147) != 146, i & 1)) {
            wkx wkxVar = (wkx) this.a.get(iIntValue);
            baoVar.x(-1304505069);
            vvd vvdVar = wsu.l;
            wkxVar.i(vvdVar);
            Object objK = wkxVar.l.k((vub) vvdVar.c);
            if (objK == null) {
                objK = vvdVar.b;
            } else {
                vvdVar.c(objK);
            }
            objK.getClass();
            wsu wsuVar = (wsu) objK;
            baoVar.x(1849434622);
            Object objG = baoVar.g();
            Object obj5 = ban.a;
            if (objG == obj5) {
                kax kaxVar = new kax(iIntValue, wsuVar, this.e, this.f, this.g, this.h);
                ivx ivxVar = bdt.a;
                objG = new bbh(kaxVar, null);
                baoVar.A(objG);
            }
            baoVar.p();
            boolean zBooleanValue = ((Boolean) ((bdy) objG).a()).booleanValue();
            baoVar.x(-1633490746);
            kbc kbcVar = this.b;
            boolean zH = baoVar.H(kbcVar);
            yjv yjvVar = this.c;
            boolean zF = zH | baoVar.F(yjvVar);
            Object objG2 = baoVar.g();
            if (zF || objG2 == obj5) {
                objG2 = new kfd(kbcVar, yjvVar, 1);
                baoVar.A(objG2);
            }
            baoVar.p();
            kbr kbrVar = new kbr(zBooleanValue, (yjk) objG2, iIntValue);
            clx clxVar = (clx) baoVar.f(ccq.d);
            baoVar.x(-1224400529);
            boolean zH2 = baoVar.H(kbcVar) | baoVar.F(wsuVar) | baoVar.F(clxVar) | baoVar.H(wkxVar);
            Object objG3 = baoVar.g();
            if (zH2 || objG3 == obj5) {
                kaw kawVar = new kaw(kbcVar, wsuVar, clxVar, wkxVar, this.i, (yih) null, 0);
                baoVar.A(kawVar);
                objG3 = kawVar;
            }
            baoVar.p();
            bbn.f(wsuVar, (yjz) objG3, baoVar);
            bkm bkmVar = bkp.g;
            float f = knq.a;
            jbr.ag(this.d, wkxVar, ccf.d(zi.b(bkmVar, knq.b), "hot_and_new_card"), kbrVar, baoVar, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 0);
            baoVar.p();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
