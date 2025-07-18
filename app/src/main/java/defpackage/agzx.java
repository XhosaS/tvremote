package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzx {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(agzx.class, "c");
    public final ahaa b;
    public volatile long c;

    public agzx(long j, ahaa ahaaVar) {
        this.b = ahaaVar;
        this.c = j;
    }

    public final boolean a(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.b == agzz.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
