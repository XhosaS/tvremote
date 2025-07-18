package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxz extends AbstractOwnableSynchronizer implements Runnable {
    private final zyb a;

    public zxz(zyb zybVar) {
        this.a = zybVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
