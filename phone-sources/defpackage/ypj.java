package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypj implements Executor {
    public final yot a;

    public ypj(yot yotVar) {
        this.a = yotVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        yot yotVar = this.a;
        yim yimVar = yim.a;
        if (ywv.c(yotVar, yimVar)) {
            ywv.b(yotVar, yimVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
