package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoa extends ynw {
    public final ypp b;
    private final Thread e;

    public yoa(yil yilVar, Thread thread, ypp yppVar) {
        super(yilVar, true, true);
        this.e = thread;
        this.b = yppVar;
    }

    @Override // defpackage.yql
    protected final void eR(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (yks.e(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.yql
    protected final boolean eS() {
        return true;
    }
}
