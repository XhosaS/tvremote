package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyr {
    public final fwv a;
    public final yjk b;
    public fxd c;
    public Bundle d;
    public Bundle[] e;
    public final ygx f = new ygx();
    public final yva g;
    public final Map h;
    public final Map i;
    public dvk j;
    public fww k;
    public dvd l;
    public final dvj m;
    public final fxp n;
    public final Map o;
    public yjv p;
    public yjv q;
    public final Map r;
    public final yuj s;
    public final yvc t;
    public final yvc u;
    private final Map v;
    private final Map w;
    private final List x;
    private int y;
    private final List z;

    public fyr(fwv fwvVar, yjk yjkVar) {
        this.a = fwvVar;
        this.b = yjkVar;
        yhb yhbVar = yhb.a;
        this.t = yvd.a(yhbVar);
        yvc yvcVarA = yvd.a(yhbVar);
        this.u = yvcVarA;
        this.g = new yul(yvcVarA);
        this.v = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.x = new ArrayList();
        this.l = dvd.b;
        this.m = new fe(this, 6);
        this.n = new fxp();
        this.o = new LinkedHashMap();
        this.r = new LinkedHashMap();
        this.z = new ArrayList();
        this.s = yuq.e(1, 0, 2, 2);
    }

    public static /* synthetic */ fxb n(fyr fyrVar, int i) {
        return fyrVar.d(i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [fxb, fxd] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fxd, java.lang.Object] */
    public static final fxb o(fxb fxbVar, int i, boolean z, fxb fxbVar2) {
        fxbVar.getClass();
        if (fxbVar.b() == i && (fxbVar2 == null || (yks.e(fxbVar, fxbVar2) && yks.e(fxbVar.c, fxbVar2.c)))) {
            return fxbVar;
        }
        ?? r0 = fxbVar instanceof fxd ? (fxd) fxbVar : 0;
        if (r0 == 0) {
            r0 = fxbVar.c;
            r0.getClass();
        }
        return r0.l(i, r0, z, fxbVar2);
    }

    public static /* synthetic */ boolean r(fyr fyrVar, int i) {
        return fyrVar.m(i, true, false);
    }

    public static /* synthetic */ void s(fyr fyrVar, fwr fwrVar) {
        fyrVar.k(fwrVar, false, new ygx());
    }

    public final dvd a() {
        return this.j == null ? dvd.c : this.l;
    }

    public final fwr b(int i) {
        Object objPrevious;
        ygx ygxVar = this.f;
        ListIterator<E> listIterator = ygxVar.listIterator(ygxVar.a);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((fwr) objPrevious).a.b() == i) {
                break;
            }
        }
        fwr fwrVar = (fwr) objPrevious;
        if (fwrVar != null) {
            return fwrVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + e());
    }

    public final fwr c() {
        return (fwr) this.f.f();
    }

    public final fxb d(int i, fxb fxbVar) {
        fxb fxbVar2;
        fxd fxdVar = this.c;
        if (fxdVar == null) {
            return null;
        }
        if (fxdVar.b() == i && (fxbVar == null || (yks.e(this.c, fxbVar) && fxbVar.c == null))) {
            return this.c;
        }
        fwr fwrVar = (fwr) this.f.f();
        if (fwrVar == null || (fxbVar2 = fwrVar.a) == null) {
            fxbVar2 = this.c;
            fxbVar2.getClass();
        }
        return o(fxbVar2, i, false, fxbVar);
    }

    public final fxb e() {
        fwr fwrVarC = c();
        if (fwrVarC != null) {
            return fwrVarC.a;
        }
        return null;
    }

    public final fxd f() {
        fxd fxdVar = this.c;
        if (fxdVar != null) {
            return fxdVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final fxd g() {
        fxb fxbVar;
        fwr fwrVar = (fwr) this.f.f();
        if (fwrVar == null || (fxbVar = fwrVar.a) == null) {
            fxbVar = this.c;
            fxbVar.getClass();
        }
        fxd fxdVar = fxbVar instanceof fxd ? (fxd) fxbVar : null;
        if (fxdVar != null) {
            return fxdVar;
        }
        fxd fxdVar2 = fxbVar.c;
        fxdVar2.getClass();
        return fxdVar2;
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.o.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((fws) it.next()).e.d();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                fwr fwrVar = (fwr) obj;
                if (!arrayList.contains(fwrVar) && !fwrVar.b().a(dvd.d)) {
                    arrayList2.add(obj);
                }
            }
            yfm.I(arrayList, arrayList2);
        }
        ygx ygxVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : ygxVar) {
            fwr fwrVar2 = (fwr) obj2;
            if (!arrayList.contains(fwrVar2) && fwrVar2.b().a(dvd.d)) {
                arrayList3.add(obj2);
            }
        }
        yfm.I(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((fwr) obj3).a instanceof fxd)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void i(fxb fxbVar, Bundle bundle, fwr fwrVar, List list) {
        ygx ygxVar;
        Object objPrevious;
        Object objPrevious2;
        ygx ygxVar2;
        fxb fxbVar2 = fwrVar.a;
        if (!(fxbVar2 instanceof fyf)) {
            do {
                ygxVar2 = this.f;
                if (ygxVar2.isEmpty() || !(((fwr) ygxVar2.e()).a instanceof fyf)) {
                    break;
                }
            } while (r(this, ((fwr) ygxVar2.e()).a.b()));
        }
        ygx<fwr> ygxVar3 = new ygx();
        Object obj = null;
        if (fxbVar instanceof fxd) {
            fxb fxbVar3 = fxbVar2;
            do {
                fxbVar3.getClass();
                fxbVar3 = fxbVar3.c;
                if (fxbVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (yks.e(((fwr) objPrevious2).a, fxbVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    fwr fwrVarQ = (fwr) objPrevious2;
                    if (fwrVarQ == null) {
                        fwrVarQ = fus.Q(w(), fxbVar3, bundle, a(), this.k);
                    }
                    ygxVar3.addFirst(fwrVarQ);
                    ygx ygxVar4 = this.f;
                    if (!ygxVar4.isEmpty() && ((fwr) ygxVar4.e()).a == fxbVar3) {
                        s(this, (fwr) ygxVar4.e());
                    }
                }
                if (fxbVar3 == null) {
                    break;
                }
            } while (fxbVar3 != fxbVar);
        }
        fxb fxbVar4 = ygxVar3.isEmpty() ? fxbVar2 : ((fwr) ygxVar3.a()).a;
        while (fxbVar4 != null && d(fxbVar4.b(), fxbVar4) != fxbVar4) {
            fxbVar4 = fxbVar4.c;
            if (fxbVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (yks.e(((fwr) objPrevious).a, fxbVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                fwr fwrVarQ2 = (fwr) objPrevious;
                if (fwrVarQ2 == null) {
                    fwrVarQ2 = fus.Q(w(), fxbVar4, fxbVar4.c(bundle2), a(), this.k);
                }
                ygxVar3.addFirst(fwrVarQ2);
            }
        }
        if (!ygxVar3.isEmpty()) {
            fxbVar2 = ((fwr) ygxVar3.a()).a;
        }
        while (true) {
            ygxVar = this.f;
            if (ygxVar.isEmpty() || !(((fwr) ygxVar.e()).a instanceof fxd)) {
                break;
            }
            fxb fxbVar5 = ((fwr) ygxVar.e()).a;
            fxbVar5.getClass();
            if (kq.a(((fxd) fxbVar5).i(), fxbVar2.b()) != null) {
                break;
            } else {
                s(this, (fwr) ygxVar.e());
            }
        }
        fwr fwrVar2 = (fwr) ygxVar.c();
        if (fwrVar2 == null) {
            fwrVar2 = (fwr) ygxVar3.c();
        }
        if (!yks.e(fwrVar2 != null ? fwrVar2.a : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                fxb fxbVar6 = ((fwr) objPrevious3).a;
                fxd fxdVar = this.c;
                fxdVar.getClass();
                if (yks.e(fxbVar6, fxdVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            fwr fwrVarQ3 = (fwr) obj;
            if (fwrVarQ3 == null) {
                cb cbVarW = w();
                fxd fxdVar2 = this.c;
                fxdVar2.getClass();
                fxdVar2.getClass();
                fwrVarQ3 = fus.Q(cbVarW, fxdVar2, fxdVar2.c(bundle), a(), this.k);
            }
            ygxVar3.addFirst(fwrVarQ3);
        }
        for (fwr fwrVar3 : ygxVar3) {
            Object obj2 = this.o.get(this.n.b(fwrVar3.a.a));
            if (obj2 == null) {
                throw new IllegalStateException("NavigatorBackStack for " + fxbVar.a + " should already be created");
            }
            ((fws) obj2).b(fwrVar3);
        }
        ygxVar.addAll(ygxVar3);
        ygxVar.add(fwrVar);
        for (fwr fwrVar4 : yfm.ag(ygxVar3, fwrVar)) {
            fxd fxdVar3 = fwrVar4.a.c;
            if (fxdVar3 != null) {
                j(fwrVar4, b(fxdVar3.b()));
            }
        }
    }

    public final void j(fwr fwrVar, fwr fwrVar2) {
        fwrVar.getClass();
        this.v.put(fwrVar, fwrVar2);
        Map map = this.w;
        if (map.get(fwrVar2) == null) {
            map.put(fwrVar2, new dxc((short[]) null));
        }
        Object obj = map.get(fwrVar2);
        obj.getClass();
        ((AtomicInteger) ((dxc) obj).a).incrementAndGet();
    }

    public final void k(fwr fwrVar, boolean z, ygx ygxVar) {
        fww fwwVar;
        Set set;
        fwrVar.getClass();
        ygx ygxVar2 = this.f;
        fwr fwrVar2 = (fwr) ygxVar2.e();
        if (!yks.e(fwrVar2, fwrVar)) {
            throw new IllegalStateException("Attempted to pop " + fwrVar.a + ", which is not the top of the back stack (" + fwrVar2.a + ')');
        }
        yfm.E(ygxVar2);
        fws fwsVar = (fws) this.o.get(this.n.b(fwrVar2.a.a));
        boolean z2 = true;
        if ((fwsVar == null || (set = (Set) fwsVar.e.d()) == null || !set.contains(fwrVar2)) && !this.w.containsKey(fwrVar2)) {
            z2 = false;
        }
        dvd dvdVar = ((dvl) fwrVar2.getLifecycle()).b;
        dvd dvdVar2 = dvd.c;
        if (dvdVar.a(dvdVar2)) {
            if (z) {
                fwrVar2.c(dvdVar2);
                ygxVar.addFirst(new dxc(fwrVar2));
            }
            if (z2) {
                fwrVar2.c(dvdVar2);
            } else {
                fwrVar2.c(dvd.a);
                u(fwrVar2);
            }
        }
        if (z || z2 || (fwwVar = this.k) == null) {
            return;
        }
        fwwVar.a(fwrVar2.d);
    }

    public final void l() {
        dxc dxcVar;
        Set set;
        List<fwr> listAn = yfm.an(this.f);
        if (listAn.isEmpty()) {
            return;
        }
        fxb fxbVar = ((fwr) yfm.W(listAn)).a;
        List listT = yfm.t(fxbVar);
        if (fxbVar instanceof fxv) {
            boolean z = fxbVar instanceof fyf;
            Iterator it = yfm.av(yfm.ah(listAn)).iterator();
            while (it.hasNext()) {
                fxb fxbVar2 = ((fwr) it.next()).a;
                if (z && !(fxbVar2 instanceof fyf) && !(fxbVar2 instanceof fxd)) {
                    break;
                }
                listT.add(fxbVar2);
                if (!(fxbVar2 instanceof fxv) && !(fxbVar2 instanceof fxd)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (yfm.W(listT) instanceof fyf) {
            Iterator it2 = yfm.ah(listAn).iterator();
            while (it2.hasNext()) {
                fxb fxbVar3 = ((fwr) it2.next()).a;
                arrayList.add(fxbVar3);
                if (!(fxbVar3 instanceof fyf) && !(fxbVar3 instanceof fxv) && !(fxbVar3 instanceof fxd)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (fwr fwrVar : yfm.ah(listAn)) {
            dvd dvdVarB = fwrVar.b();
            fxb fxbVar4 = fwrVar.a;
            fxb fxbVar5 = (fxb) yfm.U(listT);
            if (fxbVar5 != null && fxbVar5.b() == fxbVar4.b()) {
                dvd dvdVar = dvd.e;
                if (dvdVarB != dvdVar) {
                    fws fwsVar = (fws) this.o.get(this.n.b(fwrVar.a.a));
                    Boolean boolValueOf = null;
                    if (fwsVar != null && (set = (Set) fwsVar.e.d()) != null) {
                        boolValueOf = Boolean.valueOf(set.contains(fwrVar));
                    }
                    if (yks.e(boolValueOf, true) || ((dxcVar = (dxc) this.w.get(fwrVar)) != null && ((AtomicInteger) dxcVar.a).get() == 0)) {
                        map.put(fwrVar, dvd.d);
                    } else {
                        map.put(fwrVar, dvdVar);
                    }
                }
                fxb fxbVar6 = (fxb) yfm.U(arrayList);
                if (fxbVar6 != null && fxbVar6.b() == fxbVar4.b()) {
                    yfm.D(arrayList);
                }
                yfm.D(listT);
                fxd fxdVar = fxbVar4.c;
                if (fxdVar != null) {
                    listT.add(fxdVar);
                }
            } else if (arrayList.isEmpty() || fxbVar4.b() != ((fxb) yfm.S(arrayList)).b()) {
                fwrVar.c(dvd.c);
            } else {
                fxb fxbVar7 = (fxb) yfm.D(arrayList);
                if (dvdVarB == dvd.e) {
                    fwrVar.c(dvd.d);
                } else {
                    dvd dvdVar2 = dvd.d;
                    if (dvdVarB != dvdVar2) {
                        map.put(fwrVar, dvdVar2);
                    }
                }
                fxd fxdVar2 = fxbVar7.c;
                if (fxdVar2 != null && !arrayList.contains(fxdVar2)) {
                    arrayList.add(fxdVar2);
                }
            }
        }
        for (fwr fwrVar2 : listAn) {
            dvd dvdVar3 = (dvd) map.get(fwrVar2);
            if (dvdVar3 != null) {
                fwrVar2.c(dvdVar3);
            } else {
                fwrVar2.f.c();
            }
        }
    }

    public final boolean m(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        fxb fxbVar;
        boolean z3;
        ygx ygxVar = this.f;
        int i2 = 0;
        if (ygxVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = yfm.ah(ygxVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                fxbVar = null;
                break;
            }
            fxb fxbVar2 = ((fwr) it.next()).a;
            fxo fxoVarB = this.n.b(fxbVar2.a);
            if (z || fxbVar2.b() != i) {
                arrayList.add(fxoVarB);
            }
            if (fxbVar2.b() == i) {
                fxbVar = fxbVar2;
                break;
            }
        }
        if (fxbVar == null) {
            int i3 = fxb.e;
            fus.O(w(), i);
            return false;
        }
        ylb ylbVar = new ylb();
        ygx ygxVar2 = new ygx();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = z2;
                break;
            }
            fxo fxoVar = (fxo) it2.next();
            ylb ylbVar2 = new ylb();
            fwr fwrVar = (fwr) ygxVar.e();
            z3 = z2;
            asp aspVar = new asp(ylbVar2, ylbVar, this, z3, ygxVar2, 2);
            fxoVar.getClass();
            fwrVar.getClass();
            this.q = aspVar;
            fxoVar.g(fwrVar, z3);
            this.q = null;
            if (!ylbVar2.a) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                yna ynaVar = new yna(new ynb(ykr.h(fxbVar, new fyh(4)), (yjv) new fyq(this, 1), 0), 0);
                while (ynaVar.hasNext()) {
                    fxb fxbVar3 = (fxb) ynaVar.next();
                    Map map = this.h;
                    Integer numValueOf = Integer.valueOf(fxbVar3.b());
                    dxc dxcVar = (dxc) ygxVar2.c();
                    map.put(numValueOf, dxcVar != null ? dxcVar.i() : null);
                }
            }
            if (!ygxVar2.isEmpty()) {
                dxc dxcVar2 = (dxc) ygxVar2.a();
                yna ynaVar2 = new yna(new ynb(ykr.h(n(this, dxcVar2.g()), new fyh(5)), (yjv) new fyq(this, i2), 0), 0);
                while (ynaVar2.hasNext()) {
                    this.h.put(Integer.valueOf(((fxb) ynaVar2.next()).b()), dxcVar2.i());
                }
                if (this.h.values().contains(dxcVar2.i())) {
                    this.i.put(dxcVar2.i(), ygxVar2);
                }
            }
        }
        this.b.a();
        return ylbVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.fxb r17, android.os.Bundle r18, defpackage.fxh r19) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyr.p(fxb, android.os.Bundle, fxh):void");
    }

    public final void q(fxo fxoVar, List list, fxh fxhVar, yjv yjvVar) {
        list.getClass();
        this.p = yjvVar;
        fxoVar.e(list, fxhVar);
        this.p = null;
    }

    public final boolean t(int i, Bundle bundle, fxh fxhVar) throws Resources.NotFoundException {
        fxb fxbVarF;
        fwr fwrVar;
        fxb fxbVar;
        Map map = this.h;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) map.get(numValueOf);
        yfm.K(map.values(), new fyq(str, 2));
        Map map2 = this.i;
        ylh.g(map2);
        ygx<dxc> ygxVar = (ygx) map2.remove(str);
        ArrayList arrayList = new ArrayList();
        fwr fwrVar2 = (fwr) this.f.f();
        if (fwrVar2 == null || (fxbVarF = fwrVar2.a) == null) {
            fxbVarF = f();
        }
        if (ygxVar != null) {
            for (dxc dxcVar : ygxVar) {
                fxb fxbVarO = o(fxbVarF, dxcVar.g(), true, null);
                if (fxbVarO == null) {
                    int i2 = fxb.e;
                    throw new IllegalStateException("Restore State failed: destination " + fus.O(w(), dxcVar.g()) + " cannot be found from the current destination " + fxbVarF);
                }
                arrayList.add(dxcVar.o(w(), fxbVarO, a(), this.k));
                fxbVarF = fxbVarO;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<fwr> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((fwr) obj).a instanceof fxd)) {
                arrayList3.add(obj);
            }
        }
        for (fwr fwrVar3 : arrayList3) {
            List list = (List) yfm.X(arrayList2);
            if (yks.e((list == null || (fwrVar = (fwr) yfm.W(list)) == null || (fxbVar = fwrVar.a) == null) ? null : fxbVar.a, fwrVar3.a.a)) {
                list.add(fwrVar3);
            } else {
                arrayList2.add(yfm.t(fwrVar3));
            }
        }
        ylb ylbVar = new ylb();
        for (List list2 : arrayList2) {
            q(this.n.b(((fwr) yfm.S(list2)).a.a), list2, fxhVar, new up(ylbVar, arrayList, new yld(), this, bundle, 2));
        }
        return ylbVar.a;
    }

    public final void u(fwr fwrVar) {
        fwrVar.getClass();
        fwr fwrVar2 = (fwr) this.v.remove(fwrVar);
        if (fwrVar2 == null) {
            return;
        }
        Map map = this.w;
        dxc dxcVar = (dxc) map.get(fwrVar2);
        Integer numValueOf = dxcVar != null ? Integer.valueOf(((AtomicInteger) dxcVar.a).decrementAndGet()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return;
        }
        fws fwsVar = (fws) this.o.get(this.n.b(fwrVar2.a.a));
        if (fwsVar != null) {
            fwsVar.c(fwrVar2);
        }
        map.remove(fwrVar2);
    }

    public final void v() {
        ygx ygxVar;
        while (true) {
            ygxVar = this.f;
            if (ygxVar.isEmpty() || !(((fwr) ygxVar.e()).a instanceof fxd)) {
                break;
            } else {
                s(this, (fwr) ygxVar.e());
            }
        }
        fwr fwrVar = (fwr) ygxVar.f();
        if (fwrVar != null) {
            this.z.add(fwrVar);
        }
        this.y++;
        l();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            List list = this.z;
            List<fwr> listAn = yfm.an(list);
            list.clear();
            for (fwr fwrVar2 : listAn) {
                for (fwt fwtVar : this.x) {
                    fxb fxbVar = fwrVar2.a;
                    fwrVar2.a();
                    fwtVar.a();
                }
                this.s.eV(fwrVar2);
            }
            this.t.eV(yfm.an(ygxVar));
            this.u.eV(h());
        }
    }

    public final cb w() {
        return this.a.g;
    }
}
