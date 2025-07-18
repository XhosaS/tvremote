package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class be {
    public final q a;
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

    public be(int i, int i2, q qVar) {
        this.h = i;
        this.i = i2;
        this.a = qVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (am.S(2)) {
            Log.v("FragmentManager", b.b(this, "SpecialEffectsController: ", " has called complete."));
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

    public final void d(bc bcVar) {
        this.k.add(bcVar);
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
        for (bc bcVar : dnx.aM(this.g)) {
            if (!bcVar.c) {
                bcVar.a(viewGroup);
            }
            bcVar.c = true;
        }
    }

    public final void f(bc bcVar) {
        List list = this.k;
        if (list.remove(bcVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (am.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((Object) ii.T(this.i)) + " to ADDING.");
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
                if (am.S(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ii.P(this.h)) + " -> " + ((Object) ii.P(i)) + '.');
                }
                this.h = i;
                return;
            }
            return;
        }
        if (am.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ii.P(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((Object) ii.T(this.i)) + " to REMOVING.");
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) ii.P(this.h)) + " lifecycleImpact = " + ((Object) ii.T(this.i)) + " fragment = " + this.a + '}';
    }
}
