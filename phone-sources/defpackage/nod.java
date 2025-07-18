package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nod extends nms {
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    private int d = b;
    private static final nsf c = new nsf("AppVisibilityProxy");
    static final int b = 1;

    @Override // defpackage.nmt
    public final odd a() {
        return new odc(this);
    }

    @Override // defpackage.nmt
    public final void b() {
        c.a("onAppEnteredBackground", new Object[0]);
        this.d = 2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((noc) it.next()).a();
        }
    }

    @Override // defpackage.nmt
    public final void c() {
        c.a("onAppEnteredForeground", new Object[0]);
        this.d = 1;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((noc) it.next()).b();
        }
    }

    public final void d(noc nocVar) {
        this.a.add(nocVar);
    }

    public final boolean e() {
        return this.d == 2;
    }
}
