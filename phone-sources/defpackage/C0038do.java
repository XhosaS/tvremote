package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0038do {
    public final bv a;
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

    public C0038do(int i, int i2, bv bvVar) {
        this.h = i;
        this.i = i2;
        this.a = bvVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (cr.Y(2)) {
            toString();
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

    public final void d(dm dmVar) {
        this.k.add(dmVar);
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
        for (dm dmVar : yfm.al(this.g)) {
            if (!dmVar.j) {
                dmVar.a(viewGroup);
            }
            dmVar.j = true;
        }
    }

    public final void f(dm dmVar) {
        List list = this.k;
        if (list.remove(dmVar) && list.isEmpty()) {
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
                if (cr.Y(2)) {
                    Objects.toString(this.a);
                    Objects.toString(a.bA(this.i));
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
                if (cr.Y(2)) {
                    Objects.toString(this.a);
                    Objects.toString(fh.d(this.h));
                    Objects.toString(fh.d(i));
                }
                this.h = i;
                return;
            }
            return;
        }
        if (cr.Y(2)) {
            Objects.toString(this.a);
            Objects.toString(fh.d(this.h));
            Objects.toString(a.bA(this.i));
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) fh.d(this.h)) + " lifecycleImpact = " + ((Object) a.bA(this.i)) + " fragment = " + this.a + '}';
    }
}
