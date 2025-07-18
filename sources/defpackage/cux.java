package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cux implements cva {
    private final AtomicReference a;

    public cux(cva cvaVar) {
        this.a = new AtomicReference(cvaVar);
    }

    @Override // defpackage.cva
    public final Iterator a() {
        cva cvaVar = (cva) this.a.getAndSet(null);
        if (cvaVar != null) {
            return cvaVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
