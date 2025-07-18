package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcc extends FutureTask {
    final /* synthetic */ hcd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcc(hcd hcdVar, Callable callable) {
        super(callable);
        this.a = hcdVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((hcb) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new hcb(e));
        }
    }
}
