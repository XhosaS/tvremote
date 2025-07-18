package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxj implements agxs {
    private final AtomicReference a;

    public agxj(agxs agxsVar) {
        this.a = new AtomicReference(agxsVar);
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        agxs agxsVar = (agxs) this.a.getAndSet(null);
        if (agxsVar != null) {
            return agxsVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
