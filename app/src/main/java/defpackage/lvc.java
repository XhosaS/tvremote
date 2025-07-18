package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lvc implements lvg, lva, lux, lur {
    public final lve a;
    public final lvn b;
    private final Executor c;

    public lvc(Executor executor, lve lveVar, lvn lvnVar) {
        this.c = executor;
        this.a = lveVar;
        this.b = lvnVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        this.c.execute(new lvb(this, lvfVar));
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
