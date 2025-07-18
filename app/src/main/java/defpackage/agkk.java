package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkk extends AtomicInteger implements agfs, aggi {
    private static final long serialVersionUID = 8600231336733376951L;
    final agfs a;
    final aggz e;
    aggi g;
    volatile boolean h;
    final aggh b = new aggh();
    final agnu d = new agnu();
    final AtomicInteger c = new AtomicInteger(1);
    final AtomicReference f = new AtomicReference();

    public agkk(agfs agfsVar, aggz aggzVar) {
        this.a = agfsVar;
        this.e = aggzVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        this.c.decrementAndGet();
        g();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [agga, java.lang.Object] */
    @Override // defpackage.agfs
    public final void c(Object obj) {
        try {
            ?? A = this.e.a(obj);
            this.c.getAndIncrement();
            agkj agkjVar = new agkj(this);
            if (this.h || !this.b.a(agkjVar)) {
                return;
            }
            A.d(agkjVar);
        } catch (Throwable th) {
            aggq.a(th);
            this.g.dispose();
            fe(th);
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.g, aggiVar)) {
            this.g = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.h = true;
        this.g.dispose();
        this.b.dispose();
    }

    final void e() {
        agme agmeVar = (agme) this.f.get();
        if (agmeVar != null) {
            agmeVar.b();
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        this.c.decrementAndGet();
        if (!agnx.c(this.d, th)) {
            agoh.e(th);
        } else {
            this.b.dispose();
            g();
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    final void h() {
        int iAddAndGet = 1;
        while (!this.h) {
            agfs agfsVar = this.a;
            agnu agnuVar = this.d;
            if (((Throwable) agnuVar.get()) != null) {
                Throwable thB = agnx.b(agnuVar);
                e();
                agfsVar.fe(thB);
                return;
            }
            AtomicReference atomicReference = this.f;
            int i = this.c.get();
            agme agmeVar = (agme) atomicReference.get();
            Object objFf = agmeVar != null ? agmeVar.ff() : null;
            if (i == 0) {
                if (objFf == null) {
                    Throwable thB2 = agnx.b(agnuVar);
                    if (thB2 != null) {
                        agfsVar.fe(thB2);
                        return;
                    } else {
                        agfsVar.a();
                        return;
                    }
                }
            } else if (objFf == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            agfsVar.c(objFf);
        }
        e();
    }
}
