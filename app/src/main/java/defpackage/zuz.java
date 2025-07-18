package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zuz extends zww implements Runnable {
    zyd a;
    Object b;

    public zuz(zyd zydVar, Object obj) {
        zydVar.getClass();
        this.a = zydVar;
        obj.getClass();
        this.b = obj;
    }

    public static zyd g(zyd zydVar, yqi yqiVar, Executor executor) {
        zuy zuyVar = new zuy(zydVar, yqiVar);
        zydVar.d(zuyVar, zyn.c(executor, zuyVar));
        return zuyVar;
    }

    public static zyd h(zyd zydVar, zvi zviVar, Executor executor) {
        zux zuxVar = new zux(zydVar, zviVar);
        zydVar.d(zuxVar, zyn.c(executor, zuxVar));
        return zuxVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        zyd zydVar = this.a;
        Object obj = this.b;
        String strA = super.a();
        String strT = zydVar != null ? a.t(zydVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strA != null) {
                return strT.concat(strA);
            }
            return null;
        }
        return strT + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.zum
    protected final void b() {
        n(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object e(Object obj, Object obj2);

    public abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        zyd zydVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (zydVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (zydVar.isCancelled()) {
            eZ(zydVar);
            return;
        }
        try {
            try {
                Object objE = e(obj, zxn.o(zydVar));
                this.b = null;
                f(objE);
            } catch (Throwable th) {
                try {
                    zyo.a(th);
                    q(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            q(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            q(e2.getCause());
        } catch (Exception e3) {
            q(e3);
        }
    }
}
