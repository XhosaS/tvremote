package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bf {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;

    public bf(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final bf c(ViewGroup viewGroup, am amVar) {
        viewGroup.getClass();
        ii iiVarAe = amVar.ae();
        iiVarAe.getClass();
        return ii.ae(viewGroup, iiVarAe);
    }

    public final be a(q qVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            be beVar = (be) next;
            if (dnx.aB(beVar.a, qVar) && !beVar.b) {
                break;
            }
        }
        return (be) next;
    }

    public final be b(q qVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            be beVar = (be) next;
            if (dnx.aB(beVar.a, qVar) && !beVar.b) {
                break;
            }
        }
        return (be) next;
    }

    public final void d(be beVar) {
        beVar.getClass();
        if (beVar.f) {
            int i = beVar.h;
            q qVar = beVar.a;
            ii.Q(i, qVar.l(), this.a);
            beVar.g();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dnx.aP(arrayList, ((be) it.next()).g);
        }
        List listAM = dnx.aM(dnx.aN(arrayList));
        int size = listAM.size();
        for (int i = 0; i < size; i++) {
            ((bc) listAM.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((be) list.get(i2));
        }
        List listAM2 = dnx.aM(list);
        int size3 = listAM2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            be beVar = (be) listAM2.get(i3);
            if (beVar.g.isEmpty()) {
                beVar.a();
            }
        }
    }

    public final void f() {
        if (am.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        List list = this.b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            h();
            g(list);
            ArrayList<be> arrayList = new ArrayList(this.c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((be) it.next()).d = false;
            }
            for (be beVar : arrayList) {
                if (am.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ") + "Cancelling running operation " + beVar);
                }
                beVar.e(viewGroup);
            }
            ArrayList<be> arrayList2 = new ArrayList(list);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((be) it2.next()).d = false;
            }
            for (be beVar2 : arrayList2) {
                if (am.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ") + "Cancelling pending operation " + beVar2);
                }
                beVar2.e(viewGroup);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((be) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dnx.aP(arrayList, ((be) it.next()).g);
        }
        List listAM = dnx.aM(dnx.aN(arrayList));
        int size2 = listAM.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bc bcVar = (bc) listAM.get(i2);
            ViewGroup viewGroup = this.a;
            if (!bcVar.b) {
                bcVar.c(viewGroup);
            }
            bcVar.b = true;
        }
    }

    public final void h() {
        for (be beVar : this.b) {
            if (beVar.i == 2) {
                beVar.h(ii.R(beVar.a.l().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, ar arVar) {
        List list = this.b;
        synchronized (list) {
            q qVar = arVar.a;
            qVar.getClass();
            be beVarA = a(qVar);
            if (beVarA == null) {
                if (qVar.o || qVar.n) {
                    qVar.getClass();
                    beVarA = b(qVar);
                } else {
                    beVarA = null;
                }
            }
            if (beVarA != null) {
                beVarA.h(i, i2);
                return;
            }
            bd bdVar = new bd(i, i2, arVar);
            list.add(bdVar);
            bdVar.c(new bb(this, bdVar, 0));
            bdVar.c(new bb(this, bdVar, 2));
        }
    }
}
