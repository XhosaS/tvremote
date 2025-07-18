package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgi extends zhq {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static zgi f;
    public int g;
    public zgi h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        c = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long c(long j) {
        return this.i - j;
    }

    protected IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        zgi zgiVar;
        long j = this.k;
        boolean zG = g();
        if (j == 0) {
            if (!zG) {
                return;
            } else {
                j = 0;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g != 0) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.g = 1;
            if (f == null) {
                f = new zgi();
                new zgf().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && zG) {
                this.i = Math.min(j, h() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                this.i = j + jNanoTime;
            } else {
                if (!zG) {
                    throw new AssertionError();
                }
                this.i = h();
            }
            long jC = c(jNanoTime);
            zgi zgiVar2 = f;
            zgiVar2.getClass();
            while (true) {
                zgiVar = zgiVar2.h;
                if (zgiVar == null || jC < zgiVar.c(jNanoTime)) {
                    break;
                } else {
                    zgiVar2 = zgiVar;
                }
            }
            this.h = zgiVar;
            zgiVar2.h = this;
            if (zgiVar2 == f) {
                c.signal();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            this.g = 0;
            if (i != 1) {
                return i == 2;
            }
            zgi zgiVar = f;
            while (zgiVar != null) {
                zgi zgiVar2 = zgiVar.h;
                if (zgiVar2 == this) {
                    zgiVar.h = this.h;
                    this.h = null;
                    return false;
                }
                zgiVar = zgiVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
