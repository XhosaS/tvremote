package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ay extends ei {
    public final List a;
    public final en b;
    public final en c;
    public final dy d;
    public final we e;
    public Object f;
    public boolean g;
    private final Object j;
    private final ArrayList k;
    private final ArrayList l;
    private final we m;
    private final ArrayList n;
    private final ArrayList o;
    private final we p;
    private final adp q = new adp();

    public ay(List list, en enVar, en enVar2, dy dyVar, Object obj, ArrayList arrayList, ArrayList arrayList2, we weVar, ArrayList arrayList3, ArrayList arrayList4, we weVar2, we weVar3) {
        this.a = list;
        this.b = enVar;
        this.c = enVar2;
        this.d = dyVar;
        this.j = obj;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = weVar;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = weVar2;
        this.e = weVar3;
    }

    public static final void f(agwh agwhVar) {
        agum agumVar = (agum) agwhVar.a;
        if (agumVar != null) {
            agumVar.a();
        }
    }

    private final agpi h(ViewGroup viewGroup, en enVar, en enVar2) {
        dy dyVar;
        final ArrayList arrayList;
        Object obj;
        en enVar3 = enVar;
        View view = new View(viewGroup.getContext());
        final Rect rect = new Rect();
        List list = this.a;
        Iterator it = list.iterator();
        boolean z = false;
        View view2 = null;
        while (it.hasNext()) {
            if (((az) it.next()).c() && enVar2 != null && enVar3 != null && !this.m.isEmpty() && (obj = this.j) != null) {
                we weVar = this.p;
                dy dyVar2 = dq.a;
                agm.b(viewGroup, new Runnable() { // from class: ap
                    @Override // java.lang.Runnable
                    public final void run() {
                        dy dyVar3 = dq.a;
                    }
                });
                ArrayList arrayList2 = this.k;
                arrayList2.addAll(weVar.values());
                ArrayList arrayList3 = this.o;
                if (!arrayList3.isEmpty()) {
                    Object obj2 = arrayList3.get(0);
                    obj2.getClass();
                    view2 = (View) weVar.get((String) obj2);
                    this.d.i(obj, view2);
                }
                ArrayList arrayList4 = this.l;
                we weVar2 = this.e;
                arrayList4.addAll(weVar2.values());
                ArrayList arrayList5 = this.n;
                if (!arrayList5.isEmpty()) {
                    Object obj3 = arrayList5.get(0);
                    obj3.getClass();
                    final View view3 = (View) weVar2.get((String) obj3);
                    if (view3 != null) {
                        final dy dyVar3 = this.d;
                        agm.b(viewGroup, new Runnable() { // from class: aq
                            @Override // java.lang.Runnable
                            public final void run() {
                                dyVar3.w(view3, rect);
                            }
                        });
                        z = true;
                    }
                }
                dy dyVar4 = this.d;
                dyVar4.j(obj, view, arrayList2);
                dyVar4.p(obj, null, null, obj, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        Object objO = null;
        while (it2.hasNext()) {
            az azVar = (az) it2.next();
            en enVar4 = azVar.a;
            dy dyVar5 = this.d;
            Object objA = dyVar5.a(azVar.b);
            if (objA != null) {
                Iterator it3 = it2;
                ArrayList arrayList7 = new ArrayList();
                boolean z2 = z;
                bq bqVar = enVar4.a;
                Object obj4 = objO;
                View view4 = bqVar.R;
                view4.getClass();
                i(arrayList7, view4);
                if (this.j != null && (enVar4 == enVar2 || enVar4 == enVar3)) {
                    if (enVar4 == enVar2) {
                        arrayList7.removeAll(agqq.A(this.k));
                    } else {
                        arrayList7.removeAll(agqq.A(this.l));
                    }
                }
                if (arrayList7.isEmpty()) {
                    dyVar5.c(objA, view);
                    arrayList = arrayList7;
                    dyVar = dyVar5;
                } else {
                    dyVar5.d(objA, arrayList7);
                    dyVar5.p(objA, objA, arrayList7, null, null);
                    dyVar = dyVar5;
                    arrayList = arrayList7;
                    if (enVar4.h == 3) {
                        enVar4.f = false;
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        arrayList8.remove(bqVar.R);
                        dyVar.g(objA, bqVar.R, arrayList8);
                        agm.b(viewGroup, new Runnable() { // from class: ar
                            @Override // java.lang.Runnable
                            public final void run() {
                                dq.b(arrayList, 4);
                            }
                        });
                    }
                }
                if (enVar4.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z2) {
                        dyVar.h(objA, rect);
                    }
                    if (de.S(2)) {
                        Objects.toString(objA);
                        Log.v("FragmentManager", "Entering Transition: ".concat(objA.toString()));
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        Iterator it4 = arrayList.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            View view5 = (View) next;
                            Objects.toString(view5);
                            Log.v("FragmentManager", "View: ".concat(view5.toString()));
                        }
                    }
                } else {
                    dyVar.i(objA, view2);
                    if (de.S(2)) {
                        Objects.toString(objA);
                        Log.v("FragmentManager", "Exiting Transition: ".concat(objA.toString()));
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        Iterator it5 = arrayList.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            View view6 = (View) next2;
                            Objects.toString(view6);
                            Log.v("FragmentManager", "View: ".concat(view6.toString()));
                        }
                    }
                }
                boolean z3 = azVar.c;
                objO = dyVar.o(obj4, objA);
                enVar3 = enVar;
                it2 = it3;
                z = z2;
            } else {
                enVar3 = enVar;
            }
        }
        Object objR = this.d.r(objO, this.j);
        if (de.S(2)) {
            Log.v("FragmentManager", a.d(viewGroup, objR, "Final merged transition: ", " for container "));
        }
        return new agpi(arrayList6, objR);
    }

    private final void i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = ahn.a;
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
                i(arrayList, childAt);
            }
        }
    }

    private final void j(ArrayList arrayList, ViewGroup viewGroup, agum agumVar) {
        dq.b(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.l;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = ahj.a;
            arrayList2.add(ahc.f(view));
            ahc.l(view, null);
        }
        if (de.S(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                int[] iArr2 = ahj.a;
                sb.append(ahc.f(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                int[] iArr3 = ahj.a;
                sb2.append(ahc.f(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        agumVar.a();
        dy dyVar = this.d;
        ArrayList arrayList4 = this.k;
        we weVar = this.m;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            int[] iArr4 = ahj.a;
            String strF = ahc.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                ahc.l(view4, null);
                String str = (String) weVar.get(strF);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        ahc.l((View) arrayList3.get(i3), strF);
                        break;
                    }
                    i3++;
                }
            }
        }
        agm.b(viewGroup, new dx(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        dq.b(arrayList, 0);
        dyVar.k(this.j, arrayList4, arrayList3);
    }

    @Override // defpackage.ei
    public final void a(ViewGroup viewGroup) {
        this.q.a();
    }

    @Override // defpackage.ei
    public final void b(final ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut() || this.g) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                en enVar = ((az) it.next()).a;
                if (de.S(2)) {
                    if (this.g) {
                        Objects.toString(enVar);
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation ".concat(enVar.toString()));
                    } else {
                        Log.v("FragmentManager", a.d(enVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                    }
                }
                enVar.f(this);
            }
            this.g = false;
            return;
        }
        Object obj = this.f;
        if (obj != null) {
            this.d.t(obj);
            if (de.S(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + this.b + " to " + this.c);
                return;
            }
            return;
        }
        en enVar2 = this.c;
        en enVar3 = this.b;
        agpi agpiVarH = h(viewGroup, enVar2, enVar3);
        Object obj2 = agpiVarH.a;
        final Object obj3 = agpiVarH.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<en> arrayList2 = new ArrayList(agqq.i(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((az) it2.next()).a);
        }
        for (final en enVar4 : arrayList2) {
            dy dyVar = this.d;
            bq bqVar = enVar4.a;
            dyVar.q(obj3, this.q, new Runnable() { // from class: as
                @Override // java.lang.Runnable
                public final void run() {
                    en enVar5 = enVar4;
                    if (de.S(2)) {
                        Log.v("FragmentManager", a.c(enVar5, "Transition for operation ", " has completed"));
                    }
                    enVar5.f(this);
                }
            });
        }
        j(arrayList, viewGroup, new agum() { // from class: at
            @Override // defpackage.agum
            public final Object a() {
                this.a.d.e(viewGroup, obj3);
                return agpu.a;
            }
        });
        if (de.S(2)) {
            Log.v("FragmentManager", a.d(enVar2, enVar3, "Completed executing operations from ", " to "));
        }
    }

    @Override // defpackage.ei
    public final void c(final ViewGroup viewGroup) {
        Object obj;
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                en enVar = ((az) it.next()).a;
                if (de.S(2)) {
                    Log.v("FragmentManager", a.d(enVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (g() && (obj = this.j) != null && !d()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (d() && g()) {
            final agwh agwhVar = new agwh();
            agpi agpiVarH = h(viewGroup, this.c, this.b);
            Object obj2 = agpiVarH.a;
            final Object obj3 = agpiVarH.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList<en> arrayList2 = new ArrayList(agqq.i(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((az) it2.next()).a);
            }
            for (final en enVar2 : arrayList2) {
                au auVar = new au(agwhVar);
                dy dyVar = this.d;
                bq bqVar = enVar2.a;
                dyVar.z(obj3, this.q, auVar, new Runnable() { // from class: av
                    @Override // java.lang.Runnable
                    public final void run() {
                        en enVar3 = enVar2;
                        if (de.S(2)) {
                            Log.v("FragmentManager", a.c(enVar3, "Transition for operation ", " has completed"));
                        }
                        enVar3.f(this);
                    }
                });
            }
            j(arrayList, viewGroup, new agum() { // from class: aw
                @Override // defpackage.agum
                public final Object a() {
                    if (de.S(2)) {
                        Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                    }
                    final Object obj4 = obj3;
                    final ViewGroup viewGroup2 = viewGroup;
                    final ay ayVar = this.a;
                    ayVar.f = ayVar.d.s(viewGroup2, obj4);
                    if (ayVar.f == null) {
                        if (de.S(2)) {
                            Log.v("FragmentManager", "TransitionSeekController was not created.");
                        }
                        ayVar.g = true;
                        return agpu.a;
                    }
                    agwhVar.a = new agum() { // from class: an
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
                        @Override // defpackage.agum
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object a() {
                            /*
                                r6 = this;
                                ay r0 = r1
                                java.util.List r1 = r0.a
                                boolean r2 = r1.isEmpty()
                                java.lang.String r3 = "FragmentManager"
                                r4 = 2
                                if (r2 == 0) goto Le
                                goto L4d
                            Le:
                                java.util.Iterator r2 = r1.iterator()
                            L12:
                                boolean r5 = r2.hasNext()
                                if (r5 == 0) goto L4d
                                java.lang.Object r5 = r2.next()
                                az r5 = (defpackage.az) r5
                                en r5 = r5.a
                                boolean r5 = r5.d
                                if (r5 != 0) goto L12
                                boolean r2 = defpackage.de.S(r4)
                                if (r2 == 0) goto L2f
                                java.lang.String r2 = "Completing animating immediately"
                                android.util.Log.v(r3, r2)
                            L2f:
                                java.lang.Object r2 = r2
                                adp r3 = new adp
                                r3.<init>()
                                dy r4 = r0.d
                                r5 = 0
                                java.lang.Object r1 = r1.get(r5)
                                az r1 = (defpackage.az) r1
                                en r1 = r1.a
                                ao r1 = new ao
                                r1.<init>()
                                r4.q(r2, r3, r1)
                                r3.a()
                                goto L69
                            L4d:
                                boolean r1 = defpackage.de.S(r4)
                                if (r1 == 0) goto L58
                                java.lang.String r1 = "Animating to start"
                                android.util.Log.v(r3, r1)
                            L58:
                                android.view.ViewGroup r1 = r3
                                dy r2 = r0.d
                                java.lang.Object r3 = r0.f
                                r3.getClass()
                                ax r4 = new ax
                                r4.<init>()
                                r2.u(r3, r4)
                            L69:
                                agpu r0 = defpackage.agpu.a
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.an.a():java.lang.Object");
                        }
                    };
                    if (de.S(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + ayVar.b + " to " + ayVar.c);
                    }
                    return agpu.a;
                }
            });
        }
    }

    @Override // defpackage.ei
    public final boolean d() {
        Object obj;
        dy dyVar = this.d;
        if (!dyVar.m()) {
            return false;
        }
        List<az> list = this.a;
        if (!list.isEmpty()) {
            for (az azVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = azVar.b) == null || !dyVar.n(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.j;
        return obj2 == null || dyVar.n(obj2);
    }

    @Override // defpackage.ei
    public final void e(ta taVar) {
        Object obj = this.f;
        if (obj != null) {
            this.d.x(obj, taVar.a);
        }
    }

    public final boolean g() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((az) it.next()).a.a.u) {
                return false;
            }
        }
        return true;
    }
}
