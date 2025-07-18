package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lun implements lvg, lva, lux, lur {
    public final luj a;
    public final lvn b;
    private final Executor c;

    public lun(Executor executor, luj lujVar, lvn lvnVar) {
        this.c = executor;
        this.a = lujVar;
        this.b = lvnVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        this.c.execute(new lum(this, lvfVar));
    }

    @Override // defpackage.lur
    public final void b() {
        this.b.r();
    }

    @Override // defpackage.lux
    public final void c(Exception exc) {
        this.b.o(exc);
    }

    @Override // defpackage.lva
    public final void d(Object obj) {
        this.b.p(obj);
    }
}
