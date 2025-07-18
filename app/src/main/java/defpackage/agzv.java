package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzv {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(agzv.class, "a");
    public volatile int a;
    private final ahaa c;

    public agzv(boolean z, ahaa ahaaVar) {
        this.c = ahaaVar;
        this.a = z ? 1 : 0;
    }

    public final boolean a(boolean z) {
        return b.getAndSet(this, z ? 1 : 0) == 1;
    }

    public final boolean b() {
        return this.a != 0;
    }

    public final boolean c() {
        boolean zCompareAndSet = b.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.c == agzz.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
