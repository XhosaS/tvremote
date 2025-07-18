package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhb implements Runnable {
    final Future a;
    final uha b;

    public uhb(Future future, uha uhaVar) {
        this.a = future;
        this.b = uhaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM;
        Future future = this.a;
        if ((future instanceof uim) && (thM = ((uim) future).m()) != null) {
            this.b.a(thM);
            return;
        }
        try {
            this.b.b(sfy.J(future));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.a(this.b);
        return tssVarH.toString();
    }
}
