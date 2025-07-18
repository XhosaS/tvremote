package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agif extends AtomicInteger implements agfm, aggi {
    private static final long serialVersionUID = 9032184911934499404L;
    final agfg a;
    int f;
    int g;
    aghs h;
    aidf i;
    volatile boolean j;
    volatile boolean k;
    final int b = 2;
    final agie d = new agie(this);
    final AtomicBoolean e = new AtomicBoolean();
    final int c = 2;

    public agif(agfg agfgVar) {
        this.a = agfgVar;
    }

    @Override // defpackage.agfm, defpackage.aide
    public final void a(aidf aidfVar) {
        if (agns.d(this.i, aidfVar)) {
            this.i = aidfVar;
            int i = this.b;
            long j = i;
            if (aidfVar instanceof aghr) {
                aghr aghrVar = (aghr) aidfVar;
                int i2 = aghrVar.i();
                if (i2 == 1) {
                    this.f = 1;
                    this.h = aghrVar;
                    this.j = true;
                    this.a.c(this);
                    b();
                    return;
                }
                if (i2 == 2) {
                    this.f = 2;
                    this.h = aghrVar;
                    this.a.c(this);
                    aidfVar.fi(j);
                    return;
                }
            }
            this.h = new agmd(i);
            this.a.c(this);
            aidfVar.fi(j);
        }
    }

    final void b() {
        if (getAndIncrement() == 0) {
            do {
                agie agieVar = this.d;
                if (aghd.b((aggi) agieVar.get())) {
                    return;
                }
                if (!this.k) {
                    boolean z = this.j;
                    try {
                        agfi agfiVar = (agfi) this.h.ff();
                        if (z) {
                            if (agfiVar == null) {
                                if (this.e.compareAndSet(false, true)) {
                                    this.a.a();
                                    return;
                                }
                                return;
                            }
                        } else if (agfiVar != null) {
                        }
                        this.k = true;
                        agfiVar.a(agieVar);
                        if (this.f != 1) {
                            int i = this.g + 1;
                            if (i == this.c) {
                                this.g = 0;
                                this.i.fi(i);
                            } else {
                                this.g = i;
                            }
                        }
                    } catch (Throwable th) {
                        aggq.a(th);
                        c(th);
                        return;
                    }
                }
            } while (decrementAndGet() != 0);
        }
    }

    final void c(Throwable th) {
        if (!this.e.compareAndSet(false, true)) {
            agoh.e(th);
        } else {
            this.i.fh();
            this.a.fg(th);
        }
    }

    @Override // defpackage.aide
    public final void d() {
        this.j = true;
        b();
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.i.fh();
        aghd.e(this.d);
    }

    @Override // defpackage.aide
    public final void e(Throwable th) {
        if (!this.e.compareAndSet(false, true)) {
            agoh.e(th);
        } else {
            aghd.e(this.d);
            this.a.fg(th);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aide
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        agfi agfiVar = (agfi) obj;
        if (this.f != 0 || this.h.h(agfiVar)) {
            b();
        } else {
            e(new aggr());
        }
    }
}
