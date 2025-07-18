package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bh extends dm {
    public final List a;
    public final C0038do b;
    public final C0038do c;
    public final dg d;
    public final ir e;
    public final boolean f;
    public Object g;
    public boolean h;
    private final Object k;
    private final ArrayList l;
    private final ArrayList m;
    private final ir n;
    private final ArrayList o;
    private final ArrayList p;
    private final ir q;
    private final ctl r;

    public bh(List list, C0038do c0038do, C0038do c0038do2, dg dgVar, Object obj, ArrayList arrayList, ArrayList arrayList2, ir irVar, ArrayList arrayList3, ArrayList arrayList4, ir irVar2, ir irVar3, boolean z) {
        arrayList3.getClass();
        arrayList4.getClass();
        this.a = list;
        this.b = c0038do;
        this.c = c0038do2;
        this.d = dgVar;
        this.k = obj;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = irVar;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = irVar2;
        this.e = irVar3;
        this.f = z;
        this.r = new ctl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final yfw g(ViewGroup viewGroup, C0038do c0038do, C0038do c0038do2) {
        dg dgVar;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        C0038do c0038do3 = c0038do;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        List list = this.a;
        Iterator it = list.iterator();
        View view2 = null;
        boolean z = false;
        while (it.hasNext()) {
            if (((bi) it.next()).c() && c0038do2 != null && c0038do3 != null && !this.n.isEmpty() && (obj2 = this.k) != null) {
                boolean z2 = this.f;
                ir irVar = this.q;
                cz.a(c0038do3.a, c0038do2.a, z2, irVar, true);
                cvs.b(viewGroup, new bd(c0038do3, c0038do2, this, 0));
                ArrayList arrayList2 = this.l;
                arrayList2.addAll(irVar.values());
                ArrayList arrayList3 = this.p;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    obj3.getClass();
                    view2 = (View) irVar.get((String) obj3);
                    this.d.j(obj2, view2);
                }
                ArrayList arrayList4 = this.m;
                ir irVar2 = this.e;
                arrayList4.addAll(irVar2.values());
                ArrayList arrayList5 = this.o;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    View view3 = (View) irVar2.get((String) obj4);
                    if (view3 != null) {
                        cvs.b(viewGroup, new be(view3, rect, 0));
                        z = true;
                    }
                }
                dg dgVar2 = this.d;
                dgVar2.k(obj2, view, arrayList2);
                dgVar2.q(obj2, null, null, obj2, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        Object objP = null;
        Object objP2 = null;
        while (it2.hasNext()) {
            bi biVar = (bi) it2.next();
            C0038do c0038do4 = biVar.a;
            dg dgVar3 = this.d;
            Object objA = dgVar3.a(biVar.b);
            if (objA != null) {
                Iterator it3 = it2;
                ArrayList arrayList7 = new ArrayList();
                boolean z3 = z;
                bv bvVar = c0038do4.a;
                Object obj5 = objP;
                View view4 = bvVar.mView;
                view4.getClass();
                h(arrayList7, view4);
                if (this.k != null && (c0038do4 == c0038do2 || c0038do4 == c0038do3)) {
                    if (c0038do4 == c0038do2) {
                        arrayList7.removeAll(yfm.aq(this.l));
                    } else {
                        arrayList7.removeAll(yfm.aq(this.m));
                    }
                }
                if (arrayList7.isEmpty()) {
                    dgVar3.d(objA, view);
                    obj = objA;
                    arrayList = arrayList7;
                    dgVar = dgVar3;
                } else {
                    dgVar3.e(objA, arrayList7);
                    dgVar3.q(objA, objA, arrayList7, null, null);
                    dgVar = dgVar3;
                    obj = objA;
                    arrayList = arrayList7;
                    if (c0038do4.h == 3) {
                        c0038do4.g();
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        arrayList8.remove(bvVar.mView);
                        dgVar.h(obj, bvVar.mView, arrayList8);
                        cvs.b(viewGroup, new bf(arrayList, 0));
                    }
                }
                if (c0038do4.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z3) {
                        dgVar.i(obj, rect);
                    }
                    if (cr.Y(2)) {
                        Objects.toString(obj);
                        Iterator it4 = arrayList.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            Objects.toString((View) next);
                        }
                    }
                } else {
                    dgVar.j(obj, view2);
                    if (cr.Y(2)) {
                        Objects.toString(obj);
                        Iterator it5 = arrayList.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            Objects.toString((View) next2);
                        }
                    }
                }
                if (biVar.c) {
                    objP2 = dgVar.p(objP2, obj);
                    c0038do3 = c0038do;
                    it2 = it3;
                    z = z3;
                    objP = obj5;
                } else {
                    objP = dgVar.p(obj5, obj);
                    c0038do3 = c0038do;
                    it2 = it3;
                    z = z3;
                }
            } else {
                c0038do3 = c0038do;
            }
        }
        Object objB = this.d.b(objP2, objP, this.k);
        if (cr.Y(2)) {
            Objects.toString(objB);
            Objects.toString(viewGroup);
        }
        return new yfw(arrayList6, objB);
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = cwz.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, yjk yjkVar) {
        cz.b(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.m;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = cww.a;
            arrayList2.add(cwm.f(view));
            cwm.m(view, null);
        }
        if (cr.Y(2)) {
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                Objects.toString(view2);
                int[] iArr2 = cww.a;
                cwm.f(view2);
            }
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                Objects.toString(view3);
                int[] iArr3 = cww.a;
                cwm.f(view3);
            }
        }
        yjkVar.a();
        dg dgVar = this.d;
        ArrayList arrayList4 = this.l;
        ir irVar = this.n;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            int[] iArr4 = cww.a;
            String strF = cwm.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                cwm.m(view4, null);
                String str = (String) irVar.get(strF);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        cwm.m((View) arrayList3.get(i3), strF);
                        break;
                    }
                    i3++;
                }
            }
        }
        cvs.b(viewGroup, new ejq(size2, arrayList3, arrayList2, arrayList4, arrayList5, 1));
        cz.b(arrayList, 0);
        dgVar.l(this.k, arrayList4, arrayList3);
    }

    @Override // defpackage.dm
    public final void a(ViewGroup viewGroup) {
        this.r.a();
    }

    @Override // defpackage.dm
    public final void b(ViewGroup viewGroup) {
        int i = 0;
        if (!viewGroup.isLaidOut() || this.h) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                C0038do c0038do = ((bi) it.next()).a;
                if (cr.Y(2)) {
                    if (this.h) {
                        Objects.toString(c0038do);
                    } else {
                        Objects.toString(viewGroup);
                        Objects.toString(c0038do);
                    }
                }
                c0038do.f(this);
            }
            this.h = false;
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            this.d.t(obj);
            if (cr.Y(2)) {
                Objects.toString(this.b);
                Objects.toString(this.c);
                return;
            }
            return;
        }
        C0038do c0038do2 = this.c;
        C0038do c0038do3 = this.b;
        yfw yfwVarG = g(viewGroup, c0038do2, c0038do3);
        Object obj2 = yfwVarG.a;
        Object obj3 = yfwVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<C0038do> arrayList2 = new ArrayList(yfm.z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((bi) it2.next()).a);
        }
        for (C0038do c0038do4 : arrayList2) {
            dg dgVar = this.d;
            bv bvVar = c0038do4.a;
            dgVar.r(obj3, this.r, new be(c0038do4, this, 2));
        }
        i(arrayList, viewGroup, new bg(this, viewGroup, obj3, i));
        if (cr.Y(2)) {
            Objects.toString(c0038do3);
            Objects.toString(c0038do2);
        }
    }

    @Override // defpackage.dm
    public final void c(ViewGroup viewGroup) {
        Object obj;
        int i = 2;
        if (viewGroup.isLaidOut()) {
            if (f() && (obj = this.k) != null && !d()) {
                Objects.toString(obj);
                Objects.toString(this.b);
                Objects.toString(this.c);
            }
            if (d() && f()) {
                ylf ylfVar = new ylf();
                yfw yfwVarG = g(viewGroup, this.c, this.b);
                Object obj2 = yfwVarG.a;
                Object obj3 = yfwVarG.b;
                List list = this.a;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList<C0038do> arrayList2 = new ArrayList(yfm.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((bi) it.next()).a);
                }
                for (C0038do c0038do : arrayList2) {
                    bf bfVar = new bf(ylfVar, i);
                    dg dgVar = this.d;
                    bv bvVar = c0038do.a;
                    dgVar.z(obj3, this.r, bfVar, new be(c0038do, this, 3));
                }
                i(arrayList, viewGroup, new nz(this, viewGroup, obj3, ylfVar, 1));
            }
        } else {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                C0038do c0038do2 = ((bi) it2.next()).a;
                if (cr.Y(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(c0038do2);
                }
            }
        }
    }

    @Override // defpackage.dm
    public final boolean d() {
        Object obj;
        dg dgVar = this.d;
        if (!dgVar.n()) {
            return false;
        }
        List<bi> list = this.a;
        if (!list.isEmpty()) {
            for (bi biVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = biVar.b) == null || !dgVar.o(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.k;
        return obj2 == null || dgVar.o(obj2);
    }

    @Override // defpackage.dm
    public final void e(fd fdVar) {
        Object obj = this.g;
        if (obj != null) {
            this.d.w(obj, fdVar.b);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((bi) it.next()).a.a.mTransitioning) {
                return false;
            }
        }
        return true;
    }
}
