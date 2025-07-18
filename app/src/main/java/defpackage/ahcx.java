package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahcx extends ahcr {
    protected abstract Thread e();

    protected void i(long j, ahcu ahcuVar) {
        ahbz.a.s(j, ahcuVar);
    }

    protected final void u() {
        Thread threadE = e();
        if (Thread.currentThread() != threadE) {
            LockSupport.unpark(threadE);
        }
    }
}
