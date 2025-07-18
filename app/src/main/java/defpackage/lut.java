package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lut implements lvg {
    public final Object a = new Object();
    public final luu b;
    private final Executor c;

    public lut(Executor executor, luu luuVar) {
        this.c = executor;
        this.b = luuVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        synchronized (this.a) {
        }
        this.c.execute(new lus(this, lvfVar));
    }
}
