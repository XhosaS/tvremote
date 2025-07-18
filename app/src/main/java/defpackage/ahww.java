package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahww extends ahxs {
    private static final ReentrantLock a;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        a = reentrantLock;
        reentrantLock.newCondition().getClass();
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public final void a() {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}
