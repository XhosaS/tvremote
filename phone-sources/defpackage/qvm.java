package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvm implements qvn, qvh {
    public final qth d;
    public boolean e;
    public qtn g;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Object b = new Object();
    public final Map c = new HashMap();
    public ImmutableList f = ImmutableList.of();

    public qvm(qth qthVar) {
        this.d = qthVar;
    }

    private static Object h(qtn qtnVar) {
        if (qtnVar != null) {
            return qtnVar.a;
        }
        return null;
    }

    private final void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rdd) it.next()).b(h(this.g));
        }
    }

    @Override // defpackage.qvh
    public final Object a() {
        return h(this.g);
    }

    @Override // defpackage.qvh
    public final boolean b() {
        throw null;
    }

    @Override // defpackage.qvh
    public final void c(rdd rddVar) {
        throw null;
    }

    @Override // defpackage.qvh
    public final void d(rdd rddVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList e() {
        ImmutableList immutableListBuild;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        synchronized (this.b) {
            UnmodifiableIterator it = this.f.iterator();
            while (it.hasNext()) {
                builder.add((ImmutableList.Builder) ((qtn) it.next()).a);
            }
            immutableListBuild = builder.build();
        }
        return immutableListBuild;
    }

    public final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rdd) it.next()).a();
        }
    }

    public final void g(Object obj) {
        qtn qtnVar;
        if (obj == null) {
            if (this.g != null) {
                this.g = null;
                i();
                return;
            }
            return;
        }
        qtn qtnVar2 = this.g;
        qth qthVar = this.d;
        Object obj2 = this.b;
        String strC = qthVar.c(obj);
        synchronized (obj2) {
            qtnVar = (qtn) this.c.get(strC);
        }
        sij.o(qtnVar != null, "Selected account must be an available account");
        this.g = qtnVar;
        if (qtnVar.equals(qtnVar2)) {
            return;
        }
        i();
    }
}
