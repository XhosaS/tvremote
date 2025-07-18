package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
class cql extends FutureTask {
    final /* synthetic */ cqm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cql(cqm cqmVar, Callable callable) {
        super(callable);
        this.a = cqmVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((cqj) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new cqj(e));
        }
    }
}
