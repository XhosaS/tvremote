package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cve {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(cve.class, "b");
    public volatile int b = 0;
    public final dnx c;

    public cve(dnx dnxVar) {
        this.c = dnxVar;
    }

    public final boolean a(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == cvh.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
