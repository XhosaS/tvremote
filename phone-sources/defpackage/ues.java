package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ues extends ugt implements Runnable {
    uhp a;
    Class b;
    Object c;

    public ues(uhp uhpVar, Class cls, Object obj) {
        uhpVar.getClass();
        this.a = uhpVar;
        this.b = cls;
        this.c = obj;
    }

    public static uhp i(uhp uhpVar, Class cls, tsl tslVar, Executor executor) {
        uer uerVar = new uer(uhpVar, cls, tslVar);
        uhpVar.c(uerVar, sfy.x(executor, uerVar));
        return uerVar;
    }

    public static uhp j(uhp uhpVar, Class cls, ufw ufwVar, Executor executor) {
        ueq ueqVar = new ueq(uhpVar, cls, ufwVar);
        uhpVar.c(ueqVar, sfy.x(executor, ueqVar));
        return ueqVar;
    }

    @Override // defpackage.ufb
    protected final void d() {
        p(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        uhp uhpVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strDw = super.dw();
        String strCh = uhpVar != null ? a.ch(uhpVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strDw != null) {
                return strCh.concat(strDw);
            }
            return null;
        }
        return strCh + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    public abstract Object g(Object obj, Throwable th);

    public abstract void h(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        uhp uhpVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((uhpVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = uhpVar instanceof uim ? ((uim) uhpVar).m() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(uhpVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objJ = th == null ? sfy.J(uhpVar) : null;
        if (th == null) {
            b(objJ);
            return;
        }
        if (!cls.isInstance(th)) {
            ev(uhpVar);
            return;
        }
        try {
            Object objG = g(obj, th);
            this.b = null;
            this.c = null;
            h(objG);
        } catch (Throwable th2) {
            try {
                sfy.t(th2);
                e(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
