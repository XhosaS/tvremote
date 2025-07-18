package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cix extends AbstractOwnableSynchronizer implements Runnable {
    private final ciy a;

    public cix(ciy ciyVar) {
        this.a = ciyVar;
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
