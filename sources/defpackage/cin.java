package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cin implements Runnable {
    final Future a;
    final cim b;

    public cin(Future future, cim cimVar) {
        this.a = future;
        this.b = cimVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thL;
        Future future = this.a;
        if ((future instanceof cjt) && (thL = ((cjt) future).l()) != null) {
            this.b.a(thL);
            return;
        }
        try {
            this.b.b(qm.P(future));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        byf byfVarR = bdq.r(this);
        byfVarR.a().b = this.b;
        return byfVarR.toString();
    }
}
