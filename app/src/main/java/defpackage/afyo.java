package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyo extends afyn {
    private final AtomicIntegerFieldUpdater a;

    public afyo(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.afyn
    public final boolean a(afyq afyqVar) {
        return this.a.compareAndSet(afyqVar, 0, -1);
    }

    @Override // defpackage.afyn
    public final void b(afyq afyqVar) {
        this.a.set(afyqVar, 0);
    }
}
