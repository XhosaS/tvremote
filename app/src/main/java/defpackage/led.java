package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class led implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ leo b;

    public led(leo leoVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                leo leoVar = this.b;
                atomicReference.set(leoVar.y.d.r(leoVar.y.e().i(), kzg.ab));
            } finally {
                this.a.notify();
            }
        }
    }
}
