package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ugi extends uhn {
    private final Executor a;
    final /* synthetic */ ugj b;

    public ugi(ugj ugjVar, Executor executor) {
        this.b = ugjVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.uhn
    public final void d(Throwable th) {
        ugj ugjVar = this.b;
        ugjVar.b = null;
        if (th instanceof ExecutionException) {
            ugjVar.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            ugjVar.cancel(false);
        } else {
            ugjVar.e(th);
        }
    }

    @Override // defpackage.uhn
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }

    @Override // defpackage.uhn
    public final boolean g() {
        return this.b.isDone();
    }
}
