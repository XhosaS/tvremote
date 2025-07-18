package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvf {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(cvf.class, "b");
    public volatile long b;
    public final dnx c;

    public cvf(long j, dnx dnxVar) {
        this.c = dnxVar;
        this.b = j;
    }

    public final boolean a(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == cvh.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
