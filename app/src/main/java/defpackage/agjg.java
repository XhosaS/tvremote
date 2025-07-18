package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class agjg extends agnq {
    private static final long serialVersionUID = -2252972430506210021L;
    Iterator a;
    volatile boolean b;
    boolean c;

    public agjg(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.aghs
    public final void b() {
        this.a = null;
    }

    public abstract void d();

    public abstract void f(long j);

    @Override // defpackage.aghs
    public final Object ff() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        aghn.b(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // defpackage.aidf
    public final void fh() {
        this.b = true;
    }

    @Override // defpackage.aidf
    public final void fi(long j) {
        if (agns.b(j) && agnv.a(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                d();
            } else {
                f(j);
            }
        }
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.aghq
    public final int i() {
        return 1;
    }
}
