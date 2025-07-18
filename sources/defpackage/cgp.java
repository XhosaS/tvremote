package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cgp extends cii implements Runnable {
    cja a;
    Class b;
    Object c;

    public cgp(cja cjaVar, Class cls, Object obj) {
        cjaVar.getClass();
        this.a = cjaVar;
        this.b = cls;
        this.c = obj;
    }

    public static cja h(cja cjaVar, Class cls, byb bybVar, Executor executor) {
        cgo cgoVar = new cgo(cjaVar, cls, bybVar);
        cjaVar.m(cgoVar, qm.E(executor, cgoVar));
        return cgoVar;
    }

    public static cja i(cja cjaVar, Class cls, cht chtVar, Executor executor) {
        cgn cgnVar = new cgn(cjaVar, cls, chtVar);
        cjaVar.m(cgnVar, qm.E(executor, cgnVar));
        return cgnVar;
    }

    @Override // defpackage.cgx
    protected final String a() {
        cja cjaVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strA = super.a();
        String strI = cjaVar != null ? b.i(cjaVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strA != null) {
                return strI.concat(strA);
            }
            return null;
        }
        return strI + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // defpackage.cgx
    protected final void b() {
        p(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object f(Object obj, Throwable th);

    public abstract void g(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        cja cjaVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((cjaVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = cjaVar instanceof cjt ? ((cjt) cjaVar).l() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(cjaVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objP = th == null ? qm.P(cjaVar) : null;
        if (th == null) {
            c(objP);
            return;
        }
        if (!cls.isInstance(th)) {
            e(cjaVar);
            return;
        }
        try {
            Object objF = f(obj, th);
            this.b = null;
            this.c = null;
            g(objF);
        } catch (Throwable th2) {
            try {
                qm.B(th2);
                d(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
