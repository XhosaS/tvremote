package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agir extends AtomicInteger implements agfm, aggi {
    private static final long serialVersionUID = -2108443387387077490L;
    final agfg a;
    aidf f;
    final int b = Integer.MAX_VALUE;
    final boolean c = true;
    final aggh e = new aggh();
    final agnu d = new agnu();

    public agir(agfg agfgVar) {
        this.a = agfgVar;
        lazySet(1);
    }

    @Override // defpackage.agfm, defpackage.aide
    public final void a(aidf aidfVar) {
        if (agns.d(this.f, aidfVar)) {
            this.f = aidfVar;
            this.a.c(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                aidfVar.fi(Long.MAX_VALUE);
            } else {
                aidfVar.fi(i);
            }
        }
    }

    @Override // defpackage.aide
    public final void d() {
        if (decrementAndGet() == 0) {
            agnu agnuVar = this.d;
            if (((Throwable) agnuVar.get()) != null) {
                this.a.fg(agnx.b(agnuVar));
            } else {
                this.a.a();
            }
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.f.fh();
        this.e.dispose();
    }

    @Override // defpackage.aide
    public final void e(Throwable th) {
        if (this.c) {
            agnu agnuVar = this.d;
            if (!agnx.c(agnuVar, th)) {
                agoh.e(th);
                return;
            } else {
                if (decrementAndGet() == 0) {
                    this.a.fg(agnx.b(agnuVar));
                    return;
                }
                return;
            }
        }
        this.e.dispose();
        agnu agnuVar2 = this.d;
        if (!agnx.c(agnuVar2, th)) {
            agoh.e(th);
        } else if (getAndSet(0) > 0) {
            this.a.fg(agnx.b(agnuVar2));
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aide
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        getAndIncrement();
        agiq agiqVar = new agiq(this);
        this.e.a(agiqVar);
        ((agfi) obj).a(agiqVar);
    }
}
