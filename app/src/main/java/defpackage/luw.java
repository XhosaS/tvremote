package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class luw implements lvg {
    public final Object a = new Object();
    public final lux b;
    private final Executor c;

    public luw(Executor executor, lux luxVar) {
        this.c = executor;
        this.b = luxVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        if (lvfVar.i() || ((lvn) lvfVar).a) {
            return;
        }
        synchronized (this.a) {
        }
        this.c.execute(new luv(this, lvfVar));
    }
}
