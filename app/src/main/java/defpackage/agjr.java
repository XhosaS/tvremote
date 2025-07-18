package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjr extends AtomicInteger implements aggi {
    private static final long serialVersionUID = 8567835998786448817L;
    final agfs a;
    final aggz b;
    final agjq[] c;
    Object[] d;
    final agme e;
    volatile boolean f;
    volatile boolean g;
    final agnu h = new agnu();
    int i;
    int j;

    public agjr(agfs agfsVar, aggz aggzVar, int i, int i2) {
        this.a = agfsVar;
        this.b = aggzVar;
        this.d = new Object[i];
        agjq[] agjqVarArr = new agjq[i];
        for (int i3 = 0; i3 < i; i3++) {
            agjqVarArr[i3] = new agjq(this, i3);
        }
        this.c = agjqVarArr;
        this.e = new agme(i2);
    }

    final void a() {
        for (agjq agjqVar : this.c) {
            aghd.e(agjqVar);
        }
    }

    final void b(agme agmeVar) {
        synchronized (this) {
            this.d = null;
        }
        agmeVar.b();
    }

    final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        agme agmeVar = this.e;
        agfs agfsVar = this.a;
        int iAddAndGet = 1;
        while (!this.f) {
            if (this.h.get() != null) {
                a();
                b(agmeVar);
                agfsVar.fe(agnx.b(this.h));
                return;
            }
            boolean z = this.g;
            Object[] objArr = (Object[]) agmeVar.ff();
            try {
                if (z) {
                    if (objArr == null) {
                        b(agmeVar);
                        Throwable thB = agnx.b(this.h);
                        if (thB == null) {
                            agfsVar.a();
                            return;
                        } else {
                            agfsVar.fe(thB);
                            return;
                        }
                    }
                } else if (objArr == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                agfsVar.c(((mwk) this.b).a(objArr));
            } catch (Throwable th) {
                aggq.a(th);
                agnu agnuVar = this.h;
                agnx.c(agnuVar, th);
                a();
                b(agmeVar);
                agfsVar.fe(agnx.b(agnuVar));
                return;
            }
        }
        b(agmeVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.e);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
