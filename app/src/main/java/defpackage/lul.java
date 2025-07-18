package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class lul implements lvg {
    public final luj a;
    public final lvn b;
    private final Executor c;

    public lul(Executor executor, luj lujVar, lvn lvnVar) {
        this.c = executor;
        this.a = lujVar;
        this.b = lvnVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        this.c.execute(new luk(this, lvfVar));
    }
}
