package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfv extends AbstractOwnableSynchronizer {
    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
