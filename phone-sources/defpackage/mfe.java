package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfe {
    public volatile int a;
    private idy b;
    private final iej c;
    private boolean d;
    private final List e;

    public mfe(iej iejVar, boolean z) {
        icw icwVar = icz.a;
        this.b = icwVar;
        this.e = new ArrayList();
        this.c = iejVar;
        if (z) {
            this.b = a(icwVar);
        }
    }

    public final synchronized idy a(idy idyVar) {
        if (this.d) {
            return idyVar;
        }
        mfd mfdVar = new mfd(this, idyVar);
        this.e.add(mfdVar);
        return mfdVar;
    }

    public final synchronized idy b(idy idyVar) {
        return krh.b(a(idyVar));
    }

    public final synchronized void c() {
        this.b.c(new Object());
        this.b = icz.a;
    }

    public final synchronized void d() {
        if (!this.d) {
            int i = this.a - 1;
            this.a = i;
            if (i <= 0) {
                this.c.dM();
            }
        }
    }

    public final synchronized void e() {
        List list = this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((mfb) it.next()).a();
        }
        list.clear();
        this.d = true;
    }
}
