package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfz {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public /* synthetic */ mfz(Thread thread, int i, boolean z, int i2, boolean z2, int i3) {
        thread.getClass();
        this.a = thread;
        this.b = (i3 & 2) != 0 ? -1 : i;
        boolean z3 = (i3 & 16) != 0;
        this.c = z3;
        this.g = ((i3 & 32) == 0) & z2;
        this.d = !z3;
        this.f = new AtomicLong(mga.a(z, false, false, (i3 & 8) != 0 ? -21 : i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (mfy.d(j)) {
            boolean zInterrupted = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!mfy.c(this.f.get())) {
                        break;
                    } else {
                        zInterrupted |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (zInterrupted) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) throws SecurityException, IllegalArgumentException {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            int iA = mfy.a(j);
            if (!mfy.d(j)) {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + mfy.e(j) + ", setting=" + mfy.d(j) + ", pool=" + mfy.b(j, 2) + ", local=" + mfy.b(j, 1) + ", inherited=" + mfy.b(j, 0) + "}") + " " + Long.toBinaryString(j));
            }
            if (!mfy.e(j)) {
                int iA2 = mff.a(iA);
                if (iA2 != mff.a(i)) {
                    this.a.setPriority(iA2);
                }
            } else if (iA != i) {
                Process.setThreadPriority(this.b, iA);
                i = iA;
            }
        } while (!atomicLong.compareAndSet(j, mfy.f(j, false, false, false, 0, 0, 0L, 121)));
        if (mfy.c(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() throws SecurityException, IllegalArgumentException {
        long j;
        boolean z;
        while (true) {
            AtomicLong atomicLong = this.f;
            j = atomicLong.get();
            boolean zD = mfy.d(j);
            z = this.g;
            long jF = mfy.f(j, false, false, zD & (!z), 0, -21, (8796093022207L & j) + 1, 27);
            if (mfy.d(j)) {
                if (atomicLong.compareAndSet(j, jF)) {
                    break;
                }
            } else if (mfy.a(j) == mfy.a(jF)) {
                if (atomicLong.compareAndSet(j, jF)) {
                    break;
                }
            } else if (atomicLong.compareAndSet(j, mfy.f(jF, false, true, false, 0, 0, 0L, 125))) {
                a(mfy.a(j));
                break;
            }
        }
        if (z) {
            return;
        }
        e(j);
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, mfy.f(j, false, false, mfy.d(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            if (!mfy.c(j)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, mfy.f(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + " " + this.b;
    }
}
