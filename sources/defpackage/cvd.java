package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvd {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(cvd.class, "b");
    private volatile int b = 0;

    public final boolean a() {
        return this.b != 0;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
