package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyu {
    public final fxd a;
    public final kp b = new kp(null);
    public int c;
    public String d;
    public String e;

    public fyu(fxd fxdVar) {
        this.a = fxdVar;
    }

    public final fxb a(String str, boolean z) {
        Object next;
        fxd fxdVar;
        Iterator itA = ykr.f(hw.d(this.b)).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            fxb fxbVar = (fxb) next;
            if (ylh.y(fxbVar.f(), str, false) || fxbVar.e(str) != null) {
                break;
            }
        }
        fxb fxbVar2 = (fxb) next;
        if (fxbVar2 != null) {
            return fxbVar2;
        }
        if (!z || (fxdVar = this.a.c) == null) {
            return null;
        }
        return fxdVar.k(str);
    }

    public final fxb b(int i, fxb fxbVar, boolean z, fxb fxbVar2) {
        fxb fxbVarL;
        kp kpVar = this.b;
        fxb fxbVar3 = (fxb) kq.a(kpVar, i);
        if (fxbVar2 == null ? fxbVar3 != null : yks.e(fxbVar3, fxbVar2) && yks.e(fxbVar3.c, fxbVar2.c)) {
            return fxbVar3;
        }
        if (z) {
            Iterator itA = ykr.f(hw.d(kpVar)).a();
            while (itA.hasNext()) {
                fxb fxbVar4 = (fxb) itA.next();
                fxbVarL = (!(fxbVar4 instanceof fxd) || yks.e(fxbVar4, fxbVar)) ? null : ((fxd) fxbVar4).l(i, this.a, true, fxbVar2);
                if (fxbVarL != null) {
                    break;
                }
            }
            fxbVarL = null;
        } else {
            fxbVarL = null;
        }
        if (fxbVarL != null) {
            return fxbVarL;
        }
        fxd fxdVar = this.a;
        fxd fxdVar2 = fxdVar.c;
        if (fxdVar2 == null || yks.e(fxdVar2, fxbVar)) {
            return null;
        }
        fxd fxdVar3 = fxdVar.c;
        fxdVar3.getClass();
        return fxdVar3.l(i, fxdVar, z, fxbVar2);
    }

    public final fxa c(fxa fxaVar, fwz fwzVar, boolean z, fxb fxbVar) {
        fxa fxaVarN;
        ArrayList arrayList = new ArrayList();
        fxd fxdVar = this.a;
        Iterator<fxb> it = fxdVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fxb next = it.next();
            fxaVarN = yks.e(next, fxbVar) ? null : next.d(fwzVar);
            if (fxaVarN != null) {
                arrayList.add(fxaVarN);
            }
        }
        fxa fxaVar2 = (fxa) yfm.Q(arrayList);
        fxd fxdVar2 = fxdVar.c;
        if (fxdVar2 != null && z && !yks.e(fxdVar2, fxbVar)) {
            fxaVarN = fxdVar2.n(fwzVar, fxdVar);
        }
        return (fxa) yfm.Q(yfm.aW(new fxa[]{fxaVar, fxaVar2, fxaVarN}));
    }
}
