package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzo extends bzk {
    public bzo() {
        super(4);
    }

    @Override // defpackage.bzk
    public final /* synthetic */ void d(Object obj) {
        super.c(obj);
    }

    public final bzs f() {
        this.c = true;
        return bzs.l(this.a, this.b);
    }

    public final void g(Object obj) {
        super.c(obj);
    }

    public final void h(Iterable iterable) {
        super.e(iterable);
    }

    public final void i(Iterator it) {
        while (it.hasNext()) {
            super.c(it.next());
        }
    }

    public bzo(int i) {
        super(i);
    }
}
