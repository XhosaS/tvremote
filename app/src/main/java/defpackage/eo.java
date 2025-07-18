package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eo {
    public static final eh a = new eh();
    public final ViewGroup b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public boolean e;
    public boolean f;

    public eo(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public abstract void a(List list, boolean z);

    public final en b(bq bqVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            en enVar = (en) next;
            if (agvy.c(enVar.a, bqVar) && !enVar.b) {
                break;
            }
        }
        return (en) next;
    }

    public final en c(bq bqVar) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            en enVar = (en) next;
            if (agvy.c(enVar.a, bqVar) && !enVar.b) {
                break;
            }
        }
        return (en) next;
    }

    public final void d(en enVar) {
        enVar.getClass();
        if (enVar.f) {
            int i = enVar.h;
            bq bqVar = enVar.a;
            em.b(i, bqVar.cP(), this.b);
            enVar.f = false;
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agqq.k(arrayList, ((en) it.next()).g);
        }
        List listX = agqq.x(agqq.A(arrayList));
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            ((ei) listX.get(i)).b(this.b);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((en) list.get(i2));
        }
        List listX2 = agqq.x(list);
        int size3 = listX2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            en enVar = (en) listX2.get(i3);
            if (enVar.g.isEmpty()) {
                enVar.a();
            }
        }
    }

    public final void f() {
        if (de.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.b;
        List list = this.c;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            h();
            g(list);
            ArrayList<en> arrayList = new ArrayList(this.d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((en) it.next()).d = false;
            }
            for (en enVar : arrayList) {
                if (de.S(2)) {
                    Log.v("FragmentManager", a.h(enVar, zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling running operation "));
                }
                enVar.e(viewGroup);
            }
            ArrayList<en> arrayList2 = new ArrayList(list);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((en) it2.next()).d = false;
            }
            for (en enVar2 : arrayList2) {
                if (de.S(2)) {
                    Log.v("FragmentManager", a.h(enVar2, zIsAttachedToWindow ? "" : "Container " + viewGroup + " is not attached to window. ", "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                enVar2.e(viewGroup);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((en) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agqq.k(arrayList, ((en) it.next()).g);
        }
        List listX = agqq.x(agqq.A(arrayList));
        int size2 = listX.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ei eiVar = (ei) listX.get(i2);
            ViewGroup viewGroup = this.b;
            if (!eiVar.h) {
                eiVar.c(viewGroup);
            }
            eiVar.h = true;
        }
    }

    public final void h() {
        for (en enVar : this.c) {
            if (enVar.i == 2) {
                enVar.g(em.a.b(enVar.a.cP().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, dm dmVar) {
        List list = this.c;
        synchronized (list) {
            bq bqVar = dmVar.b;
            bqVar.getClass();
            en enVarB = b(bqVar);
            if (enVarB == null) {
                if (bqVar.u || bqVar.t) {
                    bqVar.getClass();
                    enVarB = c(bqVar);
                } else {
                    enVarB = null;
                }
            }
            if (enVarB != null) {
                enVarB.g(i, i2);
                return;
            }
            final ej ejVar = new ej(i, i2, dmVar);
            list.add(ejVar);
            ejVar.c(new Runnable() { // from class: ef
                @Override // java.lang.Runnable
                public final void run() {
                    eo eoVar = this.a;
                    List list2 = eoVar.c;
                    ej ejVar2 = ejVar;
                    if (list2.contains(ejVar2)) {
                        int i3 = ejVar2.h;
                        View view = ejVar2.a.R;
                        view.getClass();
                        em.b(i3, view, eoVar.b);
                    }
                }
            });
            ejVar.c(new Runnable() { // from class: eg
                @Override // java.lang.Runnable
                public final void run() {
                    eo eoVar = this.a;
                    List list2 = eoVar.c;
                    ej ejVar2 = ejVar;
                    list2.remove(ejVar2);
                    eoVar.d.remove(ejVar2);
                }
            });
        }
    }
}
