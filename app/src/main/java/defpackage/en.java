package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class en {
    public final bq a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public en(int i, int i2, bq bqVar) {
        this.h = i;
        this.i = i2;
        this.a = bqVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (de.S(2)) {
            Log.v("FragmentManager", a.c(this, "SpecialEffectsController: ", " has called complete."));
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(ei eiVar) {
        this.k.add(eiVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (ei eiVar : agqq.x(this.g)) {
            if (!eiVar.i) {
                eiVar.a(viewGroup);
            }
            eiVar.i = true;
        }
    }

    public final void f(ei eiVar) {
        List list = this.k;
        if (list.remove(eiVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (de.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((Object) ek.a(this.i)) + " to ADDING.");
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.h != 1) {
                if (de.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) em.a(this.h)) + " -> " + ((Object) em.a(i)) + '.');
                }
                this.h = i;
                return;
            }
            return;
        }
        if (de.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) em.a(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((Object) ek.a(this.i)) + " to REMOVING.");
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) em.a(this.h)) + " lifecycleImpact = " + ((Object) ek.a(this.i)) + " fragment = " + this.a + '}';
    }
}
