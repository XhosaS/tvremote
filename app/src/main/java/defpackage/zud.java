package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zud extends zww implements Runnable {
    zyd a;
    Class b;
    Object c;

    public zud(zyd zydVar, Class cls, Object obj) {
        zydVar.getClass();
        this.a = zydVar;
        this.b = cls;
        this.c = obj;
    }

    public static zyd g(zyd zydVar, Class cls, yqi yqiVar, Executor executor) {
        zuc zucVar = new zuc(zydVar, cls, yqiVar);
        zydVar.d(zucVar, zyn.c(executor, zucVar));
        return zucVar;
    }

    public static zyd h(zyd zydVar, Class cls, zvi zviVar, Executor executor) {
        zub zubVar = new zub(zydVar, cls, zviVar);
        zydVar.d(zubVar, zyn.c(executor, zubVar));
        return zubVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        zyd zydVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strA = super.a();
        String strT = zydVar != null ? a.t(zydVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strA != null) {
                return strT.concat(strA);
            }
            return null;
        }
        return strT + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // defpackage.zum
    protected final void b() {
        n(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object e(Object obj, Throwable th);

    public abstract void f(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zyd zydVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((zydVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = zydVar instanceof zzf ? ((zzf) zydVar).k() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(zydVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objO = th == null ? zxn.o(zydVar) : null;
        if (th == null) {
            p(objO);
            return;
        }
        if (!cls.isInstance(th)) {
            eZ(zydVar);
            return;
        }
        try {
            Object objE = e(obj, th);
            this.b = null;
            this.c = null;
            f(objE);
        } catch (Throwable th2) {
            try {
                zyo.a(th2);
                q(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
