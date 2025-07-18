package defpackage;

import android.util.Log;
import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pky {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    private final Map i = new HashMap();
    public final List c = new ArrayList();
    private final List j = new ArrayList();
    public final Map d = new HashMap();
    public Collection e = null;
    public boolean f = true;
    public Set g = ImmutableSet.of();
    public boolean h = false;

    private final pkx e(pju pjuVar) {
        List list = this.c;
        pkx pkxVar = new pkx(list.size(), this.a.size(), true);
        pka pkaVarA = pkxVar.a(pjuVar, -1);
        ArrayList arrayList = new ArrayList(1);
        qtl.as(pjuVar, arrayList);
        ucy ucyVar = pkaVarA.d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        pkxVar.b(new pli(1, arrayList, ucyVar.c));
        list.add(pkxVar);
        this.i.put(pkaVarA, pkxVar);
        return pkxVar;
    }

    private final pkx f(List list, int i) {
        pka pkaVar = (pka) Iterables.getLast(list);
        Map map = this.i;
        pkx pkxVar = (pkx) map.get(pkaVar);
        if (pkxVar != null) {
            return pkxVar;
        }
        List list2 = this.c;
        pkx pkxVar2 = new pkx(list2.size(), i, false);
        list2.add(pkxVar2);
        map.put(pkaVar, pkxVar2);
        return pkxVar2;
    }

    private final pkx g(pju pjuVar) {
        String string;
        int i = pjuVar.d;
        if (i != -1) {
            if (i != -2) {
                return (pkx) this.c.get(i);
            }
        } else {
            if (!pjuVar.c()) {
                StringBuilder sb = new StringBuilder();
                sb.append(pjuVar);
                sb.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                pks pksVar = pjuVar.c;
                if (pksVar instanceof pkd) {
                    sb.append("\n\tError occurred on CVE with associated View of type: ");
                    sb.append(pkd.b(pjuVar).getClass().getSimpleName());
                } else {
                    sb.append("\n\tError occurred on SyntheticNode");
                }
                Object objD = pksVar.d();
                if (objD != null) {
                    sb.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (objD != null) {
                        pju pjuVar2 = (pju) objD;
                        pks pksVar2 = pjuVar2.c;
                        if (pksVar2 == null) {
                            sb.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            string = sb.toString();
                            break;
                        }
                        if (pksVar2 instanceof pkd) {
                            sb.append("\n\t\t\tView of type: ");
                            sb.append(pkd.b(pjuVar2).getClass().getSimpleName());
                        } else {
                            sb.append("\n\t\t\tSyntheticNode");
                        }
                        objD = pksVar2.d();
                    } else {
                        string = sb.toString();
                        break;
                    }
                }
                throw new IllegalStateException(string);
            }
            this.j.add(pjuVar);
            pks pksVar3 = pjuVar.c;
            if (pksVar3.o()) {
                return e(pjuVar);
            }
            Object objD2 = pksVar3.d();
            if (objD2 == null) {
                pka pkaVarA = pjuVar.a();
                vvd vvdVar = pnj.a;
                pkaVarA.i(vvdVar);
                if (pkaVarA.l.m((vub) vvdVar.c)) {
                    return e(pjuVar);
                }
                View viewB = pkd.b(pjuVar);
                while (true) {
                    if (viewB != null) {
                        if (!pkd.p(viewB)) {
                            Object parent = viewB.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            }
                            viewB = (View) parent;
                        } else {
                            Log.e("GIL", a.cw(pjuVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                pjuVar.d = -2;
                return null;
            }
            pju pjuVar3 = (pju) objD2;
            if (pjuVar3.d == -1 && pjuVar3.d()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                qtl.as(pjuVar3, arrayList);
                a.ab(arrayList.size() > 1);
                pkx pkxVarF = f(arrayList, this.a.size());
                pka pkaVarA2 = pkxVarF.a(pjuVar, -1);
                arrayList.set(0, pkaVarA2);
                ucy ucyVar = pkaVarA2.d;
                if (ucyVar == null) {
                    ucyVar = ucy.a;
                }
                pkxVarF.b(new pli(1, arrayList, ucyVar.c));
                return pkxVarF;
            }
            pkx pkxVarG = g(pjuVar3);
            if (pkxVarG != null) {
                ucy ucyVar2 = ((pka) pjuVar3.e.b).d;
                if (ucyVar2 == null) {
                    ucyVar2 = ucy.a;
                }
                pkxVarG.a(pjuVar, ucyVar2.c);
                return pkxVarG;
            }
        }
        return null;
    }

    public final List a() {
        tql tqlVarQ = szg.q("GIL:LogBatch");
        try {
            List<pkx> list = this.c;
            ArrayList arrayList = new ArrayList(list.size());
            for (pkx pkxVar : list) {
                arrayList.add(new plj(pkxVar.a, pkxVar.b, pkxVar.c, pkxVar.d, pkxVar.e, pkxVar.f));
            }
            list.clear();
            this.i.clear();
            tqlVarQ.close();
            return arrayList;
        } finally {
        }
    }

    public final void b() {
        tql tqlVarQ = szg.q("GIL:CreateInsertGrafts");
        try {
            Set<pju> set = this.a;
            for (pju pjuVar : set) {
                if (pjuVar.d == -1) {
                    g(pjuVar);
                }
            }
            set.clear();
            List list = this.j;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pju) it.next()).d = -1;
            }
            list.clear();
            tqlVarQ.close();
            tql tqlVarQ2 = szg.q("GIL:CreateVisibilityGrafts");
            try {
                Set set2 = this.b;
                Iterator it2 = set2.iterator();
                while (true) {
                    Object obj = null;
                    if (it2.hasNext()) {
                        pju pjuVar2 = (pju) it2.next();
                        sij.z(pjuVar2.d(), "Not impressed: %s", pjuVar2);
                        int iF = pjuVar2.f();
                        vty vtyVar = pjuVar2.e;
                        int i = ((pka) vtyVar.b).e;
                        int iAL = a.aL(i);
                        if (iAL == 0) {
                            iAL = 1;
                        }
                        if (iAL != iF) {
                            int iAL2 = a.aL(i);
                            if (iAL2 == 0) {
                                iAL2 = 1;
                            }
                            int i2 = iAL2 - 1;
                            if (i2 == 2 || i2 == 4) {
                                if (iF == 2) {
                                    continue;
                                } else {
                                    sij.x(iF != 1, "Repressed VE was visible.");
                                }
                            }
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            pka pkaVar = (pka) vtyVar.b;
                            int i3 = iF - 1;
                            if (iF == 0) {
                                throw null;
                            }
                            pkaVar.e = i3;
                            pkaVar.b |= 2;
                            List arrayList = new ArrayList();
                            qtl.as(pjuVar2, arrayList);
                            pkx pkxVarF = f(arrayList, 0);
                            int iAL3 = a.aL(((pka) arrayList.get(0)).e);
                            if (iAL3 == 0 || iAL3 == 1) {
                                pkxVarF.b(new pli(2, arrayList, pkxVarF.e.size()));
                                pkw pkwVar = new pkw(pkxVarF);
                                ucy ucyVar = ((pka) vtyVar.b).d;
                                if (ucyVar == null) {
                                    ucyVar = ucy.a;
                                }
                                ucz uczVar = ucyVar.e;
                                if (uczVar == null) {
                                    uczVar = ucz.a;
                                }
                                if ((uczVar.b & 2) != 0) {
                                    pkwVar.b(pjuVar2);
                                }
                            } else {
                                pkxVarF.b(new pli(3, arrayList, -1));
                            }
                        }
                    } else {
                        set2.clear();
                        tqlVarQ2.close();
                        Map map = this.d;
                        if (map.isEmpty()) {
                            return;
                        }
                        tqlVarQ = szg.q("GIL:CreateRemoveGrafts");
                        try {
                            for (Map.Entry entry : map.entrySet()) {
                                Collection<pka> collection = (Collection) entry.getValue();
                                for (pka pkaVar2 : collection) {
                                    pju pjuVar3 = (pju) entry.getKey();
                                    int iAL4 = a.aL(pkaVar2.e);
                                    if (iAL4 == 0 || iAL4 == 1) {
                                        ArrayList arrayList2 = new ArrayList();
                                        vtw vtwVar = (vtw) pkaVar2.a(5, obj);
                                        vtwVar.x(pkaVar2);
                                        vty vtyVar2 = (vty) vtwVar;
                                        if (!vtyVar2.b.A()) {
                                            vtyVar2.u();
                                        }
                                        pka pkaVar3 = (pka) vtyVar2.b;
                                        pkaVar3.e = 1;
                                        pkaVar3.b |= 2;
                                        arrayList2.add((pka) vtyVar2.r());
                                        if (pjuVar3 != null) {
                                            qtl.as(pjuVar3, arrayList2);
                                        }
                                        f(arrayList2, 0).b(new pli(3, arrayList2, -1));
                                        obj = null;
                                    }
                                }
                                collection.clear();
                                this.e = collection;
                                obj = null;
                            }
                            tqlVarQ.close();
                            this.d.clear();
                            return;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        } finally {
            try {
                tqlVarQ.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public final boolean c() {
        return (this.c.isEmpty() && this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final boolean d(pju pjuVar, int i) {
        if (this.a.contains(pjuVar)) {
            return false;
        }
        int iAL = a.aL(((pka) pjuVar.e.b).e);
        if (iAL == 0) {
            iAL = 1;
        }
        if (iAL == i) {
            this.b.remove(pjuVar);
            return false;
        }
        this.b.add(pjuVar);
        return true;
    }
}
