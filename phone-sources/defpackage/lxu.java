package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxu implements idf {
    private final idf a;
    private final idf b;
    private final idf c;
    private final idf d;

    public lxu(idf idfVar, idf idfVar2, idf idfVar3, idf idfVar4) {
        this.a = idfVar;
        this.b = idfVar2;
        this.c = idfVar3;
        this.d = idfVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Object objB;
        String str;
        ksy ksyVarL;
        Object objB2;
        Object objB3;
        String str2;
        String str3;
        String str4;
        Object obj2;
        Object obj3;
        Object obj4;
        xaj xajVar;
        ieg iegVarC;
        xax xaxVar = (xax) obj;
        int i = xaxVar.b;
        if ((i & 16) == 0 || (i & 1) == 0 || (i & 2) == 0) {
            return ieg.b(new RuntimeException("Incomplete episode asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
        }
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
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
                xaz xazVar2 = xaxVar.d;
                if (xazVar2 == null) {
                    xazVar2 = xaz.a;
                }
                String str5 = xazVar2.c;
                ksy ksyVarK = ksy.k(str5);
                ieg iegVar = ieg.a;
                if ((xaxVar.b & 4) != 0) {
                    xaz xazVar3 = xaxVar.f;
                    if (xazVar3 == null) {
                        xazVar3 = xaz.a;
                    }
                    String str6 = xazVar3.c;
                    ksyVarL = ksy.l(str6);
                    str = str6;
                    objB = iegVar;
                } else {
                    objB = this.a.b(ksyVarK);
                    ieg iegVar2 = (ieg) objB;
                    if (!iegVar2.m()) {
                        return ieg.b;
                    }
                    xaz xazVar4 = ((xax) iegVar2.g()).d;
                    if (xazVar4 == null) {
                        xazVar4 = xaz.a;
                    }
                    str = xazVar4.c;
                    ksyVarL = ksy.l(str);
                }
                if ((xarVar.b & 8192) != 0) {
                    xap xapVar = xarVar.r;
                    if (xapVar == null) {
                        xapVar = xap.a;
                    }
                    objB2 = this.b.b(xapVar.d);
                    objB3 = this.c.b(xapVar.d);
                    str2 = xapVar.b;
                } else {
                    idf idfVar = this.a;
                    ieg iegVar3 = (ieg) idfVar.b(ksyVarL);
                    if (iegVar3.k() || (((xax) iegVar3.g()).b & 16) == 0) {
                        if ((xarVar.b & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 && ((ieg) objB).k()) {
                            idfVar.b(ksyVarK);
                        }
                        return ieg.b;
                    }
                    xar xarVar2 = ((xax) iegVar3.g()).g;
                    if (xarVar2 == null) {
                        xarVar2 = xar.a;
                    }
                    objB2 = this.b.b(xarVar2.h);
                    objB3 = this.c.b(xarVar2.h);
                    str2 = xarVar2.c;
                }
                if ((xarVar.b & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    xap xapVar2 = xarVar.q;
                    if (xapVar2 == null) {
                        xapVar2 = xap.a;
                    }
                    str3 = xapVar2.b;
                    str4 = xapVar2.c;
                } else {
                    if (((ieg) objB).k()) {
                        objB = this.a.b(ksyVarK);
                    }
                    ieg iegVar4 = (ieg) objB;
                    if (iegVar4.k()) {
                        return ieg.b;
                    }
                    xar xarVar3 = ((xax) iegVar4.g()).g;
                    if (xarVar3 == null) {
                        xarVar3 = xar.a;
                    }
                    str3 = xarVar3.c;
                    str4 = xarVar3.i;
                }
                String str7 = xazVar.c;
                String str8 = xarVar.c;
                String str9 = xarVar.i;
                int i2 = xarVar.f;
                int i3 = xarVar.g;
                Object objB4 = this.d.b(xarVar.h);
                if (true == Uri.EMPTY.equals(objB4)) {
                    obj3 = objB2;
                    obj2 = obj3;
                } else {
                    obj2 = objB2;
                    obj3 = objB4;
                }
                Object obj5 = objB3;
                long j = xarVar.e;
                Object obj6 = obj3;
                if (xarVar.k.size() > 0) {
                    obj4 = obj2;
                    xajVar = (xaj) xarVar.k.get(0);
                } else {
                    obj4 = obj2;
                    xajVar = xaj.a;
                }
                List listV = ktw.v(xarVar.o);
                xah xahVar = xaxVar.h;
                if (xahVar == null) {
                    xahVar = xah.a;
                }
                List listW = ktw.w(xahVar);
                if ((xarVar.b & 65536) != 0) {
                    xaq xaqVar = xarVar.u;
                    if (xaqVar == null) {
                        xaqVar = xaq.a;
                    }
                    iegVarC = ksh.c(xaqVar.b);
                } else {
                    iegVarC = iegVar;
                }
                xaq xaqVar2 = xarVar.u;
                if (xaqVar2 == null) {
                    xaqVar2 = xaq.a;
                }
                boolean z = xaqVar2.c;
                kun kunVarC = kuo.c(str7, str5, str);
                kunVarC.u(str8);
                kunVarC.q(str9);
                kunVarC.g(i2);
                kunVarC.t(i3);
                kunVarC.j((Uri) obj4);
                kunVarC.r((Uri) obj5);
                kunVarC.m((Uri) obj6);
                kunVarC.s(str2);
                kunVarC.i(ieg.f(kzj.b.b(xaxVar.j)));
                kunVarC.o(str3);
                kunVarC.n(str4);
                kunVarC.l(j);
                kunVarC.k(xajVar.c);
                kunVarC.e(xajVar.b);
                kunVarC.f(xarVar.d);
                kunVarC.c(xaxVar.p);
                kunVarC.b(listV);
                kunVarC.d(listW);
                kunVarC.p(iegVarC);
                kunVarC.h(z);
                kunVarC.v(kzj.g.b(xarVar.t));
                return ieg.f(kunVarC.a());
            }
        }
        return ieg.b(new RuntimeException("Asset resource not episode: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
