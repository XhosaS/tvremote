package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lee implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ leo b;

    public lee(leo leoVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                leo leoVar = this.b;
                atomicReference.set(Long.valueOf(leoVar.y.d.m(leoVar.y.e().i(), kzg.ac)));
            } finally {
                this.a.notify();
            }
        }
    }
}
