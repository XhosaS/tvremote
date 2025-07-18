package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynt {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(ynt.class, "b");
    public volatile long b;
    public final ykn c;

    public ynt(long j, ykn yknVar) {
        this.c = yknVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == ynv.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
