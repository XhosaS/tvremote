package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class luz implements lvg {
    public final Object a = new Object();
    public final lva b;
    private final Executor c;

    public luz(Executor executor, lva lvaVar) {
        this.c = executor;
        this.b = lvaVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        if (lvfVar.i()) {
            synchronized (this.a) {
            }
            this.c.execute(new luy(this, lvfVar));
        }
    }
}
