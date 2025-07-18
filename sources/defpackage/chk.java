package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class chk extends cii implements Runnable {
    cja a;
    Object b;

    public chk(cja cjaVar, Object obj) {
        cjaVar.getClass();
        this.a = cjaVar;
        this.b = obj;
    }

    public static cja h(cja cjaVar, byb bybVar, Executor executor) {
        chj chjVar = new chj(cjaVar, bybVar);
        cjaVar.m(chjVar, qm.E(executor, chjVar));
        return chjVar;
    }

    public static cja i(cja cjaVar, cht chtVar, Executor executor) {
        chi chiVar = new chi(cjaVar, chtVar);
        cjaVar.m(chiVar, qm.E(executor, chiVar));
        return chiVar;
    }

    @Override // defpackage.cgx
    protected final String a() {
        cja cjaVar = this.a;
        Object obj = this.b;
        String strA = super.a();
        String strI = cjaVar != null ? b.i(cjaVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strA != null) {
                return strI.concat(strA);
            }
            return null;
        }
        return strI + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.cgx
    protected final void b() {
        p(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object f(Object obj, Object obj2);

    public abstract void g(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        cja cjaVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (cjaVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (cjaVar.isCancelled()) {
            e(cjaVar);
            return;
        }
        try {
            try {
                Object objF = f(obj, qm.P(cjaVar));
                this.b = null;
                g(objF);
            } catch (Throwable th) {
                try {
                    qm.B(th);
                    d(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            d(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            d(e2.getCause());
        } catch (Exception e3) {
            d(e3);
        }
    }
}
