package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zwi extends zyb {
    private final Executor a;
    final /* synthetic */ zwj b;

    public zwi(zwj zwjVar, Executor executor) {
        this.b = zwjVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.zyb
    public final void d(Throwable th) {
        zwj zwjVar = this.b;
        zwjVar.c = null;
        if (th instanceof ExecutionException) {
            zwjVar.q(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zwjVar.cancel(false);
        } else {
            zwjVar.q(th);
        }
    }

    @Override // defpackage.zyb
    public final void e(Object obj) {
        this.b.c = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.q(e);
        }
    }

    @Override // defpackage.zyb
    public final boolean g() {
        return this.b.isDone();
    }
}
