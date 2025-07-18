package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blt {
    public final ReentrantLock a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public boolean d;

    public blt(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final boolean a(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.d = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
