package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mft extends AtomicInteger {
    public final mfz a;
    public final long b;
    public final AtomicReference c;
    private final zyd d;

    /* JADX WARN: Illegal instructions before constructor call */
    public mft(long j, mfz mfzVar, zyd zydVar) {
        mfzVar.getClass();
        int iA = mfx.a(j);
        int i = iA + iA;
        super(i + i);
        this.a = mfzVar;
        this.d = zydVar;
        this.b = j & 8796093022207L;
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, mfu.c(i, 0, false, true, 3)));
        if (mfu.b(i)) {
            mfz mfzVar = this.a;
            if (!mfzVar.d) {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            mfzVar.e = mfzVar.c;
        }
        for (mfr mfrVar = (mfr) this.c.getAndSet(mfq.a); mfrVar != null; mfrVar = mfrVar.b) {
            LockSupport.unpark(mfrVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
