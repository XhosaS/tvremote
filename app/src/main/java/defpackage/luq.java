package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class luq implements lvg {
    public final Object a = new Object();
    public final lur b;
    private final Executor c;

    public luq(Executor executor, lur lurVar) {
        this.c = executor;
        this.b = lurVar;
    }

    @Override // defpackage.lvg
    public final void a(lvf lvfVar) {
        if (((lvn) lvfVar).a) {
            synchronized (this.a) {
            }
            new lup(this).run();
        }
    }
}
