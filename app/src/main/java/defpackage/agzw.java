package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzw {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(agzw.class, "c");
    public final ahaa b;
    public volatile int c;

    public agzw(int i, ahaa ahaaVar) {
        this.b = ahaaVar;
        this.c = i;
    }

    public final boolean a(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.b == agzz.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
