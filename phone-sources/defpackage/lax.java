package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lax implements idf {
    private final idf a;
    private final idf b;
    private final idf c;
    private final idf d;

    public lax(idf idfVar, idf idfVar2, idf idfVar3, idf idfVar4) {
        this.a = idfVar;
        this.b = idfVar2;
        this.c = idfVar3;
        this.d = idfVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        xax xaxVar = (xax) obj;
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
        }
        int i = xaxVar.b;
        if ((i & 16) == 0 || (i & 1) == 0) {
            return ieg.b(new RuntimeException("Incomplete episode asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
        }
        if ((xazVar.b & 8) != 0) {
            xay xayVarB = xay.b(xazVar.f);
            if (xayVarB == null) {
                xayVarB = xay.ANDROID_APP;
            }
            if (xayVarB == xay.EPISODE) {
                xar xarVar = xaxVar.g;
                if (xarVar == null) {
                    xarVar = xar.a;
                }
                if ((xaxVar.b & 2) == 0) {
                    return ieg.b;
                }
                idf idfVar = this.a;
                xaz xazVar2 = xaxVar.d;
                if (xazVar2 == null) {
                    xazVar2 = xaz.a;
                }
                ieg iegVar = (ieg) idfVar.b(ksy.k(xazVar2.c));
                if (iegVar.k()) {
                    return ieg.b;
                }
                xax xaxVar2 = (xax) iegVar.g();
                int i2 = xaxVar2.b;
                if ((i2 & 16) == 0 || (i2 & 2) == 0) {
                    return ieg.b;
                }
                xar xarVar2 = xaxVar2.g;
                if (xarVar2 == null) {
                    xarVar2 = xar.a;
                }
                xaz xazVar3 = xaxVar2.d;
                if (xazVar3 == null) {
                    xazVar3 = xaz.a;
                }
                ksy ksyVarL = ksy.l(xazVar3.c);
                ieg iegVar2 = (ieg) idfVar.b(ksyVarL);
                if (iegVar2.k() || (((xax) iegVar2.g()).b & 16) == 0) {
                    return ieg.b;
                }
                xar xarVar3 = ((xax) iegVar2.g()).g;
                if (xarVar3 == null) {
                    xarVar3 = xar.a;
                }
                Object objB = this.d.b(xarVar.h);
                if (Uri.EMPTY.equals(objB)) {
                    objB = this.b.b(xarVar3.h);
                }
                vtw vtwVarM = lau.a.m();
                String str = xazVar.c;
                xaz xazVar4 = xaxVar.d;
                if (xazVar4 == null) {
                    xazVar4 = xaz.a;
                }
                String str2 = ksyVarL.b;
                law lawVarK = lbk.k(str, lbk.m(xazVar4.c, lbk.n(str2)));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                lau lauVar = (lau) vucVar;
                lawVarK.getClass();
                lauVar.c = lawVarK;
                lauVar.b |= 1;
                String str3 = xarVar.i;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                str3.getClass();
                ((lau) vucVar2).j = str3;
                String str4 = xarVar.c;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                str4.getClass();
                ((lau) vucVar3).d = str4;
                String str5 = xarVar.d;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                vuc vucVar4 = vtwVarM.b;
                str5.getClass();
                ((lau) vucVar4).q = str5;
                int i3 = xarVar.f;
                if (!vucVar4.A()) {
                    vtwVarM.u();
                }
                vuc vucVar5 = vtwVarM.b;
                ((lau) vucVar5).h = i3;
                int i4 = xarVar.g;
                if (!vucVar5.A()) {
                    vtwVarM.u();
                }
                ((lau) vtwVarM.b).i = i4;
                lcr lcrVarP = lbk.p((Uri) objB);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lau lauVar2 = (lau) vtwVarM.b;
                lcrVarP.getClass();
                lauVar2.g = lcrVarP;
                lauVar2.b |= 8;
                vtwVarM.G(lbk.u(xaxVar.j));
                boolean z = xarVar.p;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar6 = vtwVarM.b;
                ((lau) vucVar6).r = z;
                long j = xarVar.e;
                if (!vucVar6.A()) {
                    vtwVarM.u();
                }
                ((lau) vtwVarM.b).o = j;
                xar xarVar4 = xaxVar.g;
                if (xarVar4 == null) {
                    xarVar4 = xar.a;
                }
                lac lacVarI = lbk.i(xarVar4.k);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lau lauVar3 = (lau) vtwVarM.b;
                lacVarI.getClass();
                lauVar3.p = lacVarI;
                lauVar3.b |= 16;
                vtwVarM.E(lbk.s(xarVar.o));
                xah xahVar = xaxVar.h;
                if (xahVar == null) {
                    xahVar = xah.a;
                }
                vtwVarM.F(lbk.t(xahVar));
                xaq xaqVar = xarVar.u;
                if (xaqVar == null) {
                    xaqVar = xaq.a;
                }
                boolean z2 = xaqVar.c;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ((lau) vtwVarM.b).v = z2;
                vtwVarM.H(lbk.w(xarVar.t));
                String str6 = xarVar2.c;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar7 = vtwVarM.b;
                str6.getClass();
                ((lau) vucVar7).l = str6;
                String str7 = xarVar2.i;
                if (!vucVar7.A()) {
                    vtwVarM.u();
                }
                vuc vucVar8 = vtwVarM.b;
                str7.getClass();
                ((lau) vucVar8).n = str7;
                String str8 = xarVar3.c;
                if (!vucVar8.A()) {
                    vtwVarM.u();
                }
                lau lauVar4 = (lau) vtwVarM.b;
                str8.getClass();
                lauVar4.m = str8;
                lcr lcrVarP2 = lbk.p((Uri) this.b.b(xarVar3.h));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lau lauVar5 = (lau) vtwVarM.b;
                lcrVarP2.getClass();
                lauVar5.e = lcrVarP2;
                lauVar5.b |= 2;
                lcr lcrVarP3 = lbk.p((Uri) this.c.b(xarVar3.h));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lau lauVar6 = (lau) vtwVarM.b;
                lcrVarP3.getClass();
                lauVar6.f = lcrVarP3;
                lauVar6.b |= 4;
                xaq xaqVar2 = xarVar.u;
                if (xaqVar2 == null) {
                    xaqVar2 = xaq.a;
                }
                String str9 = xaqVar2.b;
                if (!TextUtils.isEmpty(str9)) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    lau lauVar7 = (lau) vtwVarM.b;
                    str9.getClass();
                    lauVar7.u = str9;
                }
                vun vunVar = xaxVar2.e;
                int iIndexOf = vunVar.indexOf(xazVar) + 1;
                ieg iegVarF = iIndexOf < vunVar.size() ? ieg.f((xaz) vunVar.get(iIndexOf)) : ieg.a;
                if (iegVarF.m()) {
                    String str10 = ((xaz) iegVarF.g()).c;
                    xaz xazVar5 = xaxVar.d;
                    if (xazVar5 == null) {
                        xazVar5 = xaz.a;
                    }
                    law lawVarK2 = lbk.k(str10, lbk.m(xazVar5.c, lbk.n(str2)));
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    lau lauVar8 = (lau) vtwVarM.b;
                    lawVarK2.getClass();
                    lauVar8.z = lawVarK2;
                    lauVar8.b |= 32;
                }
                return ieg.f((lau) vtwVarM.r());
            }
        }
        return ieg.b(new RuntimeException("Asset resource not episode: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
