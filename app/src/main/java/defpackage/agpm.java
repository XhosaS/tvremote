package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agpm implements Serializable, agpc {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(agpm.class, Object.class, "c");
    private volatile agum b;
    private volatile Object c = agpr.a;

    public agpm(agum agumVar) {
        this.b = agumVar;
    }

    private final Object writeReplace() {
        return new agpa(a());
    }

    @Override // defpackage.agpc
    public final Object a() {
        Object obj = this.c;
        agpr agprVar = agpr.a;
        if (obj != agprVar) {
            return obj;
        }
        agum agumVar = this.b;
        if (agumVar != null) {
            Object objA = agumVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, agprVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != agprVar) {
                }
            }
            this.b = null;
            return objA;
        }
        return this.c;
    }

    @Override // defpackage.agpc
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.c != agpr.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
