package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbs implements idf {
    private final idf a;
    private final idf b;

    public lbs(idf idfVar, idf idfVar2) {
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
        if ((i & 16) != 0) {
            boolean z = true;
            if ((i & 1) != 0) {
                if ((xazVar.b & 8) != 0) {
                    xay xayVarB = xay.b(xazVar.f);
                    if (xayVarB == null) {
                        xayVarB = xay.ANDROID_APP;
                    }
                    if (xayVarB == xay.MOVIES_BUNDLE) {
                        xar xarVar = xaxVar.g;
                        if (xarVar == null) {
                            xarVar = xar.a;
                        }
                        xaq xaqVar = xarVar.u;
                        if (xaqVar == null) {
                            xaqVar = xaq.a;
                        }
                        vtw vtwVarM = lbr.a.m();
                        kzv kzvVarH = lbk.h(xazVar.c);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar = vtwVarM.b;
                        lbr lbrVar = (lbr) vucVar;
                        kzvVarH.getClass();
                        lbrVar.c = kzvVarH;
                        lbrVar.b |= 1;
                        String str = xarVar.c;
                        if (!vucVar.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar2 = (lbr) vtwVarM.b;
                        str.getClass();
                        lbrVar2.d = str;
                        lcr lcrVarP = lbk.p((Uri) this.a.b(xarVar.h));
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar3 = (lbr) vtwVarM.b;
                        lcrVarP.getClass();
                        lbrVar3.e = lcrVarP;
                        lbrVar3.b |= 2;
                        lcr lcrVarP2 = lbk.p((Uri) this.b.b(xarVar.h));
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar4 = (lbr) vtwVarM.b;
                        lcrVarP2.getClass();
                        lbrVar4.f = lcrVarP2;
                        lbrVar4.b |= 4;
                        lcv lcvVarQ = lbk.q(xaxVar.k);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar5 = (lbr) vtwVarM.b;
                        lcvVarQ.getClass();
                        lbrVar5.h = lcvVarQ;
                        lbrVar5.b |= 8;
                        vtwVarM.X(lbk.u(xaxVar.j));
                        String str2 = xarVar.d;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar6 = (lbr) vtwVarM.b;
                        str2.getClass();
                        lbrVar6.g = str2;
                        int iA = ktc.a(xarVar);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((lbr) vtwVarM.b).l = iA;
                        vtwVarM.W(xarVar.n);
                        xar xarVar2 = xaxVar.g;
                        if (xarVar2 == null) {
                            xarVar2 = xar.a;
                        }
                        lac lacVarI = lbk.i(xarVar2.k);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar7 = (lbr) vtwVarM.b;
                        lacVarI.getClass();
                        lbrVar7.i = lacVarI;
                        lbrVar7.b |= 16;
                        vtwVarM.T(lbk.s(xarVar.o));
                        xah xahVar = xaxVar.h;
                        if (xahVar == null) {
                            xahVar = xah.a;
                        }
                        vtwVarM.V(lbk.t(xahVar));
                        xah xahVar2 = xaxVar.h;
                        if (xahVar2 == null) {
                            xahVar2 = xah.a;
                        }
                        boolean z2 = xahVar2.c;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar2 = vtwVarM.b;
                        ((lbr) vucVar2).m = z2;
                        xah xahVar3 = xaxVar.h;
                        if (xahVar3 == null) {
                            xahVar3 = xah.a;
                        }
                        boolean z3 = xahVar3.e;
                        if (!vucVar2.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar3 = vtwVarM.b;
                        ((lbr) vucVar3).n = z3;
                        boolean z4 = xaqVar.c;
                        if (!vucVar3.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar4 = vtwVarM.b;
                        ((lbr) vucVar4).r = z4;
                        xah xahVar4 = xaxVar.h;
                        if (!(xahVar4 == null ? xah.a : xahVar4).g) {
                            if (xahVar4 == null) {
                                xahVar4 = xah.a;
                            }
                            if (!xahVar4.i) {
                                z = false;
                            }
                        }
                        if (!vucVar4.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar5 = vtwVarM.b;
                        ((lbr) vucVar5).s = z;
                        xah xahVar5 = xaxVar.h;
                        if (xahVar5 == null) {
                            xahVar5 = xah.a;
                        }
                        boolean z5 = xahVar5.j;
                        if (!vucVar5.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar6 = vtwVarM.b;
                        ((lbr) vucVar6).t = z5;
                        xah xahVar6 = xaxVar.h;
                        if (xahVar6 == null) {
                            xahVar6 = xah.a;
                        }
                        boolean z6 = xahVar6.k;
                        if (!vucVar6.A()) {
                            vtwVarM.u();
                        }
                        ((lbr) vtwVarM.b).x = z6;
                        Collection collectionV = lbk.v(xarVar);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        lbr lbrVar8 = (lbr) vtwVarM.b;
                        vun vunVar = lbrVar8.u;
                        if (!vunVar.c()) {
                            lbrVar8.u = vuc.s(vunVar);
                        }
                        vsf.h(collectionV, lbrVar8.u);
                        String str3 = xaqVar.b;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            lbr lbrVar9 = (lbr) vtwVarM.b;
                            str3.getClass();
                            lbrVar9.q = str3;
                        }
                        ImmutableList immutableListF = ktc.f(xaxVar);
                        ArrayList arrayList = new ArrayList(immutableListF.size());
                        Iterator<E> it = immutableListF.iterator();
                        while (it.hasNext()) {
                            arrayList.add(lbk.o(((ksy) it.next()).b));
                        }
                        vtwVarM.Y(arrayList);
                        List listM = ktc.m(xaxVar);
                        ArrayList arrayList2 = new ArrayList(listM.size());
                        Iterator it2 = listM.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(lbk.l(((ksy) it2.next()).b));
                        }
                        vtwVarM.U(arrayList2);
                        return ieg.f((lbr) vtwVarM.r());
                    }
                }
                return ieg.b(new RuntimeException("Asset resource not movies bundle: ".concat(String.valueOf(String.valueOf(xaxVar)))));
            }
        }
        return ieg.b(new RuntimeException("Incomplete movies bundle asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
