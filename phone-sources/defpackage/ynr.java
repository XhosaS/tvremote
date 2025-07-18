package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynr {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ynr.class, "c");
    public final ykn b;
    private volatile int c;

    public ynr(boolean z, ykn yknVar) {
        this.b = yknVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = a.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.b == ynv.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        this.c = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
