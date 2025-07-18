package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymq implements ymw {
    private final AtomicReference a;

    public ymq(ymw ymwVar) {
        this.a = new AtomicReference(ymwVar);
    }

    @Override // defpackage.ymw
    public final Iterator a() {
        ymw ymwVar = (ymw) this.a.getAndSet(null);
        if (ymwVar != null) {
            return ymwVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
