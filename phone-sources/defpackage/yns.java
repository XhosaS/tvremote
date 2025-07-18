package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yns {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(yns.class, "b");
    public volatile int b;
    public final ykn c;

    public yns(int i, ykn yknVar) {
        this.c = yknVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.getAndIncrement(this);
    }

    public final int c() {
        return a.incrementAndGet(this);
    }

    public final boolean d(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == ynv.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
