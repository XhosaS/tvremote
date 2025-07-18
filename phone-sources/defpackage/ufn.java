package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufn extends ugt implements Runnable {
    uhp a;
    Object b;

    public ufn(uhp uhpVar, Object obj) {
        uhpVar.getClass();
        this.a = uhpVar;
        obj.getClass();
        this.b = obj;
    }

    public static uhp i(uhp uhpVar, tsl tslVar, Executor executor) {
        ufm ufmVar = new ufm(uhpVar, tslVar);
        uhpVar.c(ufmVar, sfy.x(executor, ufmVar));
        return ufmVar;
    }

    public static uhp j(uhp uhpVar, ufw ufwVar, Executor executor) {
        ufl uflVar = new ufl(uhpVar, ufwVar);
        uhpVar.c(uflVar, sfy.x(executor, uflVar));
        return uflVar;
    }

    @Override // defpackage.ufb
    protected final void d() {
        p(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        uhp uhpVar = this.a;
        Object obj = this.b;
        String strDw = super.dw();
        String strCh = uhpVar != null ? a.ch(uhpVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strDw != null) {
                return strCh.concat(strDw);
            }
            return null;
        }
        return strCh + "function=[" + obj.toString() + "]";
    }

    public abstract Object g(Object obj, Object obj2);

    public abstract void h(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        uhp uhpVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (uhpVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (uhpVar.isCancelled()) {
            ev(uhpVar);
            return;
        }
        try {
            try {
                Object objG = g(obj, sfy.J(uhpVar));
                this.b = null;
                h(objG);
            } catch (Throwable th) {
                try {
                    sfy.t(th);
                    e(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            e(e2.getCause());
        } catch (Exception e3) {
            e(e3);
        }
    }
}
