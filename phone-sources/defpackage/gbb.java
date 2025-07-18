package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@yfp
/* loaded from: classes.dex */
public abstract class gbb<T> extends AbstractList<T> {
    private final gbo a;
    public final yow f;
    public final yot g;
    public final gbc h;
    public final List i;
    public final List j;
    public final tqr k;

    public gbb(gbo gboVar, yow yowVar, yot yotVar, gbc gbcVar, tqr tqrVar) {
        gboVar.getClass();
        yowVar.getClass();
        yotVar.getClass();
        tqrVar.getClass();
        this.a = gboVar;
        this.f = yowVar;
        this.g = yotVar;
        this.h = gbcVar;
        this.k = tqrVar;
        int i = tqrVar.c;
        int i2 = tqrVar.b;
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    public gbo a() {
        return this.a;
    }

    public abstract void b(int i);

    public abstract boolean c();

    public final int d() {
        return this.h.a();
    }

    public final fzi e() {
        gbo gboVarA = a();
        if (gboVarA instanceof fzr) {
            return ((fzr) gboVarA).a;
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + gboVarA.getClass().getSimpleName() + " instead of a DataSource");
    }

    public boolean f() {
        return c();
    }

    public final void g(int i) {
        if (i == 0) {
            return;
        }
        Iterator<T> it = yfm.ah(this.i).iterator();
        while (it.hasNext()) {
            gaz gazVar = (gaz) ((WeakReference) it.next()).get();
            if (gazVar != null) {
                gazVar.e();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.h.get(i);
    }

    public final void h(int i) {
        if (i == 0) {
            return;
        }
        Iterator<T> it = yfm.ah(this.i).iterator();
        while (it.hasNext()) {
            gaz gazVar = (gaz) ((WeakReference) it.next()).get();
            if (gazVar != null) {
                gazVar.f();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
