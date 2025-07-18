package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnv {
    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 + j;
        } while (!atomicLong.compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
        return j2;
    }
}
