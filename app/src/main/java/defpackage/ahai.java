package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahai extends ahab {
    public final ahcr b;
    private final Thread e;

    public ahai(agte agteVar, Thread thread, ahcr ahcrVar) {
        super(agteVar, true);
        this.e = thread;
        this.b = ahcrVar;
    }

    @Override // defpackage.ahdv
    protected final void f(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (agvy.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.ahdv
    protected final boolean fC() {
        return true;
    }
}
