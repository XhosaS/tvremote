package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldu implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ leo b;

    public ldu(leo leoVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                leo leoVar = this.b;
                atomicReference.set(Boolean.valueOf(leoVar.y.d.t(leoVar.y.e().i(), kzg.aa)));
            } finally {
                this.a.notify();
            }
        }
    }
}
