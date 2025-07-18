package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcj implements idf {
    private final idf a;
    private final idf b;

    public lcj(idf idfVar, idf idfVar2) {
        this.a = idfVar;
        this.b = idfVar2;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        xax xaxVar = (xax) obj;
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
        }
        int i = xaxVar.b;
        if ((i & 16) == 0 || (i & 1) == 0) {
            return ieg.b(new RuntimeException("Incomplete show asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
        }
        if ((xazVar.b & 8) != 0) {
            xay xayVarB = xay.b(xazVar.f);
            if (xayVarB == null) {
                xayVarB = xay.ANDROID_APP;
            }
            if (xayVarB == xay.SHOW) {
                xar xarVar = xaxVar.g;
                if (xarVar == null) {
                    xarVar = xar.a;
                }
                lch lchVarN = lbk.n(xazVar.c);
                Object objB = this.a.b(xarVar.h);
                vtw vtwVarM = lcg.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                lcg lcgVar = (lcg) vucVar;
                lchVarN.getClass();
                lcgVar.c = lchVarN;
                lcgVar.b |= 1;
                String str = xarVar.c;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                str.getClass();
                ((lcg) vucVar2).d = str;
                String str2 = xarVar.d;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                lcg lcgVar2 = (lcg) vtwVarM.b;
                str2.getClass();
                lcgVar2.h = str2;
                kux kuxVar = (kux) objB;
                lcr lcrVarP = lbk.p(kuxVar.a);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                lcg lcgVar3 = (lcg) vucVar3;
                lcrVarP.getClass();
                lcgVar3.e = lcrVarP;
                lcgVar3.b |= 2;
                float f = kuxVar.b;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                ((lcg) vtwVarM.b).p = f;
                lcr lcrVarP2 = lbk.p((Uri) this.b.b(xarVar.h));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcg lcgVar4 = (lcg) vtwVarM.b;
                lcrVarP2.getClass();
                lcgVar4.f = lcrVarP2;
                lcgVar4.b |= 4;
                lcv lcvVarQ = lbk.q(xaxVar.k);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcg lcgVar5 = (lcg) vtwVarM.b;
                lcvVarQ.getClass();
                lcgVar5.g = lcvVarQ;
                lcgVar5.b |= 8;
                xar xarVar2 = xaxVar.g;
                if (xarVar2 == null) {
                    xarVar2 = xar.a;
                }
                lac lacVarI = lbk.i(xarVar2.k);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcg lcgVar6 = (lcg) vtwVarM.b;
                lacVarI.getClass();
                lcgVar6.i = lacVarI;
                lcgVar6.b |= 16;
                int iA = ktc.a(xarVar);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ((lcg) vtwVarM.b).l = iA;
                xah xahVar = xaxVar.h;
                if (xahVar == null) {
                    xahVar = xah.a;
                }
                boolean z = xahVar.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar4 = vtwVarM.b;
                ((lcg) vucVar4).j = z;
                boolean z2 = xarVar.l;
                if (!vucVar4.A()) {
                    vtwVarM.u();
                }
                ((lcg) vtwVarM.b).k = z2;
                vun<xaz> vunVar = xaxVar.e;
                ArrayList arrayList = new ArrayList(vunVar.size());
                for (xaz xazVar2 : vunVar) {
                    boolean z3 = false;
                    a.H((xazVar2.b & 8) != 0);
                    xay xayVarB2 = xay.b(xazVar2.f);
                    if (xayVarB2 == null) {
                        xayVarB2 = xay.ANDROID_APP;
                    }
                    if (xayVarB2 == xay.SEASON) {
                        z3 = true;
                    }
                    a.H(z3);
                    arrayList.add(lbk.m(xazVar2.c, lchVarN));
                }
                vtwVarM.ae(arrayList);
                vtwVarM.ac(xarVar.m);
                vtwVarM.ad(lbk.r(xaxVar.q));
                xar xarVar3 = xaxVar.g;
                if (xarVar3 == null) {
                    xarVar3 = xar.a;
                }
                Collection collectionV = lbk.v(xarVar3);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcg lcgVar7 = (lcg) vtwVarM.b;
                vun vunVar2 = lcgVar7.q;
                if (!vunVar2.c()) {
                    lcgVar7.q = vuc.s(vunVar2);
                }
                vsf.h(collectionV, lcgVar7.q);
                return ieg.f((lcg) vtwVarM.r());
            }
        }
        return ieg.b(new RuntimeException("Asset resource not show: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
