package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfn extends kzl {
    final /* synthetic */ AtomicReference a;

    public lfn(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.kzm
    public final void e(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
