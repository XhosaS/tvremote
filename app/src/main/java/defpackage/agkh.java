package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkh extends AtomicInteger implements aggi, agfs {
    private static final long serialVersionUID = 8443155186132538303L;
    final agfg a;
    final aggz c;
    aggi e;
    volatile boolean f;
    final agnu b = new agnu();
    final aggh d = new aggh();

    public agkh(agfg agfgVar, aggz aggzVar) {
        this.a = agfgVar;
        this.c = aggzVar;
        lazySet(1);
    }

    @Override // defpackage.agfs
    public final void a() {
        if (decrementAndGet() == 0) {
            Throwable thB = agnx.b(this.b);
            if (thB != null) {
                this.a.fg(thB);
            } else {
                this.a.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [agfi, java.lang.Object] */
    @Override // defpackage.agfs
    public final void c(Object obj) {
        try {
            ?? A = this.c.a(obj);
            getAndIncrement();
            agkg agkgVar = new agkg(this);
            if (this.f || !this.d.a(agkgVar)) {
                return;
            }
            A.a(agkgVar);
        } catch (Throwable th) {
            aggq.a(th);
            this.e.dispose();
            fe(th);
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.e, aggiVar)) {
            this.e = aggiVar;
            this.a.c(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.f = true;
        this.e.dispose();
        this.d.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        agnu agnuVar = this.b;
        if (!agnx.c(agnuVar, th)) {
            agoh.e(th);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.a.fg(agnx.b(agnuVar));
        }
    }
}
