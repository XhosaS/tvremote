package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybi extends ybh {
    private final AtomicIntegerFieldUpdater a;

    public ybi(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.ybh
    public final boolean a(ybk ybkVar) {
        return this.a.compareAndSet(ybkVar, 0, -1);
    }

    @Override // defpackage.ybh
    public final void b(ybk ybkVar) {
        this.a.set(ybkVar, 0);
    }
}
