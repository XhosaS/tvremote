package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lef implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ leo b;

    public lef(leo leoVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                leo leoVar = this.b;
                atomicReference.set(Integer.valueOf(leoVar.y.d.h(leoVar.y.e().i(), kzg.ad)));
            } finally {
                this.a.notify();
            }
        }
    }
}
