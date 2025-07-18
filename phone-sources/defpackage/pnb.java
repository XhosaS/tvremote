package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pnb implements pjj {
    public final lia a;
    private final uhs b;
    private final ntp c;

    public pnb(lia liaVar, ntp ntpVar, uhs uhsVar) {
        this.a = liaVar;
        this.c = ntpVar;
        this.b = uhsVar;
    }

    @Override // defpackage.pjj
    public final /* bridge */ /* synthetic */ Set a() {
        return ImmutableSet.of(plj.class);
    }

    @Override // defpackage.pjj
    public final uhp b(pkg pkgVar) {
        plj pljVar;
        plj pljVar2 = (plj) pkgVar.a;
        pka pkaVarAq = qtl.aq(pljVar2);
        vvd vvdVar = nbu.a;
        pkaVarAq.i(vvdVar);
        vtr vtrVar = pkaVarAq.l;
        vub vubVar = (vub) vvdVar.c;
        if (!vtrVar.m(vubVar)) {
            return uhl.a;
        }
        int i = 0;
        uhp uhpVarQ = this.c.q(pljVar2, false);
        SparseArray sparseArray = new SparseArray();
        for (pli pliVar : pljVar2.b) {
            if (pliVar.b == 1) {
                sparseArray.put(pliVar.c(), pliVar);
            }
        }
        if (sparseArray.size() == 0) {
            return uhl.a;
        }
        List list = pljVar2.c;
        SparseIntArray sparseIntArray = pljVar2.d;
        pka pkaVarAq2 = qtl.aq(pljVar2);
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < list.size()) {
            pka pkaVar = (pka) list.get(i2);
            int iValueAt = sparseIntArray.valueAt(i2);
            nsf nsfVar = null;
            int i3 = i;
            int i4 = i2;
            while (true) {
                if (iValueAt != -1) {
                    int iAL = a.aL(pkaVar.e);
                    if (iAL != 0 && iAL != 1) {
                        break;
                    }
                    nsf nsfVarT = map.containsKey(pkaVar) ? (nsf) map.get(pkaVar) : nsf.t(pkaVar);
                    if (nsfVar != null) {
                        nsfVarT.v(nsfVar);
                    }
                    if (map.containsKey(pkaVar)) {
                        break;
                    }
                    map.put(pkaVar, nsfVarT);
                    pkaVar = (pka) list.get(iValueAt);
                    nsfVar = nsfVarT;
                    i4 = iValueAt;
                    iValueAt = sparseIntArray.valueAt(iValueAt);
                } else {
                    plh plhVar = (plh) sparseArray.get(i4);
                    int i5 = i3;
                    while (i5 < plhVar.b().size()) {
                        pka pkaVar2 = (pka) plhVar.b().get(i5);
                        int iAL2 = a.aL(pkaVar2.e);
                        if (iAL2 != 0) {
                            pljVar = pljVar2;
                            if (iAL2 != 1) {
                                break;
                            }
                        } else {
                            pljVar = pljVar2;
                        }
                        nsf nsfVarT2 = map.containsKey(pkaVar2) ? (nsf) map.get(pkaVar2) : nsf.t(pkaVar2);
                        if (nsfVar != null) {
                            nsfVarT2.v(nsfVar);
                        }
                        if (!map.containsKey(pkaVar2)) {
                            map.put(pkaVar2, nsfVarT2);
                            i5++;
                            nsfVar = nsfVarT2;
                            pljVar2 = pljVar;
                        }
                    }
                }
            }
            pljVar = pljVar2;
            i2++;
            i = i3;
            pljVar2 = pljVar;
        }
        plj pljVar3 = pljVar2;
        int i6 = i;
        wjf wjfVarS = ((nsf) map.get(pkaVarAq2)).s();
        if (wjfVarS == null) {
            return sfy.B(new IllegalArgumentException());
        }
        pka pkaVarAq3 = qtl.aq(pljVar3);
        pkaVarAq3.i(vvdVar);
        Object objK = pkaVarAq3.l.k(vubVar);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        vtw vtwVarM = wip.a.m();
        long j = ((nbt) objK).c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wip wipVar = (wip) vucVar;
        wipVar.b |= 2;
        wipVar.e = j;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wip wipVar2 = (wip) vtwVarM.b;
        wipVar2.c = wjfVarS;
        wipVar2.b |= 1;
        uhp uhpVarC = sfy.C((wip) vtwVarM.r());
        uhp[] uhpVarArr = new uhp[2];
        uhpVarArr[i6] = uhpVarQ;
        uhpVarArr[1] = uhpVarC;
        return sfy.P(uhpVarArr).b(new pna(this, uhpVarC, uhpVarQ, i6), this.b);
    }
}
