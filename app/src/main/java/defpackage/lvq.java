package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvq {
    @Deprecated
    public static lvf a(Executor executor, Callable callable) {
        kkk.l(executor, "Executor must not be null");
        lvn lvnVar = new lvn();
        executor.execute(new lvo(lvnVar, callable));
        return lvnVar;
    }

    public static lvf b(Exception exc) {
        lvn lvnVar = new lvn();
        lvnVar.o(exc);
        return lvnVar;
    }

    public static lvf c(Object obj) {
        lvn lvnVar = new lvn();
        lvnVar.p(obj);
        return lvnVar;
    }

    public static Object d(lvf lvfVar) {
        kkk.e("Must not be called on the main application thread");
        kkk.j();
        if (lvfVar.h()) {
            return f(lvfVar);
        }
        lvp lvpVar = new lvp();
        g(lvfVar, lvpVar);
        lvpVar.a.await();
        return f(lvfVar);
    }

    public static Object e(lvf lvfVar, long j, TimeUnit timeUnit) throws TimeoutException {
        kkk.e("Must not be called on the main application thread");
        kkk.j();
        kkk.l(timeUnit, "TimeUnit must not be null");
        if (lvfVar.h()) {
            return f(lvfVar);
        }
        lvp lvpVar = new lvp();
        g(lvfVar, lvpVar);
        if (lvpVar.a.await(j, timeUnit)) {
            return f(lvfVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object f(lvf lvfVar) throws ExecutionException {
        if (lvfVar.i()) {
            return lvfVar.e();
        }
        if (lvfVar.g()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lvfVar.d());
    }

    private static void g(lvf lvfVar, lvp lvpVar) {
        Executor executor = lvm.b;
        lvfVar.n(executor, lvpVar);
        lvfVar.m(executor, lvpVar);
        lvfVar.j(executor, lvpVar);
    }
}
