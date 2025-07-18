package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabh {
    public static final aabh a = new aabh();
    public final AtomicReference b = new AtomicReference(new aabw(new aabu()));

    public final synchronized void a(aabs aabsVar) {
        AtomicReference atomicReference = this.b;
        aabu aabuVar = new aabu((aabw) atomicReference.get());
        aabuVar.a(aabsVar);
        atomicReference.set(new aabw(aabuVar));
    }

    public final synchronized void b(aabx aabxVar) {
        AtomicReference atomicReference = this.b;
        aabu aabuVar = new aabu((aabw) atomicReference.get());
        aabuVar.b(aabxVar);
        atomicReference.set(new aabw(aabuVar));
    }
}
