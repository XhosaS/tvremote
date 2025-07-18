package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agju extends AtomicInteger implements agfp {
    private static final long serialVersionUID = 4883307006032401862L;
    public final agfp a;
    final agnu b = new agnu();
    final agme c = new agme(16);
    volatile boolean d;

    public agju(agfp agfpVar) {
        this.a = agfpVar;
    }

    @Override // defpackage.agfk
    public final void a(Throwable th) {
        throw null;
    }

    @Override // defpackage.agfk
    public final void b(Object obj) {
        if (this.a.f()) {
            return;
        }
        int iAddAndGet = 1;
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a.b(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            agme agmeVar = this.c;
            synchronized (agmeVar) {
                agmeVar.h(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        agfp agfpVar = this.a;
        agme agmeVar2 = this.c;
        agnu agnuVar = this.b;
        while (!agfpVar.f()) {
            if (agnuVar.get() != null) {
                agmeVar2.b();
                agfpVar.a(agnx.b(agnuVar));
                return;
            }
            Object objFf = agmeVar2.ff();
            if (objFf == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                agfpVar.b(objFf);
            }
        }
        agmeVar2.b();
    }

    @Override // defpackage.agfp
    public final void c(aggx aggxVar) {
        throw null;
    }

    @Override // defpackage.agfp
    public final boolean d(Throwable th) {
        throw null;
    }

    @Override // defpackage.agfp, defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }
}
