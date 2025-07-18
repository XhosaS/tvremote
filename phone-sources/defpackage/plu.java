package defpackage;

import android.util.SparseIntArray;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plu implements pjj {
    public final oyx a;
    public final ImmutableSet b;
    public final ImmutableSet c;
    private final uhs d;

    public plu(oyx oyxVar, ImmutableSet immutableSet, ImmutableSet immutableSet2, uhs uhsVar) {
        this.a = oyxVar;
        this.b = immutableSet;
        this.c = immutableSet2;
        this.d = uhsVar;
    }

    private static boolean d(pka pkaVar) {
        int iAL = a.aL(pkaVar.e);
        if (iAL == 0) {
            iAL = 1;
        }
        int i = iAL - 1;
        return i == 0 || i == 3;
    }

    @Override // defpackage.pjj
    public final /* bridge */ /* synthetic */ Set a() {
        return ImmutableSet.of(plj.class, plk.class);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uhp] */
    @Override // defpackage.pjj
    public final uhp b(final pkg pkgVar) {
        return szg.m(pkgVar.b, new ufw() { // from class: plt
            @Override // defpackage.ufw
            public final uhp a(Object obj) {
                String str;
                tql tqlVarQ;
                uhp uhpVarI;
                pjd pjdVar = (pjd) obj;
                int i = pjdVar.b - 1;
                if (i == 0) {
                    str = pjdVar.a;
                } else {
                    if (i != 1) {
                        return uhl.a;
                    }
                    str = null;
                }
                String str2 = str;
                pkg pkgVar2 = pkgVar;
                plu pluVar = this.a;
                Object obj2 = pkgVar2.a;
                if (obj2 instanceof plk) {
                    ImmutableSet immutableSet = pluVar.c;
                    if (immutableSet.isEmpty()) {
                        return uhl.a;
                    }
                    tqlVarQ = szg.q("GIL-GK:interaction");
                    try {
                        plk plkVar = (plk) obj2;
                        ucy ucyVar = qtl.ar(plkVar).d;
                        if (ucyVar == null) {
                            ucyVar = ucy.a;
                        }
                        if (immutableSet.contains(Integer.valueOf(ucyVar.d))) {
                            vtw vtwVarM = oyg.a.m();
                            Iterator it = Lists.reverse(plkVar.b).iterator();
                            while (it.hasNext()) {
                                ucy ucyVar2 = ((pka) it.next()).d;
                                if (ucyVar2 == null) {
                                    ucyVar2 = ucy.a;
                                }
                                vtwVarM.ah(ucyVar2.d);
                            }
                            vtw vtwVarM2 = oyh.a.m();
                            vtwVarM2.ag((oyg) vtwVarM.r());
                            int iD = plkVar.c.d() - 1;
                            uzg uzgVar = iD != 1 ? iD != 4 ? uzg.UNKNOWN : uzg.TAPPED : uzg.AUTOMATED;
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            oyh oyhVar = (oyh) vtwVarM2.b;
                            oyhVar.c = uzgVar.e;
                            oyhVar.b |= 1;
                            uhpVarI = ufn.i(pluVar.a.a((oyh) vtwVarM2.r(), str2), new oyj(18), ugk.a);
                        } else {
                            uhpVarI = uhl.a;
                        }
                        tqlVarQ.a(uhpVarI);
                        tqlVarQ.close();
                        return uhpVarI;
                    } finally {
                    }
                } else {
                    if (!(obj2 instanceof plj)) {
                        throw new IllegalArgumentException("Unexpected LogEvent of type ".concat(String.valueOf(obj2.getClass().getSimpleName())));
                    }
                    if (pluVar.b.isEmpty()) {
                        return uhl.a;
                    }
                    tqlVarQ = szg.q("GIL-GK:impression");
                    try {
                        plj pljVar = (plj) obj2;
                        List<pli> list = pljVar.b;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (pli pliVar : list) {
                            int i2 = pliVar.b - 1;
                            if (i2 == 0) {
                                arrayList.add(pluVar.c(pliVar.c(), pliVar.a, pljVar.c, pljVar.d, str2));
                            } else if (i2 == 1) {
                                arrayList.add(pluVar.c(pliVar.c(), pliVar.a, pljVar.e, pljVar.f, str2));
                            }
                        }
                        uhp uhpVarA = sfy.M(arrayList).a(new oym(6), ugk.a);
                        tqlVarQ.a(uhpVarA);
                        tqlVarQ.close();
                        return uhpVarA;
                    } finally {
                    }
                }
            }
        }, this.d);
    }

    public final uhp c(int i, List list, List list2, SparseIntArray sparseIntArray, String str) {
        oyg oygVar;
        vtw vtwVarM = oyh.a.m();
        uzg uzgVar = uzg.DISPLAYED;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        oyh oyhVar = (oyh) vtwVarM.b;
        oyhVar.c = uzgVar.e;
        oyhVar.b |= 1;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            pka pkaVar = (pka) list2.get(i2);
            if (d(pkaVar)) {
                ImmutableSet immutableSet = this.b;
                ucy ucyVar = pkaVar.d;
                if (ucyVar == null) {
                    ucyVar = ucy.a;
                }
                if (immutableSet.contains(Integer.valueOf(ucyVar.d))) {
                    vtw vtwVarM2 = oyg.a.m();
                    Iterator it = Lists.reverse(list).iterator();
                    while (true) {
                        oygVar = null;
                        if (it.hasNext()) {
                            pka pkaVar2 = (pka) it.next();
                            if (!d(pkaVar2)) {
                                break;
                            }
                            ucy ucyVar2 = pkaVar2.d;
                            if (ucyVar2 == null) {
                                ucyVar2 = ucy.a;
                            }
                            vtwVarM2.ah(ucyVar2.d);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int iValueAt = i2;
                            while (iValueAt != i && iValueAt != -1) {
                                pka pkaVar3 = (pka) list2.get(iValueAt);
                                if (!d(pkaVar3)) {
                                    break;
                                }
                                ucy ucyVar3 = pkaVar3.d;
                                if (ucyVar3 == null) {
                                    ucyVar3 = ucy.a;
                                }
                                arrayList.add(Integer.valueOf(ucyVar3.d));
                                iValueAt = sparseIntArray.valueAt(iValueAt);
                            }
                            List listReverse = Lists.reverse(arrayList);
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            oyg oygVar2 = (oyg) vtwVarM2.b;
                            oygVar2.b();
                            vsf.h(listReverse, oygVar2.b);
                            oygVar = (oyg) vtwVarM2.r();
                        }
                    }
                    if (oygVar != null) {
                        vtwVarM.ag(oygVar);
                    }
                }
            }
        }
        return ((oyh) vtwVarM.b).d.size() == 0 ? uhl.a : ufn.i(this.a.a((oyh) vtwVarM.r(), str), new oyj(17), ugk.a);
    }
}
