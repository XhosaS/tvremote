package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aiax implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ aiay b;

    public aiax(aiay aiayVar, Executor executor) {
        this.a = executor;
        this.b = aiayVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.g(e);
        }
    }
}
