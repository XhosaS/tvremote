package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tln implements Executor {
    public final zbp a = new yxu(3);
    private final Executor b;

    public tln(Executor executor) {
        this.b = executor;
    }

    public final void a(Runnable runnable) {
        zbp zbpVar = this.a;
        synchronized (zbpVar) {
            ((yvi) zbpVar).b += -((yvi) zbpVar).a.f(runnable, yxv.b(runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        zbp zbpVar = this.a;
        synchronized (zbpVar) {
            ((yvo) zbpVar).h(runnable, 1);
        }
        this.b.execute(new Runnable() { // from class: tlm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zRemove;
                zbp zbpVar2 = this.a.a;
                Runnable runnable2 = runnable;
                synchronized (zbpVar2) {
                    zRemove = zbpVar2.remove(runnable2);
                }
                if (zRemove) {
                    runnable2.run();
                }
            }
        });
    }
}
