package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class chx extends ciy {
    private final Executor a;
    final /* synthetic */ chy b;

    public chx(chy chyVar, Executor executor) {
        this.b = chyVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.ciy
    public final void d(Throwable th) {
        chy chyVar = this.b;
        chyVar.b = null;
        if (th instanceof ExecutionException) {
            chyVar.d(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            chyVar.cancel(false);
        } else {
            chyVar.d(th);
        }
    }

    @Override // defpackage.ciy
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.d(e);
        }
    }

    @Override // defpackage.ciy
    public final boolean g() {
        return this.b.isDone();
    }
}
