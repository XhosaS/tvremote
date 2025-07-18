package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmc implements aghs {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b;

    public agmc() {
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        agmb agmbVar = new agmb();
        atomicReference.lazySet(agmbVar);
        d(agmbVar);
    }

    @Override // defpackage.aghs
    public final void b() {
        while (ff() != null && !fj()) {
        }
    }

    final agmb c() {
        return (agmb) this.a.get();
    }

    final agmb d(agmb agmbVar) {
        return (agmb) this.a.getAndSet(agmbVar);
    }

    @Override // defpackage.aghs
    public final Object ff() {
        agmb agmbVar;
        AtomicReference atomicReference = this.b;
        agmb agmbVar2 = (agmb) atomicReference.get();
        agmb agmbVar3 = (agmb) agmbVar2.get();
        if (agmbVar3 != null) {
            Object obj = agmbVar3.a;
            agmbVar3.a = null;
            atomicReference.lazySet(agmbVar3);
            return obj;
        }
        if (agmbVar2 == c()) {
            return null;
        }
        do {
            agmbVar = (agmb) agmbVar2.get();
        } while (agmbVar == null);
        Object obj2 = agmbVar.a;
        agmbVar.a = null;
        atomicReference.lazySet(agmbVar);
        return obj2;
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return ((agmb) this.b.get()) == c();
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        agmb agmbVar = new agmb(obj);
        d(agmbVar).lazySet(agmbVar);
        return true;
    }
}
