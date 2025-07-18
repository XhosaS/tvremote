package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzg extends emn implements eml {
    public static final dzg a = new dzg(null);
    public static dzg b;
    public final String c;

    public dzg(String str) {
        this.c = str;
    }

    public static int a(enb enbVar, int i) {
        eme emeVarI = enbVar.i(i);
        int iA = enbVar.a();
        loop0: while (true) {
            i++;
            if (i >= iA) {
                return enbVar.a() - 1;
            }
            eme emeVar = enbVar.i(i).a;
            while (emeVar != emeVarI) {
                if (emeVar == null || (emeVar = emeVar.a) == null) {
                    break loop0;
                }
            }
        }
        return i - 1;
    }

    public static void c(emm emmVar) {
        ((dzf) emmVar.c).d = -1;
    }

    static void d(emm emmVar, enb enbVar) {
        dzf dzfVar = (dzf) emmVar.c;
        ene.b();
        if (dzfVar.g) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (enbVar.m() != null) {
            arrayList.addAll(enbVar.m());
        }
        List listL = enbVar.l();
        if (listL != null) {
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                ena.a((dyt) it.next(), arrayList, enbVar.j());
            }
        }
        dym dymVar = new dym();
        dym dymVar2 = new dym();
        dyv dyvVarG = enbVar.g();
        if (dyvVarG != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dyt dytVar = (dyt) arrayList.get(i);
                if (dytVar == null) {
                    throw new IllegalStateException("NULL_TRANSITION when collecting root bounds anim. Root: " + enbVar.j() + ", root TransitionId: " + dyvVarG.toString());
                }
                ena.d(dyvVarG, dytVar, eae.c, dymVar);
                ena.d(dyvVarG, dytVar, eae.d, dymVar2);
            }
        }
        if (true != dymVar.a) {
            dymVar = null;
        }
        if (true != dymVar2.a) {
            dymVar2 = null;
        }
        enbVar.r(dymVar, dymVar2);
        dzfVar.h = arrayList.isEmpty() ? null : arrayList.size() == 1 ? (dyt) arrayList.get(0) : new dxb(arrayList);
        dzfVar.g = true;
    }

    public static void e(emm emmVar, dxa dxaVar) {
        dzf dzfVar = (dzf) emmVar.c;
        dyv dyvVar = ((dvi) dzfVar.b.get(((elv) dxaVar.b()).d.b)).e;
        dzc dzcVar = dzfVar.e;
        if (dzcVar != null && dyvVar != null) {
            dzcVar.f(dyvVar, null);
        }
        short s = dxaVar.b;
        for (int i = 0; i < s; i++) {
            o(emmVar, (elv) dxaVar.a[dxaVar.a(i)], true);
        }
    }

    public static void f(int i, emm emmVar) {
        if (p(i, emmVar.b.a)) {
            return;
        }
        long j = ((dvu) ((dzf) emmVar.c).i.i(i).b).a;
        if (emmVar.d(j)) {
            emmVar.e(j);
        }
        emmVar.b(j, true);
        emmVar.e(j);
    }

    public static void g(int i, emm emmVar) {
        eme emeVar;
        enb enbVar = ((dzf) emmVar.c).i;
        if (enbVar == null || i < 0) {
            return;
        }
        eme emeVarI = enbVar.i(i);
        int iB = -1;
        if (emeVarI != null && (emeVar = emeVarI.a) != null) {
            iB = enbVar.b(((dvu) emeVar.b).a);
        }
        if (iB < 0 || p(iB, emmVar.b.a)) {
            return;
        }
        g(iB, emmVar);
        f(iB, emmVar);
    }

    public static void h(emm emmVar) {
        dzf dzfVar = (dzf) emmVar.c;
        if (dzfVar.e == null) {
            return;
        }
        Map map = dzfVar.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            e(emmVar, (dxa) it.next());
        }
        emmVar.c();
        map.clear();
        dzfVar.b.clear();
        dzfVar.f.clear();
        dzc dzcVar = dzfVar.e;
        dyw dywVar = dzcVar.b;
        for (dyv dyvVar : dywVar.c()) {
            dyx dyxVar = (dyx) dywVar.a(dyvVar);
            dzcVar.g(dyvVar, dyxVar, null);
            dzc.b(dyxVar);
        }
        dywVar.a.clear();
        dywVar.b.clear();
        dywVar.c.clear();
        dywVar.d.clear();
        dzcVar.c.e();
        dzcVar.a.clear();
        ArrayList arrayList = dzcVar.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                dzcVar.i = null;
                dzcVar.k.clear();
                return;
            }
            ((eah) arrayList.get(size)).f();
        }
    }

    public static void j(emm emmVar, enb enbVar, int i, boolean z) {
        int iA = a(enbVar, i);
        for (int i2 = i; i2 <= iA; i2++) {
            long j = ((dvu) enbVar.i(i2).b).a;
            if (z) {
                if (!emmVar.d(j)) {
                    emmVar.b(j, false);
                }
            } else if (emmVar.d(j)) {
                emmVar.e(j);
            }
        }
        eme emeVar = enbVar.i(i).a;
        while (emeVar != null) {
            eme emeVar2 = emeVar.a;
            if (emeVar2 == null) {
                return;
            }
            long j2 = ((dvu) emeVar.b).a;
            if (z) {
                if (!emmVar.d(j2)) {
                    emmVar.b(j2, false);
                }
            } else if (emmVar.d(j2)) {
                emmVar.e(j2);
            }
            emeVar = emeVar2;
        }
    }

    public static boolean k(dzf dzfVar) {
        return dzfVar.h != null;
    }

    public static boolean l(dzf dzfVar, enb enbVar) {
        return dzfVar.d == enbVar.c() || dzfVar.c.y();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [elr, emy] */
    private static void o(emm emmVar, elv elvVar, boolean z) {
        dzf dzfVar = (dzf) emmVar.c;
        Object obj = elvVar.a;
        emh emhVar = elvVar.d.b;
        if ((obj instanceof elr) && !(obj instanceof emi)) {
            elr elrVar = (elr) obj;
            int mountItemCount = elrVar.getMountItemCount();
            while (true) {
                mountItemCount--;
                if (mountItemCount < 0) {
                    break;
                }
                try {
                    o(emmVar, elrVar.a(mountItemCount), false);
                } catch (RuntimeException e) {
                    throw new RuntimeException("content: <cls>" + String.valueOf(elvVar.a.getClass()) + "</cls>\nrenderunit: <cls>" + String.valueOf(elvVar.d.b.getClass()) + "</cls>", e);
                }
            }
            if (elrVar.getMountItemCount() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
            }
        }
        ?? r1 = elvVar.b;
        if (r1 == 0) {
            throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
        }
        if (!z) {
            r1.k(elvVar);
        } else if (!r1.m(elvVar)) {
            throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(String.valueOf(((dvi) ((dzf) emmVar.c).b.get(elvVar.d.b)).e))));
        }
        emmVar.b.a.w(elvVar);
        dzfVar.b.remove(elvVar.d.b);
    }

    private static boolean p(int i, elu eluVar) {
        return eluVar.j(i) != null;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ Object b() {
        return new dzf(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eml
    public final void i(emm emmVar, elv elvVar, elr elrVar) {
        dzf dzfVar = (dzf) emmVar.c;
        dvi dviVar = (dvi) dzfVar.b.get(elvVar.d.b);
        dxa dxaVar = (dxa) dzfVar.a.get(dviVar.e);
        if (dxaVar != null) {
            if (dxaVar.a[dviVar.c] != null) {
                elrVar.j(elvVar);
            }
        }
    }

    @Override // defpackage.eml
    public final boolean m(emm emmVar, elv elvVar) {
        return ((dzf) emmVar.c).b.containsKey(elvVar.d.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emn
    public final void n(emm emmVar, emh emhVar, Object obj) {
        enb enbVar = ((dzf) emmVar.c).c;
        if (enbVar == null || !enbVar.w()) {
            return;
        }
        long j = ((dvu) emhVar).a;
        if (emmVar.d(j) && enbVar.z(j)) {
            ene.b();
            Stack stack = new Stack();
            stack.push((View) obj);
            while (!stack.isEmpty()) {
                View view = (View) stack.pop();
                if (view instanceof emx) {
                    ((emx) view).r(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                } else if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (childCount >= 0) {
                            stack.push(viewGroup.getChildAt(childCount));
                        }
                    }
                }
            }
        }
    }
}
